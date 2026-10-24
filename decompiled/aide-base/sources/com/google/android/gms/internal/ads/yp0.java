package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yp0 implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ wp0 fY;
    private final /* synthetic */ long jw;
    private final /* synthetic */ long mb;

    yp0(wp0 wp0Var, String str, long j, long j2) {
        this.fY = wp0Var;
        this.WB = str;
        this.mb = j;
        this.jw = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.fY.DW.DW(this.WB, this.mb, this.jw);
    }
}
