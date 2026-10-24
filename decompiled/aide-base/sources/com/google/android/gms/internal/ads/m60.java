package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class m60 extends c40<Long> implements x50<Long>, l70, RandomAccess {
    private int jw;
    private long[] mb;

    static {
        new m60().rN();
    }

    m60() {
        this(new long[10], 0);
    }

    private final String VH(int i) {
        int i2 = this.jw;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void gn(int i, long j) {
        int i2;
        j6();
        if (i < 0 || i > (i2 = this.jw)) {
            throw new IndexOutOfBoundsException(VH(i));
        }
        long[] jArr = this.mb;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.mb, i, jArr2, i + 1, this.jw - i);
            this.mb = jArr2;
        }
        this.mb[i] = j;
        this.jw++;
        ((AbstractList) this).modCount++;
    }

    private final void v5(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(VH(i));
        }
    }

    public final long DW(int i) {
        v5(i);
        return this.mb[i];
    }

    public final void Hw(long j) {
        gn(this.jw, j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        gn(i, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        j6();
        t50.j6(collection);
        if (!(collection instanceof m60)) {
            return super.addAll(collection);
        }
        m60 m60Var = (m60) collection;
        int i = m60Var.jw;
        if (i == 0) {
            return false;
        }
        int i2 = this.jw;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.mb;
        if (i3 > jArr.length) {
            this.mb = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(m60Var.mb, 0, this.mb, this.jw, m60Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m60)) {
            return super.equals(obj);
        }
        m60 m60Var = (m60) obj;
        if (this.jw != m60Var.jw) {
            return false;
        }
        long[] jArr = m60Var.mb;
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(DW(i));
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iVH = 1;
        for (int i = 0; i < this.jw; i++) {
            iVH = (iVH * 31) + t50.VH(this.mb[i]);
        }
        return iVH;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Long.valueOf(this.mb[i]))) {
                long[] jArr = this.mb;
                System.arraycopy(jArr, i + 1, jArr, i, this.jw - i);
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
        long[] jArr = this.mb;
        System.arraycopy(jArr, i2, jArr, i, this.jw - i2);
        this.jw -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        j6();
        v5(i);
        long[] jArr = this.mb;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50<Long> yS(int i) {
        if (i >= this.jw) {
            return new m60(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private m60(long[] jArr, int i) {
        this.mb = jArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        v5(i);
        long[] jArr = this.mb;
        long j = jArr[i];
        int i2 = this.jw;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, i2 - i);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
