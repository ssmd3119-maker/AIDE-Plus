package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.as0;
import com.google.android.gms.internal.ads.b3;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.ca;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.cw0;
import com.google.android.gms.internal.ads.ih;
import com.google.android.gms.internal.ads.ix0;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.jn;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.ka;
import com.google.android.gms.internal.ads.m3;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.na;
import com.google.android.gms.internal.ads.om;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.rt0;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.u9;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.vq;
import com.google.android.gms.internal.ads.w9;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.zh;
import com.google.android.gms.internal.ads.zm;
import com.google.android.gms.internal.ads.zzacp;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzur;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwf;
import com.google.android.gms.internal.ads.zzyv;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class z0 extends a implements com.google.android.gms.ads.internal.overlay.m, p0, v9 {
    protected final ka Z1;
    private transient boolean n5;

    public z0(Context context, zzwf zzwfVar, String str, ka kaVar, zzbbi zzbbiVar, s1 s1Var) {
        this(new x0(context, zzwfVar, str, zzbbiVar), kaVar, null, s1Var);
    }

    static String CP(yl ylVar) {
        t9 t9Var;
        if (ylVar == null) {
            return null;
        }
        String str = ylVar.aM;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && (t9Var = ylVar.QX) != null) {
            try {
                return new JSONObject(t9Var.EQ).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    private final ih Kf(zzwb zzwbVar, Bundle bundle, cm cmVar, int i) throws JSONException {
        PackageInfo packageInfoV5;
        Bundle bundle2;
        String string;
        JSONArray jSONArrayOptJSONArray;
        ApplicationInfo applicationInfo = this.k2.jw.getApplicationInfo();
        try {
            packageInfoV5 = com.google.android.gms.common.wrappers.b.j6(this.k2.jw).v5(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoV5 = null;
        }
        DisplayMetrics displayMetrics = this.k2.jw.getResources().getDisplayMetrics();
        y0 y0Var = this.k2.k2;
        if (y0Var == null || y0Var.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.k2.k2.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = this.k2.k2.getWidth();
            int height = this.k2.k2.getHeight();
            int i4 = (!this.k2.k2.isShown() || i2 + width <= 0 || i3 + height <= 0 || i2 > displayMetrics.widthPixels || i3 > displayMetrics.heightPixels) ? 0 : 1;
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i2);
            bundle3.putInt("y", i3);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt("visible", i4);
            bundle2 = bundle3;
        }
        this.k2.q7 = w0.u7().rN().FH(w0.we(), this.k2.mb);
        this.k2.q7.VH(zzwbVar);
        w0.v5();
        x0 x0Var = this.k2;
        String strZo = bn.Zo(x0Var.jw, x0Var.k2, x0Var.w9);
        long value = 0;
        ix0 ix0Var = this.k2.Jl;
        if (ix0Var != null) {
            try {
                value = ix0Var.getValue();
            } catch (RemoteException unused2) {
                xp.u7("Cannot get correlation id, default to 0.");
            }
        }
        long j = value;
        String string2 = UUID.randomUUID().toString();
        Bundle bundleDW = w0.u7().rN().DW(this.k2.jw, this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < this.k2.pO.size(); i5++) {
            String strKeyAt = this.k2.pO.keyAt(i5);
            arrayList.add(strKeyAt);
            if (this.k2.sg.containsKey(strKeyAt) && this.k2.sg.get(strKeyAt) != null) {
                arrayList2.add(strKeyAt);
            }
        }
        vq vqVarJ6 = zm.j6(new c1(this));
        vq vqVarJ62 = zm.j6(new d1(this));
        String strFH = cmVar != null ? cmVar.FH() : null;
        List<String> list = this.k2.IS;
        if (list == null || list.size() <= 0) {
            string = null;
        } else {
            int i6 = packageInfoV5 != null ? packageInfoV5.versionCode : 0;
            if (i6 > w0.u7().a8().Hw()) {
                w0.u7().a8().u7();
                w0.u7().a8().gW(i6);
            } else {
                JSONObject jSONObjectJ0 = w0.u7().a8().J0();
                if (jSONObjectJ0 != null && (jSONArrayOptJSONArray = jSONObjectJ0.optJSONArray(this.k2.mb)) != null) {
                    string = jSONArrayOptJSONArray.toString();
                }
            }
            string = null;
        }
        x0 x0Var2 = this.k2;
        zzwf zzwfVar = x0Var2.w9;
        String str = x0Var2.mb;
        String strEQ = x0Var2.q7.EQ();
        String strZo2 = cw0.Zo();
        x0 x0Var3 = this.k2;
        zzbbi zzbbiVar = x0Var3.qp;
        List<String> list2 = x0Var3.IS;
        boolean zVy = w0.u7().a8().vy();
        int i7 = displayMetrics.widthPixels;
        int i8 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        List<String> listFH = com.google.android.gms.internal.ads.p.FH();
        x0 x0Var4 = this.k2;
        String str2 = x0Var4.WB;
        zzacp zzacpVar = x0Var4.fN;
        String strGn = x0Var4.gn();
        float fV5 = w0.tp().v5();
        boolean zZo = w0.tp().Zo();
        w0.v5();
        int iCn = bn.cn(this.k2.jw);
        w0.v5();
        int iEv = bn.Ev(this.k2.k2);
        boolean z = this.k2.jw instanceof Activity;
        boolean zVH = w0.u7().a8().VH();
        boolean zWs = w0.u7().Ws();
        int iDW = w0.vy().DW();
        w0.v5();
        Bundle bundleFY = bn.fY();
        String strFH2 = w0.Ws().FH();
        zzyv zzyvVar = this.k2.pN;
        boolean zHw = w0.Ws().Hw();
        Bundle bundleEQ = q6.DW().EQ();
        boolean zEQ = w0.u7().a8().EQ(this.k2.mb);
        x0 x0Var5 = this.k2;
        List<Integer> list3 = x0Var5.aX;
        boolean zVH2 = com.google.android.gms.common.wrappers.b.j6(x0Var5.jw).VH();
        boolean zQX = w0.u7().QX();
        w0.VH();
        return new ih(bundle2, zzwbVar, zzwfVar, str, applicationInfo, packageInfoV5, strEQ, strZo2, zzbbiVar, bundleDW, list2, arrayList, bundle, zVy, i7, i8, f, strZo, j, string2, listFH, str2, zzacpVar, strGn, fV5, zZo, iCn, iEv, z, zVH, vqVarJ6, strFH, zWs, iDW, bundleFY, strFH2, zzyvVar, zHw, bundleEQ, zEQ, vqVarJ62, list3, string, arrayList2, i, zVH2, zQX, jn.J0(), (ArrayList) jq.Zo(w0.u7().lg(), null, 1000L, TimeUnit.MILLISECONDS), w0.v5().sG(this.k2.jw), this.k2.Cz, w0.v5().ef(this.k2.jw));
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void A0(b3 b3Var, String str) {
        String strVy;
        m3 m3Var = null;
        if (b3Var != null) {
            try {
                strVy = b3Var.vy();
            } catch (RemoteException e) {
                xp.v5("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            strVy = null;
        }
        if (this.k2.sg != null && strVy != null) {
            m3Var = this.k2.sg.get(strVy);
        }
        if (m3Var == null) {
            xp.u7("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            m3Var.lp(b3Var, str);
        }
    }

    public final boolean AQ(zzwb zzwbVar, com.google.android.gms.internal.ads.d0 d0Var, int i) {
        if (!T2()) {
            return false;
        }
        w0.v5();
        as0 as0VarWe = w0.u7().a8().we();
        cm cmVar = null;
        Bundle bundleDW = as0VarWe == null ? null : bn.DW(as0VarWe);
        this.qp.j6();
        this.k2.BR = 0;
        if (((Boolean) cw0.v5().FH(com.google.android.gms.internal.ads.p.oh)).booleanValue()) {
            cm cmVarJ6 = w0.u7().a8().j6();
            e eVarJ0 = w0.J0();
            x0 x0Var = this.k2;
            eVarJ0.DW(x0Var.jw, x0Var.qp, false, cmVarJ6, cmVarJ6 != null ? cmVarJ6.Hw() : null, x0Var.mb, null);
            cmVar = cmVarJ6;
        }
        return B9(Kf(zzwbVar, bundleDW, cmVar, i), d0Var);
    }

    public final boolean B9(ih ihVar, com.google.android.gms.internal.ads.d0 d0Var) {
        this.WB = d0Var;
        d0Var.Zo("seq_num", ihVar.VH);
        d0Var.Zo("request_id", ihVar.a8);
        d0Var.Zo("session_id", ihVar.gn);
        PackageInfo packageInfo = ihVar.Zo;
        if (packageInfo != null) {
            d0Var.Zo("app_version", String.valueOf(packageInfo.versionCode));
        }
        x0 x0Var = this.k2;
        w0.j6();
        Context context = this.k2.jw;
        zzur zzurVar = this.q7.Hw;
        om zhVar = ihVar.DW.jw.getBundle("sdk_less_server_data") != null ? new zh(context, ihVar, this, zzurVar) : new mg(context, ihVar, this, zzurVar);
        zhVar.u7();
        x0Var.zh = zhVar;
        return true;
    }

    protected void BH(yl ylVar, boolean z) {
        if (ylVar == null) {
            xp.u7("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (ylVar == null) {
            xp.u7("Ad state was null when trying to ping impression URLs.");
        } else {
            xp.VH("Pinging Impression URLs.");
            am amVar = this.k2.q7;
            if (amVar != null) {
                amVar.gn();
            }
            ylVar.cb.DW(rt0.AD_IMPRESSION);
            if (ylVar.v5 != null && !ylVar.ei) {
                w0.v5();
                x0 x0Var = this.k2;
                bn.Ws(x0Var.jw, x0Var.qp.WB, Mt(ylVar.v5, ylVar.vJ));
                ylVar.ei = true;
            }
        }
        if (!ylVar.SI || z) {
            u9 u9Var = ylVar.j3;
            if (u9Var != null && u9Var.Hw != null) {
                w0.er();
                x0 x0Var2 = this.k2;
                ca.FH(x0Var2.jw, x0Var2.qp.WB, ylVar, x0Var2.mb, z, Mt(ylVar.j3.Hw, ylVar.vJ));
            }
            t9 t9Var = ylVar.QX;
            if (t9Var != null && t9Var.VH != null) {
                w0.er();
                x0 x0Var3 = this.k2;
                ca.FH(x0Var3.jw, x0Var3.qp.WB, ylVar, x0Var3.mb, z, ylVar.QX.VH);
            }
            ylVar.SI = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.je
    public final void BJ(yl ylVar) {
        u9 u9Var;
        List<String> list;
        super.BJ(ylVar);
        if (ylVar.QX != null) {
            xp.VH("Disable the debug gesture detector on the mediation ad frame.");
            y0 y0Var = this.k2.k2;
            if (y0Var != null) {
                y0Var.Hw();
            }
            xp.VH("Pinging network fill URLs.");
            w0.er();
            x0 x0Var = this.k2;
            ca.FH(x0Var.jw, x0Var.qp.WB, ylVar, x0Var.mb, false, ylVar.QX.tp);
            u9 u9Var2 = ylVar.j3;
            if (u9Var2 != null && (list = u9Var2.VH) != null && list.size() > 0) {
                xp.VH("Pinging urls remotely");
                w0.v5().aM(this.k2.jw, ylVar.j3.VH);
            }
        } else {
            xp.VH("Enable the debug gesture detector on the admob ad frame.");
            y0 y0Var2 = this.k2.k2;
            if (y0Var2 != null) {
                y0Var2.FH();
            }
        }
        if (ylVar.Hw != 3 || (u9Var = ylVar.j3) == null || u9Var.Zo == null) {
            return;
        }
        xp.VH("Pinging no fill URLs.");
        w0.er();
        x0 x0Var2 = this.k2;
        ca.FH(x0Var2.jw, x0Var2.qp.WB, ylVar, x0Var2.mb, false, ylVar.j3.Zo);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void BN(String str, String str2) {
        U2(str, str2);
    }

    public void Do() {
        this.n5 = false;
        is();
        this.k2.q7.tp();
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.hv0
    public void EQ() {
        yl ylVar = this.k2.hK;
        if (ylVar == null) {
            xp.u7("Ad state was null when trying to ping click URLs.");
            return;
        }
        u9 u9Var = ylVar.j3;
        if (u9Var != null && u9Var.FH != null) {
            w0.er();
            x0 x0Var = this.k2;
            Context context = x0Var.jw;
            String str = x0Var.qp.WB;
            yl ylVar2 = x0Var.hK;
            ca.FH(context, str, ylVar2, x0Var.mb, false, Mt(ylVar2.j3.FH, ylVar2.vJ));
        }
        t9 t9Var = this.k2.hK.QX;
        if (t9Var != null && t9Var.Zo != null) {
            w0.er();
            x0 x0Var2 = this.k2;
            Context context2 = x0Var2.jw;
            String str2 = x0Var2.qp.WB;
            yl ylVar3 = x0Var2.hK;
            ca.FH(context2, str2, ylVar3, x0Var2.mb, false, ylVar3.QX.Zo);
        }
        super.EQ();
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String Jl() {
        yl ylVar = this.k2.hK;
        if (ylVar == null) {
            return null;
        }
        return CP(ylVar);
    }

    public void Lx() {
        EQ();
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public void Mr() {
        na naVar;
        com.google.android.gms.common.internal.p.Hw("pause must be called on the main UI thread.");
        x0 x0Var = this.k2;
        yl ylVar = x0Var.hK;
        if (ylVar != null && ylVar.DW != null && x0Var.Zo()) {
            w0.VH();
            jn.aM(this.k2.hK.DW);
        }
        yl ylVar2 = this.k2.hK;
        if (ylVar2 != null && (naVar = ylVar2.XL) != null) {
            try {
                naVar.Mr();
            } catch (RemoteException unused) {
                xp.u7("Could not pause mediation adapter.");
            }
        }
        this.AL.u7(this.k2.hK);
        this.qp.DW();
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final void O1() {
        Executor executor = ar.j6;
        m0 m0Var = this.qp;
        m0Var.getClass();
        executor.execute(b1.j6(m0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean S3(com.google.android.gms.internal.ads.zzwb r5, com.google.android.gms.internal.ads.yl r6, boolean r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L36
            com.google.android.gms.ads.internal.x0 r7 = r4.k2
            boolean r7 = r7.Zo()
            if (r7 == 0) goto L36
            long r0 = r6.u7
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L18
            com.google.android.gms.ads.internal.m0 r6 = r4.qp
            r6.Hw(r5, r0)
            goto L36
        L18:
            com.google.android.gms.internal.ads.u9 r7 = r6.j3
            if (r7 == 0) goto L28
            long r0 = r7.tp
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L28
            com.google.android.gms.ads.internal.m0 r6 = r4.qp
            r6.Hw(r5, r0)
            goto L36
        L28:
            boolean r7 = r6.Ws
            if (r7 != 0) goto L36
            int r6 = r6.Hw
            r7 = 2
            if (r6 != r7) goto L36
            com.google.android.gms.ads.internal.m0 r6 = r4.qp
            r6.gn(r5)
        L36:
            com.google.android.gms.ads.internal.m0 r5 = r4.qp
            boolean r5 = r5.tp()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.z0.S3(com.google.android.gms.internal.ads.zzwb, com.google.android.gms.internal.ads.yl, boolean):boolean");
    }

    protected boolean T2() {
        w0.v5();
        if (bn.Xa(this.k2.jw, "android.permission.INTERNET")) {
            w0.v5();
            if (bn.er(this.k2.jw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.a
    final boolean UE(yl ylVar) {
        zzwb zzwbVar = this.zh;
        boolean z = false;
        if (zzwbVar != null) {
            this.zh = null;
        } else {
            zzwbVar = ylVar.j6;
            Bundle bundle = zzwbVar.jw;
            if (bundle != null) {
                z = bundle.getBoolean("_noRefresh", false);
            }
        }
        return S3(zzwbVar, ylVar, z);
    }

    public final void VH() {
        BH(this.k2.hK, false);
    }

    @Override // com.google.android.gms.ads.internal.a, com.google.android.gms.internal.ads.uw0
    public void XL() {
        cv cvVar;
        na naVar;
        com.google.android.gms.common.internal.p.Hw("resume must be called on the main UI thread.");
        yl ylVar = this.k2.hK;
        if (ylVar == null || (cvVar = ylVar.DW) == null) {
            cvVar = null;
        }
        if (cvVar != null && this.k2.Zo()) {
            w0.VH();
            jn.j3(this.k2.hK.DW);
        }
        yl ylVar2 = this.k2.hK;
        if (ylVar2 != null && (naVar = ylVar2.XL) != null) {
            try {
                naVar.XL();
            } catch (RemoteException unused) {
                xp.u7("Could not resume mediation adapter.");
            }
        }
        if (cvVar == null || !cvVar.jT()) {
            this.qp.FH();
        }
        this.AL.tp(this.k2.hK);
    }

    public void Yi() {
        xp.u7("Mediated ad does not support onVideoEnd callback");
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void Yx() {
        Do();
    }

    protected final void bd(yl ylVar, boolean z) {
        if (ylVar == null) {
            return;
        }
        if (ylVar != null && ylVar.Zo != null && !ylVar.nw) {
            w0.v5();
            x0 x0Var = this.k2;
            bn.Ws(x0Var.jw, x0Var.qp.WB, xr(ylVar.Zo));
            ylVar.nw = true;
        }
        if (!ylVar.KD || z) {
            u9 u9Var = ylVar.j3;
            if (u9Var != null && u9Var.v5 != null) {
                w0.er();
                x0 x0Var2 = this.k2;
                ca.FH(x0Var2.jw, x0Var2.qp.WB, ylVar, x0Var2.mb, z, xr(ylVar.j3.v5));
            }
            t9 t9Var = ylVar.QX;
            if (t9Var != null && t9Var.gn != null) {
                w0.er();
                x0 x0Var3 = this.k2;
                ca.FH(x0Var3.jw, x0Var3.qp.WB, ylVar, x0Var3.mb, z, ylVar.QX.gn);
            }
            ylVar.KD = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void e4() {
        lb();
    }

    public void lb() {
        this.n5 = true;
        ag();
    }

    @Override // com.google.android.gms.ads.internal.a
    public boolean nG(zzwb zzwbVar, com.google.android.gms.internal.ads.d0 d0Var) {
        return AQ(zzwbVar, d0Var, 1);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void ni() {
        yl ylVar = this.k2.hK;
        if (ylVar != null) {
            String str = ylVar.aM;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            xp.u7(sb.toString());
        }
        BH(this.k2.hK, true);
        bd(this.k2.hK, true);
        NS();
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void onPause() {
        this.AL.u7(this.k2.hK);
    }

    @Override // com.google.android.gms.ads.internal.overlay.m
    public final void onResume() {
        this.AL.tp(this.k2.hK);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void qI() {
        Dn();
    }

    @Override // com.google.android.gms.ads.internal.p0
    public final void rk() {
        Executor executor = ar.j6;
        m0 m0Var = this.qp;
        m0Var.getClass();
        executor.execute(a1.j6(m0Var));
    }

    public void showInterstitial() {
        xp.u7("showInterstitial is not supported for current ad type");
    }

    @Override // com.google.android.gms.ads.internal.a
    protected boolean tc(yl ylVar, yl ylVar2) {
        int i;
        w9 w9Var;
        if (ylVar != null && (w9Var = ylVar.Mr) != null) {
            w9Var.k6(null);
        }
        w9 w9Var2 = ylVar2.Mr;
        if (w9Var2 != null) {
            w9Var2.k6(this);
        }
        u9 u9Var = ylVar2.j3;
        int i2 = 0;
        if (u9Var != null) {
            i2 = u9Var.j3;
            i = u9Var.Mr;
        } else {
            i = 0;
        }
        this.k2.gG.DW(i2, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uw0
    public final String u7() {
        yl ylVar = this.k2.hK;
        if (ylVar == null) {
            return null;
        }
        return ylVar.aM;
    }

    @Override // com.google.android.gms.ads.internal.a
    protected final boolean xu(zzwb zzwbVar) {
        return super.xu(zzwbVar) && !this.n5;
    }

    public void z5() {
        VH();
    }

    private z0(x0 x0Var, ka kaVar, m0 m0Var, s1 s1Var) {
        super(x0Var, null, s1Var);
        this.Z1 = kaVar;
        this.n5 = false;
    }
}
