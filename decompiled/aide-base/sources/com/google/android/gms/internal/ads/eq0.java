package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class eq0 implements Runnable {
    private final /* synthetic */ sg0 WB;
    private final /* synthetic */ wp0 mb;

    eq0(wp0 wp0Var, sg0 sg0Var) {
        this.mb = wp0Var;
        this.WB = sg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.WB.j6();
        this.mb.DW.gn(this.WB);
    }
}
