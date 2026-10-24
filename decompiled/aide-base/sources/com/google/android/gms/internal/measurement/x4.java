package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x4 extends v4 {
    private static final Class<?> FH = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private x4() {
        super();
    }

    private static <E> List<E> VH(Object obj, long j) {
        return (List) a7.P8(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> Zo(Object obj, long j, int i) {
        t4 t4Var;
        List<L> listVH = VH(obj, j);
        if (listVH.isEmpty()) {
            List<L> t4Var2 = listVH instanceof u4 ? new t4(i) : ((listVH instanceof x5) && (listVH instanceof j4)) ? ((j4) listVH).tp(i) : new ArrayList<>(i);
            a7.VH(obj, j, t4Var2);
            return t4Var2;
        }
        if (FH.isAssignableFrom(listVH.getClass())) {
            ArrayList arrayList = new ArrayList(listVH.size() + i);
            arrayList.addAll(listVH);
            a7.VH(obj, j, arrayList);
            t4Var = arrayList;
        } else {
            if (!(listVH instanceof x6)) {
                if (!(listVH instanceof x5) || !(listVH instanceof j4)) {
                    return listVH;
                }
                j4 j4Var = (j4) listVH;
                if (j4Var.sh()) {
                    return listVH;
                }
                j4 j4VarTp = j4Var.tp(listVH.size() + i);
                a7.VH(obj, j, j4VarTp);
                return j4VarTp;
            }
            t4 t4Var3 = new t4(listVH.size() + i);
            t4Var3.addAll((x6) listVH);
            a7.VH(obj, j, t4Var3);
            t4Var = t4Var3;
        }
        return t4Var;
    }

    @Override // com.google.android.gms.internal.measurement.v4
    final <E> void DW(Object obj, Object obj2, long j) {
        List listVH = VH(obj2, j);
        List listZo = Zo(obj, j, listVH.size());
        int size = listZo.size();
        int size2 = listVH.size();
        if (size > 0 && size2 > 0) {
            listZo.addAll(listVH);
        }
        if (size > 0) {
            listVH = listZo;
        }
        a7.VH(obj, j, listVH);
    }

    @Override // com.google.android.gms.internal.measurement.v4
    final void FH(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) a7.P8(obj, j);
        if (list instanceof u4) {
            objUnmodifiableList = ((u4) list).u7();
        } else {
            if (FH.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof x5) && (list instanceof j4)) {
                j4 j4Var = (j4) list;
                if (j4Var.sh()) {
                    j4Var.AR();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        a7.VH(obj, j, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.v4
    final <L> List<L> j6(Object obj, long j) {
        return Zo(obj, j, 10);
    }
}
