package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class qw extends ax implements kw {
    private int BT;
    private com.google.android.gms.ads.internal.gmsg.i EQ;
    private cv Hw;
    private nw J0;
    private com.google.android.gms.ads.internal.overlay.s Mr;
    private View.OnAttachStateChangeListener P8;

    @GuardedBy("mLock")
    private boolean QX;
    private fd U2;
    private hv0 VH;
    private volatile boolean Ws;

    @GuardedBy("mLock")
    private ViewTreeObserver.OnGlobalLayoutListener XL;
    private com.google.android.gms.ads.internal.t1 a8;

    @GuardedBy("mLock")
    private ViewTreeObserver.OnScrollChangedListener aM;
    private jl er;
    private boolean gW;
    private com.google.android.gms.ads.internal.overlay.m gn;

    @GuardedBy("mLock")
    private boolean j3;
    private wc lg;
    private ow rN;
    private mw tp;
    private lw u7;
    private boolean vy;
    private com.google.android.gms.ads.internal.gmsg.k we;
    private boolean yS;
    private final Object Zo = new Object();
    private boolean J8 = false;
    private final h7<cv> v5 = new h7<>();

    private final void cn() {
        if (this.u7 != null && ((this.yS && this.BT <= 0) || this.gW)) {
            this.u7.j6(!this.gW);
            this.u7 = null;
        }
        this.Hw.QJ();
    }

    private final void er(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        wc wcVar = this.lg;
        boolean zWe = wcVar != null ? wcVar.we() : false;
        com.google.android.gms.ads.internal.w0.FH();
        com.google.android.gms.ads.internal.overlay.k.j6(this.Hw.getContext(), adOverlayInfoParcel, !zWe);
        if (this.er != null) {
            String str = adOverlayInfoParcel.q7;
            if (str == null && (zzcVar = adOverlayInfoParcel.WB) != null) {
                str = zzcVar.mb;
            }
            this.er.EQ(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        com.google.android.gms.ads.internal.w0.v5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        return com.google.android.gms.internal.ads.bn.I(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse g3(com.google.android.gms.internal.ads.bx r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qw.g3(com.google.android.gms.internal.ads.bx):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rN(View view, jl jlVar, int i) {
        if (!jlVar.u7() || i <= 0) {
            return;
        }
        jlVar.tp(view);
        if (jlVar.u7()) {
            bn.gn.postDelayed(new sw(this, view, jlVar, i), 100L);
        }
    }

    private final void ro() {
        if (this.P8 == null) {
            return;
        }
        this.Hw.getView().removeOnAttachStateChangeListener(this.P8);
    }

    public final void BT(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        this.v5.sh(str, b0Var);
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final jl DW() {
        return this.er;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void EQ(int i, int i2, boolean z) {
        this.U2.VH(i, i2);
        wc wcVar = this.lg;
        if (wcVar != null) {
            wcVar.VH(i, i2, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void FH(ow owVar) {
        this.rN = owVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Hw(int i, int i2) {
        wc wcVar = this.lg;
        if (wcVar != null) {
            wcVar.u7(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void J0() {
        this.BT--;
        cn();
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void J8(lw lwVar) {
        this.u7 = lwVar;
    }

    public final ViewTreeObserver.OnScrollChangedListener KD() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.Zo) {
            onScrollChangedListener = this.aM;
        }
        return onScrollChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.ax
    public final void Mr(bx bxVar) {
        this.v5.J0(bxVar.DW);
    }

    public final void P8(boolean z, int i, String str) {
        boolean zBR = this.Hw.BR();
        hv0 hv0Var = (!zBR || this.Hw.aq().v5()) ? this.VH : null;
        uw uwVar = zBR ? null : new uw(this.Hw, this.gn);
        com.google.android.gms.ads.internal.gmsg.i iVar = this.EQ;
        com.google.android.gms.ads.internal.gmsg.k kVar = this.we;
        com.google.android.gms.ads.internal.overlay.s sVar = this.Mr;
        cv cvVar = this.Hw;
        er(new AdOverlayInfoParcel(hv0Var, uwVar, iVar, kVar, sVar, cvVar, z, i, str, cvVar.sy()));
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void QX() {
        this.gW = true;
        cn();
    }

    public final ViewTreeObserver.OnGlobalLayoutListener SI() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.Zo) {
            onGlobalLayoutListener = this.XL;
        }
        return onGlobalLayoutListener;
    }

    public final void Sf(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        this.v5.g3(str, b0Var);
    }

    @Override // com.google.android.gms.internal.ads.ax
    public final boolean U2(bx bxVar) {
        String strValueOf = String.valueOf(bxVar.j6);
        sm.we(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriDW = bxVar.DW;
        if (this.v5.J0(uriDW)) {
            return true;
        }
        if (this.J8) {
            String scheme = uriDW.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                hv0 hv0Var = this.VH;
                if (hv0Var != null) {
                    hv0Var.EQ();
                    jl jlVar = this.er;
                    if (jlVar != null) {
                        jlVar.EQ(bxVar.j6);
                    }
                    this.VH = null;
                }
                return false;
            }
        }
        if (this.Hw.getWebView().willNotDraw()) {
            String strValueOf2 = String.valueOf(bxVar.j6);
            xp.u7(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
        } else {
            try {
                vb0 vb0VarPO = this.Hw.pO();
                if (vb0VarPO != null && vb0VarPO.VH(uriDW)) {
                    uriDW = vb0VarPO.DW(uriDW, this.Hw.getContext(), this.Hw.getView(), this.Hw.dx());
                }
            } catch (wb0 unused) {
                String strValueOf3 = String.valueOf(bxVar.j6);
                xp.u7(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.t1 t1Var = this.a8;
            if (t1Var == null || t1Var.Hw()) {
                yS(new zzc("android.intent.action.VIEW", uriDW.toString(), null, null, null, null, null));
            } else {
                this.a8.DW(bxVar.j6);
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void VH(nw nwVar) {
        this.J0 = nwVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Ws(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.Zo) {
            this.QX = true;
            this.Hw.LI();
            this.XL = onGlobalLayoutListener;
            this.aM = onScrollChangedListener;
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final boolean XL() {
        return this.Ws;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Zo() {
        jl jlVar = this.er;
        if (jlVar != null) {
            WebView webView = this.Hw.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                rN(webView, jlVar, 10);
                return;
            }
            ro();
            this.P8 = new tw(this, jlVar);
            this.Hw.getView().addOnAttachStateChangeListener(this.P8);
        }
    }

    @Override // com.google.android.gms.internal.ads.ax
    public final WebResourceResponse a8(bx bxVar) throws ExecutionException, InterruptedException, TimeoutException {
        WebResourceResponse webResourceResponseLp;
        zztv zztvVarHw;
        jl jlVar = this.er;
        if (jlVar != null) {
            jlVar.VH(bxVar.j6, bxVar.FH, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(bxVar.j6).getName())) {
            gn();
            String str = this.Hw.aq().v5() ? (String) cw0.v5().FH(p.KD) : this.Hw.BR() ? (String) cw0.v5().FH(p.SI) : (String) cw0.v5().FH(p.nw);
            com.google.android.gms.ads.internal.w0.v5();
            webResourceResponseLp = bn.lp(this.Hw.getContext(), this.Hw.sy().WB, str);
        } else {
            webResourceResponseLp = null;
        }
        if (webResourceResponseLp != null) {
            return webResourceResponseLp;
        }
        try {
            if (!rl.Hw(bxVar.j6, this.Hw.getContext(), this.vy).equals(bxVar.j6)) {
                return g3(bxVar);
            }
            zzty zztyVarGn = zzty.gn(bxVar.j6);
            if (zztyVarGn != null && (zztvVarHw = com.google.android.gms.ads.internal.w0.EQ().Hw(zztyVarGn)) != null && zztvVarHw.gn()) {
                return new WebResourceResponse("", "", zztvVarHw.EQ());
            }
            if (qp.j6()) {
                if (((Boolean) cw0.v5().FH(p.sg)).booleanValue()) {
                    return g3(bxVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ax
    public final void aM(bx bxVar) {
        this.yS = true;
        mw mwVar = this.tp;
        if (mwVar != null) {
            mwVar.j6();
            this.tp = null;
        }
        cn();
    }

    final /* synthetic */ void cb() {
        this.Hw.LI();
        com.google.android.gms.ads.internal.overlay.c cVarJu = this.Hw.ju();
        if (cVarJu != null) {
            cVarJu.Yb();
        }
        nw nwVar = this.J0;
        if (nwVar != null) {
            nwVar.j6();
            this.J0 = null;
        }
    }

    public final void dx(boolean z) {
        this.J8 = z;
    }

    final void ef(cv cvVar, boolean z) {
        fd fdVar = new fd(cvVar, cvVar.fF(), new zzzy(cvVar.getContext()));
        this.Hw = cvVar;
        this.Ws = z;
        this.U2 = fdVar;
        this.lg = null;
        this.v5.J8(cvVar);
    }

    public final void ei(boolean z, int i, String str, String str2) {
        boolean zBR = this.Hw.BR();
        hv0 hv0Var = (!zBR || this.Hw.aq().v5()) ? this.VH : null;
        uw uwVar = zBR ? null : new uw(this.Hw, this.gn);
        com.google.android.gms.ads.internal.gmsg.i iVar = this.EQ;
        com.google.android.gms.ads.internal.gmsg.k kVar = this.we;
        com.google.android.gms.ads.internal.overlay.s sVar = this.Mr;
        cv cvVar = this.Hw;
        er(new AdOverlayInfoParcel(hv0Var, uwVar, iVar, kVar, sVar, cvVar, z, i, str, str2, cvVar.sy()));
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void gn() {
        synchronized (this.Zo) {
            this.J8 = false;
            this.Ws = true;
            ar.j6.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.rw
                private final qw WB;

                {
                    this.WB = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.cb();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final boolean j6() {
        boolean z;
        synchronized (this.Zo) {
            z = this.j3;
        }
        return z;
    }

    public final void lg() {
        jl jlVar = this.er;
        if (jlVar != null) {
            jlVar.Zo();
            this.er = null;
        }
        ro();
        this.v5.FH();
        this.v5.J8(null);
        synchronized (this.Zo) {
            this.VH = null;
            this.gn = null;
            this.u7 = null;
            this.tp = null;
            this.EQ = null;
            this.we = null;
            this.Mr = null;
            this.J0 = null;
            if (this.lg != null) {
                this.lg.J0(true);
                this.lg = null;
            }
        }
    }

    public final boolean nw() {
        boolean z;
        synchronized (this.Zo) {
            z = this.QX;
        }
        return z;
    }

    public final void sG(boolean z) {
        this.vy = z;
    }

    public final ow sh() {
        return this.rN;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void tp() {
        synchronized (this.Zo) {
            this.j3 = true;
        }
        this.BT++;
        cn();
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void u7(mw mwVar) {
        this.tp = mwVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void v5(hv0 hv0Var, com.google.android.gms.ads.internal.gmsg.i iVar, com.google.android.gms.ads.internal.overlay.m mVar, com.google.android.gms.ads.internal.gmsg.k kVar, com.google.android.gms.ads.internal.overlay.s sVar, boolean z, com.google.android.gms.ads.internal.gmsg.f0 f0Var, com.google.android.gms.ads.internal.t1 t1Var, hd hdVar, jl jlVar) {
        if (t1Var == null) {
            t1Var = new com.google.android.gms.ads.internal.t1(this.Hw.getContext(), jlVar, null);
        }
        this.lg = new wc(this.Hw, hdVar);
        this.er = jlVar;
        if (((Boolean) cw0.v5().FH(p.oY)).booleanValue()) {
            BT("/adMetadata", new com.google.android.gms.ads.internal.gmsg.a(iVar));
        }
        BT("/appEvent", new com.google.android.gms.ads.internal.gmsg.j(kVar));
        BT("/backButton", com.google.android.gms.ads.internal.gmsg.m.tp);
        BT("/refresh", com.google.android.gms.ads.internal.gmsg.m.EQ);
        BT("/canOpenURLs", com.google.android.gms.ads.internal.gmsg.m.j6);
        BT("/canOpenIntents", com.google.android.gms.ads.internal.gmsg.m.DW);
        BT("/click", com.google.android.gms.ads.internal.gmsg.m.FH);
        BT("/close", com.google.android.gms.ads.internal.gmsg.m.Hw);
        BT("/customClose", com.google.android.gms.ads.internal.gmsg.m.v5);
        BT("/instrument", com.google.android.gms.ads.internal.gmsg.m.J8);
        BT("/delayPageLoaded", com.google.android.gms.ads.internal.gmsg.m.QX);
        BT("/delayPageClosed", com.google.android.gms.ads.internal.gmsg.m.XL);
        BT("/getLocationInfo", com.google.android.gms.ads.internal.gmsg.m.aM);
        BT("/httpTrack", com.google.android.gms.ads.internal.gmsg.m.Zo);
        BT("/log", com.google.android.gms.ads.internal.gmsg.m.VH);
        BT("/mraid", new com.google.android.gms.ads.internal.gmsg.b(t1Var, this.lg, hdVar));
        BT("/mraidLoaded", this.U2);
        BT("/open", new com.google.android.gms.ads.internal.gmsg.c(t1Var, this.lg));
        BT("/precache", new lu());
        BT("/touch", com.google.android.gms.ads.internal.gmsg.m.u7);
        BT("/video", com.google.android.gms.ads.internal.gmsg.m.we);
        BT("/videoMeta", com.google.android.gms.ads.internal.gmsg.m.J0);
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.Hw.getContext())) {
            BT("/logScionEvent", new zzaa(this.Hw.getContext()));
        }
        if (f0Var != null) {
            BT("/setInterstitialProperties", new com.google.android.gms.ads.internal.gmsg.e0(f0Var));
        }
        this.VH = hv0Var;
        this.gn = mVar;
        this.EQ = iVar;
        this.we = kVar;
        this.Mr = sVar;
        this.a8 = t1Var;
        this.J8 = z;
    }

    public final void vJ(boolean z, int i) {
        hv0 hv0Var = (!this.Hw.BR() || this.Hw.aq().v5()) ? this.VH : null;
        com.google.android.gms.ads.internal.overlay.m mVar = this.gn;
        com.google.android.gms.ads.internal.overlay.s sVar = this.Mr;
        cv cvVar = this.Hw;
        er(new AdOverlayInfoParcel(hv0Var, mVar, sVar, cvVar, z, i, cvVar.sy()));
    }

    public final void vy(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> pVar) {
        this.v5.ya(str, pVar);
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final com.google.android.gms.ads.internal.t1 we() {
        return this.a8;
    }

    public final void yS(zzc zzcVar) {
        boolean zBR = this.Hw.BR();
        er(new AdOverlayInfoParcel(zzcVar, (!zBR || this.Hw.aq().v5()) ? this.VH : null, zBR ? null : this.gn, this.Mr, this.Hw.sy()));
    }
}
