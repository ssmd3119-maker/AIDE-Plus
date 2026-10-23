import org.gradle.api.DefaultTask;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.provider.ListProperty;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * The AIDE api jars list member classes in the outer class's InnerClasses
 * attribute without outer class and simple name, so javac treats them as
 * anonymous and cannot resolve e.g. BuildGradle.Dependency. Each inner class
 * still describes itself correctly, so every entry is rewritten from that.
 * The jars also mark the accessor methods AIDE's own code calls as synthetic,
 * which javac hides, so that flag is cleared on everything but bridges.
 * Some member classes have no entry anywhere; Outer$name is then taken to be
 * a member of Outer.
 */
public abstract class FixInnerClassesTask extends DefaultTask {

    @InputFiles
    public abstract ConfigurableFileCollection getJars();

    /**
     * Methods to drop from the stubs, as "owner.name(descriptor)". For methods
     * that clash with the android.jar javac compiles against.
     */
    @Input
    public abstract ListProperty<String> getRemovedMethods();

    @OutputDirectory
    public abstract DirectoryProperty getOutputDir();

    private static final class Inner {
        final String outer;
        final String simpleName;
        final int access;

        Inner(String outer, String simpleName, int access) {
            this.outer = outer;
            this.simpleName = simpleName;
            this.access = access;
        }
    }

    @TaskAction
    public void run() throws IOException {
        File outDir = getOutputDir().get().getAsFile();
        Set<String> removedMethods = new HashSet<>(getRemovedMethods().getOrElse(java.util.Collections.emptyList()));
        for (File jar : getJars().getFiles()) {
            fixJar(jar, new File(outDir, jar.getName()), removedMethods);
        }
    }

    private static void fixJar(File in, File out, Set<String> removedMethods) throws IOException {
        Map<String, Inner> inners = new HashMap<>();
        Map<String, ClassReader> classes = new HashMap<>();
        try (ZipFile zip = new ZipFile(in)) {
            for (Enumeration<? extends ZipEntry> e = zip.entries(); e.hasMoreElements(); ) {
                ZipEntry entry = e.nextElement();
                if (!entry.getName().endsWith(".class")) continue;
                ClassReader reader = new ClassReader(read(zip, entry));
                classes.put(reader.getClassName(), reader);
            }
            for (ClassReader reader : classes.values()) {
                String self = reader.getClassName();
                int classAccess = reader.getAccess();
                reader.accept(new ClassVisitor(Opcodes.ASM9) {
                    @Override
                    public void visitInnerClass(String name, String outerName, String innerName, int access) {
                        if (name.equals(self) && innerName != null) {
                            inners.put(name, new Inner(outerName, innerName, withClassVisibility(access, classAccess)));
                        }
                    }
                }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
            }
            // Classes without any entry about themselves: Outer$name is a member of Outer
            for (ClassReader reader : classes.values()) {
                String self = reader.getClassName();
                int dollar = self.lastIndexOf('$');
                if (inners.containsKey(self) || dollar < 0) continue;
                String outer = self.substring(0, dollar);
                String simpleName = self.substring(dollar + 1);
                if (!classes.containsKey(outer) || simpleName.isEmpty()
                        || !Character.isJavaIdentifierStart(simpleName.charAt(0))) continue;
                int access = reader.getAccess() & ~Opcodes.ACC_SUPER;
                if (!hasOuterInstance(reader, outer)) access |= Opcodes.ACC_STATIC;
                inners.put(self, new Inner(outer, simpleName, access));
            }

            try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(out.toPath()))) {
                for (Enumeration<? extends ZipEntry> e = zip.entries(); e.hasMoreElements(); ) {
                    ZipEntry entry = e.nextElement();
                    if (entry.isDirectory()) continue;
                    byte[] bytes = read(zip, entry);
                    if (entry.getName().endsWith(".class")) {
                        bytes = fixClass(bytes, inners, removedMethods);
                    }
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    zos.write(bytes);
                    zos.closeEntry();
                }
            }
        }
    }

    private static int withClassVisibility(int access, int classAccess) {
        if ((classAccess & Opcodes.ACC_PUBLIC) != 0) {
            return (access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED)) | Opcodes.ACC_PUBLIC;
        }
        return access;
    }

    /** An inner (non-static) class has a constructor taking the outer instance first. */
    private static boolean hasOuterInstance(ClassReader reader, String outer) {
        boolean[] found = {false};
        String prefix = "(L" + outer + ";";
        reader.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                if (name.equals("<init>") && descriptor.startsWith(prefix)) found[0] = true;
                return null;
            }
        }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
        return found[0];
    }

    private static byte[] fixClass(byte[] bytes, Map<String, Inner> inners, Set<String> removedMethods) {
        ClassReader reader = new ClassReader(bytes);
        String self = reader.getClassName();
        ClassWriter writer = new ClassWriter(0);
        Set<String> written = new HashSet<>();
        reader.accept(new ClassVisitor(Opcodes.ASM9, writer) {
            @Override
            public void visitInnerClass(String name, String outerName, String innerName, int access) {
                if (!written.add(name)) return;
                Inner inner = inners.get(name);
                if (inner != null) {
                    super.visitInnerClass(name, inner.outer, inner.simpleName, inner.access);
                } else {
                    super.visitInnerClass(name, outerName, innerName, access);
                }
            }

            @Override
            public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
                return super.visitField(access & ~Opcodes.ACC_SYNTHETIC, name, descriptor, signature, value);
            }

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                if (removedMethods.contains(self + "." + name + descriptor)) {
                    return null;
                }
                if ((access & Opcodes.ACC_BRIDGE) == 0) {
                    access &= ~Opcodes.ACC_SYNTHETIC;
                }
                return super.visitMethod(access, name, descriptor, signature, exceptions);
            }

            @Override
            public void visitEnd() {
                // entries the class is missing: about itself and its member classes
                for (Map.Entry<String, Inner> e : inners.entrySet()) {
                    String name = e.getKey();
                    Inner inner = e.getValue();
                    if ((name.equals(self) || self.equals(inner.outer)) && written.add(name)) {
                        super.visitInnerClass(name, inner.outer, inner.simpleName, inner.access);
                    }
                }
                super.visitEnd();
            }
        }, 0);
        return writer.toByteArray();
    }

    private static byte[] read(ZipFile zip, ZipEntry entry) throws IOException {
        try (InputStream is = zip.getInputStream(entry)) {
            return is.readAllBytes();
        }
    }
}
