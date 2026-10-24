package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ps0 {
    final String DW;
    final int FH;
    final long j6;

    ps0(long j, String str, int i) {
        this.j6 = j;
        this.DW = str;
        this.FH = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ps0)) {
            ps0 ps0Var = (ps0) obj;
            if (ps0Var.j6 == this.j6 && ps0Var.FH == this.FH) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.j6;
    }
}
