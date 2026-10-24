package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@jg
@TargetApi(21)
/* loaded from: classes.dex */
public final class dw extends cw {
    public dw(cv cvVar, pt0 pt0Var, boolean z) {
        super(cvVar, pt0Var, z);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return Sf(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
