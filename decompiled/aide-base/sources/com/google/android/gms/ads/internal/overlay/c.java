package com.google.android.gms.ads.internal.overlay;

import abcd.iy;
import abcd.wu;
import abcd.xu;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.ads.internal.zzaq;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.gd;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.md;
import com.google.android.gms.internal.ads.xp;
import java.util.Collections;
import org.json.JSONException;

@jg
/* loaded from: classes.dex */
public class c extends md implements v {
    private static final int sE = Color.argb(0, 0, 0, 0);
    private WebChromeClient.CustomViewCallback AL;
    private boolean Jl;
    private Runnable Q6;
    protected final Activity WB;
    private g cT;
    private h fY;
    cv jw;
    private boolean kf;
    AdOverlayInfoParcel mb;
    private n qp;
    private FrameLayout zh;
    private boolean k2 = false;
    private boolean w9 = false;
    private boolean hK = false;
    private boolean q7 = false;
    int Z1 = 0;
    private final Object n5 = new Object();
    private boolean iW = false;
    private boolean eU = false;
    private boolean e3 = true;

    public c(Activity activity) {
        this.WB = activity;
    }

    private final void GK() {
        this.jw.GK();
    }

    private final void HS() {
        if (!this.WB.isFinishing() || this.iW) {
            return;
        }
        this.iW = true;
        cv cvVar = this.jw;
        if (cvVar != null) {
            cvVar.RH(this.Z1);
            synchronized (this.n5) {
                if (!this.kf && this.jw.C7()) {
                    e eVar = new e(this);
                    this.Q6 = eVar;
                    bn.gn.postDelayed(eVar, ((Long) cw0.v5().FH(com.google.android.gms.internal.ads.p.fY)).longValue());
                    return;
                }
            }
        }
        xr();
    }

    private final void UE(boolean z) throws JSONException {
        int iIntValue = ((Integer) cw0.v5().FH(com.google.android.gms.internal.ads.p.k4)).intValue();
        o oVar = new o();
        oVar.Hw = 50;
        oVar.j6 = z ? iIntValue : 0;
        oVar.DW = z ? 0 : iIntValue;
        oVar.FH = iIntValue;
        this.qp = new n(this.WB, oVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        MU(z, this.mb.zh);
        this.cT.addView(this.qp, layoutParams);
    }

    private static void d7(wu wuVar, View view) {
        if (wuVar == null || view == null) {
            return;
        }
        w0.a8().Hw(wuVar, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void tc(boolean r18) throws org.json.JSONException, com.google.android.gms.ads.internal.overlay.f {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.c.tc(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Ae() {
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.pn)).booleanValue() && this.jw != null && (!this.WB.isFinishing() || this.fY == null)) {
            w0.VH();
            jn.aM(this.jw);
        }
        HS();
    }

    public final void CO(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.WB);
        this.zh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zh.addView(view, -1, -1);
        this.WB.setContentView(this.zh);
        this.Jl = true;
        this.AL = customViewCallback;
        this.k2 = true;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Dv() {
    }

    public final void G2() {
        this.cT.mb = true;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Hn(wu wuVar) {
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.tj)).booleanValue() && com.google.android.gms.common.util.o.tp()) {
            Configuration configuration = (Configuration) xu.g3(wuVar);
            w0.v5();
            if (bn.U2(this.WB, configuration)) {
                this.WB.getWindow().addFlags(1024);
                this.WB.getWindow().clearFlags(2048);
            } else {
                this.WB.getWindow().addFlags(2048);
                this.WB.getWindow().clearFlags(1024);
            }
        }
    }

    public final void MU(boolean z, boolean z2) throws JSONException {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzaq zzaqVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        zzaq zzaqVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.qp)).booleanValue() && (adOverlayInfoParcel2 = this.mb) != null && (zzaqVar2 = adOverlayInfoParcel2.Q6) != null && zzaqVar2.AL;
        boolean z5 = ((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.k2)).booleanValue() && (adOverlayInfoParcel = this.mb) != null && (zzaqVar = adOverlayInfoParcel.Q6) != null && zzaqVar.w9;
        if (z && z2 && z4 && !z5) {
            new gd(this.jw, "useCustomClose").Hw("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        n nVar = this.qp;
        if (nVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            nVar.j6(z3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void PU(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.w9);
    }

    public final void Yb() {
        this.cT.removeView(this.qp);
        UE(true);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void b1() {
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.pn)).booleanValue()) {
            cv cvVar = this.jw;
            if (cvVar == null || cvVar.isDestroyed()) {
                xp.u7("The webview does not exist. Ignoring action.");
            } else {
                w0.VH();
                jn.j3(this.jw);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void cc(int i, int i2, Intent intent) {
        iy.v5(this, i, i2, intent);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void fp() {
        this.Jl = true;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public void hw(Bundle bundle) throws JSONException, f {
        this.WB.requestWindowFeature(1);
        this.w9 = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            AdOverlayInfoParcel adOverlayInfoParcelEQ = AdOverlayInfoParcel.EQ(this.WB.getIntent());
            this.mb = adOverlayInfoParcelEQ;
            if (adOverlayInfoParcelEQ == null) {
                throw new f("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelEQ.Z1.jw > 7500000) {
                this.Z1 = 3;
            }
            if (this.WB.getIntent() != null) {
                this.e3 = this.WB.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.mb.Q6 != null) {
                this.hK = this.mb.Q6.WB;
            } else {
                this.hK = false;
            }
            if (this.hK && this.mb.Q6.k2 != -1) {
                new i(this, null).u7();
            }
            if (bundle == null) {
                if (this.mb.jw != null && this.e3) {
                    this.mb.jw.lb();
                }
                if (this.mb.cT != 1 && this.mb.mb != null) {
                    this.mb.mb.EQ();
                }
            }
            g gVar = new g(this.WB, this.mb.n5, this.mb.Z1.WB);
            this.cT = gVar;
            gVar.setId(1000);
            int i = this.mb.cT;
            if (i == 1) {
                tc(false);
                return;
            }
            if (i == 2) {
                this.fY = new h(this.mb.fY);
                tc(false);
            } else {
                if (i != 3) {
                    throw new f("Could not determine ad overlay type.");
                }
                tc(true);
            }
        } catch (f e) {
            xp.u7(e.getMessage());
            this.Z1 = 3;
            this.WB.finish();
        }
    }

    public final void k6() {
        this.Z1 = 2;
        this.WB.finish();
    }

    public final void nG() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.mb;
        if (adOverlayInfoParcel != null && this.k2) {
            setRequestedOrientation(adOverlayInfoParcel.hK);
        }
        if (this.zh != null) {
            this.WB.setContentView(this.cT);
            this.Jl = true;
            this.zh.removeAllViews();
            this.zh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.AL;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.AL = null;
        }
        this.k2 = false;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onDestroy() {
        cv cvVar = this.jw;
        if (cvVar != null) {
            this.cT.removeView(cvVar.getView());
        }
        HS();
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onPause() {
        nG();
        m mVar = this.mb.jw;
        if (mVar != null) {
            mVar.onPause();
        }
        if (!((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.pn)).booleanValue() && this.jw != null && (!this.WB.isFinishing() || this.fY == null)) {
            w0.VH();
            jn.aM(this.jw);
        }
        HS();
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onResume() {
        m mVar = this.mb.jw;
        if (mVar != null) {
            mVar.onResume();
        }
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.pn)).booleanValue()) {
            return;
        }
        cv cvVar = this.jw;
        if (cvVar == null || cvVar.isDestroyed()) {
            xp.u7("The webview does not exist. Ignoring action.");
        } else {
            w0.VH();
            jn.j3(this.jw);
        }
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void op() {
        this.Z1 = 0;
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final boolean qG() {
        this.Z1 = 0;
        cv cvVar = this.jw;
        if (cvVar == null) {
            return true;
        }
        boolean zNZ = cvVar.NZ();
        if (!zNZ) {
            this.jw.v5("onbackblocked", Collections.emptyMap());
        }
        return zNZ;
    }

    @Override // com.google.android.gms.ads.internal.overlay.v
    public final void rX() {
        this.Z1 = 1;
        this.WB.finish();
    }

    public final void setRequestedOrientation(int i) {
        if (this.WB.getApplicationInfo().targetSdkVersion >= ((Integer) cw0.v5().FH(com.google.android.gms.internal.ads.p.C)).intValue()) {
            if (this.WB.getApplicationInfo().targetSdkVersion <= ((Integer) cw0.v5().FH(com.google.android.gms.internal.ads.p.dH)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) cw0.v5().FH(com.google.android.gms.internal.ads.p.BN)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) cw0.v5().FH(com.google.android.gms.internal.ads.p.jn)).intValue()) {
                        return;
                    }
                }
            }
        }
        this.WB.setRequestedOrientation(i);
    }

    public final void vq() {
        synchronized (this.n5) {
            this.kf = true;
            if (this.Q6 != null) {
                bn.gn.removeCallbacks(this.Q6);
                bn.gn.post(this.Q6);
            }
        }
    }

    final void xr() {
        cv cvVar;
        m mVar;
        if (this.eU) {
            return;
        }
        this.eU = true;
        cv cvVar2 = this.jw;
        if (cvVar2 != null) {
            this.cT.removeView(cvVar2.getView());
            h hVar = this.fY;
            if (hVar != null) {
                this.jw.AT(hVar.Hw);
                this.jw.dH(false);
                ViewGroup viewGroup = this.fY.FH;
                View view = this.jw.getView();
                h hVar2 = this.fY;
                viewGroup.addView(view, hVar2.j6, hVar2.DW);
                this.fY = null;
            } else if (this.WB.getApplicationContext() != null) {
                this.jw.AT(this.WB.getApplicationContext());
            }
            this.jw = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.mb;
        if (adOverlayInfoParcel != null && (mVar = adOverlayInfoParcel.jw) != null) {
            mVar.Do();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.mb;
        if (adOverlayInfoParcel2 == null || (cvVar = adOverlayInfoParcel2.fY) == null) {
            return;
        }
        d7(cvVar.Rr(), this.mb.fY.getView());
    }

    public final void xu() {
        if (this.q7) {
            this.q7 = false;
            GK();
        }
    }
}
