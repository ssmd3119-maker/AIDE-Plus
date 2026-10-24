package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.fr0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.za;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class u1 extends e1 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private boolean Jl;
    private boolean kf;

    public u1(Context context, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar, s1 s1Var) {
        super(context, zzwfVar, str, kaVar, zzbbiVar, s1Var);
        new WeakReference(null);
    }

    private final void CZ(cv cvVar) {
        WebView webView;
        View view;
        if (se() && (webView = cvVar.getWebView()) != null && (view = cvVar.getView()) != null && w0.a8().v5(this.k2.jw)) {
            zzbbi zzbbiVar = this.k2.qp;
            int i = zzbbiVar.mb;
            int i2 = zzbbiVar.jw;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            wu wuVarDW = w0.a8().DW(sb.toString(), webView, "", "javascript", ty());
            this.cT = wuVarDW;
            if (wuVarDW != null) {
                w0.a8().Hw(this.cT, view);
                cvVar.v2(this.cT);
                w0.a8().VH(this.cT);
                this.Jl = true;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zs(yl ylVar, yl ylVar2) {
        cv cvVar;
        if (ylVar2.Ws) {
            View viewTp = s.tp(ylVar2);
            if (viewTp == null) {
                xp.u7("Could not get mediation view");
                return false;
            }
            View nextView = this.k2.k2.getNextView();
            if (nextView != 0) {
                if (nextView instanceof cv) {
                    ((cv) nextView).destroy();
                }
                this.k2.k2.removeView(nextView);
            }
            if (!s.we(ylVar2)) {
                try {
                    if (w0.ei().U2(this.k2.jw)) {
                        new fr0(this.k2.jw, viewTp).Hw(new nl(this.k2.jw, this.k2.mb));
                    }
                    if (ylVar2.a8 != null) {
                        this.k2.k2.setMinimumWidth(ylVar2.a8.k2);
                        this.k2.k2.setMinimumHeight(ylVar2.a8.jw);
                    }
                    vq(viewTp);
                } catch (Exception e) {
                    w0.u7().v5(e, "BannerAdManager.swapViews");
                    xp.v5("Could not add mediation view to view hierarchy.", e);
                    return false;
                }
            }
        } else {
            zzwf zzwfVar = ylVar2.a8;
            if (zzwfVar != null && (cvVar = ylVar2.DW) != null) {
                cvVar.ba(pw.u7(zzwfVar));
                this.k2.k2.removeAllViews();
                this.k2.k2.setMinimumWidth(ylVar2.a8.k2);
                this.k2.k2.setMinimumHeight(ylVar2.a8.jw);
                vq(ylVar2.DW.getView());
            }
        }
        if (this.k2.k2.getChildCount() > 1) {
            this.k2.k2.showNext();
        }
        if (ylVar != null) {
            View nextView2 = this.k2.k2.getNextView();
            if (nextView2 instanceof cv) {
                ((cv) nextView2).destroy();
            } else if (nextView2 != 0) {
                this.k2.k2.removeView(nextView2);
            }
            this.k2.v5();
        }
        this.k2.k2.setVisibility(0);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.e1
    protected final cv BF(zl zlVar, t1 t1Var, jl jlVar) {
        com.google.android.gms.ads.d dVarAM;
        x0 x0Var = this.k2;
        zzwf zzwfVar = x0Var.w9;
        if (zzwfVar.zh == null && zzwfVar.w9) {
            zzasm zzasmVar = zlVar.DW;
            if (!zzasmVar.oy) {
                String str = zzasmVar.n5;
                if (str != null) {
                    String[] strArrSplit = str.split("[xX]");
                    strArrSplit[0] = strArrSplit[0].trim();
                    strArrSplit[1] = strArrSplit[1].trim();
                    dVarAM = new com.google.android.gms.ads.d(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
                } else {
                    dVarAM = zzwfVar.aM();
                }
                zzwfVar = new zzwf(this.k2.jw, dVarAM);
            }
            x0Var.w9 = zzwfVar;
        }
        return super.BF(zlVar, t1Var, jlVar);
    }

    @Override // com.google.android.gms.ads.internal.z0
    protected final void BH(yl ylVar, boolean z) {
        if (se()) {
            cv cvVar = ylVar != null ? ylVar.DW : null;
            if (cvVar != null) {
                if (!this.Jl) {
                    CZ(cvVar);
                }
                if (this.cT != null) {
                    cvVar.v5("onSdkImpression", new ArrayMap());
                }
            }
        }
        super.BH(ylVar, z);
        if (s.we(ylVar)) {
            c cVar = new c(this);
            if (ylVar == null || !s.we(ylVar)) {
                return;
            }
            cv cvVar2 = ylVar.DW;
            View view = cvVar2 != null ? cvVar2.getView() : null;
            if (view == null) {
                xp.u7("AdWebView is null");
                return;
            }
            try {
                List<String> list = ylVar.QX != null ? ylVar.QX.aM : null;
                if (list != null && !list.isEmpty()) {
                    wa waVarSM = ylVar.XL != null ? ylVar.XL.sM() : null;
                    za zaVarE3 = ylVar.XL != null ? ylVar.XL.e3() : null;
                    if (list.contains("2") && waVarSM != null) {
                        waVarSM.qP(xu.sy(view));
                        if (!waVarSM.cn()) {
                            waVarSM.VH();
                        }
                        cvVar2.sh("/nativeExpressViewClicked", s.j6(waVarSM, null, cVar));
                        return;
                    }
                    if (!list.contains("1") || zaVarE3 == null) {
                        xp.u7("No matching template id and mapper");
                        return;
                    }
                    zaVarE3.qP(xu.sy(view));
                    if (!zaVarE3.cn()) {
                        zaVarE3.VH();
                    }
                    cvVar2.sh("/nativeExpressViewClicked", s.j6(null, zaVarE3, cVar));
                    return;
                }
                xp.u7("No template ids present in mediation response");
            } catch (RemoteException e) {
                xp.v5("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    final void G5(yl ylVar) {
        cv cvVar;
        if (ylVar == null || ylVar.J8 || this.k2.k2 == null) {
            return;
        }
        bn bnVarV5 = w0.v5();
        x0 x0Var = this.k2;
        if (bnVarV5.a8(x0Var.k2, x0Var.jw) && this.k2.k2.getGlobalVisibleRect(new Rect(), null)) {
            if (ylVar != null && (cvVar = ylVar.DW) != null && cvVar.AF() != null) {
                ylVar.DW.AF().FH(null);
            }
            BH(ylVar, false);
            ylVar.J8 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.hd
    public final void Jz() {
        this.qp.u7();
    }

    @Override // com.google.android.gms.ads.internal.e1, com.google.android.gms.ads.internal.a
    protected final void NS() {
        yl ylVar = this.k2.hK;
        cv cvVar = ylVar != null ? ylVar.DW : null;
        if (!this.Jl && cvVar != null) {
            CZ(cvVar);
        }
        super.NS();
    }

    @Override // com.google.android.gms.ads.internal.z0
    protected final boolean T2() {
        boolean z;
        y0 y0Var;
        w0.v5();
        if (bn.Xa(this.k2.jw, "android.permission.INTERNET")) {
            z = true;
        } else {
            mp mpVarJ6 = cw0.j6();
            x0 x0Var = this.k2;
            mpVarJ6.gn(x0Var.k2, x0Var.w9, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        w0.v5();
        if (!bn.er(this.k2.jw)) {
            mp mpVarJ62 = cw0.j6();
            x0 x0Var2 = this.k2;
            mpVarJ62.gn(x0Var2.k2, x0Var2.w9, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && (y0Var = this.k2.k2) != null) {
            y0Var.setVisibility(0);
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final yx0 getVideoController() {
        cv cvVar;
        com.google.android.gms.common.internal.p.Hw("getVideoController must be called from the main thread.");
        yl ylVar = this.k2.hK;
        if (ylVar == null || (cvVar = ylVar.DW) == null) {
            return null;
        }
        return cvVar.CU();
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void ir(boolean z) {
        com.google.android.gms.common.internal.p.Hw("setManualImpressionsEnabled must be called from the main thread.");
        this.kf = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        G5(this.k2.hK);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        G5(this.k2.hK);
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final boolean p8(zzwb zzwbVar) {
        zzwb zzwbVar2 = zzwbVar;
        this.Jl = false;
        this.cT = null;
        if (zzwbVar2.AL != this.kf) {
            zzwbVar2 = new zzwb(zzwbVar2.WB, zzwbVar2.mb, zzwbVar2.jw, zzwbVar2.fY, zzwbVar2.qp, zzwbVar2.k2, zzwbVar2.zh, zzwbVar2.AL || this.kf, zzwbVar2.w9, zzwbVar2.hK, zzwbVar2.cT, zzwbVar2.q7, zzwbVar2.Z1, zzwbVar2.n5, zzwbVar2.Q6, zzwbVar2.kf, zzwbVar2.Jl, zzwbVar2.iW, null, zzwbVar2.e3, zzwbVar2.sE);
        }
        return super.p8(zzwbVar2);
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // com.google.android.gms.ads.internal.e1, com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tc(com.google.android.gms.internal.ads.yl r5, final com.google.android.gms.internal.ads.yl r6) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.u1.tc(com.google.android.gms.internal.ads.yl, com.google.android.gms.internal.ads.yl):boolean");
    }
}
