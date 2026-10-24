package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uj0 implements Runnable {
    private final /* synthetic */ long AL;
    private final /* synthetic */ bo0 WB;
    private final /* synthetic */ long cT;
    private final /* synthetic */ zzfs fY;
    private final /* synthetic */ long hK;
    private final /* synthetic */ int jw;
    private final /* synthetic */ Object k2;
    private final /* synthetic */ int mb;
    private final /* synthetic */ rj0 q7;
    private final /* synthetic */ int qp;
    private final /* synthetic */ long w9;
    private final /* synthetic */ long zh;

    uj0(rj0 rj0Var, bo0 bo0Var, int i, int i2, zzfs zzfsVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.q7 = rj0Var;
        this.WB = bo0Var;
        this.mb = i;
        this.jw = i2;
        this.fY = zzfsVar;
        this.qp = i3;
        this.k2 = obj;
        this.zh = j;
        this.AL = j2;
        this.w9 = j3;
        this.hK = j4;
        this.cT = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q7.DW.FH(this.WB, this.mb, this.jw, this.fY, this.qp, this.k2, this.q7.J0(this.zh), this.q7.J0(this.AL), this.w9, this.hK, this.cT);
    }
}
