package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class cx extends zzbid implements fx {
    private final ax WB;

    @GuardedBy("this")
    private boolean jw;

    @GuardedBy("this")
    private boolean mb;

    public cx(Context context, ax axVar) {
        super(context);
        com.google.android.gms.ads.internal.w0.u7().j3();
        this.WB = axVar;
        super.setWebViewClient(axVar);
    }

    private final synchronized void Mr() {
        if (!this.jw) {
            this.jw = true;
            com.google.android.gms.ads.internal.w0.u7().Mr();
        }
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final synchronized void FH(bx bxVar) {
        sm.we("Blank page loaded, 1...");
        zf();
    }

    final /* synthetic */ void aM() {
        super.destroy();
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.mb) {
            return;
        }
        this.mb = true;
        this.WB.j3(this);
        j3(false);
        sm.we("Initiating WebView self destruct sequence in 3...");
        sm.we("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdWebViewImpl.loadUrlUnsafe");
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        xp.u7("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    j3(true);
                }
                Mr();
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized boolean isDestroyed() {
        return this.mb;
    }

    @GuardedBy("this")
    protected void j3(boolean z) {
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbid, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (isDestroyed()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (isDestroyed()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        super.stopLoading();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void zf() {
        sm.we("Destroying WebView!");
        Mr();
        ar.j6.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.dx
            private final cx WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.aM();
            }
        });
    }
}
