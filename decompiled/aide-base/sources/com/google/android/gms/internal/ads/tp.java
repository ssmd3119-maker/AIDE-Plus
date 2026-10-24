package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class tp {
    public static long DW(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int FH(ByteBuffer byteBuffer) {
        return (j6(byteBuffer.get()) << 8) + 0 + j6(byteBuffer.get());
    }

    public static long Hw(ByteBuffer byteBuffer) {
        long jDW = (DW(byteBuffer) << 32) + 0;
        if (jDW >= 0) {
            return jDW + DW(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static String VH(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static double Zo(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = 0 | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static int j6(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static double v5(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = 0 | ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
        Double.isNaN(d);
        return d / 65536.0d;
    }
}
