package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t4 extends q2<String> implements u4, RandomAccess {
    private static final t4 jw;
    private final List<Object> mb;

    static {
        t4 t4Var = new t4();
        jw = t4Var;
        t4Var.AR();
    }

    public t4() {
        this(10);
    }

    private static String DW(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof u2 ? ((u2) obj).j3() : g4.u7((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final List<?> J0() {
        return Collections.unmodifiableList(this.mb);
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final void U2(u2 u2Var) {
        j6();
        this.mb.add(u2Var);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final Object Zo(int i) {
        return this.mb.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        j6();
        this.mb.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j6();
        this.mb.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.mb.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            String strJ3 = u2Var.j3();
            if (u2Var.Mr()) {
                this.mb.set(i, strJ3);
            }
            return strJ3;
        }
        byte[] bArr = (byte[]) obj;
        String strU7 = g4.u7(bArr);
        if (g4.gn(bArr)) {
            this.mb.set(i, strU7);
        }
        return strU7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        j6();
        return DW(this.mb.set(i, (String) obj));
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
        return new t4((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.u4
    public final u4 u7() {
        return sh() ? new x6(this) : this;
    }

    public t4(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        j6();
        if (collection instanceof u4) {
            collection = ((u4) collection).J0();
        }
        boolean zAddAll = this.mb.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        Object objRemove = this.mb.remove(i);
        ((AbstractList) this).modCount++;
        return DW(objRemove);
    }

    private t4(ArrayList<Object> arrayList) {
        this.mb = arrayList;
    }
}
