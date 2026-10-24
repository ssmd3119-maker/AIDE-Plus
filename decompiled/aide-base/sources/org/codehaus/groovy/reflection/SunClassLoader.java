package org.codehaus.groovy.reflection;

import com.aide.uidesigner.ProxyTextView;
import groovyjarjarasm.asm.ClassWriter;
import groovyjarjarasm.asm.MethodVisitor;
import groovyjarjarasm.asm.Opcodes;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SunClassLoader extends ClassLoader implements Opcodes {
    protected final Map<String, Class> j6;

    static {
        try {
        } catch (Throwable unused) {
        }
    }

    protected SunClassLoader() throws ClassNotFoundException {
        super(SunClassLoader.class.getClassLoader());
        this.j6 = new HashMap();
        this.j6.put("sun.reflect.MagicAccessorImpl", ClassLoader.getSystemClassLoader().loadClass("sun.reflect.MagicAccessorImpl"));
        FH();
    }

    private void FH() {
        ClassWriter classWriter = new ClassWriter(1);
        classWriter.visit(48, 1, "sun/reflect/GroovyMagic", (String) null, "sun/reflect/MagicAccessorImpl", (String[]) null);
        MethodVisitor methodVisitorVisitMethod = classWriter.visitMethod(1, "<init>", "()V", (String) null, (String[]) null);
        methodVisitorVisitMethod.visitCode();
        methodVisitorVisitMethod.visitVarInsn(25, 0);
        methodVisitorVisitMethod.visitMethodInsn(183, "sun/reflect/MagicAccessorImpl", "<init>", "()V", false);
        methodVisitorVisitMethod.visitInsn(ProxyTextView.INPUTTYPE_textFilter);
        methodVisitorVisitMethod.visitMaxs(0, 0);
        methodVisitorVisitMethod.visitEnd();
        classWriter.visitEnd();
        j6(classWriter.toByteArray(), "sun.reflect.GroovyMagic");
    }

    public Class DW(String str) {
        return this.j6.get(str);
    }

    protected void j6(byte[] bArr, String str) {
        this.j6.put(str, defineClass(str, bArr, 0, bArr.length));
    }

    @Override // java.lang.ClassLoader
    protected synchronized Class loadClass(String str, boolean z) {
        Class cls = this.j6.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return super.loadClass(str, z);
        } catch (ClassNotFoundException unused) {
            return getClass().getClassLoader().loadClass(str);
        }
    }
}
