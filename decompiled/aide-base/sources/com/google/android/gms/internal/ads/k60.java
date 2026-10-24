package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k60 extends i60 {
    private static final Class<?> FH = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private k60() {
        super();
    }

    private static <E> List<E> VH(Object obj, long j) {
        return (List) q80.sh(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> Zo(Object obj, long j, int i) {
        g60 g60Var;
        List<L> listVH = VH(obj, j);
        if (listVH.isEmpty()) {
            List<L> g60Var2 = listVH instanceof h60 ? new g60(i) : ((listVH instanceof l70) && (listVH instanceof x50)) ? ((x50) listVH).yS(i) : new ArrayList<>(i);
            q80.VH(obj, j, g60Var2);
            return g60Var2;
        }
        if (FH.isAssignableFrom(listVH.getClass())) {
            ArrayList arrayList = new ArrayList(listVH.size() + i);
            arrayList.addAll(listVH);
            q80.VH(obj, j, arrayList);
            g60Var = arrayList;
        } else {
            if (!(listVH instanceof m80)) {
                if (!(listVH instanceof l70) || !(listVH instanceof x50)) {
                    return listVH;
                }
                x50 x50Var = (x50) listVH;
                if (x50Var.XL()) {
                    return listVH;
                }
                x50 x50VarYS = x50Var.yS(listVH.size() + i);
                q80.VH(obj, j, x50VarYS);
                return x50VarYS;
            }
            g60 g60Var3 = new g60(listVH.size() + i);
            g60Var3.addAll((m80) listVH);
            q80.VH(obj, j, g60Var3);
            g60Var = g60Var3;
        }
        return g60Var;
    }

    @Override // com.google.android.gms.internal.ads.i60
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
        q80.VH(obj, j, listVH);
    }

    @Override // com.google.android.gms.internal.ads.i60
    final <L> List<L> j6(Object obj, long j) {
        return Zo(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.i60
    final void v5(Object obj, long j) {
        Object objUnmodifiableList;
        List list = (List) q80.sh(obj, j);
        if (list instanceof h60) {
            objUnmodifiableList = ((h60) list).we();
        } else {
            if (FH.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof l70) && (list instanceof x50)) {
                x50 x50Var = (x50) list;
                if (x50Var.XL()) {
                    x50Var.rN();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        q80.VH(obj, j, objUnmodifiableList);
    }
}
