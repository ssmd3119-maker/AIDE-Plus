package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@jg
/* loaded from: classes.dex */
public final class ea implements s9 {
    private final ka DW;
    private final Context FH;
    private final u9 Hw;
    private final String J0;
    private final long VH;
    private final boolean Ws;
    private final long Zo;
    private final zzasi j6;
    private final boolean v5;
    private final boolean we;
    private final Object u7 = new Object();
    private boolean tp = false;
    private final Map<vq<aa>, x9> EQ = new HashMap();
    private List<aa> J8 = new ArrayList();
    private final int gn = 2;

    public ea(Context context, zzasi zzasiVar, ka kaVar, u9 u9Var, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.FH = context;
        this.j6 = zzasiVar;
        this.DW = kaVar;
        this.Hw = u9Var;
        this.v5 = z;
        this.we = z2;
        this.J0 = str;
        this.Zo = j;
        this.VH = j2;
        this.Ws = z3;
    }

    private final void Hw(vq<aa> vqVar) {
        bn.gn.post(new ga(this, vqVar));
    }

    private final aa tp(List<vq<aa>> list) {
        aa aaVar;
        ta taVar;
        synchronized (this.u7) {
            int iJJ = -1;
            if (this.tp) {
                return new aa(-1);
            }
            long jMax = this.Hw.J8;
            if (jMax == -1) {
                jMax = 10000;
            }
            vq<aa> vqVar = null;
            aa aaVar2 = null;
            for (vq<aa> vqVar2 : list) {
                long jJ6 = com.google.android.gms.ads.internal.w0.we().j6();
                if (jMax == 0) {
                    try {
                        try {
                            if (vqVar2.isDone()) {
                                aaVar = vqVar2.get();
                            }
                            this.J8.add(aaVar);
                            if (aaVar != null && aaVar.j6 == 0 && (taVar = aaVar.Zo) != null && taVar.jJ() > iJJ) {
                                iJJ = taVar.jJ();
                                vqVar = vqVar2;
                                aaVar2 = aaVar;
                            }
                        } finally {
                            Math.max(jMax - (com.google.android.gms.ads.internal.w0.we().j6() - jJ6), 0L);
                        }
                    } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
                        xp.v5("Exception while processing an adapter; continuing with other adapters", e);
                    }
                }
                aaVar = vqVar2.get(jMax, TimeUnit.MILLISECONDS);
                this.J8.add(aaVar);
                if (aaVar != null) {
                    iJJ = taVar.jJ();
                    vqVar = vqVar2;
                    aaVar2 = aaVar;
                }
            }
            Hw(vqVar);
            return aaVar2 == null ? new aa(1) : aaVar2;
        }
    }

    private final aa u7(List<vq<aa>> list) throws ExecutionException, InterruptedException {
        aa aaVar;
        synchronized (this.u7) {
            if (this.tp) {
                return new aa(-1);
            }
            for (vq<aa> vqVar : list) {
                try {
                    aaVar = vqVar.get();
                    this.J8.add(aaVar);
                } catch (InterruptedException | ExecutionException e) {
                    xp.v5("Exception while processing an adapter; continuing with other adapters", e);
                }
                if (aaVar != null && aaVar.j6 == 0) {
                    Hw(vqVar);
                    return aaVar;
                }
            }
            Hw(null);
            return new aa(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final List<aa> DW() {
        return this.J8;
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final void cancel() {
        synchronized (this.u7) {
            this.tp = true;
            Iterator<x9> it = this.EQ.values().iterator();
            while (it.hasNext()) {
                it.next().FH();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s9
    public final aa j6(List<t9> list) {
        xp.VH("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzwf zzwfVar = this.j6.fY;
        int[] iArr = new int[2];
        if (zzwfVar.zh != null) {
            com.google.android.gms.ads.internal.w0.er();
            if (ca.v5(this.J0, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzwf[] zzwfVarArr = zzwfVar.zh;
                int length = zzwfVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzwf zzwfVar2 = zzwfVarArr[i];
                    if (i2 == zzwfVar2.qp && i3 == zzwfVar2.mb) {
                        zzwfVar = zzwfVar2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<t9> it = list.iterator();
        while (it.hasNext()) {
            t9 next = it.next();
            String strValueOf = String.valueOf(next.DW);
            xp.gn(strValueOf.length() != 0 ? "Trying mediation network: ".concat(strValueOf) : new String("Trying mediation network: "));
            for (Iterator<String> it2 = next.FH.iterator(); it2.hasNext(); it2 = it2) {
                String next2 = it2.next();
                Context context = this.FH;
                ka kaVar = this.DW;
                u9 u9Var = this.Hw;
                zzasi zzasiVar = this.j6;
                ArrayList arrayList2 = arrayList;
                x9 x9Var = new x9(context, next2, kaVar, u9Var, next, zzasiVar.jw, zzwfVar, zzasiVar.cT, this.v5, this.we, zzasiVar.Gj, zzasiVar.n5, zzasiVar.Cz, zzasiVar.PT, this.Ws);
                vq<aa> vqVarJ6 = zm.j6(new fa(this, x9Var));
                this.EQ.put(vqVarJ6, x9Var);
                arrayList2.add(vqVarJ6);
                it = it;
                arrayList = arrayList2;
            }
        }
        ArrayList arrayList3 = arrayList;
        return this.gn != 2 ? u7(arrayList3) : tp(arrayList3);
    }
}
