package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class al0 {
    public static final al0 Hw = new al0(new yk0[0]);
    private final yk0[] DW;
    private int FH;
    public final int j6;

    public al0(yk0... yk0VarArr) {
        this.DW = yk0VarArr;
        this.j6 = yk0VarArr.length;
    }

    public final yk0 DW(int i) {
        return this.DW[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && al0.class == obj.getClass()) {
            al0 al0Var = (al0) obj;
            if (this.j6 == al0Var.j6 && Arrays.equals(this.DW, al0Var.DW)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.FH == 0) {
            this.FH = Arrays.hashCode(this.DW);
        }
        return this.FH;
    }

    public final int j6(yk0 yk0Var) {
        for (int i = 0; i < this.j6; i++) {
            if (this.DW[i] == yk0Var) {
                return i;
            }
        }
        return -1;
    }
}
