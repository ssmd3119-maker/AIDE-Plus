package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qn0 {
    private final on0[] DW;
    private int FH;
    public final int j6;

    public qn0(on0... on0VarArr) {
        this.DW = on0VarArr;
        this.j6 = on0VarArr.length;
    }

    public final on0[] DW() {
        return (on0[]) this.DW.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qn0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.DW, ((qn0) obj).DW);
    }

    public final int hashCode() {
        if (this.FH == 0) {
            this.FH = Arrays.hashCode(this.DW) + 527;
        }
        return this.FH;
    }

    public final on0 j6(int i) {
        return this.DW[i];
    }
}
