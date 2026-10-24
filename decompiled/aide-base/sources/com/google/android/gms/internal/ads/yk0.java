package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class yk0 {
    private final zzfs[] DW;
    private int FH;
    public final int j6;

    public yk0(zzfs... zzfsVarArr) {
        ro0.Hw(zzfsVarArr.length > 0);
        this.DW = zzfsVarArr;
        this.j6 = zzfsVarArr.length;
    }

    public final int DW(zzfs zzfsVar) {
        int i = 0;
        while (true) {
            zzfs[] zzfsVarArr = this.DW;
            if (i >= zzfsVarArr.length) {
                return -1;
            }
            if (zzfsVar == zzfsVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yk0.class == obj.getClass()) {
            yk0 yk0Var = (yk0) obj;
            if (this.j6 == yk0Var.j6 && Arrays.equals(this.DW, yk0Var.DW)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.FH == 0) {
            this.FH = Arrays.hashCode(this.DW) + 527;
        }
        return this.FH;
    }

    public final zzfs j6(int i) {
        return this.DW[i];
    }
}
