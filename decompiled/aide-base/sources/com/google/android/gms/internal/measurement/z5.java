package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z5<E> extends q2<E> {
    private static final z5<Object> jw;
    private final List<E> mb;

    static {
        z5<Object> z5Var = new z5<>();
        jw = z5Var;
        z5Var.AR();
    }

    z5() {
        this(new ArrayList(10));
    }

    public static <E> z5<E> DW() {
        return (z5<E>) jw;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        j6();
        this.mb.add(i, e);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.mb.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        j6();
        E eRemove = this.mb.remove(i);
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        j6();
        E e2 = this.mb.set(i, e);
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.mb.size();
    }

    @Override // com.google.android.gms.internal.measurement.j4
    public final /* synthetic */ j4 tp(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.mb);
        return new z5(arrayList);
    }

    private z5(List<E> list) {
        this.mb = list;
    }
}
