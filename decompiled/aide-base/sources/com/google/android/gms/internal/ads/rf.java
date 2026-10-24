package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class rf implements nf<cv> {
    private final zzaa DW;
    private final m1 FH;
    private final Context Hw;
    private final vb0 VH;
    private final com.google.android.gms.ads.internal.c0 Zo;
    private String gn;
    private vq<cv> j6;
    private final zzbbi v5;

    public rf(Context context, com.google.android.gms.ads.internal.c0 c0Var, String str, vb0 vb0Var, zzbbi zzbbiVar) {
        xp.gn("Webview loading for native ads.");
        this.Hw = context;
        this.Zo = c0Var;
        this.VH = vb0Var;
        this.v5 = zzbbiVar;
        this.gn = str;
        com.google.android.gms.ads.internal.w0.Zo();
        vq<cv> vqVarJ6 = iv.j6(this.Hw, this.v5, (String) cw0.v5().FH(p.ct), this.VH, this.Zo.fY());
        this.DW = new zzaa(this.Hw);
        this.FH = new m1(c0Var, str);
        vq<cv> vqVarDW = jq.DW(vqVarJ6, new eq(this) { // from class: com.google.android.gms.internal.ads.sf
            private final rf j6;

            {
                this.j6 = this;
            }

            @Override // com.google.android.gms.internal.ads.eq
            public final vq j6(Object obj) {
                return this.j6.we((cv) obj);
            }
        }, ar.DW);
        this.j6 = vqVarDW;
        hq.j6(vqVarDW, "WebViewNativeAdsUtil.constructor");
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final vq<JSONObject> DW(final JSONObject jSONObject) {
        return jq.DW(this.j6, new eq(this, jSONObject) { // from class: com.google.android.gms.internal.ads.uf
            private final JSONObject DW;
            private final rf j6;

            {
                this.j6 = this;
                this.DW = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.eq
            public final vq j6(Object obj) {
                return this.j6.tp(this.DW, (cv) obj);
            }
        }, ar.j6);
    }

    final /* synthetic */ vq EQ(JSONObject jSONObject, cv cvVar) throws JSONException {
        jSONObject.put("ads_id", this.gn);
        fr frVar = new fr();
        cvVar.sh("/nativeAdPreProcess", new xf(this, cvVar, frVar));
        cvVar.tp("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return frVar;
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final void FH() {
        jq.VH(this.j6, new cg(this), ar.j6);
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final vq<JSONObject> Hw(final JSONObject jSONObject) {
        return jq.DW(this.j6, new eq(this, jSONObject) { // from class: com.google.android.gms.internal.ads.tf
            private final JSONObject DW;
            private final rf j6;

            {
                this.j6 = this;
                this.DW = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.eq
            public final vq j6(Object obj) {
                return this.j6.EQ(this.DW, (cv) obj);
            }
        }, ar.j6);
    }

    final /* synthetic */ vq VH(JSONObject jSONObject, cv cvVar) throws JSONException {
        jSONObject.put("ads_id", this.gn);
        cvVar.tp("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return jq.J0(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final vq<JSONObject> Zo(final JSONObject jSONObject) {
        return jq.DW(this.j6, new eq(this, jSONObject) { // from class: com.google.android.gms.internal.ads.vf
            private final JSONObject DW;
            private final rf j6;

            {
                this.j6 = this;
                this.DW = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.eq
            public final vq j6(Object obj) {
                return this.j6.u7(this.DW, (cv) obj);
            }
        }, ar.j6);
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        jq.VH(this.j6, new ag(this, str, b0Var), ar.j6);
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final void j6(String str, JSONObject jSONObject) {
        jq.VH(this.j6, new bg(this, str, jSONObject), ar.j6);
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        jq.VH(this.j6, new zf(this, str, b0Var), ar.j6);
    }

    final /* synthetic */ vq tp(JSONObject jSONObject, cv cvVar) throws JSONException {
        jSONObject.put("ads_id", this.gn);
        cvVar.tp("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return jq.J0(new JSONObject());
    }

    final /* synthetic */ vq u7(JSONObject jSONObject, cv cvVar) throws JSONException {
        jSONObject.put("ads_id", this.gn);
        cvVar.tp("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return jq.J0(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.nf
    public final vq<JSONObject> v5(final JSONObject jSONObject) {
        return jq.DW(this.j6, new eq(this, jSONObject) { // from class: com.google.android.gms.internal.ads.wf
            private final JSONObject DW;
            private final rf j6;

            {
                this.j6 = this;
                this.DW = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.eq
            public final vq j6(Object obj) {
                return this.j6.VH(this.DW, (cv) obj);
            }
        }, ar.j6);
    }

    final /* synthetic */ vq we(cv cvVar) {
        xp.gn("Javascript has loaded for native ads.");
        kw kwVarAF = cvVar.AF();
        com.google.android.gms.ads.internal.c0 c0Var = this.Zo;
        kwVarAF.v5(c0Var, c0Var, c0Var, c0Var, c0Var, false, null, new com.google.android.gms.ads.internal.t1(this.Hw, null, null), null, null);
        cvVar.sh("/logScionEvent", this.DW);
        cvVar.sh("/logScionEvent", this.FH);
        return jq.J0(cvVar);
    }
}
