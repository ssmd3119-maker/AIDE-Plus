package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class ex {

    @GuardedBy("InvokeJavascriptWorkaround.class")
    private static Boolean j6;

    private ex() {
    }

    @TargetApi(19)
    private static boolean DW(WebView webView) {
        boolean zBooleanValue;
        synchronized (ex.class) {
            if (j6 == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    j6 = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    j6 = Boolean.FALSE;
                }
                zBooleanValue = j6.booleanValue();
            } else {
                zBooleanValue = j6.booleanValue();
            }
        }
        return zBooleanValue;
    }

    @TargetApi(19)
    static void j6(WebView webView, String str) {
        if (com.google.android.gms.common.util.o.Zo() && DW(webView)) {
            webView.evaluateJavascript(str, null);
        } else {
            String strValueOf = String.valueOf(str);
            webView.loadUrl(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
        }
    }
}
