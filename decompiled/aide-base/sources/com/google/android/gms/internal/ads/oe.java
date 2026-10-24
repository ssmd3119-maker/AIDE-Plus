package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class oe extends ee {
    private final cv Q6;
    protected aa Z1;
    private s9 cT;
    private ka hK;
    private boolean kf;
    private final d0 n5;
    private u9 q7;

    oe(Context context, zl zlVar, ka kaVar, je jeVar, d0 d0Var, cv cvVar) {
        super(context, zlVar, jeVar);
        this.hK = kaVar;
        this.q7 = zlVar.FH;
        this.n5 = d0Var;
        this.Q6 = cvVar;
    }

    @Override // com.google.android.gms.internal.ads.ee
    protected final yl EQ(int i) {
        List<String> list;
        zzaso zzasoVar;
        String str;
        boolean z;
        long j;
        String strSubstring;
        List<String> list2;
        Iterator<aa> it;
        String str2;
        boolean z2;
        long j2;
        int i2;
        String str3;
        zzasi zzasiVar = this.AL.j6;
        zzwb zzwbVar = zzasiVar.jw;
        cv cvVar = this.Q6;
        zzasm zzasmVar = this.w9;
        List<String> list3 = zzasmVar.qp;
        List<String> list4 = zzasmVar.zh;
        List<String> list5 = zzasmVar.cT;
        int i3 = zzasmVar.Z1;
        long j3 = zzasmVar.q7;
        String str4 = zzasiVar.w9;
        boolean z3 = zzasmVar.w9;
        aa aaVar = this.Z1;
        t9 t9Var = aaVar != null ? aaVar.DW : null;
        aa aaVar2 = this.Z1;
        na naVar = aaVar2 != null ? aaVar2.FH : null;
        aa aaVar3 = this.Z1;
        String name = aaVar3 != null ? aaVar3.Hw : AdMobAdapter.class.getName();
        u9 u9Var = this.q7;
        aa aaVar4 = this.Z1;
        w9 w9Var = aaVar4 != null ? aaVar4.v5 : null;
        zzasm zzasmVar2 = this.w9;
        t9 t9Var2 = t9Var;
        na naVar2 = naVar;
        long j4 = zzasmVar2.hK;
        zl zlVar = this.AL;
        zzwf zzwfVar = zlVar.Hw;
        long j5 = zzasmVar2.AL;
        long j6 = zlVar.Zo;
        long j7 = zzasmVar2.Q6;
        String str5 = zzasmVar2.kf;
        JSONObject jSONObject = zlVar.gn;
        zzawd zzawdVar = zzasmVar2.e9;
        List<String> list6 = zzasmVar2.QO;
        List<String> list7 = zzasmVar2.sM;
        u9 u9Var2 = this.q7;
        boolean z4 = u9Var2 != null ? u9Var2.Ws : false;
        zzaso zzasoVar2 = this.w9.ys;
        s9 s9Var = this.cT;
        if (s9Var != null) {
            List<aa> listDW = s9Var.DW();
            if (listDW == null) {
                list = list6;
                zzasoVar = zzasoVar2;
                str = str4;
                z = z3;
                j = j7;
                strSubstring = "";
            } else {
                Iterator<aa> it2 = listDW.iterator();
                String string = "";
                while (true) {
                    zzasoVar = zzasoVar2;
                    if (!it2.hasNext()) {
                        break;
                    }
                    aa next = it2.next();
                    if (next != null) {
                        it = it2;
                        t9 t9Var3 = next.DW;
                        if (t9Var3 == null || TextUtils.isEmpty(t9Var3.Hw)) {
                            list2 = list6;
                        } else {
                            String strValueOf = String.valueOf(string);
                            j2 = j7;
                            String str6 = next.DW.Hw;
                            int i4 = next.j6;
                            list2 = list6;
                            if (i4 != -1) {
                                if (i4 == 0) {
                                    str3 = str4;
                                    z2 = z3;
                                    i2 = 0;
                                } else if (i4 == 1) {
                                    str3 = str4;
                                    z2 = z3;
                                    i2 = 1;
                                } else if (i4 == 3) {
                                    i2 = 2;
                                } else if (i4 != 4) {
                                    i2 = 5;
                                    if (i4 != 5) {
                                        i2 = 6;
                                    }
                                } else {
                                    str3 = str4;
                                    z2 = z3;
                                    i2 = 3;
                                }
                                long j8 = next.VH;
                                str2 = str3;
                                StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 33);
                                sb.append(str6);
                                sb.append(".");
                                sb.append(i2);
                                sb.append(".");
                                sb.append(j8);
                                String string2 = sb.toString();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(string2).length());
                                sb2.append(strValueOf);
                                sb2.append(string2);
                                sb2.append("_");
                                string = sb2.toString();
                                it2 = it;
                                zzasoVar2 = zzasoVar;
                                j7 = j2;
                                list6 = list2;
                                z3 = z2;
                                str4 = str2;
                            } else {
                                i2 = 4;
                            }
                            str3 = str4;
                            z2 = z3;
                            long j82 = next.VH;
                            str2 = str3;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 33);
                            sb3.append(str6);
                            sb3.append(".");
                            sb3.append(i2);
                            sb3.append(".");
                            sb3.append(j82);
                            String string22 = sb3.toString();
                            StringBuilder sb22 = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(string22).length());
                            sb22.append(strValueOf);
                            sb22.append(string22);
                            sb22.append("_");
                            string = sb22.toString();
                            it2 = it;
                            zzasoVar2 = zzasoVar;
                            j7 = j2;
                            list6 = list2;
                            z3 = z2;
                            str4 = str2;
                        }
                    } else {
                        list2 = list6;
                        it = it2;
                    }
                    str2 = str4;
                    z2 = z3;
                    j2 = j7;
                    it2 = it;
                    zzasoVar2 = zzasoVar;
                    j7 = j2;
                    list6 = list2;
                    z3 = z2;
                    str4 = str2;
                }
                list = list6;
                str = str4;
                z = z3;
                j = j7;
                strSubstring = string.substring(0, Math.max(0, string.length() - 1));
            }
        } else {
            list = list6;
            zzasoVar = zzasoVar2;
            str = str4;
            z = z3;
            j = j7;
            strSubstring = null;
        }
        zzasm zzasmVar3 = this.w9;
        List<String> list8 = zzasmVar3.Nh;
        String str7 = zzasmVar3.An;
        zl zlVar2 = this.AL;
        return new yl(zzwbVar, cvVar, list3, i, list4, list5, i3, j3, str, z, t9Var2, naVar2, name, u9Var, w9Var, j4, zzwfVar, j5, j6, j, str5, jSONObject, null, zzawdVar, list, list7, z4, zzasoVar, strSubstring, list8, str7, zlVar2.u7, zzasmVar3.Bx, zlVar2.tp, zzasmVar3.qP, zzasmVar3.MP, zzasmVar3.Of, zzasmVar3.PT, zzasmVar3.AR);
    }

    @Override // com.google.android.gms.internal.ads.ee
    protected final void tp(long j) throws InterruptedException, he {
        Bundle bundle;
        synchronized (this.zh) {
            this.cT = this.q7.J0 != -1 ? new ea(this.qp, this.AL.j6, this.hK, this.q7, this.w9.sE, this.w9.aX, this.w9.AE, j, ((Long) cw0.v5().FH(p.ys)).longValue(), 2, this.AL.tp) : new ha(this.qp, this.AL.j6, this.hK, this.q7, this.w9.sE, this.w9.aX, this.w9.AE, j, ((Long) cw0.v5().FH(p.ys)).longValue(), this.n5, this.AL.tp);
        }
        ArrayList arrayList = new ArrayList(this.q7.j6);
        Bundle bundle2 = this.AL.j6.jw.Z1;
        if ((bundle2 == null || (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) == null) ? false : bundle.getBoolean("_skipMediation")) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((t9) listIterator.next()).FH.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
                    listIterator.remove();
                }
            }
        }
        aa aaVarJ6 = this.cT.j6(arrayList);
        this.Z1 = aaVarJ6;
        int i = aaVarJ6.j6;
        if (i != 0) {
            if (i == 1) {
                throw new he("No fill from any mediation ad networks.", 3);
            }
            int i2 = this.Z1.j6;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected mediation result: ");
            sb.append(i2);
            throw new he(sb.toString(), 0);
        }
        t9 t9Var = aaVarJ6.DW;
        if (t9Var == null || t9Var.Ws == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        bn.gn.post(new pe(this, countDownLatch));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
            synchronized (this.zh) {
                if (!this.kf) {
                    throw new he("View could not be prepared", 0);
                }
                if (this.Q6.isDestroyed()) {
                    throw new he("Assets not loaded, web view is destroyed", 0);
                }
            }
        } catch (InterruptedException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 38);
            sb2.append("Interrupted while waiting for latch : ");
            sb2.append(strValueOf);
            throw new he(sb2.toString(), 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.ee, com.google.android.gms.internal.ads.om
    public final void v5() {
        synchronized (this.zh) {
            super.v5();
            if (this.cT != null) {
                this.cT.cancel();
            }
        }
    }
}
