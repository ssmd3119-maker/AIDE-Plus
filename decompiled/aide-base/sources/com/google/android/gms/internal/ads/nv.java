package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.Map;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class nv extends FrameLayout implements cv {
    private final cv WB;
    private final ks mb;

    public nv(cv cvVar) {
        super(cvVar.getContext());
        this.WB = cvVar;
        this.mb = new ks(cvVar.fF(), this, this);
        addView(this.WB.getView());
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void AE() {
        this.WB.AE();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final kw AF() {
        return this.WB.AF();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void AT(Context context) {
        this.WB.AT(context);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void Ay(boolean z) {
        this.WB.Ay(z);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.aw
    public final boolean BR() {
        return this.WB.BR();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final boolean C7() {
        return this.WB.C7();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final sv CU() {
        return this.WB.CU();
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void DW(String str) {
        this.WB.DW(str);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void EV(com.google.android.gms.ads.internal.overlay.c cVar) {
        this.WB.EV(cVar);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final void Ev(sv svVar) {
        this.WB.Ev(svVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void F9(boolean z) {
        this.WB.F9(z);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void GK() {
        this.WB.GK();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void Hw(boolean z, int i) {
        this.WB.Hw(z, i);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int IS() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void J0(boolean z, int i, String str) {
        this.WB.J0(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public final void J8(ir0 ir0Var) {
        this.WB.J8(ir0Var);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void LI() {
        this.WB.LI();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void Lz(String str) {
        this.WB.Lz(str);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void M8(boolean z) {
        this.WB.M8(z);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void MQ(com.google.android.gms.ads.internal.overlay.c cVar) {
        this.WB.MQ(cVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final boolean NZ() {
        return this.WB.NZ();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void Nh() {
        this.WB.Nh();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final boolean Nk() {
        return this.WB.Nk();
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final void O1() {
        this.WB.O1();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void QJ() {
        this.WB.QJ();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final a0 QO() {
        return this.WB.QO();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void RH(int i) {
        this.WB.RH(i);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final abcd.wu Rr() {
        return this.WB.Rr();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final String Wo() {
        return this.WB.Wo();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void XL(boolean z, int i, String str, String str2) {
        this.WB.XL(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final WebViewClient ZX() {
        return this.WB.ZX();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void a5(boolean z, long j) {
        this.WB.a5(z, j);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final ks aX() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.gw
    public final pw aq() {
        return this.WB.aq();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void ba(pw pwVar) {
        this.WB.ba(pwVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void dH(boolean z) {
        this.WB.dH(z);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void destroy() {
        abcd.wu wuVarRr = Rr();
        if (wuVarRr == null) {
            this.WB.destroy();
            return;
        }
        com.google.android.gms.ads.internal.w0.a8().gn(wuVarRr);
        bn.gn.postDelayed(new ov(this), ((Integer) cw0.v5().FH(p.F3)).intValue());
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.zv
    public final Activity dx() {
        return this.WB.dx();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void e9(boolean z) {
        this.WB.e9(z);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final Context fF() {
        return this.WB.fF();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final com.google.android.gms.ads.internal.s1 fY() {
        return this.WB.fY();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final com.google.android.gms.ads.internal.overlay.c fh() {
        return this.WB.fh();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        this.WB.g3(str, b0Var);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void g4(boolean z) {
        this.WB.g4(z);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final String gG() {
        return this.WB.gG();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final View.OnClickListener getOnClickListener() {
        return this.WB.getOnClickListener();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final int getRequestedOrientation() {
        return this.WB.getRequestedOrientation();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.jw
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final WebView getWebView() {
        return this.WB.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void gn(zzc zzcVar) {
        this.WB.gn(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void h2() {
        TextView textView = new TextView(getContext());
        Resources resourcesDW = com.google.android.gms.ads.internal.w0.u7().DW();
        textView.setText(resourcesDW != null ? resourcesDW.getString(abcd.mu.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (Build.VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void hk() {
        setBackgroundColor(0);
        this.WB.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final boolean isDestroyed() {
        return this.WB.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void j6(String str, JSONObject jSONObject) {
        this.WB.j6(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final boolean jT() {
        return this.WB.jT();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final com.google.android.gms.ads.internal.overlay.c ju() {
        return this.WB.ju();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void loadData(String str, String str2, String str3) {
        this.WB.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.WB.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void loadUrl(String str) {
        this.WB.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void onPause() {
        this.mb.DW();
        this.WB.onPause();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void onResume() {
        this.WB.onResume();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final void oy(String str, fu fuVar) {
        this.WB.oy(str, fuVar);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final b0 pN() {
        return this.WB.pN();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.hw
    public final vb0 pO() {
        return this.WB.pO();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void qN() {
        this.WB.qN();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void qj() {
        this.WB.qj();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final f1 r() {
        return this.WB.r();
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final void rk() {
        this.WB.rk();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int sM() {
        return getMeasuredHeight();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.cv
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.WB.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.cv
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.WB.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void setRequestedOrientation(int i) {
        this.WB.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.WB.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.WB.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        this.WB.sh(str, b0Var);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void stopLoading() {
        this.WB.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.iw
    public final zzbbi sy() {
        return this.WB.sy();
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void tp(String str, JSONObject jSONObject) {
        this.WB.tp(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void v2(abcd.wu wuVar) {
        this.WB.v2(wuVar);
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void v5(String str, Map<String, ?> map) {
        this.WB.v5(str, map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void vF(f1 f1Var) {
        this.WB.vF(f1Var);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void wM(String str, String str2, String str3) {
        this.WB.wM(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void ya(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> pVar) {
        this.WB.ya(str, pVar);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final fu ys(String str) {
        return this.WB.ys(str);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void zf() {
        this.mb.j6();
        this.WB.zf();
    }
}
