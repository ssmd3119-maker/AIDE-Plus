package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Future;

@jg
/* loaded from: classes.dex */
public final class dk extends om implements jk, mk, qk {
    private final mk AL;
    private volatile com.google.android.gms.ads.internal.gmsg.i Jl;
    private gk Q6;
    private final t9 cT;
    public final String fY;
    private final String hK;
    private final Context k2;
    private Future kf;
    private final long q7;
    private final zl qp;
    private final rk zh;
    private int Z1 = 0;
    private int n5 = 3;
    private final Object w9 = new Object();

    public dk(Context context, String str, String str2, t9 t9Var, zl zlVar, rk rkVar, mk mkVar, long j) {
        this.k2 = context;
        this.fY = str;
        this.hK = str2;
        this.cT = t9Var;
        this.qp = zlVar;
        this.zh = rkVar;
        this.AL = mkVar;
        this.q7 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(zzwb zzwbVar, na naVar) {
        this.zh.DW().CO(this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.fY)) {
                naVar.DP(zzwbVar, this.hK, this.cT.j6);
            } else {
                naVar.Jy(zzwbVar, this.hK);
            }
        } catch (RemoteException e) {
            xp.v5("Fail to load ad from adapter.", e);
            Hw(this.fY, 0);
        }
    }

    private final boolean J8(long j) throws InterruptedException {
        long jDW = this.q7 - (com.google.android.gms.ads.internal.w0.we().DW() - j);
        if (jDW <= 0) {
            this.n5 = 4;
            return false;
        }
        try {
            this.w9.wait(jDW);
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.n5 = 5;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.jk
    public final void DW() {
        J0(this.qp.j6.jw, this.zh.j6());
    }

    public final void EQ(com.google.android.gms.ads.internal.gmsg.i iVar) {
        this.Jl = iVar;
    }

    @Override // com.google.android.gms.internal.ads.jk
    public final void FH(int i) {
        Hw(this.fY, 0);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void Hw(String str, int i) {
        synchronized (this.w9) {
            this.Z1 = 2;
            this.n5 = i;
            this.w9.notify();
        }
    }

    public final Future QX() {
        Future future = this.kf;
        if (future != null) {
            return future;
        }
        vq vqVar = (vq) VH();
        this.kf = vqVar;
        return vqVar;
    }

    public final gk XL() {
        gk gkVar;
        synchronized (this.w9) {
            gkVar = this.Q6;
        }
        return gkVar;
    }

    public final t9 aM() {
        return this.cT;
    }

    @Override // com.google.android.gms.internal.ads.qk
    public final void ef(Bundle bundle) {
        com.google.android.gms.ads.internal.gmsg.i iVar = this.Jl;
        if (iVar != null) {
            iVar.HT("", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        rk rkVar = this.zh;
        if (rkVar == null || rkVar.DW() == null || this.zh.j6() == null) {
            return;
        }
        lk lkVarDW = this.zh.DW();
        lkVarDW.CO(null);
        lkVarDW.k6(this);
        lkVarDW.MU(this);
        zzwb zzwbVar = this.qp.j6.jw;
        na naVarJ6 = this.zh.j6();
        try {
            if (naVarJ6.isInitialized()) {
                mp.j6.post(new ek(this, zzwbVar, naVarJ6));
            } else {
                mp.j6.post(new fk(this, naVarJ6, zzwbVar, lkVarDW));
            }
        } catch (RemoteException e) {
            xp.v5("Fail to check if adapter is initialized.", e);
            Hw(this.fY, 0);
        }
        long jDW = com.google.android.gms.ads.internal.w0.we().DW();
        while (true) {
            synchronized (this.w9) {
                if (this.Z1 != 0) {
                    ik ikVar = new ik();
                    ikVar.DW(com.google.android.gms.ads.internal.w0.we().DW() - jDW);
                    ikVar.v5(1 == this.Z1 ? 6 : this.n5);
                    ikVar.VH(this.fY);
                    ikVar.gn(this.cT.Hw);
                    this.Q6 = ikVar.u7();
                } else if (!J8(jDW)) {
                    ik ikVar2 = new ik();
                    ikVar2.v5(this.n5);
                    ikVar2.DW(com.google.android.gms.ads.internal.w0.we().DW() - jDW);
                    ikVar2.VH(this.fY);
                    ikVar2.gn(this.cT.Hw);
                    this.Q6 = ikVar2.u7();
                }
            }
        }
        lkVarDW.CO(null);
        lkVarDW.k6(null);
        if (this.Z1 == 1) {
            this.AL.j6(this.fY);
        } else {
            this.AL.Hw(this.fY, this.n5);
        }
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void j6(String str) {
        synchronized (this.w9) {
            this.Z1 = 1;
            this.w9.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }
}
