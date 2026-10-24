package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class z4 extends q2<Long> implements j4<Long>, x5, RandomAccess {
    private int jw;
    private long[] mb;

    static {
        new z4().AR();
    }

    z4() {
        this(new long[10], 0);
    }

    private final void Hw(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(v5(i));
        }
    }

    private final void gn(int i, long j) {
        int i2;
        j6();
        if (i < 0 || i > (i2 = this.jw)) {
            throw new IndexOutOfBoundsException(v5(i));
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

    private final String v5(int i) {
        int i2 = this.jw;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final long DW(int i) {
        Hw(i);
        return this.mb[i];
    }

    public final void VH(long j) {
        gn(this.jw, j);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        gn(i, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        j6();
        g4.j6(collection);
        if (!(collection instanceof z4)) {
            return super.addAll(collection);
        }
        z4 z4Var = (z4) collection;
        int i = z4Var.jw;
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
        System.arraycopy(z4Var.mb, 0, this.mb, this.jw, z4Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return super.equals(obj);
        }
        z4 z4Var = (z4) obj;
        if (this.jw != z4Var.jw) {
            return false;
        }
        long[] jArr = z4Var.mb;
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

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZo = 1;
        for (int i = 0; i < this.jw; i++) {
            iZo = (iZo * 31) + g4.Zo(this.mb[i]);
        }
        return iZo;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Long.valueOf(this.mb[i]))) {
                long[] jArr = this.mb;
                System.arraycopy(jArr, i + 1, jArr, i, (this.jw - i) - 1);
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
        Hw(i);
        long[] jArr = this.mb;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.measurement.j4
    public final /* synthetic */ j4<Long> tp(int i) {
        if (i >= this.jw) {
            return new z4(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private z4(long[] jArr, int i) {
        this.mb = jArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        Hw(i);
        long[] jArr = this.mb;
        long j = jArr[i];
        if (i < this.jw - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}
