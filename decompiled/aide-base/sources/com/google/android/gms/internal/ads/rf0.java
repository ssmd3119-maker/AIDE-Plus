package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rf0 implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ pf0 fY;
    private final /* synthetic */ long jw;
    private final /* synthetic */ long mb;

    rf0(pf0 pf0Var, String str, long j, long j2) {
        this.fY = pf0Var;
        this.WB = str;
        this.mb = j;
        this.jw = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.fY.DW.FH(this.WB, this.mb, this.jw);
    }
}
