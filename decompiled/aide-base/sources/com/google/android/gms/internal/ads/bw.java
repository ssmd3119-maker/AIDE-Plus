package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@jg
@TargetApi(11)
/* loaded from: classes.dex */
public final class bw extends cw {
    public bw(cv cvVar, pt0 pt0Var, boolean z) {
        super(cvVar, pt0Var, z);
    }

    @Override // com.google.android.gms.internal.ads.dv, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return Sf(webView, str, null);
    }
}
