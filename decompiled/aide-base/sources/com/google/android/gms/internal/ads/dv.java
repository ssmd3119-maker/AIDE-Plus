package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class dv extends WebViewClient implements kw {
    private View.OnAttachStateChangeListener BT;
    private final pt0 DW;
    private nw EQ;
    private final HashMap<String, List<com.google.android.gms.ads.internal.gmsg.b0<? super cv>>> FH;
    private final Object Hw;

    @GuardedBy("mLock")
    private boolean J0;

    @GuardedBy("mLock")
    private boolean J8;
    private com.google.android.gms.ads.internal.t1 Mr;

    @GuardedBy("mLock")
    private ViewTreeObserver.OnScrollChangedListener QX;
    private wc U2;
    private lw VH;

    @GuardedBy("mLock")
    private ViewTreeObserver.OnGlobalLayoutListener Ws;

    @GuardedBy("mLock")
    private boolean XL;
    private com.google.android.gms.ads.internal.overlay.m Zo;
    private ow a8;
    private com.google.android.gms.ads.internal.overlay.s aM;
    private boolean er;
    private boolean gW;
    private mw gn;
    private final fd j3;
    private cv j6;
    protected jl lg;
    private boolean rN;
    private com.google.android.gms.ads.internal.gmsg.k tp;
    private com.google.android.gms.ads.internal.gmsg.i u7;
    private hv0 v5;
    private boolean we;
    private int yS;
    private static final String[] vy = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    private static final String[] P8 = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    public dv(cv cvVar, pt0 pt0Var, boolean z) {
        this(cvVar, pt0Var, z, new fd(cvVar, cvVar.fF(), new zzzy(cvVar.getContext())), null);
    }

    private final void Mr(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        wc wcVar = this.U2;
        boolean zWe = wcVar != null ? wcVar.we() : false;
        com.google.android.gms.ads.internal.w0.FH();
        com.google.android.gms.ads.internal.overlay.k.j6(this.j6.getContext(), adOverlayInfoParcel, !zWe);
        if (this.lg != null) {
            String str = adOverlayInfoParcel.q7;
            if (str == null && (zzcVar = adOverlayInfoParcel.WB) != null) {
                str = zzcVar.mb;
            }
            this.lg.EQ(str);
        }
    }

    private final void P8() {
        if (this.BT == null) {
            return;
        }
        this.j6.getView().removeOnAttachStateChangeListener(this.BT);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void dx(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.e<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.p.QO
            com.google.android.gms.internal.ads.m r1 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r0 = r1.FH(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L13
            return
        L13:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r0 = "err"
            r5.putString(r0, r9)
            java.lang.String r9 = "code"
            r5.putString(r9, r10)
            boolean r9 = android.text.TextUtils.isEmpty(r11)
            if (r9 != 0) goto L37
            android.net.Uri r9 = android.net.Uri.parse(r11)
            java.lang.String r10 = r9.getHost()
            if (r10 == 0) goto L37
            java.lang.String r9 = r9.getHost()
            goto L39
        L37:
            java.lang.String r9 = ""
        L39:
            java.lang.String r10 = "host"
            r5.putString(r10, r9)
            com.google.android.gms.internal.ads.bn r1 = com.google.android.gms.ads.internal.w0.v5()
            com.google.android.gms.internal.ads.cv r9 = r7.j6
            com.google.android.gms.internal.ads.zzbbi r9 = r9.sy()
            java.lang.String r3 = r9.WB
            r6 = 1
            java.lang.String r4 = "gmob-apps"
            r2 = r8
            r1.J8(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv.dx(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private final void ef(Uri uri) {
        String path = uri.getPath();
        List<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> list = this.FH.get(path);
        if (list == null) {
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 32);
            sb.append("No GMSG handler found for GMSG: ");
            sb.append(strValueOf);
            sm.we(sb.toString());
            return;
        }
        com.google.android.gms.ads.internal.w0.v5();
        Map<String, String> mapXG = bn.XG(uri);
        if (xp.DW(2)) {
            String strValueOf2 = String.valueOf(path);
            sm.we(strValueOf2.length() != 0 ? "Received GMSG: ".concat(strValueOf2) : new String("Received GMSG: "));
            for (String str : mapXG.keySet()) {
                String str2 = mapXG.get(str);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length());
                sb2.append("  ");
                sb2.append(str);
                sb2.append(": ");
                sb2.append(str2);
                sm.we(sb2.toString());
            }
        }
        Iterator<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> it = list.iterator();
        while (it.hasNext()) {
            it.next().zza(this.j6, mapXG);
        }
    }

    private final void ei() {
        if (this.VH != null && ((this.rN && this.yS <= 0) || this.er)) {
            this.VH.j6(!this.er);
            this.VH = null;
        }
        this.j6.QJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(View view, jl jlVar, int i) {
        if (!jlVar.u7() || i <= 0) {
            return;
        }
        jlVar.tp(view);
        if (jlVar.u7()) {
            bn.gn.postDelayed(new fv(this, view, jlVar, i), 100L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        com.google.android.gms.ads.internal.w0.v5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
    
        return com.google.android.gms.internal.ads.bn.I(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse sG(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv.sG(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final ViewTreeObserver.OnGlobalLayoutListener BT() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.Hw) {
            onGlobalLayoutListener = this.Ws;
        }
        return onGlobalLayoutListener;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final jl DW() {
        return this.lg;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void EQ(int i, int i2, boolean z) {
        this.j3.VH(i, i2);
        wc wcVar = this.U2;
        if (wcVar != null) {
            wcVar.VH(i, i2, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void FH(ow owVar) {
        this.a8 = owVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Hw(int i, int i2) {
        wc wcVar = this.U2;
        if (wcVar != null) {
            wcVar.u7(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void J0() {
        this.yS--;
        ei();
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void J8(lw lwVar) {
        this.VH = lwVar;
    }

    public final void KD(boolean z) {
        this.we = z;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void QX() {
        this.er = true;
        ei();
    }

    final /* synthetic */ void SI() {
        this.j6.LI();
        com.google.android.gms.ads.internal.overlay.c cVarJu = this.j6.ju();
        if (cVarJu != null) {
            cVarJu.Yb();
        }
        nw nwVar = this.EQ;
        if (nwVar != null) {
            nwVar.j6();
            this.EQ = null;
        }
    }

    public final void U2(zzc zzcVar) {
        boolean zBR = this.j6.BR();
        Mr(new AdOverlayInfoParcel(zzcVar, (!zBR || this.j6.aq().v5()) ? this.v5 : null, zBR ? null : this.Zo, this.aM, this.j6.sy()));
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void VH(nw nwVar) {
        this.EQ = nwVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Ws(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.Hw) {
            this.J8 = true;
            this.j6.LI();
            this.Ws = onGlobalLayoutListener;
            this.QX = onScrollChangedListener;
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final boolean XL() {
        boolean z;
        synchronized (this.Hw) {
            z = this.J0;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void Zo() {
        jl jlVar = this.lg;
        if (jlVar != null) {
            WebView webView = this.j6.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                j3(webView, jlVar, 10);
                return;
            }
            P8();
            this.BT = new gv(this, jlVar);
            this.j6.getView().addOnAttachStateChangeListener(this.BT);
        }
    }

    public final void aM() {
        jl jlVar = this.lg;
        if (jlVar != null) {
            jlVar.Zo();
            this.lg = null;
        }
        P8();
        synchronized (this.Hw) {
            this.FH.clear();
            this.v5 = null;
            this.Zo = null;
            this.VH = null;
            this.gn = null;
            this.u7 = null;
            this.tp = null;
            this.we = false;
            this.J0 = false;
            this.J8 = false;
            this.XL = false;
            this.aM = null;
            this.EQ = null;
            if (this.U2 != null) {
                this.U2.J0(true);
                this.U2 = null;
            }
        }
    }

    protected final WebResourceResponse cb(String str, Map<String, String> map) {
        zztv zztvVarHw;
        try {
            String strHw = rl.Hw(str, this.j6.getContext(), this.gW);
            if (!strHw.equals(str)) {
                return sG(strHw, map);
            }
            zzty zztyVarGn = zzty.gn(str);
            if (zztyVarGn != null && (zztvVarHw = com.google.android.gms.ads.internal.w0.EQ().Hw(zztyVarGn)) != null && zztvVarHw.gn()) {
                return new WebResourceResponse("", "", zztvVarHw.EQ());
            }
            if (qp.j6()) {
                if (((Boolean) cw0.v5().FH(p.sg)).booleanValue()) {
                    return sG(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    public final void cn(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        synchronized (this.Hw) {
            List<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> list = this.FH.get(str);
            if (list == null) {
                return;
            }
            list.remove(b0Var);
        }
    }

    public final void er(boolean z, int i, String str) {
        boolean zBR = this.j6.BR();
        hv0 hv0Var = (!zBR || this.j6.aq().v5()) ? this.v5 : null;
        hv hvVar = zBR ? null : new hv(this.j6, this.Zo);
        com.google.android.gms.ads.internal.gmsg.i iVar = this.u7;
        com.google.android.gms.ads.internal.gmsg.k kVar = this.tp;
        com.google.android.gms.ads.internal.overlay.s sVar = this.aM;
        cv cvVar = this.j6;
        Mr(new AdOverlayInfoParcel(hv0Var, hvVar, iVar, kVar, sVar, cvVar, z, i, str, cvVar.sy()));
    }

    public final boolean gW() {
        boolean z;
        synchronized (this.Hw) {
            z = this.J8;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void gn() {
        synchronized (this.Hw) {
            this.we = false;
            this.J0 = true;
            ar.j6.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ev
                private final dv WB;

                {
                    this.WB = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.SI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final boolean j6() {
        boolean z;
        synchronized (this.Hw) {
            z = this.XL;
        }
        return z;
    }

    public final void lg(String str, com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var) {
        synchronized (this.Hw) {
            List<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> copyOnWriteArrayList = this.FH.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                this.FH.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(b0Var);
        }
    }

    public final ow nw() {
        return this.a8;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String strValueOf = String.valueOf(str);
        sm.we(strValueOf.length() != 0 ? "Loading resource: ".concat(strValueOf) : new String("Loading resource: "));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            ef(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.Hw) {
            if (this.j6.isDestroyed()) {
                sm.we("Blank page loaded, 1...");
                this.j6.zf();
                return;
            }
            this.rN = true;
            mw mwVar = this.gn;
            if (mwVar != null) {
                mwVar.j6();
                this.gn = null;
            }
            ei();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceivedError(android.webkit.WebView r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            if (r5 >= 0) goto Ld
            int r0 = -r5
            int r0 = r0 + (-1)
            java.lang.String[] r1 = com.google.android.gms.internal.ads.dv.vy
            int r2 = r1.length
            if (r0 >= r2) goto Ld
            r0 = r1[r0]
            goto L11
        Ld:
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L11:
            com.google.android.gms.internal.ads.cv r1 = r3.j6
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = "http_err"
            r3.dx(r1, r2, r0, r7)
            super.onReceivedError(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv.onReceivedError(android.webkit.WebView, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceivedSslError(android.webkit.WebView r5, android.webkit.SslErrorHandler r6, android.net.http.SslError r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L27
            int r0 = r7.getPrimaryError()
            if (r0 < 0) goto L10
            java.lang.String[] r1 = com.google.android.gms.internal.ads.dv.P8
            int r2 = r1.length
            if (r0 >= r2) goto L10
            r0 = r1[r0]
            goto L14
        L10:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L14:
            com.google.android.gms.internal.ads.cv r1 = r4.j6
            android.content.Context r1 = r1.getContext()
            com.google.android.gms.internal.ads.jn r2 = com.google.android.gms.ads.internal.w0.VH()
            java.lang.String r2 = r2.VH(r7)
            java.lang.String r3 = "ssl_err"
            r4.dx(r1, r3, r0, r2)
        L27:
            super.onReceivedSslError(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dv.onReceivedSslError(android.webkit.WebView, android.webkit.SslErrorHandler, android.net.http.SslError):void");
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        pt0 pt0Var = this.DW;
        if (pt0Var != null) {
            pt0Var.DW(rt0.ANDROID_WEBVIEW_CRASH);
        }
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        webView.destroy();
        return true;
    }

    public final void rN(String str, com.google.android.gms.common.util.p<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> pVar) {
        synchronized (this.Hw) {
            List<com.google.android.gms.ads.internal.gmsg.b0<? super cv>> list = this.FH.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.android.gms.ads.internal.gmsg.b0<? super cv> b0Var : list) {
                if (pVar.j6(b0Var)) {
                    arrayList.add(b0Var);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void ro(boolean z) {
        this.gW = z;
    }

    public final void sh(boolean z, int i) {
        hv0 hv0Var = (!this.j6.BR() || this.j6.aq().v5()) ? this.v5 : null;
        com.google.android.gms.ads.internal.overlay.m mVar = this.Zo;
        com.google.android.gms.ads.internal.overlay.s sVar = this.aM;
        cv cvVar = this.j6;
        Mr(new AdOverlayInfoParcel(hv0Var, mVar, sVar, cvVar, z, i, cvVar.sy()));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return cb(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case ProxyTextView.INPUTTYPE_textPassword /* 129 */:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws wb0 {
        String strValueOf = String.valueOf(str);
        sm.we(strValueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(strValueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uriDW = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriDW.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriDW.getHost())) {
            ef(uriDW);
        } else {
            if (this.we && webView == this.j6.getWebView()) {
                String scheme = uriDW.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    hv0 hv0Var = this.v5;
                    if (hv0Var != null) {
                        hv0Var.EQ();
                        jl jlVar = this.lg;
                        if (jlVar != null) {
                            jlVar.EQ(str);
                        }
                        this.v5 = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.j6.getWebView().willNotDraw()) {
                String strValueOf2 = String.valueOf(str);
                xp.u7(strValueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(strValueOf2) : new String("AdWebView unable to handle URL: "));
            } else {
                try {
                    vb0 vb0VarPO = this.j6.pO();
                    if (vb0VarPO != null && vb0VarPO.VH(uriDW)) {
                        uriDW = vb0VarPO.DW(uriDW, this.j6.getContext(), this.j6.getView(), this.j6.dx());
                    }
                } catch (wb0 unused) {
                    String strValueOf3 = String.valueOf(str);
                    xp.u7(strValueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(strValueOf3) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.t1 t1Var = this.Mr;
                if (t1Var == null || t1Var.Hw()) {
                    U2(new zzc("android.intent.action.VIEW", uriDW.toString(), null, null, null, null, null));
                } else {
                    this.Mr.DW(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void tp() {
        synchronized (this.Hw) {
            this.XL = true;
        }
        this.yS++;
        ei();
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void u7(mw mwVar) {
        this.gn = mwVar;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void v5(hv0 hv0Var, com.google.android.gms.ads.internal.gmsg.i iVar, com.google.android.gms.ads.internal.overlay.m mVar, com.google.android.gms.ads.internal.gmsg.k kVar, com.google.android.gms.ads.internal.overlay.s sVar, boolean z, com.google.android.gms.ads.internal.gmsg.f0 f0Var, com.google.android.gms.ads.internal.t1 t1Var, hd hdVar, jl jlVar) {
        if (t1Var == null) {
            t1Var = new com.google.android.gms.ads.internal.t1(this.j6.getContext(), jlVar, null);
        }
        this.U2 = new wc(this.j6, hdVar);
        this.lg = jlVar;
        if (((Boolean) cw0.v5().FH(p.oY)).booleanValue()) {
            lg("/adMetadata", new com.google.android.gms.ads.internal.gmsg.a(iVar));
        }
        lg("/appEvent", new com.google.android.gms.ads.internal.gmsg.j(kVar));
        lg("/backButton", com.google.android.gms.ads.internal.gmsg.m.tp);
        lg("/refresh", com.google.android.gms.ads.internal.gmsg.m.EQ);
        lg("/canOpenURLs", com.google.android.gms.ads.internal.gmsg.m.j6);
        lg("/canOpenIntents", com.google.android.gms.ads.internal.gmsg.m.DW);
        lg("/click", com.google.android.gms.ads.internal.gmsg.m.FH);
        lg("/close", com.google.android.gms.ads.internal.gmsg.m.Hw);
        lg("/customClose", com.google.android.gms.ads.internal.gmsg.m.v5);
        lg("/instrument", com.google.android.gms.ads.internal.gmsg.m.J8);
        lg("/delayPageLoaded", com.google.android.gms.ads.internal.gmsg.m.QX);
        lg("/delayPageClosed", com.google.android.gms.ads.internal.gmsg.m.XL);
        lg("/getLocationInfo", com.google.android.gms.ads.internal.gmsg.m.aM);
        lg("/httpTrack", com.google.android.gms.ads.internal.gmsg.m.Zo);
        lg("/log", com.google.android.gms.ads.internal.gmsg.m.VH);
        lg("/mraid", new com.google.android.gms.ads.internal.gmsg.b(t1Var, this.U2, hdVar));
        lg("/mraidLoaded", this.j3);
        lg("/open", new com.google.android.gms.ads.internal.gmsg.c(t1Var, this.U2));
        lg("/precache", new lu());
        lg("/touch", com.google.android.gms.ads.internal.gmsg.m.u7);
        lg("/video", com.google.android.gms.ads.internal.gmsg.m.we);
        lg("/videoMeta", com.google.android.gms.ads.internal.gmsg.m.J0);
        if (com.google.android.gms.ads.internal.w0.ei().U2(this.j6.getContext())) {
            lg("/logScionEvent", new zzaa(this.j6.getContext()));
        }
        if (f0Var != null) {
            lg("/setInterstitialProperties", new com.google.android.gms.ads.internal.gmsg.e0(f0Var));
        }
        this.v5 = hv0Var;
        this.Zo = mVar;
        this.u7 = iVar;
        this.tp = kVar;
        this.aM = sVar;
        this.Mr = t1Var;
        this.we = z;
    }

    public final ViewTreeObserver.OnScrollChangedListener vy() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.Hw) {
            onScrollChangedListener = this.QX;
        }
        return onScrollChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final com.google.android.gms.ads.internal.t1 we() {
        return this.Mr;
    }

    public final void yS(boolean z, int i, String str, String str2) {
        boolean zBR = this.j6.BR();
        hv0 hv0Var = (!zBR || this.j6.aq().v5()) ? this.v5 : null;
        hv hvVar = zBR ? null : new hv(this.j6, this.Zo);
        com.google.android.gms.ads.internal.gmsg.i iVar = this.u7;
        com.google.android.gms.ads.internal.gmsg.k kVar = this.tp;
        com.google.android.gms.ads.internal.overlay.s sVar = this.aM;
        cv cvVar = this.j6;
        Mr(new AdOverlayInfoParcel(hv0Var, hvVar, iVar, kVar, sVar, cvVar, z, i, str, str2, cvVar.sy()));
    }

    private dv(cv cvVar, pt0 pt0Var, boolean z, fd fdVar, wc wcVar) {
        this.FH = new HashMap<>();
        this.Hw = new Object();
        this.we = false;
        this.DW = pt0Var;
        this.j6 = cvVar;
        this.J0 = z;
        this.j3 = fdVar;
        this.U2 = null;
    }
}
