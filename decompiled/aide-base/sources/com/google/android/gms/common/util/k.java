package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class k {
    public static long DW(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    break;
                }
                j += i2;
                outputStream.write(bArr, 0, i2);
            } finally {
                if (z) {
                    j6(inputStream);
                    j6(outputStream);
                }
            }
        }
        return j;
    }

    public static byte[] FH(InputStream inputStream, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Hw(inputStream, byteArrayOutputStream, z);
        return byteArrayOutputStream.toByteArray();
    }

    private static long Hw(InputStream inputStream, OutputStream outputStream, boolean z) {
        return DW(inputStream, outputStream, z, 1024);
    }

    public static void j6(@Nullable Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
