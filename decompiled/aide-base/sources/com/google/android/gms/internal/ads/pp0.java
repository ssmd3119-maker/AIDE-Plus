package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class pp0 {
    public final int DW;
    public final List<byte[]> j6;

    private pp0(List<byte[]> list, int i) {
        this.j6 = list;
        this.DW = i;
    }

    public static pp0 j6(ap0 ap0Var) throws af0 {
        try {
            ap0Var.J0(21);
            int iVH = ap0Var.VH() & 3;
            int iVH2 = ap0Var.VH();
            int iDW = ap0Var.DW();
            int i = 0;
            for (int i2 = 0; i2 < iVH2; i2++) {
                ap0Var.J0(1);
                int iGn = ap0Var.gn();
                for (int i3 = 0; i3 < iGn; i3++) {
                    int iGn2 = ap0Var.gn();
                    i += iGn2 + 4;
                    ap0Var.J0(iGn2);
                }
            }
            ap0Var.EQ(iDW);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < iVH2; i5++) {
                ap0Var.J0(1);
                int iGn3 = ap0Var.gn();
                for (int i6 = 0; i6 < iGn3; i6++) {
                    int iGn4 = ap0Var.gn();
                    System.arraycopy(xo0.j6, 0, bArr, i4, xo0.j6.length);
                    int length = i4 + xo0.j6.length;
                    System.arraycopy(ap0Var.j6, ap0Var.DW(), bArr, length, iGn4);
                    i4 = length + iGn4;
                    ap0Var.J0(iGn4);
                }
            }
            return new pp0(i == 0 ? null : Collections.singletonList(bArr), iVH + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new af0("Error parsing HEVC config", e);
        }
    }
}
