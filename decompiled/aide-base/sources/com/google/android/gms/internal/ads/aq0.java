package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class aq0 implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ wp0 jw;
    private final /* synthetic */ long mb;

    aq0(wp0 wp0Var, int i, long j) {
        this.jw = wp0Var;
        this.WB = i;
        this.mb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.jw.DW.u7(this.WB, this.mb);
    }
}
