package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class g60 extends c40<String> implements h60, RandomAccess {
    private static final g60 jw;
    private final List<Object> mb;

    static {
        g60 g60Var = new g60();
        jw = g60Var;
        g60Var.rN();
    }

    public g60() {
        this(10);
    }

    private static String DW(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof i40 ? ((i40) obj).VH() : t50.tp((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final Object BT(int i) {
        return this.mb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final List<?> FH() {
        return Collections.unmodifiableList(this.mb);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        j6();
        this.mb.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j6();
        this.mb.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void cn(i40 i40Var) {
        j6();
        this.mb.add(i40Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.mb.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof i40) {
            i40 i40Var = (i40) obj;
            String strVH = i40Var.VH();
            if (i40Var.gn()) {
                this.mb.set(i, strVH);
            }
            return strVH;
        }
        byte[] bArr = (byte[]) obj;
        String strTp = t50.tp(bArr);
        if (t50.u7(bArr)) {
            this.mb.set(i, strTp);
        }
        return strTp;
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

    @Override // com.google.android.gms.internal.ads.h60
    public final h60 we() {
        return XL() ? new m80(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50 yS(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.mb);
        return new g60((ArrayList<Object>) arrayList);
    }

    public g60(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        j6();
        if (collection instanceof h60) {
            collection = ((h60) collection).FH();
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

    private g60(ArrayList<Object> arrayList) {
        this.mb = arrayList;
    }
}
