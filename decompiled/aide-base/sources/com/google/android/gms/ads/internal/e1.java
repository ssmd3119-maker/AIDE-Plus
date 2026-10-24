package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.hd;
import com.google.android.gms.internal.ads.ie;
import com.google.android.gms.internal.ads.iv;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.kl;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class e1 extends z0 implements g, hd {
    private boolean Q6;

    public e1(Context context, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar, s1 s1Var) {
        super(context, zzwfVar, str, kaVar, zzbbiVar, s1Var);
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void Af() {
        EQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected cv BF(zl zlVar, t1 t1Var, jl jlVar) {
        View nextView = this.k2.k2.getNextView();
        if (nextView instanceof cv) {
            ((cv) nextView).destroy();
        }
        if (nextView != 0) {
            this.k2.k2.removeView(nextView);
        }
        w0.Zo();
        x0 x0Var = this.k2;
        Context context = x0Var.jw;
        pw pwVarU7 = pw.u7(x0Var.w9);
        x0 x0Var2 = this.k2;
        cv cvVarDW = iv.DW(context, pwVarU7, x0Var2.w9.WB, false, false, x0Var2.fY, x0Var2.qp, this.WB, this, this.q7, zlVar.u7);
        if (this.k2.w9.zh == null) {
            vq(cvVarDW.getView());
        }
        cvVarDW.AF().v5(this, this, this, this, this, false, null, t1Var, this, jlVar);
        lA(cvVarDW);
        cvVarDW.Lz(zlVar.j6.sg);
        return cvVarDW;
    }

    final void Iy(cv cvVar) {
        x0 x0Var = this.k2;
        yl ylVar = x0Var.hK;
        if (ylVar != null) {
            this.AL.Hw(x0Var.w9, ylVar, cvVar.getView(), cvVar);
            this.Q6 = false;
        } else {
            this.Q6 = true;
            xp.u7("Request to enable ActiveView before adState is available.");
        }
    }

    @Override // com.google.android.gms.ads.internal.a
    protected void MU(zl zlVar, com.google.android.gms.internal.ads.d0 d0Var) {
        if (zlVar.v5 != -2) {
            bn.gn.post(new g1(this, zlVar));
            return;
        }
        zzwf zzwfVar = zlVar.Hw;
        if (zzwfVar != null) {
            this.k2.w9 = zzwfVar;
        }
        zzasm zzasmVar = zlVar.DW;
        if (!zzasmVar.w9 || zzasmVar.aX) {
            kl klVar = this.q7.FH;
            x0 x0Var = this.k2;
            bn.gn.post(new h1(this, zlVar, klVar.j6(x0Var.jw, x0Var.qp, zlVar.DW), d0Var));
            return;
        }
        x0 x0Var2 = this.k2;
        x0Var2.BR = 0;
        w0.Hw();
        x0 x0Var3 = this.k2;
        x0Var2.AL = ie.j6(x0Var3.jw, this, zlVar, x0Var3.fY, null, this.Z1, this, d0Var);
    }

    @Override // com.google.android.gms.ads.internal.a
    protected void NS() {
        super.NS();
        if (this.Q6) {
            if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.xg)).booleanValue()) {
                Iy(this.k2.hK.DW);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void Qa(View view) {
        x0 x0Var = this.k2;
        x0Var.Nh = view;
        BJ(new yl(x0Var.cT, null, null, null, null, null, null, null));
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void c0(int i, int i2, int i3, int i4) {
        ag();
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void hG() {
        is();
    }

    protected final void lA(cv cvVar) {
        cvVar.sh("/trackActiveViewUnit", new f1(this));
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void rB(com.google.android.gms.internal.ads.j0 j0Var) {
        com.google.android.gms.common.internal.p.Hw("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.k2.e9 = j0Var;
    }

    protected final boolean se() {
        zzasm zzasmVar;
        zl zlVar = this.k2.cT;
        return (zlVar == null || (zzasmVar = zlVar.DW) == null || !zzasmVar.qP) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    protected boolean tc(yl ylVar, yl ylVar2) {
        cv cvVar;
        y0 y0Var;
        if (this.k2.Zo() && (y0Var = this.k2.k2) != null) {
            y0Var.j6().J0(ylVar2.BT);
        }
        try {
            if (ylVar2.DW != null && !ylVar2.Ws && ylVar2.sG && !ylVar2.j6.jw.containsKey("sdk_less_server_data")) {
                try {
                    ylVar2.DW.h2();
                } catch (Throwable unused) {
                    sm.we("Could not render test Ad label.");
                }
            }
        } catch (RuntimeException unused2) {
            sm.we("Could not render test AdLabel.");
        }
        if (ylVar2 != null && (cvVar = ylVar2.DW) != null) {
            cvVar.g4(ylVar2.vJ);
        }
        return super.tc(ylVar, ylVar2);
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void uj() {
        VH();
        OM();
    }
}
