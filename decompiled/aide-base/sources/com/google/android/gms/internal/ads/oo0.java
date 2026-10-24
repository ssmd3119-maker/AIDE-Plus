package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class oo0<T> implements lo0 {
    public final int DW;
    private final xn0 FH;
    private final po0<? extends T> Hw;
    private volatile long VH;
    private volatile boolean Zo;
    public final bo0 j6;
    private volatile T v5;

    public oo0(xn0 xn0Var, Uri uri, int i, po0<? extends T> po0Var) {
        this.FH = xn0Var;
        this.j6 = new bo0(uri, 1);
        this.DW = i;
        this.Hw = po0Var;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final boolean DW() {
        return this.Zo;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void FH() {
        this.Zo = true;
    }

    public final T Hw() {
        return this.v5;
    }

    @Override // com.google.android.gms.internal.ads.lo0
    public final void j6() throws IOException {
        ao0 ao0Var = new ao0(this.FH, this.j6);
        try {
            ao0Var.j6();
            this.v5 = this.Hw.j6(this.FH.Jm(), ao0Var);
        } finally {
            this.VH = ao0Var.DW();
            ip0.j6(ao0Var);
        }
    }

    public final long v5() {
        return this.VH;
    }
}
