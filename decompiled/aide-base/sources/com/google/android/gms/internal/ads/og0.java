package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class og0 {
    private int j6;

    public final void DW(int i) {
        this.j6 = i;
    }

    public final boolean FH() {
        return VH(Integer.MIN_VALUE);
    }

    public final boolean Hw() {
        return VH(4);
    }

    protected final boolean VH(int i) {
        return (this.j6 & i) == i;
    }

    public final void Zo(int i) {
        this.j6 |= Integer.MIN_VALUE;
    }

    public void j6() {
        this.j6 = 0;
    }

    public final boolean v5() {
        return VH(1);
    }
}
