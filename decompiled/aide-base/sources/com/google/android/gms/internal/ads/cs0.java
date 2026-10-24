package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class cs0 implements Runnable {
    private ValueCallback<String> WB = new es0(this);
    final /* synthetic */ boolean fY;
    final /* synthetic */ WebView jw;
    final /* synthetic */ ur0 mb;
    final /* synthetic */ as0 qp;

    cs0(as0 as0Var, ur0 ur0Var, WebView webView, boolean z) {
        this.qp = as0Var;
        this.mb = ur0Var;
        this.jw = webView;
        this.fY = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.jw.getSettings().getJavaScriptEnabled()) {
            try {
                this.jw.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.WB);
            } catch (Throwable unused) {
                this.WB.onReceiveValue("");
            }
        }
    }
}
