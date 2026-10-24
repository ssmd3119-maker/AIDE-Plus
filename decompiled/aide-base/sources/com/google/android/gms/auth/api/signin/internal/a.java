package com.google.android.gms.auth.api.signin.internal;

/* loaded from: classes.dex */
public class a {
    private static int DW = 31;
    private int j6 = 1;

    public int DW() {
        return this.j6;
    }

    public final a FH(boolean z) {
        this.j6 = (DW * this.j6) + (z ? 1 : 0);
        return this;
    }

    public a j6(Object obj) {
        this.j6 = (DW * this.j6) + (obj == null ? 0 : obj.hashCode());
        return this;
    }
}
