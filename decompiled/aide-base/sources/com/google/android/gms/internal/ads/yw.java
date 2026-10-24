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
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class yw extends cx implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, d7, cv {
    private Map<String, fu> AE;
    private final com.google.android.gms.ads.internal.p0 AL;
    private float BR;
    private a0 Cz;

    @GuardedBy("this")
    private int Gj;
    private int IS;

    @GuardedBy("this")
    private boolean Jl;
    private int Nh;

    @GuardedBy("this")
    private boolean Q6;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.c QO;

    @GuardedBy("this")
    private boolean Z1;
    private final WindowManager Za;
    private final AtomicReference<abcd.wu> a5;
    private b0 aX;

    @GuardedBy("this")
    private pw cT;

    @GuardedBy("this")
    private sv e3;
    private WeakReference<View.OnClickListener> e9;

    @GuardedBy("this")
    private String eU;

    @GuardedBy("this")
    private int fN;
    private final zzbhs fY;
    private int gG;

    @GuardedBy("this")
    private com.google.android.gms.ads.internal.overlay.c hK;

    @GuardedBy("this")
    private boolean iW;
    private final vb0 k2;

    @GuardedBy("this")
    private int kf;

    @GuardedBy("this")
    private boolean n5;
    private a0 oy;
    private a0 pN;

    @GuardedBy("this")
    private f1 pO;

    @GuardedBy("this")
    private String q7;
    private final qw qp;

    @GuardedBy("this")
    private boolean sE;
    private lp sM;

    @GuardedBy("this")
    private boolean sg;
    private final com.google.android.gms.ads.internal.s1 w9;
    private int ys;
    private final zzbbi zh;

    protected yw(zzbhs zzbhsVar, qw qwVar, pw pwVar, String str, boolean z, boolean z2, vb0 vb0Var, zzbbi zzbbiVar, d0 d0Var, com.google.android.gms.ads.internal.p0 p0Var, com.google.android.gms.ads.internal.s1 s1Var) {
        super(zzbhsVar, qwVar);
        this.Jl = true;
        this.iW = false;
        this.eU = "";
        this.a5 = new AtomicReference<>();
        this.ys = -1;
        this.IS = -1;
        this.gG = -1;
        this.Nh = -1;
        this.fY = zzbhsVar;
        this.qp = qwVar;
        this.cT = pwVar;
        this.q7 = str;
        this.n5 = z;
        this.kf = -1;
        this.k2 = vb0Var;
        this.zh = zzbbiVar;
        this.AL = p0Var;
        this.w9 = s1Var;
        this.Za = (WindowManager) getContext().getSystemService("window");
        this.sM = new lp(this.fY.FH(), this, this, null);
        com.google.android.gms.ads.internal.w0.v5().J0(zzbhsVar, zzbbiVar.WB, getSettings());
        setDownloadListener(this);
        this.BR = zzbhsVar.getResources().getDisplayMetrics().density;
        er();
        if (com.google.android.gms.common.util.o.Hw()) {
            addJavascriptInterface(vv.j6(this), "googleAdsJsInterface");
        }
        vy();
        b0 b0Var = new b0(new d0(true, "make_wv", this.q7));
        this.aX = b0Var;
        b0Var.FH().v5(d0Var);
        a0 a0VarDW = v.DW(this.aX.FH());
        this.pN = a0VarDW;
        this.aX.j6("native:view_create", a0VarDW);
        this.oy = null;
        this.Cz = null;
        com.google.android.gms.ads.internal.w0.VH().Ws(zzbhsVar);
    }

    private final synchronized void BT() {
        if (this.AE != null) {
            Iterator<fu> it = this.AE.values().iterator();
            while (it.hasNext()) {
                it.next().j6();
            }
        }
        this.AE = null;
    }

    private final void P8(boolean z) {
        HashMap map = new HashMap();
        map.put("isVisible", z ? "1" : "0");
        e7.DW(this, "onAdVisibilityChanged", map);
    }

    private final synchronized void er() {
        if (!this.n5 && !this.cT.v5()) {
            if (Build.VERSION.SDK_INT < 18) {
                xp.VH("Disabling hardware acceleration on an AdView.");
                yS();
                return;
            } else {
                xp.VH("Enabling hardware acceleration on an AdView.");
                gW();
                return;
            }
        }
        xp.VH("Enabling hardware acceleration on an overlay.");
        gW();
    }

    private final synchronized void gW() {
        if (this.Q6) {
            com.google.android.gms.ads.internal.w0.VH().Mr(this);
        }
        this.Q6 = false;
    }

    private final boolean lg() throws JSONException {
        int iJ8;
        int iJ82;
        if (!this.qp.XL() && !this.qp.nw()) {
            return false;
        }
        com.google.android.gms.ads.internal.w0.v5();
        DisplayMetrics displayMetricsFH = bn.FH(this.Za);
        cw0.j6();
        int iJ83 = mp.J8(displayMetricsFH, displayMetricsFH.widthPixels);
        cw0.j6();
        int iJ84 = mp.J8(displayMetricsFH, displayMetricsFH.heightPixels);
        Activity activityFH = this.fY.FH();
        if (activityFH == null || activityFH.getWindow() == null) {
            iJ8 = iJ83;
            iJ82 = iJ84;
        } else {
            com.google.android.gms.ads.internal.w0.v5();
            int[] iArrJJ = bn.jJ(activityFH);
            cw0.j6();
            iJ8 = mp.J8(displayMetricsFH, iArrJJ[0]);
            cw0.j6();
            iJ82 = mp.J8(displayMetricsFH, iArrJJ[1]);
        }
        if (this.IS == iJ83 && this.ys == iJ84 && this.gG == iJ8 && this.Nh == iJ82) {
            return false;
        }
        boolean z = (this.IS == iJ83 && this.ys == iJ84) ? false : true;
        this.IS = iJ83;
        this.ys = iJ84;
        this.gG = iJ8;
        this.Nh = iJ82;
        new gd(this).j6(iJ83, iJ84, iJ8, iJ82, displayMetricsFH.density, this.Za.getDefaultDisplay().getRotation());
        return z;
    }

    private final void rN() {
        v.j6(this.aX.FH(), this.pN, "aeh2");
    }

    private final void vy() {
        d0 d0VarFH;
        b0 b0Var = this.aX;
        if (b0Var == null || (d0VarFH = b0Var.FH()) == null || com.google.android.gms.ads.internal.w0.u7().J0() == null) {
            return;
        }
        com.google.android.gms.ads.internal.w0.u7().J0().Hw(d0VarFH);
    }

    private final synchronized void yS() {
        if (!this.Q6) {
            com.google.android.gms.ads.internal.w0.VH().we(this);
        }
        this.Q6 = true;
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
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void AT(Context context) {
        this.fY.setBaseContext(context);
        this.sM.VH(this.fY.FH());
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void Ay(boolean z) {
        if (this.hK != null) {
            this.hK.MU(this.qp.XL(), z);
        } else {
            this.Z1 = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.aw
    public final synchronized boolean BR() {
        return this.n5;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean C7() {
        return this.fN > 0;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final synchronized sv CU() {
        return this.e3;
    }

    @Override // com.google.android.gms.internal.ads.zzbid, com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.t7
    public final synchronized void DW(String str) {
        if (isDestroyed()) {
            xp.u7("The webview is destroyed. Ignoring action.");
        } else {
            super.DW(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void EV(com.google.android.gms.ads.internal.overlay.c cVar) {
        this.QO = cVar;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final synchronized void Ev(sv svVar) {
        if (this.e3 != null) {
            xp.j6("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.e3 = svVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void F9(boolean z) {
        int i = this.fN + (z ? 1 : -1);
        this.fN = i;
        if (i <= 0 && this.hK != null) {
            this.hK.vq();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void GK() {
        if (this.Cz == null) {
            v.j6(this.aX.FH(), this.pN, "aes2");
            a0 a0VarDW = v.DW(this.aX.FH());
            this.Cz = a0VarDW;
            this.aX.j6("native:view_show", a0VarDW);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zh.WB);
        e7.DW(this, "onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void Hw(boolean z, int i) {
        this.qp.vJ(z, i);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int IS() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void J0(boolean z, int i, String str) {
        this.qp.P8(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.jr0
    public final void J8(ir0 ir0Var) {
        synchronized (this) {
            this.sE = ir0Var.Zo;
        }
        P8(ir0Var.Zo);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void LI() {
        this.sM.FH();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void Lz(String str) {
        if (str == null) {
            str = "";
        }
        try {
            this.eU = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void M8(boolean z) {
        this.Jl = z;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void MQ(com.google.android.gms.ads.internal.overlay.c cVar) {
        this.hK = cVar;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean NZ() {
        return this.Jl;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final synchronized void Nh() {
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean Nk() {
        return this.Z1;
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final synchronized void O1() {
        this.iW = false;
        if (this.AL != null) {
            this.AL.O1();
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void QJ() {
        if (this.oy == null) {
            a0 a0VarDW = v.DW(this.aX.FH());
            this.oy = a0VarDW;
            this.aX.j6("native:view_load", a0VarDW);
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final a0 QO() {
        return this.pN;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void RH(int i) {
        if (i == 0) {
            v.j6(this.aX.FH(), this.pN, "aebb2");
        }
        rN();
        if (this.aX.FH() != null) {
            this.aX.FH().Zo("close_type", String.valueOf(i));
        }
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zh.WB);
        e7.DW(this, "onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final abcd.wu Rr() {
        return this.a5.get();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized String Wo() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.ew
    public final void XL(boolean z, int i, String str, String str2) {
        this.qp.ei(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final WebViewClient ZX() {
        return this.qp;
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void a5(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", z ? "1" : "0");
        map.put("duration", Long.toString(j));
        e7.DW(this, "onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final ks aX() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.gw
    public final synchronized pw aq() {
        return this.cT;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void ba(pw pwVar) {
        this.cT = pwVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void dH(boolean z) {
        boolean z2 = z != this.n5;
        this.n5 = z;
        er();
        if (z2) {
            new gd(this).Zo(z ? "expanded" : "default");
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.zv
    public final Activity dx() {
        return this.fY.FH();
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final void e9(boolean z) {
        this.qp.dx(z);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final Context fF() {
        return this.fY.Hw();
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final com.google.android.gms.ads.internal.s1 fY() {
        return this.w9;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized com.google.android.gms.ads.internal.overlay.c fh() {
        return this.QO;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void g3(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        qw qwVar = this.qp;
        if (qwVar != null) {
            qwVar.Sf(str, b0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void g4(boolean z) {
        this.qp.sG(z);
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final synchronized String gG() {
        return this.eU;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final View.OnClickListener getOnClickListener() {
        return this.e9.get();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized int getRequestedOrientation() {
        return this.kf;
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
        this.qp.yS(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void h2() {
        sm.we("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void hk() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.cx
    protected final synchronized void j3(boolean z) {
        if (z) {
            this.a5.set(null);
            this.qp.lg();
            com.google.android.gms.ads.internal.w0.vy();
            eu.v5(this);
            BT();
        } else {
            vy();
            this.sM.Hw();
            if (this.hK != null) {
                this.hK.k6();
                this.hK.onDestroy();
                this.hK = null;
            }
            this.a5.set(null);
            this.qp.lg();
            com.google.android.gms.ads.internal.w0.vy();
            eu.v5(this);
            BT();
        }
    }

    @Override // com.google.android.gms.internal.ads.d7, com.google.android.gms.internal.ads.u6
    public final void j6(String str, JSONObject jSONObject) {
        e7.Hw(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized boolean jT() {
        return this.iW;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized com.google.android.gms.ads.internal.overlay.c ju() {
        return this.hK;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.sM.j6();
        }
        boolean z = this.sE;
        if (this.qp != null && this.qp.nw()) {
            if (!this.sg) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerSI = this.qp.SI();
                if (onGlobalLayoutListenerSI != null) {
                    com.google.android.gms.ads.internal.w0.P8();
                    nr.j6(this, onGlobalLayoutListenerSI);
                }
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListenerKD = this.qp.KD();
                if (onScrollChangedListenerKD != null) {
                    com.google.android.gms.ads.internal.w0.P8();
                    nr.DW(this, onScrollChangedListenerKD);
                }
                this.sg = true;
            }
            lg();
            z = true;
        }
        P8(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.sM.DW();
            }
            super.onDetachedFromWindow();
            if (this.sg && this.qp != null && this.qp.nw() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerSI = this.qp.SI();
                if (onGlobalLayoutListenerSI != null) {
                    com.google.android.gms.ads.internal.w0.VH().gn(getViewTreeObserver(), onGlobalLayoutListenerSI);
                }
                ViewTreeObserver.OnScrollChangedListener onScrollChangedListenerKD = this.qp.KD();
                if (onScrollChangedListenerKD != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListenerKD);
                }
                this.sg = false;
            }
        }
        P8(false);
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

    @Override // com.google.android.gms.internal.ads.cx, android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        qw qwVar = this.qp;
        if (qwVar == null || qwVar.sh() == null) {
            return;
        }
        this.qp.sh().j6();
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
        boolean zLg = lg();
        com.google.android.gms.ads.internal.overlay.c cVarJu = ju();
        if (cVarJu == null || !zLg) {
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
        if (!isInEditMode() && !this.n5 && !this.cT.Zo()) {
            if (this.cT.gn()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.cT.VH()) {
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
            if (this.cT.j6()) {
                if (!((Boolean) cw0.v5().FH(p.Hl)).booleanValue() && com.google.android.gms.common.util.o.Hw()) {
                    sh("/contentHeight", new zw(this));
                    DW("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    setMeasuredDimension(View.MeasureSpec.getSize(i), this.Gj != -1 ? (int) (this.Gj * this.BR) : View.MeasureSpec.getSize(i2));
                    return;
                }
                super.onMeasure(i, i2);
                return;
            }
            if (this.cT.v5()) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.Za.getDefaultDisplay().getMetrics(displayMetrics);
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size3 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size4 = View.MeasureSpec.getSize(i2);
            int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size3 : Integer.MAX_VALUE;
            int i6 = (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) ? size4 : Integer.MAX_VALUE;
            boolean z = true;
            boolean z2 = this.cT.FH > i5 || this.cT.DW > i6;
            if (((Boolean) cw0.v5().FH(p.S4)).booleanValue()) {
                if (this.cT.FH / this.BR > i5 / this.BR || this.cT.DW / this.BR > i6 / this.BR) {
                    z = false;
                }
                if (z2) {
                    z2 = z;
                }
            }
            if (!z2) {
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                setMeasuredDimension(this.cT.FH, this.cT.DW);
                return;
            }
            int i7 = (int) (this.cT.FH / this.BR);
            int i8 = (int) (this.cT.DW / this.BR);
            int i9 = (int) (size3 / this.BR);
            int i10 = (int) (size4 / this.BR);
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
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.cx, android.webkit.WebView
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            xp.Hw("Could not pause webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx, android.webkit.WebView
    public final void onResume() {
        try {
            super.onResume();
        } catch (Exception e) {
            xp.Hw("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.qp.nw()) {
            synchronized (this) {
                if (this.pO != null) {
                    this.pO.j6(motionEvent);
                }
            }
        } else {
            vb0 vb0Var = this.k2;
            if (vb0Var != null) {
                vb0Var.Hw(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final synchronized void oy(String str, fu fuVar) {
        if (this.AE == null) {
            this.AE = new HashMap();
        }
        this.AE.put(str, fuVar);
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss
    public final b0 pN() {
        return this.aX;
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.hw
    public final vb0 pO() {
        return this.k2;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void qN() {
        HashMap map = new HashMap(3);
        map.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.w0.tp().Zo()));
        map.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.w0.tp().v5()));
        map.put("device_volume", String.valueOf(vn.Hw(getContext())));
        e7.DW(this, "volume", map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void qj() {
        rN();
        HashMap map = new HashMap(1);
        map.put("version", this.zh.WB);
        e7.DW(this, "onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized f1 r() {
        return this.pO;
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final synchronized void rk() {
        this.iW = true;
        if (this.AL != null) {
            this.AL.rk();
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final int sM() {
        return getMeasuredHeight();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.cv
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.e9 = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void setRequestedOrientation(int i) {
        this.kf = i;
        if (this.hK != null) {
            this.hK.setRequestedOrientation(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void sh(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        qw qwVar = this.qp;
        if (qwVar != null) {
            qwVar.BT(str, b0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.cx, android.webkit.WebView
    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            xp.Hw("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.cv, com.google.android.gms.internal.ads.ss, com.google.android.gms.internal.ads.iw
    public final zzbbi sy() {
        return this.zh;
    }

    @Override // com.google.android.gms.internal.ads.t7
    public final void tp(String str, JSONObject jSONObject) {
        e7.FH(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void v2(abcd.wu wuVar) {
        this.a5.set(wuVar);
    }

    @Override // com.google.android.gms.internal.ads.u6
    public final void v5(String str, Map map) {
        e7.DW(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void vF(f1 f1Var) {
        this.pO = f1Var;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void wM(String str, String str2, String str3) {
        if (((Boolean) cw0.v5().FH(p.hz)).booleanValue()) {
            str2 = fw.DW(str2, fw.j6());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.d7
    public final void we(String str, String str2) {
        e7.j6(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void ya(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> pVar) {
        qw qwVar = this.qp;
        if (qwVar != null) {
            qwVar.vy(str, pVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ss
    public final synchronized fu ys(String str) {
        if (this.AE == null) {
            return null;
        }
        return this.AE.get(str);
    }

    @Override // com.google.android.gms.internal.ads.cx, com.google.android.gms.internal.ads.cv
    public final void zf() {
    }
}
