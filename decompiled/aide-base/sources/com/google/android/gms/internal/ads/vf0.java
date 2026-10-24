package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class vf0 implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ pf0 mb;

    vf0(pf0 pf0Var, int i) {
        this.mb = pf0Var;
        this.WB = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.DW.DW(this.WB);
    }
}
