package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class mg extends om implements ah {
    private final pt0 AL;
    private u9 Q6;

    @GuardedBy("mCancelLock")
    private wn Z1;
    private Runnable cT;
    private final lg fY;
    private zzasi hK;
    private final Object k2 = new Object();
    private zzasm n5;

    @GuardedBy("mCancelLock")
    private boolean q7;
    private final ih qp;
    private final zzur w9;
    private final Context zh;

    public mg(Context context, ih ihVar, lg lgVar, zzur zzurVar) {
        this.fY = lgVar;
        this.zh = context;
        this.qp = ihVar;
        this.w9 = zzurVar;
        pt0 pt0Var = new pt0(zzurVar);
        this.AL = pt0Var;
        pt0Var.j6(new qt0(this) { // from class: com.google.android.gms.internal.ads.ng
            private final mg j6;

            {
                this.j6 = this;
            }

            @Override // com.google.android.gms.internal.ads.qt0
            public final void j6(dv0 dv0Var) {
                this.j6.J0(dv0Var);
            }
        });
        final ev0 ev0Var = new ev0();
        ev0Var.FH = Integer.valueOf(this.qp.tp.mb);
        ev0Var.Hw = Integer.valueOf(this.qp.tp.jw);
        ev0Var.v5 = Integer.valueOf(this.qp.tp.fY ? 0 : 2);
        this.AL.j6(new qt0(ev0Var) { // from class: com.google.android.gms.internal.ads.og
            private final ev0 j6;

            {
                this.j6 = ev0Var;
            }

            @Override // com.google.android.gms.internal.ads.qt0
            public final void j6(dv0 dv0Var) {
                dv0Var.u7.Zo = this.j6;
            }
        });
        if (this.qp.Zo != null) {
            this.AL.j6(new qt0(this) { // from class: com.google.android.gms.internal.ads.pg
                private final mg j6;

                {
                    this.j6 = this;
                }

                @Override // com.google.android.gms.internal.ads.qt0
                public final void j6(dv0 dv0Var) {
                    this.j6.we(dv0Var);
                }
            });
        }
        zzwf zzwfVar = this.qp.FH;
        if (zzwfVar.fY && "interstitial_mb".equals(zzwfVar.WB)) {
            this.AL.j6(qg.j6);
        } else if (zzwfVar.fY && "reward_mb".equals(zzwfVar.WB)) {
            this.AL.j6(rg.j6);
        } else if (zzwfVar.AL || zzwfVar.fY) {
            this.AL.j6(tg.j6);
        } else {
            this.AL.j6(sg.j6);
        }
        this.AL.DW(rt0.AD_REQUEST);
    }

    private final void J8(int i, String str) {
        if (i == 3 || i == -1) {
            xp.gn(str);
        } else {
            xp.u7(str);
        }
        if (this.n5 == null) {
            this.n5 = new zzasm(i);
        } else {
            this.n5 = new zzasm(i, this.n5.q7);
        }
        zzasi zzasiVar = this.hK;
        if (zzasiVar == null) {
            zzasiVar = new zzasi(this.qp, -1L, null, null, null, null);
        }
        zzasm zzasmVar = this.n5;
        this.fY.eQ(new zl(zzasiVar, zzasmVar, this.Q6, null, i, -1L, zzasmVar.Q6, null, this.AL, null));
    }

    private final zzwf tp(zzasi zzasiVar) throws wg, NumberFormatException {
        u9 u9Var;
        List<Integer> list;
        zzasi zzasiVar2 = this.hK;
        if (((zzasiVar2 == null || (list = zzasiVar2.MP) == null || list.size() <= 1) ? false : true) && (u9Var = this.Q6) != null && !u9Var.U2) {
            return null;
        }
        if (this.n5.oy) {
            for (zzwf zzwfVar : zzasiVar.fY.zh) {
                if (zzwfVar.w9) {
                    return new zzwf(zzwfVar, zzasiVar.fY.zh);
                }
            }
        }
        String str = this.n5.n5;
        if (str == null) {
            throw new wg("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            String strValueOf = String.valueOf(this.n5.n5);
            throw new wg(strValueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(strValueOf) : new String("Invalid ad size format from the ad response: "), 0);
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            for (zzwf zzwfVar2 : zzasiVar.fY.zh) {
                float f = this.zh.getResources().getDisplayMetrics().density;
                int i3 = zzwfVar2.qp;
                if (i3 == -1) {
                    i3 = (int) (zzwfVar2.k2 / f);
                }
                int i4 = zzwfVar2.mb;
                if (i4 == -2) {
                    i4 = (int) (zzwfVar2.jw / f);
                }
                if (i == i3 && i2 == i4 && !zzwfVar2.w9) {
                    return new zzwf(zzwfVar2, zzasiVar.fY.zh);
                }
            }
            String strValueOf2 = String.valueOf(this.n5.n5);
            throw new wg(strValueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(strValueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(this.n5.n5);
            throw new wg(strValueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(strValueOf3) : new String("Invalid ad size number from the ad response: "), 0);
        }
    }

    final /* synthetic */ void EQ(hr hrVar) {
        wn ghVar;
        synchronized (this.k2) {
            if (this.q7) {
                xp.u7("Request task was already canceled");
                return;
            }
            zzbbi zzbbiVar = this.qp.tp;
            Context context = this.zh;
            if (new yg(context).j6(zzbbiVar)) {
                xp.VH("Fetching ad response from local ad request service.");
                ghVar = new fh(context, hrVar, this);
                ghVar.VH();
            } else {
                xp.VH("Fetching ad response from remote ad request service.");
                cw0.j6();
                if (mp.a8(context, 12451000)) {
                    ghVar = new gh(context, zzbbiVar, hrVar, this);
                } else {
                    xp.u7("Failed to connect to remote ad request service.");
                    ghVar = null;
                }
            }
            this.Z1 = ghVar;
            if (ghVar == null) {
                J8(0, "Could not start the ad request service.");
                bn.gn.removeCallbacks(this.cT);
            }
        }
    }

    final /* synthetic */ void J0(dv0 dv0Var) {
        dv0Var.Hw = this.qp.a8;
    }

    final /* synthetic */ void Ws() {
        synchronized (this.k2) {
            this.q7 = true;
            if (this.Z1 != null) {
                v5();
            }
            J8(2, "Timed out waiting for ad response.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ah
    public final void e9(zzasm zzasmVar) throws IllegalAccessException, NoSuchMethodException, wg, SecurityException, IllegalArgumentException, InvocationTargetException {
        Boolean boolValueOf;
        JSONObject jSONObject;
        xp.VH("Received ad response.");
        this.n5 = zzasmVar;
        String str = zzasmVar.b1;
        if (!TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.w0.ei().XL(this.zh, str);
        }
        long jDW = com.google.android.gms.ads.internal.w0.we().DW();
        synchronized (this.k2) {
            boolValueOf = null;
            this.Z1 = null;
        }
        com.google.android.gms.ads.internal.w0.u7().a8().XL(this.n5.IS);
        if (((Boolean) cw0.v5().FH(p.zh)).booleanValue()) {
            if (this.n5.ce) {
                com.google.android.gms.ads.internal.w0.u7().a8().U2(this.hK.qp);
            } else {
                com.google.android.gms.ads.internal.w0.u7().a8().gn(this.hK.qp);
            }
        }
        try {
            if (this.n5.k2 != -2 && this.n5.k2 != -3) {
                int i = this.n5.k2;
                StringBuilder sb = new StringBuilder(66);
                sb.append("There was a problem getting an ad response. ErrorCode: ");
                sb.append(i);
                throw new wg(sb.toString(), this.n5.k2);
            }
            if (this.n5.k2 != -3) {
                if (TextUtils.isEmpty(this.n5.fY)) {
                    throw new wg("No fill from ad server.", 3);
                }
                com.google.android.gms.ads.internal.w0.u7().a8().v5(this.n5.sg);
                if (this.n5.w9) {
                    try {
                        this.Q6 = new u9(this.n5.fY);
                        com.google.android.gms.ads.internal.w0.u7().VH(this.Q6.gn);
                    } catch (JSONException e) {
                        xp.Hw("Could not parse mediation config.", e);
                        String strValueOf = String.valueOf(this.n5.fY);
                        throw new wg(strValueOf.length() != 0 ? "Could not parse mediation config: ".concat(strValueOf) : new String("Could not parse mediation config: "), 0);
                    }
                } else {
                    com.google.android.gms.ads.internal.w0.u7().VH(this.n5.BR);
                }
                if (!TextUtils.isEmpty(this.n5.gG)) {
                    xp.VH("Received cookie from server. Setting webview cookie in CookieManager.");
                    CookieManager cookieManagerQX = com.google.android.gms.ads.internal.w0.VH().QX(this.zh);
                    if (cookieManagerQX != null) {
                        cookieManagerQX.setCookie("googleads.g.doubleclick.net", this.n5.gG);
                    }
                }
            }
            zzwf zzwfVarTp = this.hK.fY.zh != null ? tp(this.hK) : null;
            com.google.android.gms.ads.internal.w0.u7().a8().rN(this.n5.pO);
            com.google.android.gms.ads.internal.w0.u7().a8().BT(this.n5.Pa);
            if (TextUtils.isEmpty(this.n5.eU)) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(this.n5.eU);
                } catch (Exception e2) {
                    xp.Hw("Error parsing the JSON for Active View.", e2);
                }
            }
            Bundle bundle = this.hK.jw.Z1;
            int i2 = this.n5.oa;
            if (i2 == 2) {
                boolValueOf = Boolean.TRUE;
                Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                    bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
                }
                bundle2.putBoolean("render_test_ad_label", true);
            } else if (i2 == 1) {
                boolValueOf = Boolean.FALSE;
            } else if (i2 == 0) {
                boolValueOf = Boolean.valueOf(ep.j6(bundle));
            }
            Boolean bool = boolValueOf;
            if (this.n5.AR) {
                Bundle bundle3 = bundle.getBundle(AdMobAdapter.class.getName());
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                    bundle.putBundle(AdMobAdapter.class.getName(), bundle3);
                }
                bundle3.putBoolean("is_analytics_logging_enabled", true);
            }
            zzasi zzasiVar = this.hK;
            zzasm zzasmVar2 = this.n5;
            this.fY.eQ(new zl(zzasiVar, zzasmVar2, this.Q6, zzwfVarTp, -2, jDW, zzasmVar2.Q6, jSONObject, this.AL, bool));
            bn.gn.removeCallbacks(this.cT);
        } catch (wg e3) {
            J8(e3.j6(), e3.getMessage());
            bn.gn.removeCallbacks(this.cT);
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() throws IllegalAccessException, NoSuchMethodException, wg, SecurityException, IllegalArgumentException, InvocationTargetException {
        String string;
        xp.VH("AdLoaderBackgroundTask started.");
        Runnable runnable = new Runnable(this) { // from class: com.google.android.gms.internal.ads.ug
            private final mg WB;

            {
                this.WB = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.Ws();
            }
        };
        this.cT = runnable;
        bn.gn.postDelayed(runnable, ((Long) cw0.v5().FH(p.a5)).longValue());
        long jDW = com.google.android.gms.ads.internal.w0.we().DW();
        Bundle bundle = this.qp.DW.jw;
        if (bundle != null && (string = bundle.getString("_ad")) != null) {
            zzasi zzasiVar = new zzasi(this.qp, jDW, null, null, null, null);
            this.hK = zzasiVar;
            e9(qi.j6(this.zh, zzasiVar, string));
        } else {
            final lr lrVar = new lr();
            zm.DW(new Runnable(this, lrVar) { // from class: com.google.android.gms.internal.ads.vg
                private final mg WB;
                private final hr mb;

                {
                    this.WB = this;
                    this.mb = lrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.WB.EQ(this.mb);
                }
            });
            zzasi zzasiVar2 = new zzasi(this.qp, jDW, com.google.android.gms.ads.internal.w0.ei().lg(this.zh), com.google.android.gms.ads.internal.w0.ei().rN(this.zh), com.google.android.gms.ads.internal.w0.ei().er(this.zh), com.google.android.gms.ads.internal.w0.ei().Zo(this.zh));
            this.hK = zzasiVar2;
            lrVar.DW(zzasiVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
        synchronized (this.k2) {
            if (this.Z1 != null) {
                this.Z1.cancel();
            }
        }
    }

    final /* synthetic */ void we(dv0 dv0Var) {
        dv0Var.u7.FH = this.qp.Zo.packageName;
    }
}
