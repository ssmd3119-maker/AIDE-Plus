import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.android.build.api.variant.BuiltArtifactsLoader;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * Appends the prebuilt dex of the given jars to the apk AGP built, after its
 * own dex files and in the given order, then aligns and signs it again.
 * Everything runs in-process (apksig), so it works wherever Gradle runs,
 * including Android IDE apps without build-tools binaries.
 *
 * Alignment works like zipalign: uncompressed entries get the 0xD935 extra
 * field padded so their data starts on a 4 byte (native libraries: 4 KiB)
 * boundary, and apksig keeps that alignment when it signs.
 */
public abstract class AppendDexTask extends DefaultTask {

    @InputFiles
    public abstract DirectoryProperty getApkDir();

    @Internal
    public abstract Property<BuiltArtifactsLoader> getLoader();

    @InputFiles
    public abstract ConfigurableFileCollection getDexJars();

    @InputFile
    public abstract RegularFileProperty getKeystore();

    @Input
    public abstract Property<String> getStorePassword();

    @Input
    public abstract Property<String> getKeyAlias();

    @Input
    public abstract Property<String> getKeyPassword();

    @Input
    public abstract Property<Integer> getMinSdk();

    @OutputFile
    public abstract RegularFileProperty getOutputApk();

    private static final Pattern DEX = Pattern.compile("classes(\\d*)\\.dex");
    private static final Pattern SIGNATURE = Pattern.compile("META-INF/[^/]+\\.(SF|RSA|EC|DSA|MF)");
    private static final int ALIGNMENT_EXTRA_ID = 0xD935;
    private static final int LOCAL_HEADER_SIZE = 30;

    /** Counts the bytes written, to know where the next local header starts. */
    private static final class CountingOutputStream extends java.io.FilterOutputStream {
        long count;

        CountingOutputStream(OutputStream out) {
            super(out);
        }

        @Override
        public void write(int b) throws IOException {
            out.write(b);
            count++;
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            out.write(b, off, len);
            count += len;
        }
    }

    /** Sets the zipalign extra field so the data of an uncompressed entry starts aligned. */
    private static void align(ZipEntry entry, long headerOffset) {
        int alignment = entry.getName().endsWith(".so") ? 4096 : 4;
        int nameLength = entry.getName().getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
        long dataStart = headerOffset + LOCAL_HEADER_SIZE + nameLength + 6;
        int padding = (int) ((alignment - dataStart % alignment) % alignment);
        byte[] extra = new byte[6 + padding];
        extra[0] = (byte) ALIGNMENT_EXTRA_ID;
        extra[1] = (byte) (ALIGNMENT_EXTRA_ID >> 8);
        extra[2] = (byte) (2 + padding);
        extra[3] = (byte) ((2 + padding) >> 8);
        extra[4] = (byte) alignment;
        extra[5] = (byte) (alignment >> 8);
        entry.setExtra(extra);
    }

    static int dexIndex(String name) {
        Matcher m = DEX.matcher(name);
        if (!m.matches()) return -1;
        return m.group(1).isEmpty() ? 1 : Integer.parseInt(m.group(1));
    }

    @TaskAction
    public void run() throws Exception {
        File inputApk = new File(getLoader().get().load(getApkDir().get()).getElements().iterator().next().getOutputFile());
        File out = getOutputApk().get().getAsFile();
        File unsigned = new File(getTemporaryDir(), "unsigned.apk");

        int nextIndex = 1;
        CountingOutputStream counter = new CountingOutputStream(
                new java.io.BufferedOutputStream(Files.newOutputStream(unsigned.toPath())));
        try (ZipOutputStream zos = new ZipOutputStream(counter);
             ZipFile zip = new ZipFile(inputApk)) {
            for (Enumeration<? extends ZipEntry> e = zip.entries(); e.hasMoreElements(); ) {
                ZipEntry entry = e.nextElement();
                // the apk is signed again below
                if (SIGNATURE.matcher(entry.getName()).matches()) continue;
                int index = dexIndex(entry.getName());
                if (index >= nextIndex) nextIndex = index + 1;
                ZipEntry copy = new ZipEntry(entry.getName());
                copy.setMethod(entry.getMethod());
                if (entry.getMethod() == ZipEntry.STORED) {
                    copy.setSize(entry.getSize());
                    copy.setCompressedSize(entry.getSize());
                    copy.setCrc(entry.getCrc());
                    align(copy, counter.count);
                }
                zos.putNextEntry(copy);
                try (InputStream is = zip.getInputStream(entry)) {
                    is.transferTo(zos);
                }
                zos.closeEntry();
            }
            for (File jar : getDexJars().getFiles()) {
                nextIndex = appendDex(jar, zos, nextIndex);
            }
        }

        signApk(unsigned, out);
        ApkVerifier.Result result = new ApkVerifier.Builder(out).build().verify();
        if (!result.isVerified()) {
            throw new GradleException("Signed apk does not verify: " + result.getErrors());
        }
        getLogger().lifecycle("AIDE-Plus apk: " + out);
    }

    private int appendDex(File jar, ZipOutputStream zos, int nextIndex) throws IOException {
        try (ZipFile zip = new ZipFile(jar)) {
            List<ZipEntry> dexEntries = new ArrayList<>();
            for (Enumeration<? extends ZipEntry> e = zip.entries(); e.hasMoreElements(); ) {
                ZipEntry entry = e.nextElement();
                if (dexIndex(entry.getName()) > 0) dexEntries.add(entry);
            }
            if (dexEntries.isEmpty()) throw new GradleException("No dex in " + jar);
            dexEntries.sort(Comparator.comparingInt(entry -> dexIndex(entry.getName())));
            for (ZipEntry entry : dexEntries) {
                String name = nextIndex == 1 ? "classes.dex" : "classes" + nextIndex + ".dex";
                nextIndex++;
                getLogger().lifecycle(name + " <- " + jar.getName() + "!" + entry.getName());
                zos.putNextEntry(new ZipEntry(name));
                try (InputStream is = zip.getInputStream(entry)) {
                    is.transferTo(zos);
                }
                zos.closeEntry();
            }
        }
        return nextIndex;
    }

    private void signApk(File unsigned, File out) throws Exception {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        try (InputStream is = new FileInputStream(getKeystore().get().getAsFile())) {
            keyStore.load(is, getStorePassword().get().toCharArray());
        }
        String alias = getKeyAlias().get();
        PrivateKey key = (PrivateKey) keyStore.getKey(alias, getKeyPassword().get().toCharArray());
        X509Certificate cert = (X509Certificate) keyStore.getCertificate(alias);
        if (key == null || cert == null) throw new GradleException("No key '" + alias + "' in " + getKeystore().get());

        ApkSigner.SignerConfig signer = new ApkSigner.SignerConfig.Builder(
                "CERT", key, Collections.singletonList(cert)).build();
        out.getParentFile().mkdirs();
        // ApkSigner also aligns the uncompressed entries, which replaces zipalign
        new ApkSigner.Builder(Collections.singletonList(signer))
                .setInputApk(unsigned)
                .setOutputApk(out)
                .setMinSdkVersion(getMinSdk().get())
                .setV1SigningEnabled(true)
                .setV2SigningEnabled(true)
                .setV3SigningEnabled(true)
                .build()
                .sign();
    }
}
