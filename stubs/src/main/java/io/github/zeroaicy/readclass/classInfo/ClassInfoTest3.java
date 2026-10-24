package io.github.zeroaicy.readclass.classInfo;

import java.io.InputStream;
import java.io.Reader;

/**
 * Compile-time stub of the ClassReader library; the implementation ships as
 * dex in app_rewrite/libs/ClassReaderLibrary-1.8.0-beta.jar.
 */
public class ClassInfoTest3 {

    public static Reader TestReadClass(String jarPath, String classPath) {
        throw new RuntimeException("Stub!");
    }

    public static InputStream modifyADRT(InputStream classStream) {
        throw new RuntimeException("Stub!");
    }

    public static byte[] modifyADRT(byte[] classBytes) {
        throw new RuntimeException("Stub!");
    }
}
