package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class jn0 {
    public final int DW;
    public final int FH;
    public final int Hw;
    public final int VH;
    public final boolean Zo;
    public final int gn;
    public final boolean j6;
    public final boolean u7;
    public final boolean v5;

    public jn0() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jn0.class == obj.getClass()) {
            jn0 jn0Var = (jn0) obj;
            if (this.j6 == jn0Var.j6 && this.DW == jn0Var.DW && this.FH == jn0Var.FH && this.v5 == jn0Var.v5 && this.Zo == jn0Var.Zo && this.u7 == jn0Var.u7 && this.VH == jn0Var.VH && this.gn == jn0Var.gn && this.Hw == jn0Var.Hw && TextUtils.equals(null, null) && TextUtils.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.j6 ? 1 : 0)) * 31) + this.DW) * 31) + this.FH) * 31) + this.Hw) * 31) + (this.v5 ? 1 : 0)) * 31) + (this.Zo ? 1 : 0)) * 31) + (this.u7 ? 1 : 0)) * 31) + this.VH) * 31) + this.gn;
    }

    private jn0(String str, String str2, boolean z, boolean z2, int i, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5) {
        this.j6 = true;
        this.DW = Integer.MAX_VALUE;
        this.FH = Integer.MAX_VALUE;
        this.Hw = Integer.MAX_VALUE;
        this.v5 = true;
        this.Zo = true;
        this.VH = Integer.MAX_VALUE;
        this.gn = Integer.MAX_VALUE;
        this.u7 = true;
    }
}
