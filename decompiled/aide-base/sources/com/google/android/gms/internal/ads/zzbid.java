package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbid extends WebView {
    public zzbid(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.w0.VH().tp(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            xp.Hw("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
    }

    public void DW(String str) {
        ex.j6(this, str);
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            sm.we("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "CoreWebView.loadUrl");
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
