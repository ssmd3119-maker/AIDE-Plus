package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class z40 implements f90 {
    private final x40 j6;

    private z40(x40 x40Var) {
        t50.Hw(x40Var, "output");
        x40 x40Var2 = x40Var;
        this.j6 = x40Var2;
        x40Var2.j6 = this;
    }

    public static z40 v5(x40 x40Var) {
        z40 z40Var = x40Var.j6;
        return z40Var != null ? z40Var : new z40(x40Var);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void BT(int i, long j) {
        this.j6.WB(i, j);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void DW(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.Ev(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iSh = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSh += x40.sh(list.get(i3).booleanValue());
        }
        this.j6.OW(iSh);
        while (i2 < list.size()) {
            this.j6.ro(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void EQ(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.kf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iEt = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iEt += x40.et(list.get(i3).intValue());
        }
        this.j6.OW(iEt);
        while (i2 < list.size()) {
            this.j6.XX(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void FH(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.Z1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iYO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iYO += x40.yO(list.get(i3).intValue());
        }
        this.j6.OW(iYO);
        while (i2 < list.size()) {
            this.j6.Qq(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Hw(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.Z1(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iCU = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCU += x40.CU(list.get(i3).intValue());
        }
        this.j6.OW(iCU);
        while (i2 < list.size()) {
            this.j6.Qq(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void J0(int i, float f) {
        this.j6.Zo(i, f);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void J8(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.mb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iCn = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCn += x40.cn(list.get(i3).longValue());
        }
        this.j6.OW(iCn);
        while (i2 < list.size()) {
            this.j6.ei(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void KD(int i, long j) {
        this.j6.ko(i, j);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Mr(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.Zo(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iFN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iFN += x40.FN(list.get(i3).floatValue());
        }
        this.j6.OW(iFN);
        while (i2 < list.size()) {
            this.j6.aj(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void P8(int i, Object obj, r70 r70Var) {
        x40 x40Var = this.j6;
        x40Var.q7(i, 3);
        r70Var.EQ((z60) obj, x40Var.j6);
        x40Var.q7(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void QX(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.ko(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iSI = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSI += x40.SI(list.get(i3).longValue());
        }
        this.j6.OW(iSI);
        while (i2 < list.size()) {
            this.j6.U2(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void SI(int i, Object obj, r70 r70Var) {
        this.j6.u7(i, (z60) obj, r70Var);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Sf(int i, int i2) {
        this.j6.Z1(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void U2(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof h60)) {
            while (i2 < list.size()) {
                this.j6.lp(i, list.get(i2));
                i2++;
            }
            return;
        }
        h60 h60Var = (h60) list;
        while (i2 < list.size()) {
            Object objBT = h60Var.BT(i2);
            if (objBT instanceof String) {
                this.j6.lp(i, (String) objBT);
            } else {
                this.j6.VH(i, (i40) objBT);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void VH(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.ko(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iNw = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iNw += x40.nw(list.get(i3).longValue());
        }
        this.j6.OW(iNw);
        while (i2 < list.size()) {
            this.j6.U2(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void Ws(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.WB(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iKD = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iKD += x40.KD(list.get(i3).longValue());
        }
        this.j6.OW(iKD);
        while (i2 < list.size()) {
            this.j6.a8(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void XL(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.Q6(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iJJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJJ += x40.jJ(list.get(i3).intValue());
        }
        this.j6.OW(iJJ);
        while (i2 < list.size()) {
            this.j6.br(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void a8(int i, double d) {
        this.j6.BT(i, d);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void aM(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.BT(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iSG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iSG += x40.sG(list.get(i3).doubleValue());
        }
        this.j6.OW(iSG);
        while (i2 < list.size()) {
            this.j6.gW(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void cb(int i, int i2) {
        this.j6.Q6(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void cn(int i, int i2) {
        this.j6.n5(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void dx(int i, int i2) {
        this.j6.kf(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void ef(int i) {
        this.j6.q7(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void ei(int i, int i2) {
        this.j6.kf(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void er(int i, List<?> list, r70 r70Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            SI(i, list.get(i2), r70Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void g3(int i, String str) {
        this.j6.lp(i, str);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void gW(int i, Object obj) {
        if (obj instanceof i40) {
            this.j6.vy(i, (i40) obj);
        } else {
            this.j6.P8(i, (z60) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void gn(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.mb(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iCb = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCb += x40.cb(list.get(i3).longValue());
        }
        this.j6.OW(iCb);
        while (i2 < list.size()) {
            this.j6.ei(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void j3(int i, List<i40> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.j6.VH(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void j6(int i, long j) {
        this.j6.ko(i, j);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void lg(int i, boolean z) {
        this.j6.Ev(i, z);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void nw(int i, int i2) {
        this.j6.Z1(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final int rN() {
        return r50.e.EQ;
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final <K, V> void ro(int i, s60<K, V> s60Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.j6.q7(i, 2);
            this.j6.OW(r60.j6(s60Var, entry.getKey(), entry.getValue()));
            r60.DW(this.j6, s60Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void sG(int i, long j) {
        this.j6.mb(i, j);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void sh(int i, i40 i40Var) {
        this.j6.VH(i, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void tp(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.n5(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iXG = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iXG += x40.XG(list.get(i3).intValue());
        }
        this.j6.OW(iXG);
        while (i2 < list.size()) {
            this.j6.OW(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void u7(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.kf(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.q7(i, 2);
        int iWc = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iWc += x40.wc(list.get(i3).intValue());
        }
        this.j6.OW(iWc);
        while (i2 < list.size()) {
            this.j6.XX(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void vJ(int i) {
        this.j6.q7(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void vy(int i, List<?> list, r70 r70Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            P8(i, list.get(i2), r70Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public final void yS(int i, long j) {
        this.j6.mb(i, j);
    }
}
