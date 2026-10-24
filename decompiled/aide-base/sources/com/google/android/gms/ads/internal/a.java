package com.google.android.gms.ads.internal;

import abcd.wu;
import abcd.xu;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.Cdo;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.cx0;
import com.google.android.gms.internal.ads.dm;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.fj;
import com.google.android.gms.internal.ads.fw0;
import com.google.android.gms.internal.ads.hq0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.je;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jm;
import com.google.android.gms.internal.ads.jw0;
import com.google.android.gms.internal.ads.lg;
import com.google.android.gms.internal.ads.lm;
import com.google.android.gms.internal.ads.mp;
import com.google.android.gms.internal.ads.oj;
import com.google.android.gms.internal.ads.pv0;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qm;
import com.google.android.gms.internal.ads.rl;
import com.google.android.gms.internal.ads.rt0;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.sm;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.vw0;
import com.google.android.gms.internal.ads.wj;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.yx0;
import com.google.android.gms.internal.ads.zd;
import com.google.android.gms.internal.ads.zl;
import com.google.android.gms.internal.ads.zw0;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzawd;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzu;
import com.google.android.gms.internal.ads.zzzw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class a extends vw0 implements com.google.android.gms.ads.internal.gmsg.i, com.google.android.gms.ads.internal.gmsg.k, com.google.android.gms.ads.internal.overlay.s, je, lg, jm, hv0 {
    protected final hq0 AL;
    protected com.google.android.gms.internal.ads.d0 WB;
    protected wu cT;
    private com.google.android.gms.internal.ads.a0 jw;
    protected final x0 k2;
    protected com.google.android.gms.internal.ads.a0 mb;
    protected final s1 q7;
    protected transient zzwb zh;
    protected boolean fY = false;
    private final Bundle w9 = new Bundle();
    private boolean hK = false;
    protected final m0 qp = new m0(this);

    a(x0 x0Var, m0 m0Var, s1 s1Var) {
        this.k2 = x0Var;
        this.q7 = s1Var;
        w0.v5().yS(this.k2.jw);
        w0.v5().gW(this.k2.jw);
        qm.j6(this.k2.jw);
        w0.XL().j6(this.k2.jw);
        dm dmVarU7 = w0.u7();
        x0 x0Var2 = this.k2;
        dmVarU7.we(x0Var2.jw, x0Var2.qp);
        w0.EQ().FH(this.k2.jw);
        this.AL = w0.u7().aM();
        w0.gn().FH(this.k2.jw);
        w0.BT().j6(this.k2.jw);
    }

    private static long Yb(String str) {
        int iIndexOf = str.indexOf("ufe");
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        try {
            return Long.parseLong(str.substring(iIndexOf + 4, iIndexOf2));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            xp.Hw("", e);
            return -1L;
        }
    }

    protected static boolean d7(zzwb zzwbVar) {
        Bundle bundle = zzwbVar.Z1.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        return bundle == null || !bundle.containsKey("gw");
    }

    @Override // com.google.android.gms.internal.ads.je
    public void BJ(yl ylVar) {
        this.WB.DW(this.jw, "awr");
        x0 x0Var = this.k2;
        x0Var.AL = null;
        int i = ylVar.Hw;
        if (i != -2 && i != 3 && x0Var.FH() != null) {
            w0.u7().rN().VH(this.k2.FH());
        }
        if (ylVar.Hw == -1) {
            this.fY = false;
            return;
        }
        if (UE(ylVar)) {
            xp.VH("Ad refresh scheduled.");
        }
        int i2 = ylVar.Hw;
        if (i2 != -2) {
            if (i2 == 3) {
                ylVar.cb.DW(rt0.AD_FAILED_TO_LOAD_NO_FILL);
            } else {
                ylVar.cb.DW(rt0.AD_FAILED_TO_LOAD);
            }
            HS(ylVar.Hw);
            return;
        }
        x0 x0Var2 = this.k2;
        if (x0Var2.gG == null) {
            x0Var2.gG = new lm(x0Var2.mb);
        }
        y0 y0Var = this.k2.k2;
        if (y0Var != null) {
            y0Var.j6().J8(ylVar.vy);
        }
        this.AL.VH(this.k2.hK);
        if (tc(this.k2.hK, ylVar)) {
            x0 x0Var3 = this.k2;
            x0Var3.hK = ylVar;
            am amVar = x0Var3.q7;
            if (amVar != null) {
                if (ylVar != null) {
                    amVar.v5(ylVar.yS);
                    x0Var3.q7.Zo(x0Var3.hK.gW);
                    x0Var3.q7.Hw(x0Var3.hK.Ws);
                }
                x0Var3.q7.FH(x0Var3.w9.fY);
            }
            this.WB.Zo("is_mraid", this.k2.hK.j6() ? "1" : "0");
            this.WB.Zo("is_mediation", this.k2.hK.Ws ? "1" : "0");
            cv cvVar = this.k2.hK.DW;
            if (cvVar != null && cvVar.AF() != null) {
                this.WB.Zo("is_delay_pl", this.k2.hK.DW.AF().j6() ? "1" : "0");
            }
            this.WB.DW(this.mb, "ttc");
            if (w0.u7().J0() != null) {
                w0.u7().J0().Hw(this.WB);
            }
            JL();
            if (this.k2.Zo()) {
                NS();
            }
        }
        if (ylVar.sh != null) {
            w0.v5().aM(this.k2.jw, ylVar.sh);
        }
    }

    protected void Bh(boolean z) {
        sm.we("Ad finished loading.");
        this.fY = z;
        this.hK = true;
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.k2();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
        wj wjVar = this.k2.QO;
        if (wjVar != null) {
            try {
                wjVar.AE();
            } catch (RemoteException e2) {
                xp.Zo("#007 Could not call remote method.", e2);
            }
        }
        zw0 zw0Var = this.k2.kf;
        if (zw0Var != null) {
            try {
                zw0Var.mq();
            } catch (RemoteException e3) {
                xp.Zo("#007 Could not call remote method.", e3);
            }
        }
    }

    protected final void CO(zzawd zzawdVar) {
        if (this.k2.QO == null) {
            return;
        }
        String str = "";
        int i = 1;
        if (zzawdVar != null) {
            try {
                str = zzawdVar.WB;
                i = zzawdVar.mb;
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
                return;
            }
        }
        fj fjVar = new fj(str, i);
        this.k2.QO.zG(fjVar);
        if (this.k2.sM != null) {
            this.k2.sM.nI(fjVar, this.k2.cT.j6.sg);
        }
    }

    protected final void Dn() {
        sm.we("Ad leaving application.");
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.mb();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
        wj wjVar = this.k2.QO;
        if (wjVar != null) {
            try {
                wjVar.SI();
            } catch (RemoteException e2) {
                xp.Zo("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.s
    public final void E4() {
        Dn();
    }

    @Override // com.google.android.gms.internal.ads.hv0
    public void EQ() {
        if (this.k2.hK == null) {
            xp.u7("Ad state was null when trying to ping click URLs.");
            return;
        }
        xp.VH("Pinging click URLs.");
        am amVar = this.k2.q7;
        if (amVar != null) {
            amVar.u7();
        }
        if (this.k2.hK.FH != null) {
            w0.v5();
            x0 x0Var = this.k2;
            Context context = x0Var.jw;
            String str = x0Var.qp.WB;
            yl ylVar = x0Var.hK;
            bn.Ws(context, str, Mt(ylVar.FH, ylVar.vJ));
        }
        fw0 fw0Var = this.k2.Z1;
        if (fw0Var != null) {
            try {
                fw0Var.EQ();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    protected void G2(int i, boolean z) {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Failed to load ad: ");
        sb.append(i);
        xp.u7(sb.toString());
        this.fY = z;
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.Gj(i);
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
        wj wjVar = this.k2.QO;
        if (wjVar != null) {
            try {
                wjVar.wc(i);
            } catch (RemoteException e2) {
                xp.Zo("#007 Could not call remote method.", e2);
            }
        }
        e5 e5Var = this.k2.sE;
        if (e5Var != null) {
            try {
                e5Var.jU(i);
            } catch (RemoteException e3) {
                xp.Zo("#007 Could not call remote method.", e3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void HS(int i) {
        G2(i, false);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.i
    public final void HT(String str, Bundle bundle) {
        zw0 zw0Var;
        this.w9.putAll(bundle);
        if (!this.hK || (zw0Var = this.k2.kf) == null) {
            return;
        }
        try {
            zw0Var.mq();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    public final void HV(oj ojVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.k2.sM = ojVar;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final zzwf I8() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: getAdSize");
        if (this.k2.w9 == null) {
            return null;
        }
        return new zzzu(this.k2.w9);
    }

    public final void JL() {
        yl ylVar = this.k2.hK;
        if (ylVar == null || TextUtils.isEmpty(ylVar.vy) || ylVar.cn || !w0.Ws().Hw()) {
            return;
        }
        xp.VH("Sending troubleshooting signals to the server.");
        Cdo cdoWs = w0.Ws();
        x0 x0Var = this.k2;
        cdoWs.v5(x0Var.jw, x0Var.qp.WB, ylVar.vy, x0Var.mb);
        ylVar.cn = true;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final jw0 JP() {
        return this.k2.n5;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void JX(fw0 fw0Var) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setAdClickListener");
        this.k2.Z1 = fw0Var;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean KD() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: isLoaded");
        x0 x0Var = this.k2;
        return x0Var.zh == null && x0Var.AL == null && x0Var.hK != null;
    }

    protected abstract void MU(zl zlVar, com.google.android.gms.internal.ads.d0 d0Var);

    @Override // com.google.android.gms.internal.ads.uw0
    public void Mr() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: pause");
    }

    protected final List<String> Mt(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rl.Hw(it.next(), this.k2.jw, z));
        }
        return arrayList;
    }

    protected void NS() {
        Bh(false);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public String Nh() {
        return this.k2.mb;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void OM() {
        List<String> list;
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: recordManualImpression");
        if (this.k2.hK == null) {
            xp.u7("Ad state was null when trying to ping manual tracking URLs.");
            return;
        }
        xp.VH("Pinging manual tracking URLs.");
        if (this.k2.hK.ro) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<String> list2 = this.k2.hK.VH;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        t9 t9Var = this.k2.hK.QX;
        if (t9Var != null && (list = t9Var.u7) != null) {
            arrayList.addAll(list);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        w0.v5();
        x0 x0Var = this.k2;
        bn.Ws(x0Var.jw, x0Var.qp.WB, arrayList);
        this.k2.hK.ro = true;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final wu Tv() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: getAdFrame");
        return xu.sy(this.k2.k2);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.k
    public final void U2(String str, String str2) {
        cx0 cx0Var = this.k2.Q6;
        if (cx0Var != null) {
            try {
                cx0Var.U2(str, str2);
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    boolean UE(yl ylVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public void XL() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: resume");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final Bundle XX() {
        return this.hK ? this.w9 : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Xa(String str) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setUserId");
        this.k2.a5 = str;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void Zz(zzzw zzzwVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setVideoOptions");
        this.k2.Gj = zzzwVar;
    }

    protected final void ag() {
        sm.we("Ad opening.");
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.ko();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
        wj wjVar = this.k2.QO;
        if (wjVar != null) {
            try {
                wjVar.ca();
            } catch (RemoteException e2) {
                xp.Zo("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void br(wj wjVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setRewardedVideoAdListener");
        this.k2.QO = wjVar;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final boolean cT() {
        return this.fY;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public void cX(sd sdVar) {
        xp.u7("#006 Unexpected call to a deprecated method.");
    }

    public final void dY() {
        xp.gn("Ad impression.");
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.hK();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public void destroy() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: destroy");
        this.qp.j6();
        this.AL.gn(this.k2.hK);
        x0 x0Var = this.k2;
        y0 y0Var = x0Var.k2;
        if (y0Var != null) {
            y0Var.DW();
        }
        x0Var.n5 = null;
        x0Var.kf = null;
        x0Var.Q6 = null;
        x0Var.e9 = null;
        x0Var.Jl = null;
        x0Var.tp(false);
        y0 y0Var2 = x0Var.k2;
        if (y0Var2 != null) {
            y0Var2.removeAllViews();
        }
        x0Var.Hw();
        x0Var.v5();
        x0Var.hK = null;
        this.cT = null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void dz(zzwf zzwfVar) {
        cv cvVar;
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setAdSize");
        x0 x0Var = this.k2;
        x0Var.w9 = zzwfVar;
        yl ylVar = x0Var.hK;
        if (ylVar != null && (cvVar = ylVar.DW) != null && x0Var.BR == 0) {
            cvVar.ba(pw.u7(zzwfVar));
        }
        y0 y0Var = this.k2.k2;
        if (y0Var == null) {
            return;
        }
        if (y0Var.getChildCount() > 1) {
            y0 y0Var2 = this.k2.k2;
            y0Var2.removeView(y0Var2.getNextView());
        }
        this.k2.k2.setMinimumWidth(zzwfVar.k2);
        this.k2.k2.setMinimumHeight(zzwfVar.jw);
        this.k2.k2.requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.lg
    public final void eQ(zl zlVar) {
        zzasm zzasmVar = zlVar.DW;
        if (zzasmVar.Q6 != -1 && !TextUtils.isEmpty(zzasmVar.Cz)) {
            long jYb = Yb(zlVar.DW.Cz);
            if (jYb != -1) {
                this.WB.DW(this.WB.FH(zlVar.DW.Q6 + jYb), "stc");
            }
        }
        this.WB.Hw(zlVar.DW.Cz);
        this.WB.DW(this.mb, "arf");
        this.jw = this.WB.VH();
        this.WB.Zo("gqi", zlVar.DW.pN);
        x0 x0Var = this.k2;
        x0Var.zh = null;
        x0Var.cT = zlVar;
        zlVar.u7.j6(new a0(this, zlVar));
        zlVar.u7.DW(rt0.AD_LOADED);
        MU(zlVar, this.WB);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ek(ix0 ix0Var) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setCorrelationIdProvider");
        this.k2.Jl = ix0Var;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ew(String str) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setCustomData");
        this.k2.ys = str;
    }

    public final s1 fY() {
        return this.q7;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public yx0 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public void ir(boolean z) {
        xp.u7("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
    }

    protected void is() {
        sm.we("Ad closing.");
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.fN();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
        wj wjVar = this.k2.QO;
        if (wjVar != null) {
            try {
                wjVar.Mz();
            } catch (RemoteException e2) {
                xp.Zo("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void k6(com.google.android.gms.internal.ads.a0 a0Var) {
        this.WB = new com.google.android.gms.internal.ads.d0(((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.sh)).booleanValue(), "load_ad", this.k2.w9.WB);
        this.jw = new com.google.android.gms.internal.ads.a0(-1L, null, null);
        if (a0Var == null) {
            this.mb = new com.google.android.gms.internal.ads.a0(-1L, null, null);
        } else {
            this.mb = new com.google.android.gms.internal.ads.a0(a0Var.j6(), a0Var.DW(), a0Var.FH());
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void lR(cx0 cx0Var) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setAppEventListener");
        this.k2.Q6 = cx0Var;
    }

    protected abstract boolean nG(zzwb zzwbVar, com.google.android.gms.internal.ads.d0 d0Var);

    protected final void na() {
        wj wjVar = this.k2.QO;
        if (wjVar == null) {
            return;
        }
        try {
            wjVar.ei();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final cx0 oR() {
        return this.k2.Q6;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public boolean p8(zzwb zzwbVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: loadAd");
        w0.EQ().EQ();
        this.w9.clear();
        this.hK = false;
        zzwb zzwbVarGn = zzwbVar.gn();
        zzwbVarGn.jw.putInt("dv", DynamiteModule.FH(this.k2.jw, ModuleDescriptor.MODULE_ID));
        zzwbVarGn.jw.putBoolean(AdMobAdapter.NEW_BUNDLE, true);
        if (com.google.android.gms.common.util.i.DW(this.k2.jw) && zzwbVarGn.cT != null) {
            pv0 pv0Var = new pv0(zzwbVarGn);
            pv0Var.j6(null);
            zzwbVarGn = pv0Var.DW();
        }
        x0 x0Var = this.k2;
        if (x0Var.zh != null || x0Var.AL != null) {
            if (this.zh != null) {
                xp.u7("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
            } else {
                xp.u7("Loading already in progress, saving this object for future refreshes.");
            }
            this.zh = zzwbVarGn;
            return false;
        }
        xp.gn("Starting ad request.");
        String strValueOf = String.valueOf(this.k2.qp.WB);
        xp.gn(strValueOf.length() != 0 ? "SDK version: ".concat(strValueOf) : new String("SDK version: "));
        k6(null);
        this.mb = this.WB.VH();
        if (zzwbVarGn.k2) {
            xp.gn("This request is sent from a test device.");
        } else {
            cw0.j6();
            String strWs = mp.Ws(this.k2.jw);
            StringBuilder sb = new StringBuilder(String.valueOf(strWs).length() + 71);
            sb.append("Use AdRequest.Builder.addTestDevice(\"");
            sb.append(strWs);
            sb.append("\") to get test ads on this device.");
            xp.gn(sb.toString());
        }
        this.qp.VH(zzwbVarGn);
        boolean zNG = nG(zzwbVarGn, this.WB);
        this.fY = zNG;
        return zNG;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public void rB(com.google.android.gms.internal.ads.j0 j0Var) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    @Override // com.google.android.gms.internal.ads.jm
    public final void s0(HashSet<am> hashSet) {
        this.k2.j6(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public void sG(boolean z) {
        throw new IllegalStateException("#005 Unexpected call to an abstract (unimplemented) method.");
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void stopLoading() {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: stopLoading");
        this.fY = false;
        this.k2.tp(true);
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void tD(zd zdVar, String str) {
        xp.u7("#006 Unexpected call to a deprecated method.");
    }

    protected abstract boolean tc(yl ylVar, yl ylVar2);

    protected final String ty() {
        zzasm zzasmVar;
        zl zlVar = this.k2.cT;
        if (zlVar == null || (zzasmVar = zlVar.DW) == null) {
            return "javascript";
        }
        String str = zzasmVar.PT;
        if (TextUtils.isEmpty(str)) {
            return "javascript";
        }
        try {
            if (new JSONObject(str).optInt("media_type", -1) == 0) {
                return null;
            }
            return "javascript";
        } catch (JSONException e) {
            xp.v5("", e);
            return "javascript";
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void uy(zzyv zzyvVar) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setIconAdOptions");
        this.k2.pN = zzyvVar;
    }

    protected final void vq(View view) {
        y0 y0Var = this.k2.k2;
        if (y0Var != null) {
            y0Var.addView(view, w0.VH().rN());
        }
    }

    protected final List<String> xr(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(rl.FH(it.next(), this.k2.jw));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void xt(jw0 jw0Var) {
        com.google.android.gms.common.internal.p.Hw("#008 Must be called on the main UI thread.: setAdListener");
        this.k2.n5 = jw0Var;
    }

    protected boolean xu(zzwb zzwbVar) {
        y0 y0Var = this.k2.k2;
        if (y0Var == null) {
            return false;
        }
        Object parent = y0Var.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        return w0.v5().a8(view, view.getContext());
    }

    protected final void yP() {
        wj wjVar = this.k2.QO;
        if (wjVar == null) {
            return;
        }
        try {
            wjVar.P8();
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final void ye(zw0 zw0Var) {
        this.k2.kf = zw0Var;
    }

    public final void yx() {
        xp.gn("Ad clicked.");
        jw0 jw0Var = this.k2.n5;
        if (jw0Var != null) {
            try {
                jw0Var.EQ();
            } catch (RemoteException e) {
                xp.Zo("#007 Could not call remote method.", e);
            }
        }
    }
}
