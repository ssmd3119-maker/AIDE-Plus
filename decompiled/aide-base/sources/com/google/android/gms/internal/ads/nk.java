package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class nk extends om implements mk {
    private final HashSet<String> AL;
    private final long cT;
    private final zl fY;
    private final ej hK;
    private final ArrayList<dk> k2;
    private final Context qp;
    private final Object w9;
    private final List<gk> zh;

    public nk(Context context, zl zlVar, ej ejVar) {
        this(context, zlVar, ejVar, ((Long) cw0.v5().FH(p.jO)).longValue());
    }

    private final yl tp(int i, String str, t9 t9Var) {
        zzaso zzasoVar;
        boolean z;
        String str2;
        boolean z2;
        List<String> list;
        String strSubstring;
        zl zlVar = this.fY;
        zzasi zzasiVar = zlVar.j6;
        zzwb zzwbVar = zzasiVar.jw;
        zzasm zzasmVar = zlVar.DW;
        List<String> list2 = zzasmVar.qp;
        List<String> list3 = zzasmVar.zh;
        List<String> list4 = zzasmVar.cT;
        int i2 = zzasmVar.Z1;
        long j = zzasmVar.q7;
        String str3 = zzasiVar.w9;
        boolean z3 = zzasmVar.w9;
        u9 u9Var = zlVar.FH;
        long j2 = zzasmVar.hK;
        zzwf zzwfVar = zlVar.Hw;
        long j3 = zzasmVar.AL;
        long j4 = zlVar.Zo;
        long j5 = zzasmVar.Q6;
        String str4 = zzasmVar.kf;
        JSONObject jSONObject = zlVar.gn;
        zzawd zzawdVar = zzasmVar.e9;
        List<String> list5 = zzasmVar.QO;
        List<String> list6 = zzasmVar.sM;
        boolean z4 = zzasmVar.a5;
        zzaso zzasoVar2 = zzasmVar.ys;
        StringBuilder sb = new StringBuilder("");
        List<gk> list7 = this.zh;
        if (list7 == null) {
            strSubstring = sb.toString();
            zzasoVar = zzasoVar2;
            z = z3;
            str2 = str4;
            z2 = z4;
            list = list5;
        } else {
            Iterator<gk> it = list7.iterator();
            while (true) {
                zzasoVar = zzasoVar2;
                if (!it.hasNext()) {
                    break;
                }
                gk next = it.next();
                if (next != null) {
                    Iterator<gk> it2 = it;
                    if (TextUtils.isEmpty(next.j6)) {
                        it = it2;
                    } else {
                        String str5 = next.j6;
                        String str6 = str4;
                        int i3 = next.DW;
                        boolean z5 = z4;
                        List<String> list8 = list5;
                        int i4 = 3;
                        if (i3 == 3) {
                            i4 = 1;
                        } else if (i3 == 4) {
                            i4 = 2;
                        } else if (i3 == 5) {
                            i4 = 4;
                        } else if (i3 == 6) {
                            i4 = 0;
                        } else if (i3 != 7) {
                            i4 = 6;
                        }
                        long j6 = next.FH;
                        boolean z6 = z3;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 33);
                        sb2.append(str5);
                        sb2.append(".");
                        sb2.append(i4);
                        sb2.append(".");
                        sb2.append(j6);
                        sb.append(String.valueOf(sb2.toString()).concat("_"));
                        it = it2;
                        zzasoVar2 = zzasoVar;
                        str4 = str6;
                        z4 = z5;
                        z3 = z6;
                        list5 = list8;
                    }
                }
                zzasoVar2 = zzasoVar;
            }
            z = z3;
            str2 = str4;
            z2 = z4;
            list = list5;
            strSubstring = sb.substring(0, Math.max(0, sb.length() - 1));
        }
        zl zlVar2 = this.fY;
        zzasm zzasmVar2 = zlVar2.DW;
        return new yl(zzwbVar, null, list2, i, list3, list4, i2, j, str3, z, t9Var, null, str, u9Var, null, j2, zzwfVar, j3, j4, j5, str2, jSONObject, null, zzawdVar, list, list6, z2, zzasoVar, strSubstring, zzasmVar2.Nh, zzasmVar2.An, zlVar2.u7, zzasmVar2.Bx, zlVar2.tp, zzasmVar2.qP, zzasmVar2.MP, zzasmVar2.Of, zzasmVar2.PT, zzasmVar2.AR);
    }

    final /* synthetic */ void EQ(yl ylVar) {
        this.hK.tp().BJ(ylVar);
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void Hw(String str, int i) {
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:? -> B:37:0x00b3). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.om
    public final void gn() throws Throwable {
        Object obj;
        for (t9 t9Var : this.fY.FH.j6) {
            String str = t9Var.EQ;
            for (String string : t9Var.FH) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(string) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(string)) {
                    try {
                        string = new JSONObject(str).getString("class_name");
                    } catch (JSONException e) {
                        xp.Hw("Unable to determine custom event class name, skipping...", e);
                    }
                }
                String str2 = string;
                Object obj2 = this.w9;
                synchronized (obj2) {
                    try {
                        rk rkVarGn = this.hK.gn(str2);
                        if (rkVarGn == null || rkVarGn.DW() == null || rkVarGn.j6() == null) {
                            List<gk> list = this.zh;
                            ik ikVar = new ik();
                            ikVar.gn(t9Var.Hw);
                            ikVar.VH(str2);
                            ikVar.DW(0L);
                            ikVar.v5(7);
                            list.add(ikVar.u7());
                        } else {
                            obj = obj2;
                            try {
                                dk dkVar = new dk(this.qp, str2, str, t9Var, this.fY, rkVarGn, this, this.cT);
                                dkVar.EQ(this.hK.u7());
                                this.k2.add(dkVar);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<dk> arrayList = this.k2;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            dk dkVar2 = arrayList.get(i2);
            i2++;
            dk dkVar3 = dkVar2;
            if (hashSet.add(dkVar3.fY)) {
                dkVar3.QX();
            }
        }
        ArrayList<dk> arrayList2 = this.k2;
        int size2 = arrayList2.size();
        while (i < size2) {
            dk dkVar4 = arrayList2.get(i);
            i++;
            dk dkVar5 = dkVar4;
            try {
                try {
                    dkVar5.QX().get();
                    synchronized (this.w9) {
                        if (!TextUtils.isEmpty(dkVar5.fY)) {
                            this.zh.add(dkVar5.XL());
                        }
                    }
                    synchronized (this.w9) {
                        if (this.AL.contains(dkVar5.fY)) {
                            final yl ylVarTp = tp(-2, dkVar5.fY, dkVar5.aM());
                            mp.j6.post(new Runnable(this, ylVarTp) { // from class: com.google.android.gms.internal.ads.ok
                                private final nk WB;
                                private final yl mb;

                                {
                                    this.WB = this;
                                    this.mb = ylVarTp;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.WB.we(this.mb);
                                }
                            });
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (this.w9) {
                        if (!TextUtils.isEmpty(dkVar5.fY)) {
                            this.zh.add(dkVar5.XL());
                        }
                        throw th3;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                synchronized (this.w9) {
                    if (!TextUtils.isEmpty(dkVar5.fY)) {
                        this.zh.add(dkVar5.XL());
                    }
                }
            } catch (Exception e2) {
                xp.v5("Unable to resolve rewarded adapter.", e2);
                synchronized (this.w9) {
                    if (!TextUtils.isEmpty(dkVar5.fY)) {
                        this.zh.add(dkVar5.XL());
                    }
                }
            }
        }
        final yl ylVarTp2 = tp(3, null, null);
        mp.j6.post(new Runnable(this, ylVarTp2) { // from class: com.google.android.gms.internal.ads.pk
            private final nk WB;
            private final yl mb;

            {
                this.WB = this;
                this.mb = ylVarTp2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.WB.EQ(this.mb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.mk
    public final void j6(String str) {
        synchronized (this.w9) {
            this.AL.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }

    final /* synthetic */ void we(yl ylVar) {
        this.hK.tp().BJ(ylVar);
    }

    private nk(Context context, zl zlVar, ej ejVar, long j) {
        this.k2 = new ArrayList<>();
        this.zh = new ArrayList();
        this.AL = new HashSet<>();
        this.w9 = new Object();
        this.qp = context;
        this.fY = zlVar;
        this.hK = ejVar;
        this.cT = j;
    }
}
