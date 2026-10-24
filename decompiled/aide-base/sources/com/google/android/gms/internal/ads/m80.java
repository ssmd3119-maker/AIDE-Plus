package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m80 extends AbstractList<String> implements h60, RandomAccess {
    private final h60 WB;

    public m80(h60 h60Var) {
        this.WB = h60Var;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final Object BT(int i) {
        return this.WB.BT(i);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final List<?> FH() {
        return this.WB.FH();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void cn(i40 i40Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.WB.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new o80(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new n80(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.WB.size();
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final h60 we() {
        return this;
    }
}
