package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class sw implements Runnable {
    private final /* synthetic */ View WB;
    private final /* synthetic */ qw fY;
    private final /* synthetic */ int jw;
    private final /* synthetic */ jl mb;

    sw(qw qwVar, View view, jl jlVar, int i) {
        this.fY = qwVar;
        this.WB = view;
        this.mb = jlVar;
        this.jw = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.fY.rN(this.WB, this.mb, this.jw - 1);
    }
}
