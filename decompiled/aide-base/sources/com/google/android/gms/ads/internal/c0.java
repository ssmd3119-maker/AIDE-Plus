package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.ads.b3;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.by0;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.ie;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.kq0;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.nf;
import com.google.android.gms.internal.ads.p3;
import com.google.android.gms.internal.ads.rf;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.vq;
import com.google.android.gms.internal.ads.wa;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.za;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zm;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class c0 extends z0 implements com.google.android.gms.internal.ads.i1 {
    private fr<com.google.android.gms.internal.ads.j1> Jl;
    private final Object Q6;
    private boolean e3;
    private cv eU;
    private cv iW;
    private boolean kf;
    private final String pO;
    private int sE;

    @GuardedBy("mLock")
    private nf sg;

    public c0(Context context, s1 s1Var, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar) {
        this(context, s1Var, zzwfVar, str, kaVar, zzbbiVar, false);
    }

    private final void CZ(com.google.android.gms.internal.ads.v0 v0Var) {
        bn.gn.post(new h0(this, v0Var));
    }

    private final u9 Cq() {
        yl ylVar = this.k2.hK;
        if (ylVar == null || !ylVar.Ws) {
            return null;
        }
        return ylVar.j3;
    }

    private final void Dx(String str, boolean z) {
        String str2;
        if (z) {
            if (this.eU == null && this.iW == null) {
                return;
            }
            boolean z2 = this.eU != null;
            boolean z3 = this.iW != null;
            cv cvVar = null;
            if (z2) {
                str2 = null;
                cvVar = this.eU;
            } else if (z3) {
                cvVar = this.iW;
                str2 = "javascript";
            } else {
                str2 = null;
            }
            if (cvVar.getWebView() != null && w0.a8().v5(this.k2.jw)) {
                zzbbi zzbbiVar = this.k2.qp;
                int i = zzbbiVar.mb;
                int i2 = zzbbiVar.jw;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                wu wuVarFH = w0.a8().FH(sb.toString(), cvVar.getWebView(), "", "javascript", str2, str);
                this.cT = wuVarFH;
                if (wuVarFH == null) {
                    return;
                }
                cvVar.v2(wuVarFH);
                if (z3) {
                    wu wuVar = this.cT;
                    View view = this.iW.getView();
                    if (view != null) {
                        w0.a8().Hw(wuVar, view);
                    }
                }
                w0.a8().VH(this.cT);
            }
        }
    }

    private final void G5(com.google.android.gms.internal.ads.x0 x0Var) {
        bn.gn.post(new j0(this, x0Var));
    }

    private final boolean KQ() {
        yl ylVar = this.k2.hK;
        return ylVar != null && ylVar.ef;
    }

    private final void en() {
        nf nfVarGB = GB();
        if (nfVarGB != null) {
            nfVarGB.FH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.gms.internal.ads.c1 lA(com.google.android.gms.internal.ads.j1 j1Var) {
        com.google.android.gms.internal.ads.c1 c1Var;
        Object objG3;
        Object obj = null;
        if (j1Var instanceof com.google.android.gms.internal.ads.x0) {
            com.google.android.gms.internal.ads.x0 x0Var = (com.google.android.gms.internal.ads.x0) j1Var;
            c1Var = new com.google.android.gms.internal.ads.c1(x0Var.FH(), x0Var.DW(), x0Var.gn(), x0Var.TI(), x0Var.Zo(), x0Var.er(), -1.0d, null, null, x0Var.KX(), x0Var.getVideoController(), x0Var.tX(), x0Var.v5(), x0Var.u7(), x0Var.tp());
            if (x0Var.QX() != null) {
                objG3 = xu.g3(x0Var.QX());
                obj = objG3;
            }
        } else if (j1Var instanceof com.google.android.gms.internal.ads.v0) {
            com.google.android.gms.internal.ads.v0 v0Var = (com.google.android.gms.internal.ads.v0) j1Var;
            c1Var = new com.google.android.gms.internal.ads.c1(v0Var.FH(), v0Var.DW(), v0Var.gn(), v0Var.j3(), v0Var.Zo(), null, v0Var.a8(), v0Var.yS(), v0Var.aM(), v0Var.KX(), v0Var.getVideoController(), v0Var.tX(), v0Var.v5(), v0Var.u7(), v0Var.tp());
            if (v0Var.QX() != null) {
                objG3 = xu.g3(v0Var.QX());
                obj = objG3;
            }
        } else {
            c1Var = null;
        }
        if (obj instanceof com.google.android.gms.internal.ads.l1) {
            c1Var.s5((com.google.android.gms.internal.ads.l1) obj);
        }
        return c1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void se(x0 x0Var, x0 x0Var2) {
        if (x0Var2.iW == null) {
            x0Var2.iW = x0Var.iW;
        }
        if (x0Var2.eU == null) {
            x0Var2.eU = x0Var.eU;
        }
        if (x0Var2.sg == null) {
            x0Var2.sg = x0Var.sg;
        }
        if (x0Var2.pO == null) {
            x0Var2.pO = x0Var.pO;
        }
        if (x0Var2.Gj == null) {
            x0Var2.Gj = x0Var.Gj;
        }
        if (x0Var2.fN == null) {
            x0Var2.fN = x0Var.fN;
        }
        if (x0Var2.IS == null) {
            x0Var2.IS = x0Var.IS;
        }
        if (x0Var2.q7 == null) {
            x0Var2.q7 = x0Var.q7;
        }
        if (x0Var2.gG == null) {
            x0Var2.gG = x0Var.gG;
        }
        if (x0Var2.Z1 == null) {
            x0Var2.Z1 = x0Var.Z1;
        }
        if (x0Var2.n5 == null) {
            x0Var2.n5 = x0Var.n5;
        }
        if (x0Var2.w9 == null) {
            x0Var2.w9 = x0Var.w9;
        }
        if (x0Var2.hK == null) {
            x0Var2.hK = x0Var.hK;
        }
        if (x0Var2.cT == null) {
            x0Var2.cT = x0Var.cT;
        }
    }

    private final void zs(com.google.android.gms.internal.ads.c1 c1Var) {
        bn.gn.post(new i0(this, c1Var));
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final m3 Aq(String str) {
        com.google.android.gms.common.internal.p.Hw("getOnCustomClickListener must be called on the main UI thread.");
        SimpleArrayMap<String, m3> simpleArrayMap = this.k2.sg;
        if (simpleArrayMap == null) {
            return null;
        }
        return simpleArrayMap.get(str);
    }

    public final String BF() {
        return this.pO;
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void Bh(boolean z) {
        super.Bh(z);
        if (this.e3) {
            if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.xg)).booleanValue()) {
                kL();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void Bx() {
        this.cT = null;
        cv cvVar = this.eU;
        if (cvVar != null) {
            cvVar.destroy();
            this.eU = null;
        }
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void G2(int i, boolean z) {
        en();
        super.G2(i, z);
    }

    public final nf GB() {
        nf nfVar;
        synchronized (this.Q6) {
            nfVar = this.sg;
        }
        return nfVar;
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void HS(int i) {
        G2(i, false);
    }

    public final void Iz(int i) {
        com.google.android.gms.common.internal.p.Hw("setMaxNumberOfAds must be called on the main UI thread.");
        this.sE = i;
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final boolean Lm() {
        if (Cq() != null) {
            return Cq().XL;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.v9
    public final void Lx() {
        yl ylVar = this.k2.hK;
        if (ylVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(ylVar.aM)) {
            super.Lx();
        } else {
            yx();
        }
    }

    @Override // com.google.android.gms.ads.internal.a
    public final void MU(final zl zlVar, com.google.android.gms.internal.ads.d0 d0Var) throws JSONException {
        zzwf zzwfVar = zlVar.Hw;
        if (zzwfVar != null) {
            this.k2.w9 = zzwfVar;
        }
        if (zlVar.v5 != -2) {
            bn.gn.post(new Runnable(this, zlVar) { // from class: com.google.android.gms.ads.internal.d0
                private final c0 WB;
                private final zl mb;

                {
                    this.WB = this;
                    this.mb = zlVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.BJ(new yl(this.mb, null, null, null, null, null, null, null));
                }
            });
            return;
        }
        int i = zlVar.j6.b1;
        if (i == 1) {
            x0 x0Var = this.k2;
            x0Var.BR = 0;
            w0.Hw();
            x0 x0Var2 = this.k2;
            x0Var.AL = ie.j6(x0Var2.jw, this, zlVar, x0Var2.fY, null, this.Z1, this, d0Var);
            String strValueOf = String.valueOf(this.k2.AL.getClass().getName());
            xp.VH(strValueOf.length() != 0 ? "AdRenderer: ".concat(strValueOf) : new String("AdRenderer: "));
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONObject(zlVar.DW.fY).getJSONArray("slots");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                JSONArray jSONArrayOptJSONArray = jSONArray2.getJSONObject(i2).optJSONArray("ads");
                for (int i3 = 0; jSONArrayOptJSONArray != null && i3 < jSONArrayOptJSONArray.length(); i3++) {
                    jSONArray.put(jSONArrayOptJSONArray.get(i3));
                }
            }
            en();
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(zm.j6(new f0(this, i4, jSONArray, i, zlVar)));
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                try {
                    bn.gn.post(new g0(this, (com.google.android.gms.internal.ads.j1) ((vq) arrayList.get(i5)).get(((Long) cw0.v5().FH(com.google.android.gms.internal.ads.p.ys)).longValue(), TimeUnit.MILLISECONDS), i5, arrayList));
                } catch (InterruptedException e) {
                    xp.v5("", e);
                    Thread.currentThread().interrupt();
                } catch (CancellationException e2) {
                    e = e2;
                    xp.v5("", e);
                } catch (ExecutionException e3) {
                    e = e3;
                    xp.v5("", e);
                } catch (TimeoutException e4) {
                    e = e4;
                    xp.v5("", e);
                }
            }
        } catch (JSONException e5) {
            xp.v5("Malformed native ad response", e5);
            HS(0);
        }
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void Mr() {
        throw new IllegalStateException("Native Ad DOES NOT support pause().");
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final void NS() {
        Bh(false);
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final String Nh() {
        return this.k2.mb;
    }

    protected final void Qv(wu wuVar) {
        Object objG3 = wuVar != null ? xu.g3(wuVar) : null;
        if (objG3 instanceof com.google.android.gms.internal.ads.h1) {
            ((com.google.android.gms.internal.ads.h1) objG3).MP();
        }
        super.bd(this.k2.hK, false);
    }

    @Override // com.google.android.gms.ads.internal.z0
    protected final boolean S3(zzwb zzwbVar, yl ylVar, boolean z) {
        return this.qp.tp();
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void XL() {
        throw new IllegalStateException("Native Ad DOES NOT support resume().");
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.v9
    public final void Yi() {
        by0 by0VarPj;
        na naVar = this.k2.hK.XL;
        if (naVar == null) {
            super.Yi();
            return;
        }
        yx0 videoController = null;
        try {
            wa waVarSM = naVar.sM();
            if (waVarSM != null) {
                videoController = waVarSM.getVideoController();
            } else {
                za zaVarE3 = naVar.e3();
                if (zaVarE3 != null) {
                    videoController = zaVarE3.getVideoController();
                } else {
                    b3 b3VarLJ = naVar.lJ();
                    if (b3VarLJ != null) {
                        videoController = b3VarLJ.getVideoController();
                    }
                }
            }
            if (videoController == null || (by0VarPj = videoController.pj()) == null) {
                return;
            }
            by0VarPj.w9();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void Zq(cv cvVar) {
        this.iW = cvVar;
    }

    public final void b7() {
        this.e3 = false;
        if (this.k2.hK == null || this.iW == null) {
            xp.u7("Request to enable ActiveView before adState is available.");
        } else {
            w0.u7().aM().VH(this.k2.hK);
        }
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void cX(sd sdVar) {
        throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
    }

    public final void d6(cv cvVar) {
        this.eU = cvVar;
    }

    public final SimpleArrayMap<String, p3> dm() {
        com.google.android.gms.common.internal.p.Hw("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        return this.k2.pO;
    }

    public final void eE() {
        cv cvVar;
        zzacp zzacpVar;
        cv cvVar2 = this.iW;
        if (cvVar2 != null && cvVar2.CU() != null && (zzacpVar = this.k2.fN) != null && zzacpVar.k2 != null) {
            this.iW.CU().d7(this.k2.fN.k2);
        } else {
            if (this.k2.sE == null || (cvVar = this.iW) == null || cvVar.CU() == null) {
                return;
            }
            this.iW.CU().MU(false, true, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final boolean f2() {
        if (Cq() != null) {
            return Cq().aM;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void h4(com.google.android.gms.internal.ads.h1 h1Var) {
        x0 x0Var = this.k2;
        if (x0Var.hK.EQ != null && x0Var.Cz == null) {
            hq0 hq0VarAM = w0.u7().aM();
            x0 x0Var2 = this.k2;
            hq0VarAM.v5(x0Var2.w9, x0Var2.hK, new kq0(h1Var), null);
        }
    }

    final void iy() {
        synchronized (this.Q6) {
            sm.we("Initializing webview native ads utills");
            this.sg = new rf(this.k2.jw, this, this.pO, this.k2.fY, this.k2.qp);
        }
    }

    public final void kL() {
        if (this.k2.hK == null || this.iW == null) {
            this.e3 = true;
            xp.u7("Request to enable ActiveView before adState is available.");
        } else {
            hq0 hq0VarAM = w0.u7().aM();
            x0 x0Var = this.k2;
            hq0VarAM.Hw(x0Var.w9, x0Var.hK, this.iW.getView(), this.iW);
            this.e3 = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    public final boolean nG(zzwb zzwbVar, com.google.android.gms.internal.ads.d0 d0Var) {
        try {
            iy();
            return super.AQ(zzwbVar, d0Var, this.sE);
        } catch (Exception e) {
            if (!xp.DW(4)) {
                return false;
            }
            Log.i("Ads", "Error initializing webview.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void pM(View view) {
        boolean z = this.eU != null;
        if (!KQ() || this.cT == null || !z || view == null) {
            return;
        }
        w0.a8().Hw(this.cT, view);
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void py() {
        cv cvVar = this.iW;
        if (cvVar != null) {
            cvVar.destroy();
            this.iW = null;
        }
    }

    public final void qg(List<String> list) {
        com.google.android.gms.common.internal.p.Hw("setNativeTemplates must be called on the main UI thread.");
        this.k2.IS = list;
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public final void rB(com.google.android.gms.internal.ads.j0 j0Var) {
        throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.uw0
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0353  */
    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.ads.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean tc(com.google.android.gms.internal.ads.yl r28, com.google.android.gms.internal.ads.yl r29) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.c0.tc(com.google.android.gms.internal.ads.yl, com.google.android.gms.internal.ads.yl):boolean");
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final boolean vZ() {
        if (Cq() != null) {
            return Cq().QX;
        }
        return false;
    }

    protected final Future<com.google.android.gms.internal.ads.j1> wZ() {
        return this.Jl;
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void xg(com.google.android.gms.internal.ads.f1 f1Var) {
        cv cvVar = this.iW;
        if (cvVar != null) {
            cvVar.vF(f1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.i1
    public final void ys() {
        if (KQ() && this.cT != null) {
            cv cvVar = this.eU;
            cv cvVar2 = (cvVar == null && (cvVar = this.iW) == null) ? null : cvVar;
            if (cvVar2 != null) {
                cvVar2.v5("onSdkImpression", new HashMap());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.z0, com.google.android.gms.internal.ads.v9
    public final void z5() {
        yl ylVar = this.k2.hK;
        if (ylVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(ylVar.aM)) {
            super.z5();
        } else {
            dY();
        }
    }

    public c0(Context context, s1 s1Var, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar, boolean z) {
        super(context, zzwfVar, str, kaVar, zzbbiVar, s1Var);
        this.Q6 = new Object();
        this.Jl = new fr<>();
        this.sE = 1;
        this.pO = UUID.randomUUID().toString();
        this.kf = z;
    }
}
