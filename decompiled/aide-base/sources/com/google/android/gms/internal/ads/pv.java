package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class pv extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, cv {
    private int AE;
    private boolean AL;
    private int An;
    private int BR;

    @GuardedBy("this")
    private boolean Cz;

    @GuardedBy("this")
    private boolean Gj;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.c IS;

    @GuardedBy("this")
    private boolean Jl;
    private final pt0 Jm;
    private lp Nh;
    private Map<String, fu> Pa;

    @GuardedBy("this")
    private boolean Q6;
    private a0 QO;
    private final zzbhs WB;

    @GuardedBy("this")
    private pw Z1;
    private int Za;
    private b0 a5;

    @GuardedBy("this")
    private int aX;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.c cT;
    private final WindowManager ce;

    @GuardedBy("this")
    private int e3;
    private a0 e9;

    @GuardedBy("this")
    private Boolean eU;

    @GuardedBy("this")
    private sv fN;
    private final com.google.android.gms.ads.internal.p0 fY;

    @GuardedBy("this")
    private boolean gG;
    private dv hK;

    @GuardedBy("this")
    private boolean iW;
    private final zzbbi jw;
    private final DisplayMetrics k2;

    @GuardedBy("this")
    private boolean kf;
    private final vb0 mb;

    @GuardedBy("this")
    private String n5;

    @GuardedBy("this")
    private int oy;

    @GuardedBy("this")
    private f1 pN;

    @GuardedBy("this")
    private String pO;

    @GuardedBy("this")
    private abcd.wu q7;
    private final com.google.android.gms.ads.internal.s1 qp;

    @GuardedBy("this")
    private boolean sE;
    private a0 sM;

    @GuardedBy("this")
    private boolean sg;
    private boolean w9;
    private WeakReference<View.OnClickListener> ys;
    private final float zh;

    private pv(zzbhs zzbhsVar, pw pwVar, String str, boolean z, boolean z2, vb0 vb0Var, zzbbi zzbbiVar, d0 d0Var, com.google.android.gms.ads.internal.p0 p0Var, com.google.android.gms.ads.internal.s1 s1Var, pt0 pt0Var) {
        super(zzbhsVar);
        this.AL = false;
        this.w9 = false;
        this.sE = true;
        this.sg = false;
        this.pO = "";
        this.BR = -1;
        this.AE = -1;
        this.Za = -1;
        this.An = -1;
        this.WB = zzbhsVar;
        this.Z1 = pwVar;
        this.n5 = str;
        this.Jl = z;
        this.e3 = -1;
        this.mb = vb0Var;
        this.jw = zzbbiVar;
        this.fY = p0Var;
        this.qp = s1Var;
        this.ce = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.w0.v5();
        DisplayMetrics displayMetricsFH = bn.FH(this.ce);
        this.k2 = displayMetricsFH;
        this.zh = displayMetricsFH.density;
        this.Jm = pt0Var;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            xp.Hw("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.w0.v5().J0(zzbhsVar, zzbbiVar.WB, settings);
        com.google.android.gms.ads.internal.w0.VH().tp(getContext(), settings);
        setDownloadListener(this);
        rN();
        if (com.google.android.gms.common.util.o.Hw()) {
            addJavascriptInterface(vv.j6(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.Nh = new lp(this.WB.FH(), this, this, null);
        BT();
        b0 b0Var = new b0(new d0(true, "make_wv", this.n5));
        this.a5 = b0Var;
        b0Var.FH().v5(d0Var);
        a0 a0VarDW = v.DW(this.a5.FH());
        this.QO = a0VarDW;
        this.a5.j6("native:view_create", a0VarDW);
        this.sM = null;
        this.e9 = null;
        com.google.android.gms.ads.internal.w0.VH().Ws(zzbhsVar);
        com.google.android.gms.ads.internal.w0.u7().j3();
    }

    private final void BT() {
        d0 d0VarFH;
        b0 b0Var = this.a5;
        if (b0Var == null || (d0VarFH = b0Var.FH()) == null || com.google.android.gms.ads.internal.w0.u7().J0() == null) {
            return;
        }
        com.google.android.gms.ads.internal.w0.u7().J0().Hw(d0VarFH);
    }

    private final void KD(String str) {
        if (!com.google.android.gms.common.util.o.Zo()) {
            String strValueOf = String.valueOf(str);
            nw(strValueOf.length() != 0 ? "javascript:".concat(strValueOf) : new String("javascript:"));
            return;
        }
        if (ro() == null) {
            a8();
        }
        if (ro().booleanValue()) {
            Mr(str, null);
        } else {
            String strValueOf2 = String.valueOf(str);
            nw(strValueOf2.length() != 0 ? "javascript:".concat(strValueOf2) : new String("javascript:"));
        }
    }

    @TargetApi(19)
    private final synchronized void Mr(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    static pv P8(Context context, pw pwVar, String str, boolean z, boolean z2, vb0 vb0Var, zzbbi zzbbiVar, d0 d0Var, com.google.android.gms.ads.internal.p0 p0Var, com.google.android.gms.ads.internal.s1 s1Var, pt0 pt0Var) {
        return new pv(new zzbhs(context), pwVar, str, z, z2, vb0Var, zzbbiVar, d0Var, p0Var, s1Var, pt0Var);
    }

    private final synchronized void SI(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdWebViewImpl.loadUrlUnsafe");
            xp.v5("Could not call loadUrl. ", e);
        }
    }

    private final boolean U2() throws JSONException {
        int i;
        int iJ8;
        if (!this.hK.XL() && !this.hK.gW()) {
            return false;
        }
        cw0.j6();
        DisplayMetrics displayMetrics = this.k2;
        int iJ82 = mp.J8(displayMetrics, displayMetrics.widthPixels);
        cw0.j6();
        DisplayMetrics displayMetrics2 = this.k2;
        int iJ83 = mp.J8(displayMetrics2, displayMetrics2.heightPixels);
        Activity activityFH = this.WB.FH();
        if (activityFH == null || activityFH.getWindow() == null) {
            i = iJ82;
            iJ8 = iJ83;
        } else {
            com.google.android.gms.ads.internal.w0.v5();
            int[] iArrJJ = bn.jJ(activityFH);
            cw0.j6();
            int iJ84 = mp.J8(this.k2, iArrJJ[0]);
            cw0.j6();
            iJ8 = mp.J8(this.k2, iArrJJ[1]);
            i = iJ84;
        }
        if (this.AE == iJ82 && this.BR == iJ83 && this.Za == i && this.An == iJ8) {
            return false;
        }
        boolean z = (this.AE == iJ82 && this.BR == iJ83) ? false : true;
        this.AE = iJ82;
        this.BR = iJ83;
        this.Za = i;
        this.An = iJ8;
        new gd(this).j6(iJ82, iJ83, i, iJ8, this.k2.density, this.ce.getDefaultDisplay().getRotation());
        return z;
    }

    private final synchronized void a8() {
        Boolean boolJ8 = com.google.android.gms.ads.internal.w0.u7().J8();
        this.eU = boolJ8;
        if (boolJ8 == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                j3(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                j3(Boolean.FALSE);
            }
        }
    }

    private final synchronized void cn() {
        if (!this.gG) {
            this.gG = true;
            com.google.android.gms.ads.internal.w0.u7().Mr();
        }
    }

    private final synchronized void er() {
        if (!this.iW) {
            com.google.android.gms.ads.internal.w0.VH().we(this);
        }
        this.iW = true;
    }

    private final synchronized void gW() {
        if (this.Pa != null) {
            Iterator<fu> it = this.Pa.values().iterator();
            while (it.hasNext()) {
                it.next().j6();
            }
        }
        this.Pa = null;
    }

    private final void j3(Boolean bool) {
        synchronized (this) {
            this.eU = bool;
        }
        com.google.android.gms.ads.internal.w0.u7().Hw(bool);
    }

    private final void lg() {
        v.j6(this.a5.FH(), this.QO, "aeh2");
    }

    private final synchronized void nw(String str) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    private final synchronized void rN() {
        if (!this.Jl && !this.Z1.v5()) {
            if (Build.VERSION.SDK_INT < 18) {
                xp.VH("Disabling hardware acceleration on an AdView.");
                er();
                return;
            } else {
                xp.VH("Enabling hardware acceleration on an AdView.");
                yS();
                return;
            }
        }
        xp.VH("Enabling hardware acceleration on an overlay.");
        yS();
    }

    private final synchronized Boolean ro() {
        return this.eU;
    }

    private final void vy(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        v5("onAdVisibilityChanged", map);
    }

    private final synchronized void yS() {
        if (this.iW) {
            com.google.android.gms.ads.internal.w0.VH().Mr(this);
        }
        this.iW = false;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void AE() {
        com.google.android.gms.ads.internal.overlay.c cVarJu = ju();
        if (cVarJu != null) {
            cVarJu.G2();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final /* synthetic */ kw AF() {
        return this.hK;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void AT(Context context) {
        this.WB.setBaseContext(context);
        this.Nh.VH(this.WB.FH());
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void Ay(boolean z) {
        if (this.cT != null) {
            this.cT.MU(this.hK.XL(), z);
        } else {
            this.Q6 = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.aw
    public final synchronized boolean BR() {
        return this.Jl;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean C7() {
        return this.oy > 0;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final synchronized sv CU() {
        return this.fN;
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void DW(String str) {
        KD(str);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void EV(com.google.android.gms.ads.internal.overlay.c cVar) {
        this.IS = cVar;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final synchronized void Ev(sv svVar) {
        if (this.fN != null) {
            xp.j6("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.fN = svVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void F9(boolean z) {
        int i = this.oy + (z ? 1 : -1);
        this.oy = i;
        if (i <= 0 && this.cT != null) {
            this.cT.vq();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void GK() {
        if (this.e9 == null) {
            v.j6(this.a5.FH(), this.QO, "aes2");
            a0 a0VarDW = v.DW(this.a5.FH());
            this.e9 = a0VarDW;
            this.a5.j6("native:view_show", a0VarDW);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.jw.WB);
        v5("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void Hw(boolean z, int i) {
        this.hK.sh(z, i);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int IS() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void J0(boolean z, int i, String str) {
        this.hK.er(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public final void J8(ir0 ir0Var) {
        synchronized (this) {
            this.Gj = ir0Var.Zo;
        }
        vy(ir0Var.Zo);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void LI() {
        this.Nh.FH();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void Lz(String str) {
        if (str == null) {
            str = "";
        }
        try {
            this.pO = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void M8(boolean z) {
        this.sE = z;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void MQ(com.google.android.gms.ads.internal.overlay.c cVar) {
        this.cT = cVar;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean NZ() {
        return this.sE;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final synchronized void Nh() {
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean Nk() {
        return this.Q6;
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final synchronized void O1() {
        this.sg = false;
        if (this.fY != null) {
            this.fY.O1();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void QJ() {
        if (this.sM == null) {
            a0 a0VarDW = v.DW(this.a5.FH());
            this.sM = a0VarDW;
            this.a5.j6("native:view_load", a0VarDW);
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final a0 QO() {
        return this.QO;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void RH(int i) {
        if (i == 0) {
            v.j6(this.a5.FH(), this.QO, "aebb2");
        }
        lg();
        if (this.a5.FH() != null) {
            this.a5.FH().Zo("close_type", String.valueOf(i));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.jw.WB);
        v5("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized abcd.wu Rr() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized String Wo() {
        return this.n5;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void XL(boolean z, int i, String str, String str2) {
        this.hK.yS(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final WebViewClient ZX() {
        return this.hK;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void a5(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", z ? "1" : "0");
        map.put("duration", Long.toString(j));
        v5("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final ks aX() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.gw
    public final synchronized pw aq() {
        return this.Z1;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void ba(pw pwVar) {
        this.Z1 = pwVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void dH(boolean z) {
        boolean z2 = z != this.Jl;
        this.Jl = z;
        rN();
        if (z2) {
            new gd(this).Zo(z ? "expanded" : "default");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final synchronized void destroy() {
        BT();
        this.Nh.Hw();
        if (this.cT != null) {
            this.cT.k6();
            this.cT.onDestroy();
            this.cT = null;
        }
        this.q7 = null;
        this.hK.aM();
        if (this.kf) {
            return;
        }
        com.google.android.gms.ads.internal.w0.vy();
        eu.v5(this);
        gW();
        this.kf = true;
        sm.we("Initiating WebView self destruct sequence in 3...");
        sm.we("Loading blank page in WebView, 2...");
        SI("about:blank");
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.zv
    public final Activity dx() {
        return this.WB.FH();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void e9(boolean z) {
        this.hK.KD(z);
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        xp.EQ("#004 The webview is destroyed. Ignoring action.");
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final Context fF() {
        return this.WB.Hw();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final com.google.android.gms.ads.internal.s1 fY() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized com.google.android.gms.ads.internal.overlay.c fh() {
        return this.IS;
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.kf) {
                    this.hK.aM();
                    com.google.android.gms.ads.internal.w0.vy();
                    eu.v5(this);
                    gW();
                    cn();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        dv dvVar = this.hK;
        if (dvVar != null) {
            dvVar.cn(str, b0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void g4(boolean z) {
        this.hK.ro(z);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final synchronized String gG() {
        return this.pO;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final View.OnClickListener getOnClickListener() {
        return this.ys.get();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized int getRequestedOrientation() {
        return this.e3;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.jw
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void gn(zzc zzcVar) {
        this.hK.U2(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void h2() {
        sm.we("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void hk() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean isDestroyed() {
        return this.kf;
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void j6(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        xp.VH(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        KD(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean jT() {
        return this.sg;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized com.google.android.gms.ads.internal.overlay.c ju() {
        return this.cT;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final synchronized void loadData(String str, String str2, String str3) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final synchronized void loadUrl(String str) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdWebViewImpl.loadUrl");
            xp.v5("Could not call loadUrl. ", e);
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.Nh.j6();
        }
        boolean z = this.Gj;
        if (this.hK != null && this.hK.gW()) {
            if (!this.Cz) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerBT = this.hK.BT();
                if (onGlobalLayoutListenerBT != null) {
                    com.google.android.gms.ads.internal.w0.P8();
                    nr.j6(this, onGlobalLayoutListenerBT);
                }
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListenerVy = this.hK.vy();
                if (onScrollChangedListenerVy != null) {
                    com.google.android.gms.ads.internal.w0.P8();
                    nr.DW(this, onScrollChangedListenerVy);
                }
                this.Cz = true;
            }
            U2();
            z = true;
        }
        vy(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.Nh.DW();
            }
            super.onDetachedFromWindow();
            if (this.Cz && this.hK != null && this.hK.gW() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerBT = this.hK.BT();
                if (onGlobalLayoutListenerBT != null) {
                    com.google.android.gms.ads.internal.w0.VH().gn(getViewTreeObserver(), onGlobalLayoutListenerBT);
                }
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListenerVy = this.hK.vy();
                if (onScrollChangedListenerVy != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListenerVy);
                }
                this.Cz = false;
            }
        }
        vy(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.w0.v5();
            bn.EQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            xp.VH(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        dv dvVar = this.hK;
        if (dvVar == null || dvVar.nw() == null) {
            return;
        }
        this.hK.nw().j6();
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zU2 = U2();
        com.google.android.gms.ads.internal.overlay.c cVarJu = ju();
        if (cVarJu == null || !zU2) {
            return;
        }
        cVarJu.xu();
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    protected final synchronized void onMeasure(int i, int i2) {
        if (isDestroyed()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.Jl && !this.Z1.Zo()) {
            if (this.Z1.gn()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.Z1.VH()) {
                if (((Boolean) cw0.v5().FH(p.PH)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                sv svVarCU = CU();
                float fTi = svVarCU != null ? svVarCU.ti() : 0.0f;
                if (fTi == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                int i3 = (int) (size2 * fTi);
                int i4 = (int) (size / fTi);
                if (size2 == 0 && i4 != 0) {
                    i3 = (int) (i4 * fTi);
                    size2 = i4;
                } else if (size == 0 && i3 != 0) {
                    i4 = (int) (i3 / fTi);
                    size = i3;
                }
                setMeasuredDimension(Math.min(i3, size), Math.min(i4, size2));
                return;
            }
            if (this.Z1.j6()) {
                if (!((Boolean) cw0.v5().FH(p.Hl)).booleanValue() && com.google.android.gms.common.util.o.Hw()) {
                    sh("/contentHeight", new qv(this));
                    KD("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    setMeasuredDimension(View.MeasureSpec.getSize(i), this.aX != -1 ? (int) (this.aX * this.k2.density) : View.MeasureSpec.getSize(i2));
                    return;
                }
                super.onMeasure(i, i2);
                return;
            }
            if (this.Z1.v5()) {
                setMeasuredDimension(this.k2.widthPixels, this.k2.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size3 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
            int i6 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size4 : Integer.MAX_VALUE;
            boolean z = this.Z1.FH > i5 || this.Z1.DW > i6;
            if (((Boolean) cw0.v5().FH(p.S4)).booleanValue()) {
                boolean z2 = ((float) this.Z1.FH) / this.zh <= ((float) i5) / this.zh && ((float) this.Z1.DW) / this.zh <= ((float) i6) / this.zh;
                if (z) {
                    z = z2;
                }
            }
            if (z) {
                int i7 = (int) (this.Z1.FH / this.zh);
                int i8 = (int) (this.Z1.DW / this.zh);
                int i9 = (int) (size3 / this.zh);
                int i10 = (int) (size4 / this.zh);
                StringBuilder sb = new StringBuilder(103);
                sb.append("Not enough space to show ad. Needs ");
                sb.append(i7);
                sb.append("x");
                sb.append(i8);
                sb.append(" dp, but only has ");
                sb.append(i9);
                sb.append("x");
                sb.append(i10);
                sb.append(" dp.");
                xp.u7(sb.toString());
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (!this.AL) {
                    this.Jm.DW(rt0.BANNER_SIZE_INVALID);
                    this.AL = true;
                    return;
                }
            } else {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.w9) {
                    this.Jm.DW(rt0.BANNER_SIZE_VALID);
                    this.w9 = true;
                }
                setMeasuredDimension(this.Z1.FH, this.Z1.DW);
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final void onPause() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            xp.Hw("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final void onResume() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            xp.Hw("Could not resume webview.", e);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.hK.gW()) {
            synchronized (this) {
                if (this.pN != null) {
                    this.pN.j6(motionEvent);
                }
            }
        } else {
            vb0 vb0Var = this.mb;
            if (vb0Var != null) {
                vb0Var.Hw(motionEvent);
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final synchronized void oy(String str, fu fuVar) {
        if (this.Pa == null) {
            this.Pa = new HashMap();
        }
        this.Pa.put(str, fuVar);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final b0 pN() {
        return this.a5;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.hw
    public final vb0 pO() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void qN() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.w0.tp().Zo()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.w0.tp().v5()));
        map.put("device_volume", String.valueOf(vn.Hw(getContext())));
        v5("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void qj() {
        lg();
        HashMap map = new HashMap(1);
        map.put("version", this.jw.WB);
        v5("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized f1 r() {
        return this.pN;
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final synchronized void rk() {
        this.sg = true;
        if (this.fY != null) {
            this.fY.rk();
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int sM() {
        return getMeasuredHeight();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.cv
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.ys = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void setRequestedOrientation(int i) {
        this.e3 = i;
        if (this.cT != null) {
            this.cT.setRequestedOrientation(i);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof dv) {
            this.hK = (dv) webViewClient;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        dv dvVar = this.hK;
        if (dvVar != null) {
            dvVar.lg(str, b0Var);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.cv
    public final void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            xp.Hw("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.iw
    public final zzbbi sy() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void tp(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(string).length());
        sb.append(str);
        sb.append("(");
        sb.append(string);
        sb.append(");");
        KD(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void v2(abcd.wu wuVar) {
        this.q7 = wuVar;
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void v5(String str, Map<String, ?> map) {
        try {
            j6(str, com.google.android.gms.ads.internal.w0.v5().CU(map));
        } catch (JSONException unused) {
            xp.u7("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void vF(f1 f1Var) {
        this.pN = f1Var;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void wM(String str, String str2, String str3) {
        if (isDestroyed()) {
            xp.u7("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        if (((Boolean) cw0.v5().FH(p.hz)).booleanValue()) {
            str2 = fw.DW(str2, fw.j6());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void ya(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> pVar) {
        dv dvVar = this.hK;
        if (dvVar != null) {
            dvVar.rN(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final synchronized fu ys(String str) {
        if (this.Pa == null) {
            return null;
        }
        return this.Pa.get(str);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void zf() {
        sm.we("Destroying WebView!");
        cn();
        bn.gn.post(new rv(this));
    }
}
