package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cq0 implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ float fY;
    private final /* synthetic */ int jw;
    private final /* synthetic */ int mb;
    private final /* synthetic */ wp0 qp;

    cq0(wp0 wp0Var, int i, int i2, int i3, float f) {
        this.qp = wp0Var;
        this.WB = i;
        this.mb = i2;
        this.jw = i3;
        this.fY = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.qp.DW.QX(this.WB, this.mb, this.jw, this.fY);
    }
}
