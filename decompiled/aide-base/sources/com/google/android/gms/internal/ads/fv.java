package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class fv implements Runnable {
    private final /* synthetic */ View WB;
    private final /* synthetic */ dv fY;
    private final /* synthetic */ int jw;
    private final /* synthetic */ jl mb;

    fv(dv dvVar, View view, jl jlVar, int i) {
        this.fY = dvVar;
        this.WB = view;
        this.mb = jlVar;
        this.jw = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.fY.j3(this.WB, this.mb, this.jw - 1);
    }
}
