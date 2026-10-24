package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class kf0 {
    private static final int[] j6 = {1, 2, 3, 6};
    private static final int[] DW = {48000, 44100, 32000};
    private static final int[] FH = {2, 1, 2, 3, 3, 4, 4, 5};

    public static zzfs DW(ap0 ap0Var, String str, String str2, zzhp zzhpVar) {
        ap0Var.J0(2);
        int i = DW[(ap0Var.VH() & 192) >> 6];
        int iVH = ap0Var.VH();
        int i2 = FH[(iVH & 14) >> 1];
        if ((iVH & 1) != 0) {
            i2++;
        }
        return zzfs.gn(str, "audio/eac3", null, -1, -1, i2, i, null, zzhpVar, 0, str2);
    }

    public static int FH() {
        return 1536;
    }

    public static int Hw(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? j6[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static zzfs j6(ap0 ap0Var, String str, String str2, zzhp zzhpVar) {
        int i = DW[(ap0Var.VH() & 192) >> 6];
        int iVH = ap0Var.VH();
        int i2 = FH[(iVH & 56) >> 3];
        if ((iVH & 4) != 0) {
            i2++;
        }
        return zzfs.gn(str, "audio/ac3", null, -1, -1, i2, i, null, zzhpVar, 0, str2);
    }
}
