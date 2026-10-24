package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class v60 implements u60 {
    v60() {
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final int DW(int i, Object obj, Object obj2) {
        t60 t60Var = (t60) obj;
        if (t60Var.isEmpty()) {
            return 0;
        }
        Iterator it = t60Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final boolean FH(Object obj) {
        return !((t60) obj).j6();
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final Map<?, ?> Hw(Object obj) {
        return (t60) obj;
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final Object VH(Object obj) {
        ((t60) obj).Hw();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final s60<?, ?> Zo(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final Map<?, ?> gn(Object obj) {
        return (t60) obj;
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final Object j6(Object obj, Object obj2) {
        t60 t60VarVH = (t60) obj;
        t60 t60Var = (t60) obj2;
        if (!t60Var.isEmpty()) {
            if (!t60VarVH.j6()) {
                t60VarVH = t60VarVH.VH();
            }
            t60VarVH.FH(t60Var);
        }
        return t60VarVH;
    }

    @Override // com.google.android.gms.internal.ads.u60
    public final Object v5(Object obj) {
        return t60.Zo().VH();
    }
}
