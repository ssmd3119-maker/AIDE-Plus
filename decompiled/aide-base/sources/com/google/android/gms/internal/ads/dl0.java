package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
public final class dl0 implements hl0 {
    private final rk0[] DW;
    private final int[] j6;

    public dl0(int[] iArr, rk0[] rk0VarArr) {
        this.j6 = iArr;
        this.DW = rk0VarArr;
    }

    public final void DW(long j) {
        for (rk0 rk0Var : this.DW) {
            if (rk0Var != null) {
                rk0Var.EQ(j);
            }
        }
    }

    public final int[] FH() {
        int[] iArr = new int[this.DW.length];
        int i = 0;
        while (true) {
            rk0[] rk0VarArr = this.DW;
            if (i >= rk0VarArr.length) {
                return iArr;
            }
            if (rk0VarArr[i] != null) {
                iArr[i] = rk0VarArr[i].XL();
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.hl0
    public final mh0 j6(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.j6;
            if (i3 >= iArr.length) {
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unmatched track of type: ");
                sb.append(i2);
                Log.e("BaseMediaChunkOutput", sb.toString());
                return new ch0();
            }
            if (i2 == iArr[i3]) {
                return this.DW[i3];
            }
            i3++;
        }
    }
}
