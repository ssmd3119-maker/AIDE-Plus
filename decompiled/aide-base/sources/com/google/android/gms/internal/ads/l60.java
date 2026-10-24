package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class l60 extends i60 {
    private l60() {
        super();
    }

    private static <E> x50<E> Zo(Object obj, long j) {
        return (x50) q80.sh(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.i60
    final <E> void DW(Object obj, Object obj2, long j) {
        x50 x50VarZo = Zo(obj, j);
        x50 x50VarZo2 = Zo(obj2, j);
        int size = x50VarZo.size();
        int size2 = x50VarZo2.size();
        if (size > 0 && size2 > 0) {
            if (!x50VarZo.XL()) {
                x50VarZo = x50VarZo.yS(size2 + size);
            }
            x50VarZo.addAll(x50VarZo2);
        }
        if (size > 0) {
            x50VarZo2 = x50VarZo;
        }
        q80.VH(obj, j, x50VarZo2);
    }

    @Override // com.google.android.gms.internal.ads.i60
    final <L> List<L> j6(Object obj, long j) {
        x50 x50VarZo = Zo(obj, j);
        if (x50VarZo.XL()) {
            return x50VarZo;
        }
        int size = x50VarZo.size();
        x50 x50VarYS = x50VarZo.yS(size == 0 ? 10 : size << 1);
        q80.VH(obj, j, x50VarYS);
        return x50VarYS;
    }

    @Override // com.google.android.gms.internal.ads.i60
    final void v5(Object obj, long j) {
        Zo(obj, j).rN();
    }
}
