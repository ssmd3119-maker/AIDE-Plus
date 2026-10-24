package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public final class so0 {
    private static final byte[] j6 = {0, 0, 0, 1};
    private static final int[] DW = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] FH = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int DW(zo0 zo0Var) {
        int iJ6 = zo0Var.j6(4);
        if (iJ6 == 15) {
            return zo0Var.j6(24);
        }
        ro0.j6(iJ6 < 13);
        return DW[iJ6];
    }

    public static byte[] FH(byte[] bArr, int i, int i2) {
        byte[] bArr2 = j6;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, j6.length, i2);
        return bArr3;
    }

    public static Pair<Integer, Integer> Hw(byte[] bArr) {
        zo0 zo0Var = new zo0(bArr);
        int iJ6 = j6(zo0Var);
        int iDW = DW(zo0Var);
        int iJ62 = zo0Var.j6(4);
        if (iJ6 == 5 || iJ6 == 29) {
            iDW = DW(zo0Var);
            if (j6(zo0Var) == 22) {
                iJ62 = zo0Var.j6(4);
            }
        }
        int i = FH[iJ62];
        ro0.j6(i != -1);
        return Pair.create(Integer.valueOf(iDW), Integer.valueOf(i));
    }

    private static int j6(zo0 zo0Var) {
        int iJ6 = zo0Var.j6(5);
        return iJ6 == 31 ? zo0Var.j6(6) + 32 : iJ6;
    }
}
