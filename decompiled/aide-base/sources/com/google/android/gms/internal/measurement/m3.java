package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m3 implements p7 {
    private final k3 j6;

    private m3(k3 k3Var) {
        g4.Hw(k3Var, "output");
        k3 k3Var2 = k3Var;
        this.j6 = k3Var2;
        k3Var2.j6 = this;
    }

    public static m3 Sf(k3 k3Var) {
        m3 m3Var = k3Var.j6;
        return m3Var != null ? m3Var : new m3(k3Var);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void BT(int i, u2 u2Var) {
        this.j6.EQ(i, u2Var);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void DW(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.cn(i, list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iN5 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN5 += k3.n5(list.get(i3).booleanValue());
        }
        this.j6.dx(iN5);
        while (i2 < list.size()) {
            this.j6.Z1(list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void EQ(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.WB(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iX9 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iX9 += k3.x9(list.get(i3).intValue());
        }
        this.j6.dx(iX9);
        while (i2 < list.size()) {
            this.j6.Sf(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void FH(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.aq(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iG3 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG3 += k3.g3(list.get(i3).intValue());
        }
        this.j6.dx(iG3);
        while (i2 < list.size()) {
            this.j6.lg(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void Hw(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.aq(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iQq = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iQq += k3.Qq(list.get(i3).intValue());
        }
        this.j6.dx(iQq);
        while (i2 < list.size()) {
            this.j6.lg(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void J0(int i, float f) {
        this.j6.u7(i, f);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void J8(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.et(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iA8 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA8 += k3.a8(list.get(i3).longValue());
        }
        this.j6.dx(iA8);
        while (i2 < list.size()) {
            this.j6.aM(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void KD(int i, int i2) {
        this.j6.Ev(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void Mr(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.u7(i, list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iRN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iRN += k3.rN(list.get(i3).floatValue());
        }
        this.j6.dx(iRN);
        while (i2 < list.size()) {
            this.j6.VH(list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void P8(int i, long j) {
        this.j6.tp(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void QX(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.tp(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iMr = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMr += k3.Mr(list.get(i3).longValue());
        }
        this.j6.dx(iMr);
        while (i2 < list.size()) {
            this.j6.QX(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void SI(int i, int i2) {
        this.j6.WB(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void U2(int i, List<String> list) {
        int i2 = 0;
        if (!(list instanceof u4)) {
            while (i2 < list.size()) {
                this.j6.ro(i, list.get(i2));
                i2++;
            }
            return;
        }
        u4 u4Var = (u4) list;
        while (i2 < list.size()) {
            Object objZo = u4Var.Zo(i2);
            if (objZo instanceof String) {
                this.j6.ro(i, (String) objZo);
            } else {
                this.j6.EQ(i, (u2) objZo);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void VH(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.tp(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iJ3 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ3 += k3.j3(list.get(i3).longValue());
        }
        this.j6.dx(iJ3);
        while (i2 < list.size()) {
            this.j6.QX(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void Ws(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.nw(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iU2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iU2 += k3.U2(list.get(i3).longValue());
        }
        this.j6.dx(iU2);
        while (i2 < list.size()) {
            this.j6.XL(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void XL(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.Ev(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int I = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            I += k3.I(list.get(i3).intValue());
        }
        this.j6.dx(I);
        while (i2 < list.size()) {
            this.j6.ef(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void Zo(int i, Object obj) {
        if (obj instanceof u2) {
            this.j6.SI(i, (u2) obj);
        } else {
            this.j6.KD(i, (l5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void a8(int i, List<?> list, c6 c6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            cn(i, list.get(i2), c6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void aM(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.gn(i, list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iLp = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iLp += k3.lp(list.get(i3).doubleValue());
        }
        this.j6.dx(iLp);
        while (i2 < list.size()) {
            this.j6.ei(list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void cb(int i, int i2) {
        this.j6.WB(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void cn(int i, Object obj, c6 c6Var) {
        k3 k3Var = this.j6;
        k3Var.wc(i, 3);
        c6Var.DW((l5) obj, k3Var.j6);
        k3Var.wc(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final <K, V> void dx(int i, e5<K, V> e5Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.j6.wc(i, 2);
            this.j6.dx(d5.j6(e5Var, entry.getKey(), entry.getValue()));
            d5.DW(this.j6, e5Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void ef(int i, int i2) {
        this.j6.jO(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void ei(int i, String str) {
        this.j6.ro(i, str);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void er(int i, boolean z) {
        this.j6.cn(i, z);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void gW(int i) {
        this.j6.wc(i, 4);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void gn(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.et(i, list.get(i2).longValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iCb = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCb += k3.cb(list.get(i3).longValue());
        }
        this.j6.dx(iCb);
        while (i2 < list.size()) {
            this.j6.aM(list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void j3(int i, List<u2> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.j6.EQ(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void j6(int i, long j) {
        this.j6.et(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void lg(int i, long j) {
        this.j6.nw(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void nw(int i, long j) {
        this.j6.tp(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void rN(int i, List<?> list, c6 c6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ro(i, list.get(i2), c6Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void ro(int i, Object obj, c6 c6Var) {
        this.j6.J0(i, (l5) obj, c6Var);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void sG(int i, int i2) {
        this.j6.aq(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void sh(int i, int i2) {
        this.j6.aq(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void tp(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.jO(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iMz = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMz += k3.Mz(list.get(i3).intValue());
        }
        this.j6.dx(iMz);
        while (i2 < list.size()) {
            this.j6.dx(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void u7(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.j6.WB(i, list.get(i2).intValue());
                i2++;
            }
            return;
        }
        this.j6.wc(i, 2);
        int iCa = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iCa += k3.ca(list.get(i3).intValue());
        }
        this.j6.dx(iCa);
        while (i2 < list.size()) {
            this.j6.Sf(list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void v5(int i, long j) {
        this.j6.et(i, j);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void vy(int i) {
        this.j6.wc(i, 3);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final void we(int i, double d) {
        this.j6.gn(i, d);
    }

    @Override // com.google.android.gms.internal.measurement.p7
    public final int yS() {
        return e4.e.EQ;
    }
}
