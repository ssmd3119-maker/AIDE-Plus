package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public final class vj0 implements Runnable {
    private final /* synthetic */ long AL;
    private final /* synthetic */ bo0 WB;
    private final /* synthetic */ boolean Z1;
    private final /* synthetic */ long cT;
    private final /* synthetic */ zzfs fY;
    private final /* synthetic */ long hK;
    private final /* synthetic */ int jw;
    private final /* synthetic */ Object k2;
    private final /* synthetic */ int mb;
    private final /* synthetic */ rj0 n5;
    private final /* synthetic */ IOException q7;
    private final /* synthetic */ int qp;
    private final /* synthetic */ long w9;
    private final /* synthetic */ long zh;

    vj0(rj0 rj0Var, bo0 bo0Var, int i, int i2, zzfs zzfsVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.n5 = rj0Var;
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
        this.q7 = iOException;
        this.Z1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n5.DW.v5(this.WB, this.mb, this.jw, this.fY, this.qp, this.k2, this.n5.J0(this.zh), this.n5.J0(this.AL), this.w9, this.hK, this.cT, this.q7, this.Z1);
    }
}
