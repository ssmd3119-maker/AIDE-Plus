package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class r6 extends vw0 {
    private final String WB;
    private com.google.android.gms.ads.internal.m fY;
    private final h5 jw;
    private boolean mb;
    private final j6 qp;

    private r6(String str, h5 h5Var) {
        this.WB = str;
        this.jw = h5Var;
        this.qp = new j6();
        com.google.android.gms.ads.internal.w0.j3().DW(h5Var);
    }

    private final void Mt() {
        if (this.fY != null) {
            return;
        }
        com.google.android.gms.ads.internal.m mVarDW = this.jw.DW(this.WB);
        this.fY = mVarDW;
        this.qp.j6(mVarDW);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final zzwf I8() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            return mVar.I8();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final jw0 JP() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void JX(fw0 fw0Var) {
        j6 j6Var = this.qp;
        j6Var.v5 = fw0Var;
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            j6Var.j6(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Jl() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            return mVar.Jl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean KD() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        return mVar != null && mVar.KD();
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Mr() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.Mr();
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Nh() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void OM() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.OM();
        } else {
            xp.u7("Interstitial ad must be loaded before pingManualTrackingUrl().");
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final abcd.wu Tv() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            return mVar.Tv();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void XL() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.XL();
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final Bundle XX() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        return mVar != null ? mVar.XX() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Xa(String str) {
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Zz(zzzw zzzwVar) {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void br(wj wjVar) {
        j6 j6Var = this.qp;
        j6Var.Zo = wjVar;
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            j6Var.j6(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean cT() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        return mVar != null && mVar.cT();
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void cX(sd sdVar) {
        xp.u7("setInAppPurchaseListener is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void destroy() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void dz(zzwf zzwfVar) {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.dz(zzwfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ek(ix0 ix0Var) {
        Mt();
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.ek(ix0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ew(String str) {
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final yx0 getVideoController() {
        throw new IllegalStateException("getVideoController not implemented for interstitials");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ir(boolean z) {
        Mt();
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.ir(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void lR(cx0 cx0Var) {
        j6 j6Var = this.qp;
        j6Var.FH = cx0Var;
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            j6Var.j6(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final cx0 oR() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean p8(zzwb zzwbVar) {
        if (!m6.u7(zzwbVar).contains("gw")) {
            Mt();
        }
        if (m6.u7(zzwbVar).contains("_skipMediation")) {
            Mt();
        }
        if (zzwbVar.hK != null) {
            Mt();
        }
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            return mVar.p8(zzwbVar);
        }
        m6 m6VarJ3 = com.google.android.gms.ads.internal.w0.j3();
        if (m6.u7(zzwbVar).contains("_ad")) {
            m6VarJ3.v5(zzwbVar, this.WB);
        }
        p6 p6VarJ6 = m6VarJ3.j6(zzwbVar, this.WB);
        if (p6VarJ6 == null) {
            Mt();
            q6.DW().Zo();
            return this.fY.p8(zzwbVar);
        }
        if (p6VarJ6.v5) {
            q6.DW().v5();
        } else {
            p6VarJ6.j6();
            q6.DW().Zo();
        }
        this.fY = p6VarJ6.j6;
        p6VarJ6.FH.DW(this.qp);
        this.qp.j6(this.fY);
        return p6VarJ6.Zo;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void rB(j0 j0Var) {
        j6 j6Var = this.qp;
        j6Var.Hw = j0Var;
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            j6Var.j6(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void sG(boolean z) {
        this.mb = z;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar == null) {
            xp.u7("Interstitial ad must be loaded before showInterstitial().");
        } else {
            mVar.sG(this.mb);
            this.fY.showInterstitial();
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void stopLoading() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            mVar.stopLoading();
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void tD(zd zdVar, String str) {
        xp.u7("setPlayStorePurchaseParams is deprecated and should not be called.");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String u7() {
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            return mVar.u7();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void uy(zzyv zzyvVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void xt(jw0 jw0Var) {
        j6 j6Var = this.qp;
        j6Var.j6 = jw0Var;
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            j6Var.j6(mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ye(zw0 zw0Var) {
        j6 j6Var = this.qp;
        j6Var.DW = zw0Var;
        com.google.android.gms.ads.internal.m mVar = this.fY;
        if (mVar != null) {
            j6Var.j6(mVar);
        }
    }

    public r6(Context context, String str, ka kaVar, zzbbi zzbbiVar, com.google.android.gms.ads.internal.s1 s1Var) {
        this(str, new h5(context, kaVar, zzbbiVar, s1Var));
    }
}
