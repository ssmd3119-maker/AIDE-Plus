package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
@TargetApi(14)
/* loaded from: classes.dex */
public final class as0 extends Thread {
    private final int AL;
    private boolean WB;
    private final String Z1;
    private final int cT;
    private final vr0 fY;
    private final int hK;
    private final Object jw;
    private final int k2;
    private boolean mb;
    private final boolean n5;
    private final int q7;
    private final int qp;
    private final int w9;
    private final int zh;

    public as0() {
        this(new vr0());
    }

    private final fs0 DW(View view, ur0 ur0Var) {
        boolean z;
        if (view == null) {
            return new fs0(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new fs0(this, 0, 0);
            }
            ur0Var.Hw(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new fs0(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof cv)) {
            ur0Var.J0();
            WebView webView = (WebView) view;
            if (com.google.android.gms.common.util.o.Zo()) {
                ur0Var.J0();
                webView.post(new cs0(this, ur0Var, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            return z ? new fs0(this, 0, 1) : new fs0(this, 0, 0);
        }
        if (!(view instanceof ViewGroup)) {
            return new fs0(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            fs0 fs0VarDW = DW(viewGroup.getChildAt(i3), ur0Var);
            i += fs0VarDW.j6;
            i2 += fs0VarDW.DW;
        }
        return new fs0(this, i, i2);
    }

    private static boolean gn() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context contextDW = com.google.android.gms.ads.internal.w0.gn().DW();
            if (contextDW == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) contextDW.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) contextDW.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) contextDW.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.w0.u7().v5(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void tp() {
        synchronized (this.jw) {
            this.mb = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            xp.VH(sb.toString());
        }
    }

    public final boolean EQ() {
        return this.mb;
    }

    final void FH(ur0 ur0Var, WebView webView, String str, boolean z) {
        ur0Var.we();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString("text");
                if (this.n5 || TextUtils.isEmpty(webView.getTitle())) {
                    ur0Var.FH(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(strOptString);
                    ur0Var.FH(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (ur0Var.VH()) {
                this.fY.DW(ur0Var);
            }
        } catch (JSONException unused) {
            xp.VH("Json string may be malformed.");
        } catch (Throwable th) {
            xp.FH("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.w0.u7().v5(th, "ContentFetchTask.processWebViewContent");
        }
    }

    final void Hw(View view) {
        try {
            ur0 ur0Var = new ur0(this.k2, this.zh, this.AL, this.w9, this.hK, this.cT, this.q7);
            Context contextDW = com.google.android.gms.ads.internal.w0.gn().DW();
            if (contextDW != null && !TextUtils.isEmpty(this.Z1)) {
                String str = (String) view.getTag(contextDW.getResources().getIdentifier((String) cw0.v5().FH(p.Qq), "id", contextDW.getPackageName()));
                if (str != null && str.equals(this.Z1)) {
                    return;
                }
            }
            fs0 fs0VarDW = DW(view, ur0Var);
            ur0Var.J8();
            if (fs0VarDW.j6 == 0 && fs0VarDW.DW == 0) {
                return;
            }
            if (fs0VarDW.DW == 0 && ur0Var.Ws() == 0) {
                return;
            }
            if (fs0VarDW.DW == 0 && this.fY.j6(ur0Var)) {
                return;
            }
            this.fY.FH(ur0Var);
        } catch (Exception e) {
            xp.Hw("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.w0.u7().v5(e, "ContentFetchTask.fetchContent");
        }
    }

    public final void VH() {
        synchronized (this.jw) {
            if (this.WB) {
                xp.VH("Content hash thread already started, quiting...");
            } else {
                this.WB = true;
                start();
            }
        }
    }

    public final void j6() {
        synchronized (this.jw) {
            this.mb = false;
            this.jw.notifyAll();
            xp.VH("ContentFetchThread: wakeup");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        while (true) {
            try {
                if (gn()) {
                    Activity activityJ6 = com.google.android.gms.ads.internal.w0.gn().j6();
                    if (activityJ6 == null) {
                        xp.VH("ContentFetchThread: no activity. Sleeping.");
                        tp();
                    } else if (activityJ6 != null) {
                        View viewFindViewById = null;
                        try {
                            if (activityJ6.getWindow() != null && activityJ6.getWindow().getDecorView() != null) {
                                viewFindViewById = activityJ6.getWindow().getDecorView().findViewById(R.id.content);
                            }
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.w0.u7().v5(e, "ContentFetchTask.extractContent");
                            xp.VH("Failed getting root view of activity. Content not extracted.");
                        }
                        if (viewFindViewById != null && viewFindViewById != null) {
                            viewFindViewById.post(new bs0(this, viewFindViewById));
                        }
                    }
                } else {
                    xp.VH("ContentFetchTask: sleeping");
                    tp();
                }
                Thread.sleep(this.qp * 1000);
            } catch (InterruptedException e2) {
                xp.Hw("Error in ContentFetchTask", e2);
            } catch (Exception e3) {
                xp.Hw("Error in ContentFetchTask", e3);
                com.google.android.gms.ads.internal.w0.u7().v5(e3, "ContentFetchTask.run");
            }
            synchronized (this.jw) {
                while (this.mb) {
                    try {
                        xp.VH("ContentFetchTask: waiting");
                        this.jw.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public final ur0 u7() {
        return this.fY.Hw();
    }

    private as0(vr0 vr0Var) {
        this.WB = false;
        this.mb = false;
        this.fY = vr0Var;
        this.jw = new Object();
        this.k2 = ((Integer) cw0.v5().FH(p.ef)).intValue();
        this.zh = ((Integer) cw0.v5().FH(p.Sf)).intValue();
        this.AL = ((Integer) cw0.v5().FH(p.vJ)).intValue();
        this.w9 = ((Integer) cw0.v5().FH(p.g3)).intValue();
        this.hK = ((Integer) cw0.v5().FH(p.I)).intValue();
        this.cT = ((Integer) cw0.v5().FH(p.ca)).intValue();
        this.q7 = ((Integer) cw0.v5().FH(p.x9)).intValue();
        this.qp = ((Integer) cw0.v5().FH(p.Mz)).intValue();
        this.Z1 = (String) cw0.v5().FH(p.sy);
        this.n5 = ((Boolean) cw0.v5().FH(p.aj)).booleanValue();
        setName("ContentFetchTask");
    }
}
