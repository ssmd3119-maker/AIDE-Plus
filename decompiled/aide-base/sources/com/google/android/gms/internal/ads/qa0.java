package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class qa0<E> extends AbstractList<E> {
    private static final sa0 jw = sa0.DW(qa0.class);
    List<E> WB;
    Iterator<E> mb;

    public qa0(List<E> list, Iterator<E> it) {
        this.WB = list;
        this.mb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.WB.size() > i) {
            return this.WB.get(i);
        }
        if (!this.mb.hasNext()) {
            throw new NoSuchElementException();
        }
        this.WB.add(this.mb.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new ra0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        jw.j6("potentially expensive size() call");
        jw.j6("blowup running");
        while (this.mb.hasNext()) {
            this.WB.add(this.mb.next());
        }
        return this.WB.size();
    }
}
