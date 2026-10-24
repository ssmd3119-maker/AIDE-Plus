package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.r50;
import java.util.Map;

/* loaded from: classes.dex */
public final class f50 extends e50<Object> {
    f50() {
    }

    @Override // com.google.android.gms.internal.ads.e50
    final Object DW(d50 d50Var, z60 z60Var, int i) {
        return d50Var.j6(z60Var, i);
    }

    final void EQ(Object obj, h50<Object> h50Var) {
        ((r50.c) obj).zzfqa = h50Var;
    }

    @Override // com.google.android.gms.internal.ads.e50
    final <UT, UB> UB FH(q70 q70Var, Object obj, d50 d50Var, h50<Object> h50Var, UB ub, j80<UT, UB> j80Var) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.e50
    final void Hw(i40 i40Var, Object obj, d50 d50Var, h50<Object> h50Var) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.e50
    final boolean VH(z60 z60Var) {
        return z60Var instanceof r50.c;
    }

    @Override // com.google.android.gms.internal.ads.e50
    final void Zo(f90 f90Var, Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.e50
    final h50<Object> gn(Object obj) {
        return ((r50.c) obj).zzfqa;
    }

    @Override // com.google.android.gms.internal.ads.e50
    final int j6(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.e50
    final void tp(Object obj) {
        gn(obj).we();
    }

    @Override // com.google.android.gms.internal.ads.e50
    final h50<Object> u7(Object obj) {
        h50<Object> h50VarGn = gn(obj);
        if (!h50VarGn.FH()) {
            return h50VarGn;
        }
        h50<Object> h50Var = (h50) h50VarGn.clone();
        EQ(obj, h50Var);
        return h50Var;
    }

    @Override // com.google.android.gms.internal.ads.e50
    final void v5(q70 q70Var, Object obj, d50 d50Var, h50<Object> h50Var) {
        throw new NoSuchMethodError();
    }
}
