package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l80 extends j80<k80, k80> {
    l80() {
    }

    private static void Mr(Object obj, k80 k80Var) {
        ((r50) obj).zzfpu = k80Var;
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void DW(k80 k80Var, int i, i40 i40Var) {
        k80Var.EQ((i << 3) | 2, i40Var);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ k80 EQ() {
        return k80.VH();
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void FH(k80 k80Var, int i, k80 k80Var2) {
        k80Var.EQ((i << 3) | 3, k80Var2);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void Hw(k80 k80Var, f90 f90Var) {
        k80Var.tp(f90Var);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void J0(k80 k80Var, int i, int i2) {
        k80Var.EQ((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void J8(k80 k80Var, f90 f90Var) {
        k80Var.DW(f90Var);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void QX(Object obj, k80 k80Var) {
        Mr(obj, k80Var);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ int VH(k80 k80Var) {
        return k80Var.v5();
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void Ws(Object obj, k80 k80Var) {
        Mr(obj, k80Var);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ k80 XL(k80 k80Var, k80 k80Var2) {
        k80 k80Var3 = k80Var;
        k80 k80Var4 = k80Var2;
        return k80Var4.equals(k80.Zo()) ? k80Var3 : k80.j6(k80Var3, k80Var4);
    }

    @Override // com.google.android.gms.internal.ads.j80
    final void aM(Object obj) {
        ((r50) obj).zzfpu.Hw();
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ k80 gn(Object obj) {
        return ((r50) obj).zzfpu;
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ k80 j3(k80 k80Var) {
        k80 k80Var2 = k80Var;
        k80Var2.Hw();
        return k80Var2;
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void j6(k80 k80Var, int i, long j) {
        k80Var.EQ(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ int tp(k80 k80Var) {
        return k80Var.gn();
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ k80 u7(Object obj) {
        k80 k80Var = ((r50) obj).zzfpu;
        if (k80Var != k80.Zo()) {
            return k80Var;
        }
        k80 k80VarVH = k80.VH();
        Mr(obj, k80VarVH);
        return k80VarVH;
    }

    @Override // com.google.android.gms.internal.ads.j80
    final boolean v5(q70 q70Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.j80
    final /* synthetic */ void we(k80 k80Var, int i, long j) {
        k80Var.EQ((i << 3) | 1, Long.valueOf(j));
    }
}
