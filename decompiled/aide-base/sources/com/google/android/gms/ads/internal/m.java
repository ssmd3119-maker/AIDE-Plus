package com.google.android.gms.ads.internal;

import abcd.wu;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.ej;
import com.google.android.gms.internal.ads.fr0;
import com.google.android.gms.internal.ads.iv;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.kw;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qi;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzawd;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class m extends e1 implements com.google.android.gms.ads.internal.gmsg.h, com.google.android.gms.ads.internal.gmsg.f0 {
    private int Jl;
    private boolean e3;
    private float eU;
    private final ej fN;
    private boolean iW;
    private transient boolean kf;
    private final String pO;
    private nl sE;
    private String sg;

    public m(Context context, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar, s1 s1Var) {
        super(context, zzwfVar, str, kaVar, zzbbiVar, s1Var);
        this.Jl = -1;
        boolean z = false;
        this.kf = false;
        if (zzwfVar != null && "reward_mb".equals(zzwfVar.WB)) {
            z = true;
        }
        this.pO = z ? "/Rewarded" : "/Interstitial";
        this.fN = z ? new ej(this.k2, this.Z1, new o(this), this, this) : null;
    }

    private final boolean Iz(boolean z) {
        return this.fN != null && z;
    }

    private final void xL(Bundle bundle) {
        bn bnVarV5 = w0.v5();
        x0 x0Var = this.k2;
        bnVarV5.g3(x0Var.jw, x0Var.qp.WB, "gmob-apps", bundle, false);
    }

    private static zl zs(zl zlVar) throws JSONException {
        try {
            String string = qi.Zo(zlVar.DW).toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zlVar.j6.qp);
            t9 t9Var = new t9(string, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L);
            zzasm zzasmVar = zlVar.DW;
            u9 u9Var = new u9(Collections.singletonList(t9Var), ((Long) cw0.v5().FH(com.google.android.gms.internal.ads.p.ys)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzasmVar.Nh, zzasmVar.BR, "", -1L, 0, 1, null, 0, -1, -1L, false);
            return new zl(zlVar.j6, new zzasm(zlVar.j6, zzasmVar.jw, zzasmVar.fY, Collections.emptyList(), Collections.emptyList(), zzasmVar.AL, true, zzasmVar.hK, Collections.emptyList(), zzasmVar.q7, zzasmVar.Z1, zzasmVar.n5, zzasmVar.Q6, zzasmVar.kf, zzasmVar.Jl, zzasmVar.iW, null, zzasmVar.e3, zzasmVar.sE, zzasmVar.sg, zzasmVar.pO, zzasmVar.fN, zzasmVar.pN, zzasmVar.oy, zzasmVar.aX, null, Collections.emptyList(), Collections.emptyList(), zzasmVar.a5, zzasmVar.ys, zzasmVar.IS, zzasmVar.gG, zzasmVar.Nh, zzasmVar.BR, zzasmVar.AE, null, zzasmVar.An, zzasmVar.Pa, zzasmVar.ce, zzasmVar.Bx, 0, zzasmVar.qP, Collections.emptyList(), zzasmVar.Of, zzasmVar.PT, zzasmVar.b1, zzasmVar.AR), u9Var, zlVar.Hw, zlVar.v5, zlVar.Zo, zlVar.VH, null, zlVar.u7, null);
        } catch (JSONException e) {
            xp.Hw("Unable to generate ad state for an interstitial ad with pooling.", e);
            return zlVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.e1
    protected final cv BF(zl zlVar, t1 t1Var, jl jlVar) {
        w0.Zo();
        x0 x0Var = this.k2;
        Context context = x0Var.jw;
        pw pwVarU7 = pw.u7(x0Var.w9);
        x0 x0Var2 = this.k2;
        cv cvVarDW = iv.DW(context, pwVarU7, x0Var2.w9.WB, false, false, x0Var2.fY, x0Var2.qp, this.WB, this, this.q7, zlVar.u7);
        cvVarDW.AF().v5(this, this, null, this, this, true, this, t1Var, this, jlVar);
        lA(cvVarDW);
        cvVarDW.Lz(zlVar.j6.sg);
        cvVarDW.sh("/reward", new com.google.android.gms.ads.internal.gmsg.g(this));
        return cvVarDW;
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.overlay.m
    public final void Do() {
        super.Do();
        this.AL.VH(this.k2.hK);
        nl nlVar = this.sE;
        if (nlVar != null) {
            nlVar.DW(false);
        }
        this.cT = null;
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void Jz() {
        com.google.android.gms.ads.internal.overlay.c cVarJu = this.k2.hK.DW.ju();
        if (cVarJu != null) {
            cVarJu.k6();
        }
    }

    @Override // com.google.android.gms.ads.internal.e1, com.google.android.gms.ads.internal.a
    public final void MU(zl zlVar, com.google.android.gms.internal.ads.d0 d0Var) {
        if (zlVar.v5 != -2) {
            super.MU(zlVar, d0Var);
            return;
        }
        if (Iz(zlVar.FH != null)) {
            this.fN.EQ();
            return;
        }
        if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.zh)).booleanValue()) {
            super.MU(zlVar, d0Var);
            return;
        }
        boolean z = !zlVar.DW.w9;
        if (a.d7(zlVar.j6.jw) && z) {
            this.k2.cT = zs(zlVar);
        }
        super.MU(this.k2.cT, d0Var);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.f0
    public final void Mx(boolean z, float f) {
        this.iW = z;
        this.eU = f;
    }

    @Override // com.google.android.gms.ads.internal.e1, com.google.android.gms.ads.internal.a
    protected final void NS() {
        zzasm zzasmVar;
        yl ylVar = this.k2.hK;
        cv cvVar = ylVar != null ? ylVar.DW : null;
        zl zlVar = this.k2.cT;
        if (zlVar != null && (zzasmVar = zlVar.DW) != null && zzasmVar.qP && cvVar != null && w0.a8().v5(this.k2.jw)) {
            zzbbi zzbbiVar = this.k2.qp;
            int i = zzbbiVar.mb;
            int i2 = zzbbiVar.jw;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            wu wuVarDW = w0.a8().DW(sb.toString(), cvVar.getWebView(), "", "javascript", ty());
            this.cT = wuVarDW;
            if (wuVarDW != null && cvVar.getView() != null) {
                w0.a8().Hw(this.cT, cvVar.getView());
                cvVar.v2(this.cT);
                w0.a8().VH(this.cT);
            }
        }
        super.NS();
        this.kf = true;
    }

    public final void Qv() {
        w0.yS().FH(Integer.valueOf(this.Jl));
        if (this.k2.Zo()) {
            this.k2.Hw();
            x0 x0Var = this.k2;
            x0Var.hK = null;
            x0Var.AE = false;
            this.kf = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.z0
    protected final boolean S3(zzwb zzwbVar, yl ylVar, boolean z) {
        if (this.k2.Zo() && ylVar.DW != null) {
            w0.VH();
            jn.aM(ylVar.DW);
        }
        return this.qp.tp();
    }

    @Override // com.google.android.gms.ads.internal.gmsg.h
    public final void Ve() {
        yl ylVar = this.k2.hK;
        if (Iz(ylVar != null && ylVar.Ws)) {
            this.fN.we();
            yP();
            return;
        }
        yl ylVar2 = this.k2.hK;
        if (ylVar2 != null && ylVar2.rN != null) {
            w0.v5();
            x0 x0Var = this.k2;
            bn.Ws(x0Var.jw, x0Var.qp.WB, x0Var.hK.rN);
        }
        yP();
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void is() {
        Qv();
        super.is();
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.overlay.m
    public final void lb() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        yl ylVar;
        cv cvVar;
        yl ylVar2;
        cv cvVar2;
        kw kwVarAF;
        VH();
        super.lb();
        yl ylVar3 = this.k2.hK;
        if (ylVar3 != null && (cvVar2 = ylVar3.DW) != null && (kwVarAF = cvVar2.AF()) != null) {
            kwVarAF.Zo();
        }
        if (w0.ei().U2(this.k2.jw) && (ylVar2 = this.k2.hK) != null && ylVar2.DW != null) {
            w0.ei().J0(this.k2.hK.DW.getContext(), this.sg);
        }
        nl nlVar = this.sE;
        if (nlVar != null) {
            nlVar.DW(true);
        }
        if (this.cT == null || (ylVar = this.k2.hK) == null || (cvVar = ylVar.DW) == null) {
            return;
        }
        cvVar.v5("onSdkImpression", new HashMap());
    }

    @Override // com.google.android.gms.ads.internal.gmsg.h
    public final void mj() {
        yl ylVar = this.k2.hK;
        if (Iz(ylVar != null && ylVar.Ws)) {
            this.fN.J0();
        }
        na();
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    public final boolean nG(zzwb zzwbVar, com.google.android.gms.internal.ads.d0 d0Var) {
        if (this.k2.hK != null) {
            xp.u7("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.sE == null && a.d7(zzwbVar) && w0.ei().U2(this.k2.jw) && !TextUtils.isEmpty(this.k2.mb)) {
            x0 x0Var = this.k2;
            this.sE = new nl(x0Var.jw, x0Var.mb);
        }
        return super.nG(zzwbVar, d0Var);
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void sG(boolean z) {
        com.google.android.gms.common.internal.p.Hw("setImmersiveMode must be called on the main UI thread.");
        this.e3 = z;
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        Bitmap bitmapRo;
        na naVar;
        com.google.android.gms.common.internal.p.Hw("showInterstitial must be called on the main UI thread.");
        yl ylVar = this.k2.hK;
        if (Iz(ylVar != null && ylVar.Ws)) {
            this.fN.Zo(this.e3);
            return;
        }
        if (w0.ei().U2(this.k2.jw)) {
            String strA8 = w0.ei().a8(this.k2.jw);
            this.sg = strA8;
            String strValueOf = String.valueOf(strA8);
            String strValueOf2 = String.valueOf(this.pO);
            this.sg = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        }
        if (this.k2.hK == null) {
            xp.u7("The interstitial has not loaded.");
            return;
        }
        if (!this.kf) {
            if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.gM)).booleanValue()) {
                return;
            }
        }
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.CU)).booleanValue()) {
            w0.v5();
            if (bn.SI(this.k2.jw)) {
                xp.u7("It is not recommended to show an interstitial when app is not in foreground.");
                return;
            }
        }
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.e9)).booleanValue()) {
            String packageName = this.k2.jw.getApplicationContext() != null ? this.k2.jw.getApplicationContext().getPackageName() : this.k2.jw.getPackageName();
            if (!this.kf) {
                xp.u7("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                xL(bundle);
            }
            w0.v5();
            if (!bn.nw(this.k2.jw)) {
                xp.u7("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                xL(bundle2);
            }
        }
        if (this.k2.VH()) {
            return;
        }
        yl ylVar2 = this.k2.hK;
        if (ylVar2.Ws && (naVar = ylVar2.XL) != null) {
            try {
                naVar.sG(this.e3);
                this.k2.hK.XL.showInterstitial();
                return;
            } catch (RemoteException e) {
                xp.v5("Could not show interstitial.", e);
                Qv();
                return;
            }
        }
        cv cvVar = this.k2.hK.DW;
        if (cvVar == null) {
            xp.u7("The interstitial failed to load.");
            return;
        }
        if (cvVar.BR()) {
            xp.u7("The interstitial is already showing.");
            return;
        }
        this.k2.hK.DW.dH(true);
        x0 x0Var = this.k2;
        x0Var.DW(x0Var.hK.DW.getView());
        x0 x0Var2 = this.k2;
        yl ylVar3 = x0Var2.hK;
        if (ylVar3.EQ != null) {
            this.AL.DW(x0Var2.w9, ylVar3);
        }
        if (com.google.android.gms.common.util.o.j6()) {
            final yl ylVar4 = this.k2.hK;
            if (ylVar4.j6()) {
                new fr0(this.k2.jw, ylVar4.DW.getView()).Hw(ylVar4.DW);
            } else {
                ylVar4.DW.AF().VH(new nw(this, ylVar4) { // from class: com.google.android.gms.ads.internal.n
                    private final yl DW;
                    private final m j6;

                    {
                        this.j6 = this;
                        this.DW = ylVar4;
                    }

                    @Override // com.google.android.gms.internal.ads.nw
                    public final void j6() {
                        m mVar = this.j6;
                        yl ylVar5 = this.DW;
                        new fr0(mVar.k2.jw, ylVar5.DW.getView()).Hw(ylVar5.DW);
                    }
                });
            }
        }
        if (this.k2.AE) {
            w0.v5();
            bitmapRo = bn.ro(this.k2.jw);
        } else {
            bitmapRo = null;
        }
        int iDW = w0.yS().DW(bitmapRo);
        this.Jl = iDW;
        if (bitmapRo != null) {
            new p(this, iDW).u7();
            return;
        }
        boolean z = this.k2.AE;
        w0.v5();
        boolean zSf = bn.Sf(this.k2.jw);
        boolean z2 = this.e3;
        yl ylVar5 = this.k2.hK;
        zzaq zzaqVar = new zzaq(z, zSf, false, 0.0f, -1, z2, ylVar5.dx, ylVar5.Sf);
        int requestedOrientation = this.k2.hK.DW.getRequestedOrientation();
        if (requestedOrientation == -1) {
            requestedOrientation = this.k2.hK.gn;
        }
        x0 x0Var3 = this.k2;
        yl ylVar6 = x0Var3.hK;
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, ylVar6.DW, requestedOrientation, x0Var3.qp, ylVar6.BT, zzaqVar);
        w0.FH();
        com.google.android.gms.ads.internal.overlay.k.j6(this.k2.jw, adOverlayInfoParcel, true);
    }

    @Override // com.google.android.gms.ads.internal.e1, com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    public final boolean tc(yl ylVar, yl ylVar2) {
        x0 x0Var;
        View view;
        if (Iz(ylVar2.Ws)) {
            return ej.v5(ylVar, ylVar2);
        }
        if (!super.tc(ylVar, ylVar2)) {
            return false;
        }
        if (!this.k2.Zo() && (view = (x0Var = this.k2).Nh) != null && ylVar2.EQ != null) {
            this.AL.FH(x0Var.w9, ylVar2, view);
        }
        bd(ylVar2, false);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.h
    public final void tv(zzawd zzawdVar) {
        yl ylVar = this.k2.hK;
        if (Iz(ylVar != null && ylVar.Ws)) {
            CO(this.fN.VH(zzawdVar));
            return;
        }
        yl ylVar2 = this.k2.hK;
        if (ylVar2 != null) {
            if (ylVar2.er != null) {
                w0.v5();
                x0 x0Var = this.k2;
                bn.Ws(x0Var.jw, x0Var.qp.WB, x0Var.hK.er);
            }
            zzawd zzawdVar2 = this.k2.hK.lg;
            if (zzawdVar2 != null) {
                zzawdVar = zzawdVar2;
            }
        }
        CO(zzawdVar);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.f0
    public final void vS(boolean z) {
        this.k2.AE = z;
    }
}
