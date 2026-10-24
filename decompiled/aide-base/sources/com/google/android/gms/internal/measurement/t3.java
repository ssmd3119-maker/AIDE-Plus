package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.e4;
import java.util.Map;

/* loaded from: classes.dex */
public final class t3 extends s3<Object> {
    t3() {
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final <UT, UB> UB DW(b6 b6Var, Object obj, r3 r3Var, v3<Object> v3Var, UB ub, u6<UT, UB> u6Var) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final void FH(u2 u2Var, Object obj, r3 r3Var, v3<Object> v3Var) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final void Hw(b6 b6Var, Object obj, r3 r3Var, v3<Object> v3Var) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final boolean VH(l5 l5Var) {
        return l5Var instanceof e4.c;
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final int Zo(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final v3<Object> gn(Object obj) {
        return ((e4.c) obj).zzbyj;
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final Object j6(r3 r3Var, l5 l5Var, int i) {
        return r3Var.j6(l5Var, i);
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final void tp(Object obj) {
        gn(obj).XL();
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final v3<Object> u7(Object obj) {
        e4.c cVar = (e4.c) obj;
        if (cVar.zzbyj.FH()) {
            cVar.zzbyj = (v3) cVar.zzbyj.clone();
        }
        return cVar.zzbyj;
    }

    @Override // com.google.android.gms.internal.measurement.s3
    final void v5(p7 p7Var, Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }
}
