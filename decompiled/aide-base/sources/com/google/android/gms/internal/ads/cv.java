package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface cv extends com.google.android.gms.ads.internal.p0, u6, t7, ss, zv, aw, ew, hw, iw, jw, jr0 {
    kw AF();

    void AT(Context context);

    void Ay(boolean z);

    @Override // com.google.android.gms.internal.ads.aw
    boolean BR();

    boolean C7();

    @Override // com.google.android.gms.internal.ads.ss
    sv CU();

    void EV(com.google.android.gms.ads.internal.overlay.c cVar);

    @Override // com.google.android.gms.internal.ads.ss
    void Ev(sv svVar);

    void F9(boolean z);

    void GK();

    void LI();

    void Lz(String str);

    void M8(boolean z);

    void MQ(com.google.android.gms.ads.internal.overlay.c cVar);

    boolean NZ();

    boolean Nk();

    void QJ();

    void RH(int i);

    abcd.wu Rr();

    String Wo();

    WebViewClient ZX();

    @Override // com.google.android.gms.internal.ads.gw
    pw aq();

    void ba(pw pwVar);

    void dH(boolean z);

    void destroy();

    @Override // com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.zv
    Activity dx();

    Context fF();

    @Override // com.google.android.gms.internal.ads.ss
    com.google.android.gms.ads.internal.s1 fY();

    com.google.android.gms.ads.internal.overlay.c fh();

    void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var);

    void g4(boolean z);

    @Override // com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.zv
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    View.OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    @Override // com.google.android.gms.internal.ads.jw
    View getView();

    WebView getWebView();

    int getWidth();

    void h2();

    void hk();

    boolean isDestroyed();

    boolean jT();

    com.google.android.gms.ads.internal.overlay.c ju();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.ss
    void oy(String str, fu fuVar);

    @Override // com.google.android.gms.internal.ads.ss
    b0 pN();

    @Override // com.google.android.gms.internal.ads.hw
    vb0 pO();

    void qN();

    void qj();

    f1 r();

    @Override // com.google.android.gms.internal.ads.ss
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var);

    void stopLoading();

    @Override // com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.iw
    zzbbi sy();

    void v2(abcd.wu wuVar);

    void vF(f1 f1Var);

    void wM(String str, String str2, String str3);

    void ya(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> pVar);

    void zf();
}
