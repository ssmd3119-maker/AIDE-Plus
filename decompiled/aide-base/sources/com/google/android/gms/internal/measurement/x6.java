package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class x6 extends AbstractList<String> implements u4, RandomAccess {
    private final u4 WB;

    public x6(u4 u4Var) {
        this.WB = u4Var;
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final List<?> J0() {
        return this.WB.J0();
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final void U2(u2 u2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final Object Zo(int i) {
        return this.WB.Zo(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.WB.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new z6(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new y6(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.WB.size();
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final u4 u7() {
        return this;
    }
}
