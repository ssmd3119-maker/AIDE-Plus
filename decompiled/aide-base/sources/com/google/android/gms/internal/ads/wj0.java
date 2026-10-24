package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wj0 implements Runnable {
    private final /* synthetic */ int WB;
    private final /* synthetic */ Object fY;
    private final /* synthetic */ int jw;
    private final /* synthetic */ rj0 k2;
    private final /* synthetic */ zzfs mb;
    private final /* synthetic */ long qp;

    wj0(rj0 rj0Var, int i, zzfs zzfsVar, int i2, Object obj, long j) {
        this.k2 = rj0Var;
        this.WB = i;
        this.mb = zzfsVar;
        this.jw = i2;
        this.fY = obj;
        this.qp = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.k2.DW.j6(this.WB, this.mb, this.jw, this.fY, this.k2.J0(this.qp));
    }
}
