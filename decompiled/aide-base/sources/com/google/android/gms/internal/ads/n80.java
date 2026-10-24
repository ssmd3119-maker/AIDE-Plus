package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n80 implements ListIterator<String> {
    private ListIterator<String> WB;
    private final /* synthetic */ m80 jw;
    private final /* synthetic */ int mb;

    n80(m80 m80Var, int i) {
        this.jw = m80Var;
        this.mb = i;
        this.WB = this.jw.WB.listIterator(this.mb);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.WB.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.WB.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.WB.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.WB.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.WB.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.WB.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
