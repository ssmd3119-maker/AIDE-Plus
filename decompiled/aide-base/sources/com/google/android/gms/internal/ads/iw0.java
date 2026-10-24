package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class iw0<T> {
    public final ab0 DW;
    public final e3 FH;
    public boolean Hw;
    public final T j6;

    private iw0(T t, ab0 ab0Var) {
        this.Hw = false;
        this.j6 = t;
        this.DW = ab0Var;
        this.FH = null;
    }

    public static <T> iw0<T> DW(e3 e3Var) {
        return new iw0<>(e3Var);
    }

    public static <T> iw0<T> j6(T t, ab0 ab0Var) {
        return new iw0<>(t, ab0Var);
    }

    private iw0(e3 e3Var) {
        this.Hw = false;
        this.j6 = null;
        this.DW = null;
        this.FH = e3Var;
    }
}
