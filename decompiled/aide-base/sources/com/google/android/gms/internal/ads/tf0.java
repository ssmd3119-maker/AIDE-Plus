package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tf0 implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ pf0 fY;
    private final /* synthetic */ long jw;
    private final /* synthetic */ long mb;

    tf0(pf0 pf0Var, int i, long j, long j2) {
        this.fY = pf0Var;
        this.WB = i;
        this.mb = j;
        this.jw = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.fY.DW.v5(this.WB, this.mb, this.jw);
    }
}
