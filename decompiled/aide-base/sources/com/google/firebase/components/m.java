package com.google.firebase.components;

import abcd.kx;
import abcd.lx;
import abcd.nx;
import com.google.firebase.components.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m extends i {
    private final Map<Class<?>, q<?>> DW = new HashMap();
    private final o FH;
    private final List<a<?>> j6;

    public m(Executor executor, Iterable<d> iterable, a<?>... aVarArr) {
        this.FH = new o(executor);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a.FH(this.FH, o.class, lx.class, kx.class));
        Iterator<d> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getComponents());
        }
        Collections.addAll(arrayList, aVarArr);
        List<a<?>> listUnmodifiableList = Collections.unmodifiableList(a.C0115a.FH(arrayList));
        this.j6 = listUnmodifiableList;
        Iterator<a<?>> it2 = listUnmodifiableList.iterator();
        while (it2.hasNext()) {
            Hw(it2.next());
        }
        FH();
    }

    private void FH() {
        for (a<?> aVar : this.j6) {
            for (e eVar : aVar.Zo()) {
                if (eVar.FH() && !this.DW.containsKey(eVar.DW())) {
                    throw new h(String.format("Unsatisfied dependency for component %s: %s", aVar, eVar.DW()));
                }
            }
        }
    }

    private <T> void Hw(a<T> aVar) {
        q<?> qVar = new q<>(aVar.VH(), new s(aVar, this));
        Iterator<Class<? super T>> it = aVar.v5().iterator();
        while (it.hasNext()) {
            this.DW.put(it.next(), qVar);
        }
    }

    @Override // com.google.firebase.components.b
    public final <T> nx<T> DW(Class<T> cls) {
        com.google.android.gms.common.internal.p.tp(cls, "Null interface requested.");
        return this.DW.get(cls);
    }

    public final void v5(boolean z) {
        for (a<?> aVar : this.j6) {
            if (aVar.u7() || (aVar.tp() && z)) {
                j6(aVar.v5().iterator().next());
            }
        }
        this.FH.v5();
    }
}
