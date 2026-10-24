package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n70<E> extends c40<E> {
    private static final n70<Object> jw;
    private final List<E> mb;

    static {
        n70<Object> n70Var = new n70<>();
        jw = n70Var;
        n70Var.rN();
    }

    n70() {
        this(new ArrayList(10));
    }

    public static <E> n70<E> DW() {
        return (n70<E>) jw;
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

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50 yS(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.mb);
        return new n70(arrayList);
    }

    private n70(List<E> list) {
        this.mb = list;
    }
}
