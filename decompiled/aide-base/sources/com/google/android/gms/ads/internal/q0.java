package com.google.android.gms.ads.internal;

import abcd.iy;
import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.vb0;
import com.google.android.gms.internal.ads.vw0;
import com.google.android.gms.internal.ads.wb0;
import com.google.android.gms.internal.ads.wj;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.zm;
import com.google.android.gms.internal.ads.zw0;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzw;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class q0 extends vw0 {
    private vb0 AL;
    private final zzbbi WB;
    private final Context fY;
    private final Future<vb0> jw = zm.j6(new t0(this));
    private WebView k2;
    private final zzwf mb;
    private final v0 qp;
    private AsyncTask<Void, Void, String> w9;
    private jw0 zh;

    public q0(Context context, zzwf zzwfVar, String str, zzbbi zzbbiVar) {
        this.fY = context;
        this.WB = zzbbiVar;
        this.mb = zzwfVar;
        this.k2 = new WebView(this.fY);
        this.qp = new v0(str);
        HS(0);
        this.k2.setVerticalScrollBarEnabled(false);
        this.k2.getSettings().setJavaScriptEnabled(true);
        this.k2.setWebViewClient(new r0(this));
        this.k2.setOnTouchListener(new s0(this));
    }

    private static /* synthetic */ void Mt(Object obj, Intent intent) {
        ((Context) obj).startActivity(intent);
        iy.BT(obj, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d7(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        Mt(this.fY, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String tc(String str) {
        if (this.AL == null) {
            return str;
        }
        Uri uriDW = Uri.parse(str);
        try {
            uriDW = this.AL.DW(uriDW, this.fY, null, null);
        } catch (wb0 e) {
            xp.v5("Unable to process ad data", e);
        }
        return uriDW.toString();
    }

    final String Dn() {
        String strFH = this.qp.FH();
        if (TextUtils.isEmpty(strFH)) {
            strFH = "www.google.com";
        }
        String str = (String) cw0.v5().FH(com.google.android.gms.internal.ads.p.om);
        StringBuilder sb = new StringBuilder(String.valueOf(strFH).length() + 8 + String.valueOf(str).length());
        sb.append("https://");
        sb.append(strFH);
        sb.append(str);
        return sb.toString();
    }

    final void HS(int i) {
        if (this.k2 == null) {
            return;
        }
        this.k2.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final zzwf I8() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final jw0 JP() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void JX(fw0 fw0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Jl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean KD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Mr() {
        com.google.android.gms.common.internal.p.Hw("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Nh() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void OM() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final wu Tv() {
        com.google.android.gms.common.internal.p.Hw("getAdFrame must be called on the main UI thread.");
        return xu.sy(this.k2);
    }

    final int UE(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            cw0.j6();
            return mp.j6(this.fY, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void XL() {
        com.google.android.gms.common.internal.p.Hw("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final Bundle XX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Xa(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Zz(zzzw zzzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void br(wj wjVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean cT() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void cX(sd sdVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void destroy() {
        com.google.android.gms.common.internal.p.Hw("destroy must be called on the main UI thread.");
        this.w9.cancel(true);
        this.jw.cancel(true);
        this.k2.destroy();
        this.k2 = null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void dz(zzwf zzwfVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ek(ix0 ix0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ew(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final yx0 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ir(boolean z) {
    }

    final String is() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) cw0.v5().FH(com.google.android.gms.internal.ads.p.om));
        builder.appendQueryParameter("query", this.qp.j6());
        builder.appendQueryParameter("pubId", this.qp.Hw());
        Map<String, String> mapV5 = this.qp.v5();
        for (String str : mapV5.keySet()) {
            builder.appendQueryParameter(str, mapV5.get(str));
        }
        Uri uriBuild = builder.build();
        vb0 vb0Var = this.AL;
        if (vb0Var != null) {
            try {
                uriBuild = vb0Var.j6(uriBuild, this.fY);
            } catch (wb0 e) {
                xp.v5("Unable to process ad data", e);
            }
        }
        String strDn = Dn();
        String encodedQuery = uriBuild.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(strDn).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(strDn);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void lR(cx0 cx0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final cx0 oR() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean p8(zzwb zzwbVar) {
        com.google.android.gms.common.internal.p.tp(this.k2, "This Search Ad has already been torn down");
        this.qp.DW(zzwbVar, this.WB);
        this.w9 = new u0(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void rB(com.google.android.gms.internal.ads.j0 j0Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void sG(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void tD(zd zdVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String u7() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void uy(zzyv zzyvVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void xt(jw0 jw0Var) {
        this.zh = jw0Var;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ye(zw0 zw0Var) {
        throw new IllegalStateException("Unused method");
    }
}
