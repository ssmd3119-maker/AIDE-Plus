package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

@jg
@TargetApi(11)
/* loaded from: classes.dex */
public final class tu extends WebChromeClient {
    private final cv j6;

    public tu(cv cvVar) {
        this.j6 = cvVar;
    }

    private final boolean DW(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        com.google.android.gms.ads.internal.t1 t1VarWe;
        try {
        } catch (WindowManager.BadTokenException e) {
            xp.v5("Fail to display Dialog.", e);
        }
        if (this.j6 != null && this.j6.AF() != null && this.j6.AF().we() != null && (t1VarWe = this.j6.AF().we()) != null && !t1VarWe.Hw()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            t1VarWe.DW(sb.toString());
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            builder.setView(linearLayout).setPositiveButton(R.string.ok, new av(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new zu(jsPromptResult)).setOnCancelListener(new yu(jsPromptResult)).create().show();
        } else {
            builder.setMessage(str3).setPositiveButton(R.string.ok, new xu(jsResult)).setNegativeButton(R.string.cancel, new wu(jsResult)).setOnCancelListener(new uu(jsResult)).create().show();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Context j6(WebView webView) {
        if (!(webView instanceof cv)) {
            return webView.getContext();
        }
        cv cvVar = (cv) webView;
        Activity activityDx = cvVar.dx();
        return activityDx != null ? activityDx : cvVar.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof cv)) {
            xp.u7("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        com.google.android.gms.ads.internal.overlay.c cVarJu = ((cv) webView).ju();
        if (cVarJu == null) {
            xp.u7("Tried to close an AdWebView not associated with an overlay.");
        } else {
            cVarJu.k6();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(strMessage).length() + 19 + String.valueOf(strSourceId).length());
        sb.append("JS: ");
        sb.append(strMessage);
        sb.append(" (");
        sb.append(strSourceId);
        sb.append(":");
        sb.append(iLineNumber);
        sb.append(")");
        String string = sb.toString();
        if (string.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = bv.j6[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            xp.j6(string);
        } else if (i == 2) {
            xp.u7(string);
        } else if (i == 3 || i == 4 || i != 5) {
            xp.gn(string);
        } else {
            xp.VH(string);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.j6.ZX() != null) {
            webView2.setWebViewClient(this.j6.ZX());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072L, j4), 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r4, android.webkit.GeolocationPermissions.Callback r5) {
        /*
            r3 = this;
            if (r5 == 0) goto L2c
            com.google.android.gms.ads.internal.w0.v5()
            com.google.android.gms.internal.ads.cv r0 = r3.j6
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = com.google.android.gms.internal.ads.bn.Xa(r0, r1)
            r1 = 1
            if (r0 != 0) goto L28
            com.google.android.gms.ads.internal.w0.v5()
            com.google.android.gms.internal.ads.cv r0 = r3.j6
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = com.google.android.gms.internal.ads.bn.Xa(r0, r2)
            if (r0 == 0) goto L26
            goto L28
        L26:
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r5.invoke(r4, r0, r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tu.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.c cVarJu = this.j6.ju();
        if (cVarJu == null) {
            xp.u7("Could not get ad overlay when hiding custom view.");
        } else {
            cVarJu.nG();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return DW(j6(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return DW(j6(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return DW(j6(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return DW(j6(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (com.google.android.gms.common.util.o.gn()) {
            if (!((Boolean) cw0.v5().FH(p.aq)).booleanValue()) {
                cv cvVar = this.j6;
                if (cvVar == null || cvVar.AF() == null || this.j6.AF().DW() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] strArrWe = this.j6.AF().DW().we(permissionRequest.getResources());
                if (strArrWe.length > 0) {
                    permissionRequest.grant(strArrWe);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.c cVarJu = this.j6.ju();
        if (cVarJu == null) {
            xp.u7("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        } else {
            cVarJu.CO(view, customViewCallback);
            cVarJu.setRequestedOrientation(i);
        }
    }
}
