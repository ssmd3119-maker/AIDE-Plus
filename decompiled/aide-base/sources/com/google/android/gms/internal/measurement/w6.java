package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class w6 extends u6<v6, v6> {
    w6() {
    }

    private static void Mr(Object obj, v6 v6Var) {
        ((e4) obj).zzbyd = v6Var;
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void DW(v6 v6Var, int i, u2 u2Var) {
        v6Var.FH((i << 3) | 2, u2Var);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ int EQ(v6 v6Var) {
        return v6Var.EQ();
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void FH(v6 v6Var, int i, v6 v6Var2) {
        v6Var.FH((i << 3) | 3, v6Var2);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void Hw(v6 v6Var, p7 p7Var) {
        v6Var.v5(p7Var);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void J0(v6 v6Var, int i, int i2) {
        v6Var.FH((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void J8(v6 v6Var, p7 p7Var) {
        v6Var.DW(p7Var);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void QX(Object obj, v6 v6Var) {
        Mr(obj, v6Var);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ v6 VH(v6 v6Var) {
        v6 v6Var2 = v6Var;
        v6Var2.VH();
        return v6Var2;
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void Ws(Object obj, v6 v6Var) {
        Mr(obj, v6Var);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ v6 XL(v6 v6Var, v6 v6Var2) {
        v6 v6Var3 = v6Var;
        v6 v6Var4 = v6Var2;
        return v6Var4.equals(v6.u7()) ? v6Var3 : v6.j6(v6Var3, v6Var4);
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final void aM(Object obj) {
        ((e4) obj).zzbyd.VH();
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ int gn(v6 v6Var) {
        return v6Var.gn();
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ v6 j3() {
        return v6.tp();
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void j6(v6 v6Var, int i, long j) {
        v6Var.FH(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ v6 tp(Object obj) {
        v6 v6Var = ((e4) obj).zzbyd;
        if (v6Var != v6.u7()) {
            return v6Var;
        }
        v6 v6VarTp = v6.tp();
        Mr(obj, v6VarTp);
        return v6VarTp;
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ v6 u7(Object obj) {
        return ((e4) obj).zzbyd;
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final boolean v5(b6 b6Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.u6
    final /* synthetic */ void we(v6 v6Var, int i, long j) {
        v6Var.FH((i << 3) | 1, Long.valueOf(j));
    }
}
