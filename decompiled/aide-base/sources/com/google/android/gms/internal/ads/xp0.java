package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xp0 implements Runnable {
    private final /* synthetic */ sg0 WB;
    private final /* synthetic */ wp0 mb;

    xp0(wp0 wp0Var, sg0 sg0Var) {
        this.mb = wp0Var;
        this.WB = sg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.DW.EQ(this.WB);
    }
}
