package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.xp;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.ads.j1 WB;
    private final /* synthetic */ c0 fY;
    private final /* synthetic */ List jw;
    private final /* synthetic */ int mb;

    g0(c0 c0Var, com.google.android.gms.internal.ads.j1 j1Var, int i, List list) {
        this.fY = c0Var;
        this.WB = j1Var;
        this.mb = i;
        this.jw = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if ((this.WB instanceof com.google.android.gms.internal.ads.x0) && this.fY.k2.e3 != null) {
                this.fY.fY = this.mb != this.jw.size() - 1;
                com.google.android.gms.internal.ads.c1 c1VarLA = c0.lA(this.WB);
                this.fY.k2.e3.k5(c1VarLA);
                this.fY.Qv(c1VarLA.QX());
                return;
            }
            if ((this.WB instanceof com.google.android.gms.internal.ads.x0) && this.fY.k2.eU != null) {
                this.fY.fY = this.mb != this.jw.size() - 1;
                com.google.android.gms.internal.ads.x0 x0Var = (com.google.android.gms.internal.ads.x0) this.WB;
                this.fY.k2.eU.TJ(x0Var);
                this.fY.Qv(x0Var.QX());
                return;
            }
            if ((this.WB instanceof com.google.android.gms.internal.ads.v0) && this.fY.k2.e3 != null) {
                this.fY.fY = this.mb != this.jw.size() - 1;
                com.google.android.gms.internal.ads.c1 c1VarLA2 = c0.lA(this.WB);
                this.fY.k2.e3.k5(c1VarLA2);
                this.fY.Qv(c1VarLA2.QX());
                return;
            }
            if (!(this.WB instanceof com.google.android.gms.internal.ads.v0) || this.fY.k2.iW == null) {
                this.fY.G2(3, this.mb != this.jw.size() - 1);
                return;
            }
            this.fY.fY = this.mb != this.jw.size() - 1;
            com.google.android.gms.internal.ads.v0 v0Var = (com.google.android.gms.internal.ads.v0) this.WB;
            this.fY.k2.iW.ms(v0Var);
            this.fY.Qv(v0Var.QX());
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
