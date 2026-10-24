package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lp0 {
    public final int DW;
    public final float FH;
    public final List<byte[]> j6;

    private lp0(List<byte[]> list, int i, int i2, int i3, float f) {
        this.j6 = list;
        this.DW = i;
        this.FH = f;
    }

    private static byte[] DW(ap0 ap0Var) {
        int iGn = ap0Var.gn();
        int iDW = ap0Var.DW();
        ap0Var.J0(iGn);
        return so0.FH(ap0Var.j6, iDW, iGn);
    }

    public static lp0 j6(ap0 ap0Var) throws af0 {
        int i;
        int i2;
        float f;
        try {
            ap0Var.J0(4);
            int iVH = (ap0Var.VH() & 3) + 1;
            if (iVH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iVH2 = ap0Var.VH() & 31;
            for (int i3 = 0; i3 < iVH2; i3++) {
                arrayList.add(DW(ap0Var));
            }
            int iVH3 = ap0Var.VH();
            for (int i4 = 0; i4 < iVH3; i4++) {
                arrayList.add(DW(ap0Var));
            }
            if (iVH2 > 0) {
                yo0 yo0VarFH = xo0.FH((byte[]) arrayList.get(0), iVH, ((byte[]) arrayList.get(0)).length);
                int i5 = yo0VarFH.j6;
                int i6 = yo0VarFH.DW;
                f = yo0VarFH.FH;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new lp0(arrayList, iVH, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new af0("Error parsing AVC config", e);
        }
    }
}
