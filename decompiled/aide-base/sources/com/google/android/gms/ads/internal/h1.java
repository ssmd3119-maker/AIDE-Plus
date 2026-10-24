package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.ie;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.mv;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzasm;

/* loaded from: classes.dex */
public final class h1 implements Runnable {
    final /* synthetic */ zl WB;
    final /* synthetic */ e1 fY;
    private final /* synthetic */ com.google.android.gms.internal.ads.d0 jw;
    final /* synthetic */ jl mb;

    h1(e1 e1Var, zl zlVar, jl jlVar, com.google.android.gms.internal.ads.d0 d0Var) {
        this.fY = e1Var;
        this.WB = zlVar;
        this.mb = jlVar;
        this.jw = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasm zzasmVar = this.WB.DW;
        if (zzasmVar.e3 && this.fY.k2.e9 != null) {
            String strQq = null;
            if (zzasmVar.jw != null) {
                w0.v5();
                strQq = bn.Qq(this.WB.DW.jw);
            }
            com.google.android.gms.internal.ads.e0 e0Var = new com.google.android.gms.internal.ads.e0(this.fY, strQq, this.WB.DW.fY);
            e1 e1Var = this.fY;
            x0 x0Var = e1Var.k2;
            x0Var.BR = 1;
            try {
                e1Var.fY = false;
                x0Var.e9.rI(e0Var);
                return;
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
                this.fY.fY = true;
            }
        }
        t1 t1Var = new t1(this.fY.k2.jw, this.mb, this.WB.DW.ys);
        try {
            cv cvVarBF = this.fY.BF(this.WB, t1Var, this.mb);
            cvVarBF.g4(this.fY.k2.cT.DW.AR);
            cvVarBF.setOnTouchListener(new j1(this, t1Var));
            cvVarBF.setOnClickListener(new k1(this, t1Var));
            x0 x0Var2 = this.fY.k2;
            x0Var2.BR = 0;
            w0.Hw();
            e1 e1Var2 = this.fY;
            x0 x0Var3 = e1Var2.k2;
            x0Var2.AL = ie.j6(x0Var3.jw, e1Var2, this.WB, x0Var3.fY, cvVarBF, e1Var2.Z1, e1Var2, this.jw);
        } catch (mv e2) {
            xp.Hw("Could not obtain webview.", e2);
            bn.gn.post(new i1(this));
        }
    }
}
