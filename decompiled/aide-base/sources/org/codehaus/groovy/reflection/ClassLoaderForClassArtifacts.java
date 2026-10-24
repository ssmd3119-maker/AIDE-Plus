package org.codehaus.groovy.reflection;

import java.lang.ref.SoftReference;
import java.security.PrivilegedAction;
import java.util.concurrent.atomic.AtomicInteger;
import org.codehaus.groovy.runtime.callsite.GroovySunClassLoader;

/* loaded from: classes.dex */
public class ClassLoaderForClassArtifacts extends ClassLoader {
    public final SoftReference<Class> j6;

    /* renamed from: org.codehaus.groovy.reflection.ClassLoaderForClassArtifacts$1, reason: invalid class name */
    public class AnonymousClass1 implements PrivilegedAction<Class> {
        final /* synthetic */ byte[] DW;
        final /* synthetic */ ClassLoaderForClassArtifacts FH;
        final /* synthetic */ String j6;

        @Override // java.security.PrivilegedAction
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public Class run() {
            return this.FH.j6(this.j6, this.DW);
        }
    }

    public ClassLoaderForClassArtifacts(Class cls) {
        super(cls.getClassLoader());
        new AtomicInteger(-1);
        this.j6 = new SoftReference<>(cls);
    }

    public Class j6(String str, byte[] bArr) throws ClassFormatError {
        Class<?> clsDefineClass = defineClass(str, bArr, 0, bArr.length, this.j6.get().getProtectionDomain());
        resolveClass(clsDefineClass);
        return clsDefineClass;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str) {
        Class clsDW;
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        return clsFindLoadedClass != null ? clsFindLoadedClass : (GroovySunClassLoader.sunVM == null || (clsDW = GroovySunClassLoader.sunVM.DW(str)) == null) ? super.loadClass(str) : clsDW;
    }
}
