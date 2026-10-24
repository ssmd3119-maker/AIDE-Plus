package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class g40 extends c40<Boolean> implements x50<Boolean>, l70, RandomAccess {
    private int jw;
    private boolean[] mb;

    static {
        new g40().rN();
    }

    g40() {
        this(new boolean[10], 0);
    }

    private final void Hw(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(v5(i));
        }
    }

    private final void VH(int i, boolean z) {
        int i2;
        j6();
        if (i < 0 || i > (i2 = this.jw)) {
            throw new IndexOutOfBoundsException(v5(i));
        }
        boolean[] zArr = this.mb;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.mb, i, zArr2, i + 1, this.jw - i);
            this.mb = zArr2;
        }
        this.mb[i] = z;
        this.jw++;
        ((AbstractList) this).modCount++;
    }

    private final String v5(int i) {
        int i2 = this.jw;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final void DW(boolean z) {
        VH(this.jw, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        VH(i, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        j6();
        t50.j6(collection);
        if (!(collection instanceof g40)) {
            return super.addAll(collection);
        }
        g40 g40Var = (g40) collection;
        int i = g40Var.jw;
        if (i == 0) {
            return false;
        }
        int i2 = this.jw;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.mb;
        if (i3 > zArr.length) {
            this.mb = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(g40Var.mb, 0, this.mb, this.jw, g40Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g40)) {
            return super.equals(obj);
        }
        g40 g40Var = (g40) obj;
        if (this.jw != g40Var.jw) {
            return false;
        }
        boolean[] zArr = g40Var.mb;
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Hw(i);
        return Boolean.valueOf(this.mb[i]);
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZo = 1;
        for (int i = 0; i < this.jw; i++) {
            iZo = (iZo * 31) + t50.Zo(this.mb[i]);
        }
        return iZo;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Boolean.valueOf(this.mb[i]))) {
                boolean[] zArr = this.mb;
                System.arraycopy(zArr, i + 1, zArr, i, this.jw - i);
                this.jw--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        j6();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.mb;
        System.arraycopy(zArr, i2, zArr, i, this.jw - i2);
        this.jw -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        j6();
        Hw(i);
        boolean[] zArr = this.mb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50<Boolean> yS(int i) {
        if (i >= this.jw) {
            return new g40(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private g40(boolean[] zArr, int i) {
        this.mb = zArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        Hw(i);
        boolean[] zArr = this.mb;
        boolean z = zArr[i];
        int i2 = this.jw;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, i2 - i);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
