package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.b3;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cb;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.ie;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.s3;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.za;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzawd;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m1 extends z0 implements com.google.android.gms.internal.ads.i1 {
    private boolean Jl;
    private boolean Q6;
    private yl kf;

    public m1(Context context, s1 s1Var, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar) {
        super(context, zzwfVar, str, kaVar, zzbbiVar, s1Var);
        this.Jl = false;
    }

    private static yl BF(zl zlVar, int i) {
        zzasi zzasiVar = zlVar.j6;
        zzwb zzwbVar = zzasiVar.jw;
        zzasm zzasmVar = zlVar.DW;
        List<String> list = zzasmVar.qp;
        List<String> list2 = zzasmVar.zh;
        List<String> list3 = zzasmVar.cT;
        int i2 = zzasmVar.Z1;
        long j = zzasmVar.q7;
        String str = zzasiVar.w9;
        boolean z = zzasmVar.w9;
        u9 u9Var = zlVar.FH;
        long j2 = zzasmVar.hK;
        zzwf zzwfVar = zlVar.Hw;
        long j3 = zzasmVar.AL;
        long j4 = zlVar.Zo;
        long j5 = zlVar.VH;
        String str2 = zzasmVar.kf;
        JSONObject jSONObject = zlVar.gn;
        zzawd zzawdVar = zzasmVar.e9;
        List<String> list4 = zzasmVar.QO;
        return new yl(zzwbVar, null, list, i, list2, list3, i2, j, str, z, null, null, null, u9Var, null, j2, zzwfVar, j3, j4, j5, str2, jSONObject, null, zzawdVar, list4, list4, zzasmVar.a5, zzasmVar.ys, null, zzasmVar.Nh, zzasmVar.An, zlVar.u7, zzasmVar.Bx, zlVar.tp, zzasmVar.qP, zzasmVar.MP, zzasmVar.Of, zzasmVar.PT, zzasmVar.AR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean CZ(yl ylVar, yl ylVar2) {
        View viewTp = s.tp(ylVar2);
        if (viewTp == null) {
            return false;
        }
        View nextView = this.k2.k2.getNextView();
        if (nextView != 0) {
            if (nextView instanceof cv) {
                ((cv) nextView).destroy();
            }
            this.k2.k2.removeView(nextView);
        }
        if (!s.we(ylVar2)) {
            try {
                vq(viewTp);
            } catch (Throwable th) {
                w0.u7().v5(th, "AdLoaderManager.swapBannerViews");
                xp.v5("Could not add mediation view to view hierarchy.", th);
                return false;
            }
        }
        if (this.k2.k2.getChildCount() > 1) {
            this.k2.k2.showNext();
        }
        if (ylVar != null) {
            View nextView2 = this.k2.k2.getNextView();
            if (nextView2 != null) {
                this.k2.k2.removeView(nextView2);
            }
            this.k2.v5();
        }
        this.k2.k2.setMinimumWidth(I8().k2);
        this.k2.k2.setMinimumHeight(I8().jw);
        this.k2.k2.requestLayout();
        this.k2.k2.setVisibility(0);
        return true;
    }

    private final void lA(com.google.android.gms.internal.ads.c1 c1Var) {
        bn.gn.post(new o1(this, c1Var));
    }

    private final u9 q6() {
        yl ylVar = this.k2.hK;
        if (ylVar == null || !ylVar.Ws) {
            return null;
        }
        return ylVar.j3;
    }

    private final boolean se(yl ylVar, yl ylVar2) {
        G5(null);
        if (!this.k2.Zo()) {
            xp.u7("Native ad does not have custom rendering mode.");
            HS(0);
            return false;
        }
        try {
            cb cbVarM0 = ylVar2.XL != null ? ylVar2.XL.m0() : null;
            wa waVarSM = ylVar2.XL != null ? ylVar2.XL.sM() : null;
            za zaVarE3 = ylVar2.XL != null ? ylVar2.XL.e3() : null;
            b3 b3VarLJ = ylVar2.XL != null ? ylVar2.XL.lJ() : null;
            String strCP = z0.CP(ylVar2);
            if (cbVarM0 != null && this.k2.e3 != null) {
                com.google.android.gms.internal.ads.c1 c1Var = new com.google.android.gms.internal.ads.c1(cbVarM0.FH(), cbVarM0.DW(), cbVarM0.gn(), cbVarM0.j3() != null ? cbVarM0.j3() : null, cbVarM0.Zo(), cbVarM0.er(), cbVarM0.a8(), cbVarM0.yS(), cbVarM0.aM(), null, cbVarM0.getVideoController(), cbVarM0.ro() != null ? (View) xu.g3(cbVarM0.ro()) : null, cbVarM0.v5(), strCP, cbVarM0.tp());
                c1Var.s5(new com.google.android.gms.internal.ads.g1(this.k2.jw, this, this.k2.fY, cbVarM0, c1Var));
                lA(c1Var);
            } else if (waVarSM != null && this.k2.e3 != null) {
                com.google.android.gms.internal.ads.c1 c1Var2 = new com.google.android.gms.internal.ads.c1(waVarSM.FH(), waVarSM.DW(), waVarSM.gn(), waVarSM.j3() != null ? waVarSM.j3() : null, waVarSM.Zo(), null, waVarSM.a8(), waVarSM.yS(), waVarSM.aM(), null, waVarSM.getVideoController(), waVarSM.ro() != null ? (View) xu.g3(waVarSM.ro()) : null, waVarSM.v5(), strCP, waVarSM.tp());
                c1Var2.s5(new com.google.android.gms.internal.ads.g1(this.k2.jw, this, this.k2.fY, waVarSM, c1Var2));
                lA(c1Var2);
            } else if (waVarSM != null && this.k2.iW != null) {
                com.google.android.gms.internal.ads.v0 v0Var = new com.google.android.gms.internal.ads.v0(waVarSM.FH(), waVarSM.DW(), waVarSM.gn(), waVarSM.j3() != null ? waVarSM.j3() : null, waVarSM.Zo(), waVarSM.a8(), waVarSM.yS(), waVarSM.aM(), null, waVarSM.tp(), waVarSM.getVideoController(), waVarSM.ro() != null ? (View) xu.g3(waVarSM.ro()) : null, waVarSM.v5(), strCP);
                v0Var.s5(new com.google.android.gms.internal.ads.g1(this.k2.jw, this, this.k2.fY, waVarSM, v0Var));
                bn.gn.post(new p1(this, v0Var));
            } else if (zaVarE3 != null && this.k2.e3 != null) {
                com.google.android.gms.internal.ads.c1 c1Var3 = new com.google.android.gms.internal.ads.c1(zaVarE3.FH(), zaVarE3.DW(), zaVarE3.gn(), zaVarE3.TI() != null ? zaVarE3.TI() : null, zaVarE3.Zo(), zaVarE3.er(), -1.0d, null, null, null, zaVarE3.getVideoController(), zaVarE3.ro() != null ? (View) xu.g3(zaVarE3.ro()) : null, zaVarE3.v5(), strCP, zaVarE3.tp());
                c1Var3.s5(new com.google.android.gms.internal.ads.g1(this.k2.jw, this, this.k2.fY, zaVarE3, c1Var3));
                lA(c1Var3);
            } else if (zaVarE3 != null && this.k2.eU != null) {
                com.google.android.gms.internal.ads.x0 x0Var = new com.google.android.gms.internal.ads.x0(zaVarE3.FH(), zaVarE3.DW(), zaVarE3.gn(), zaVarE3.TI() != null ? zaVarE3.TI() : null, zaVarE3.Zo(), zaVarE3.er(), null, zaVarE3.tp(), zaVarE3.getVideoController(), zaVarE3.ro() != null ? (View) xu.g3(zaVarE3.ro()) : null, zaVarE3.v5(), strCP);
                x0Var.s5(new com.google.android.gms.internal.ads.g1(this.k2.jw, this, this.k2.fY, zaVarE3, x0Var));
                bn.gn.post(new q1(this, x0Var));
            } else {
                if (b3VarLJ == null || this.k2.pO == null || this.k2.pO.get(b3VarLJ.vy()) == null) {
                    xp.u7("No matching mapper/listener for retrieved native ad template.");
                    HS(0);
                    return false;
                }
                bn.gn.post(new r1(this, b3VarLJ));
            }
            return super.tc(ylVar, ylVar2);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
            HS(0);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final m3 Aq(String str) {
        com.google.android.gms.common.internal.p.Hw("getOnCustomClickListener must be called on the main UI thread.");
        return this.k2.sg.get(str);
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void Bx() {
        xp.Zo("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    public final void G5(List<String> list) {
        com.google.android.gms.common.internal.p.Hw("setNativeTemplates must be called on the main UI thread.");
        this.k2.IS = list;
    }

    protected final void Iy(wu wuVar) {
        Object objG3 = wuVar != null ? xu.g3(wuVar) : null;
        if (objG3 instanceof com.google.android.gms.internal.ads.h1) {
            ((com.google.android.gms.internal.ads.h1) objG3).MP();
        }
        super.bd(this.k2.hK, false);
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final boolean Lm() {
        if (q6() != null) {
            return q6().XL;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.v9
    public final void Lx() {
        t9 t9Var;
        yl ylVar = this.k2.hK;
        if (ylVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(ylVar.aM) || (t9Var = this.k2.hK.QX) == null || !t9Var.DW()) {
            super.Lx();
        } else {
            yx();
        }
    }

    @Override // com.google.android.gms.ads.internal.a
    public final void MU(zl zlVar, com.google.android.gms.internal.ads.d0 d0Var) {
        this.kf = null;
        int i = zlVar.v5;
        if (i != -2) {
            this.kf = BF(zlVar, i);
        } else if (!zlVar.DW.w9) {
            xp.u7("partialAdState is not mediation");
            this.kf = BF(zlVar, 0);
        }
        if (this.kf != null) {
            bn.gn.post(new Runnable(this) { // from class: com.google.android.gms.ads.internal.n1
                private final m1 WB;

                {
                    this.WB = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.Qv();
                }
            });
            return;
        }
        zzwf zzwfVar = zlVar.Hw;
        if (zzwfVar != null) {
            this.k2.w9 = zzwfVar;
        }
        x0 x0Var = this.k2;
        x0Var.BR = 0;
        w0.Hw();
        x0 x0Var2 = this.k2;
        x0Var.AL = ie.j6(x0Var2.jw, this, zlVar, x0Var2.fY, null, this.Z1, this, d0Var);
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void Mr() {
        if (!this.Jl) {
            throw new IllegalStateException("Native Ad does not support pause().");
        }
        super.Mr();
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void NS() {
        t9 t9Var;
        x0 x0Var;
        s3 s3Var;
        super.NS();
        yl ylVar = this.k2.hK;
        if (ylVar == null || (t9Var = ylVar.QX) == null || !t9Var.j6() || (s3Var = (x0Var = this.k2).oy) == null) {
            return;
        }
        try {
            s3Var.ME(this, xu.sy(x0Var.jw));
            super.bd(this.k2.hK, false);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    final /* synthetic */ void Qv() {
        BJ(this.kf);
    }

    @Override // com.google.android.gms.ads.internal.z0
    protected final boolean S3(zzwb zzwbVar, yl ylVar, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void XL() {
        if (!this.Jl) {
            throw new IllegalStateException("Native Ad does not support resume().");
        }
        super.XL();
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final boolean f2() {
        if (q6() != null) {
            return q6().aM;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final yx0 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void h4(com.google.android.gms.internal.ads.h1 h1Var) {
        xp.Zo("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void ir(boolean z) {
        com.google.android.gms.common.internal.p.Hw("setManualImpressionsEnabled must be called from the main thread.");
        this.Q6 = z;
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final boolean p8(zzwb zzwbVar) {
        zzwb zzwbVar2 = zzwbVar;
        List<Integer> list = this.k2.aX;
        if (list != null && list.size() == 1 && this.k2.aX.get(0).intValue() == 2) {
            xp.j6("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            HS(0);
            return false;
        }
        if (this.k2.oy == null) {
            return super.p8(zzwbVar);
        }
        if (zzwbVar2.AL != this.Q6) {
            zzwbVar2 = new zzwb(zzwbVar2.WB, zzwbVar2.mb, zzwbVar2.jw, zzwbVar2.fY, zzwbVar2.qp, zzwbVar2.k2, zzwbVar2.zh, zzwbVar2.AL || this.Q6, zzwbVar2.w9, zzwbVar2.hK, zzwbVar2.cT, zzwbVar2.q7, zzwbVar2.Z1, zzwbVar2.n5, zzwbVar2.Q6, zzwbVar2.kf, zzwbVar2.Jl, zzwbVar2.iW, null, zzwbVar2.e3, zzwbVar2.sE);
        }
        return super.p8(zzwbVar2);
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void pM(View view) {
        xp.Zo("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void py() {
        xp.Zo("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void rB(com.google.android.gms.internal.ads.j0 j0Var) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean tc(com.google.android.gms.internal.ads.yl r5, com.google.android.gms.internal.ads.yl r6) {
        /*
            r4 = this;
            com.google.android.gms.ads.internal.x0 r0 = r4.k2
            boolean r0 = r0.Zo()
            if (r0 == 0) goto L94
            boolean r0 = r6.Ws
            r1 = 0
            if (r0 != 0) goto L16
            r4.HS(r1)
            java.lang.String r5 = "newState is not mediation."
            com.google.android.gms.internal.ads.xp.u7(r5)
            return r1
        L16:
            com.google.android.gms.internal.ads.t9 r0 = r6.QX
            r2 = 1
            if (r0 == 0) goto L64
            boolean r0 = r0.j6()
            if (r0 == 0) goto L64
            com.google.android.gms.ads.internal.x0 r0 = r4.k2
            boolean r0 = r0.Zo()
            if (r0 == 0) goto L38
            com.google.android.gms.ads.internal.x0 r0 = r4.k2
            com.google.android.gms.ads.internal.y0 r0 = r0.k2
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzazc r0 = r0.j6()
            java.lang.String r3 = r6.BT
            r0.J0(r3)
        L38:
            boolean r0 = super.tc(r5, r6)
            if (r0 != 0) goto L40
        L3e:
            r5 = 0
            goto L5e
        L40:
            com.google.android.gms.ads.internal.x0 r0 = r4.k2
            boolean r0 = r0.Zo()
            if (r0 == 0) goto L52
            boolean r5 = r4.CZ(r5, r6)
            if (r5 != 0) goto L52
            r4.HS(r1)
            goto L3e
        L52:
            com.google.android.gms.ads.internal.x0 r5 = r4.k2
            boolean r5 = r5.VH()
            if (r5 != 0) goto L5d
            super.BH(r6, r1)
        L5d:
            r5 = 1
        L5e:
            if (r5 != 0) goto L61
            return r1
        L61:
            r4.Jl = r2
            goto L75
        L64:
            com.google.android.gms.internal.ads.t9 r0 = r6.QX
            if (r0 == 0) goto L8b
            boolean r0 = r0.DW()
            if (r0 == 0) goto L8b
            boolean r5 = r4.se(r5, r6)
            if (r5 != 0) goto L75
            return r1
        L75:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.lang.Integer[] r6 = new java.lang.Integer[r2]
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r1] = r0
            java.util.List r6 = java.util.Arrays.asList(r6)
            r5.<init>(r6)
            r4.zs(r5)
            return r2
        L8b:
            r4.HS(r1)
            java.lang.String r5 = "Response is neither banner nor native."
            com.google.android.gms.internal.ads.xp.u7(r5)
            return r1
        L94:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "AdLoader API does not support custom rendering."
            r5.<init>(r6)
            goto L9d
        L9c:
            throw r5
        L9d:
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.m1.tc(com.google.android.gms.internal.ads.yl, com.google.android.gms.internal.ads.yl):boolean");
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final boolean vZ() {
        if (q6() != null) {
            return q6().QX;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void xg(com.google.android.gms.internal.ads.f1 f1Var) {
        xp.Zo("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void ys() {
        xp.Zo("#005 Unexpected call to an abstract (unimplemented) method.", null);
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.v9
    public final void z5() {
        t9 t9Var;
        yl ylVar = this.k2.hK;
        if (ylVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(ylVar.aM) || (t9Var = this.k2.hK.QX) == null || !t9Var.DW()) {
            super.z5();
        } else {
            dY();
        }
    }

    public final void zs(List<Integer> list) {
        com.google.android.gms.common.internal.p.Hw("setAllowedAdTypes must be called on the main UI thread.");
        this.k2.aX = list;
    }
}
