package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class y4 extends v4 {
    private y4() {
        super();
    }

    private static <E> j4<E> Zo(Object obj, long j) {
        return (j4) a7.P8(obj, j);
    }

    @Override // com.google.android.gms.internal.measurement.v4
    final <E> void DW(Object obj, Object obj2, long j) {
        j4 j4VarZo = Zo(obj, j);
        j4 j4VarZo2 = Zo(obj2, j);
        int size = j4VarZo.size();
        int size2 = j4VarZo2.size();
        if (size > 0 && size2 > 0) {
            if (!j4VarZo.sh()) {
                j4VarZo = j4VarZo.tp(size2 + size);
            }
            j4VarZo.addAll(j4VarZo2);
        }
        if (size > 0) {
            j4VarZo2 = j4VarZo;
        }
        a7.VH(obj, j, j4VarZo2);
    }

    @Override // com.google.android.gms.internal.measurement.v4
    final void FH(Object obj, long j) {
        Zo(obj, j).AR();
    }

    @Override // com.google.android.gms.internal.measurement.v4
    final <L> List<L> j6(Object obj, long j) {
        j4 j4VarZo = Zo(obj, j);
        if (j4VarZo.sh()) {
            return j4VarZo;
        }
        int size = j4VarZo.size();
        j4 j4VarTp = j4VarZo.tp(size == 0 ? 10 : size << 1);
        a7.VH(obj, j, j4VarTp);
        return j4VarTp;
    }
}
