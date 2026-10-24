package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class s2 extends q2<Boolean> implements j4<Boolean>, x5, RandomAccess {
    private int jw;
    private boolean[] mb;

    static {
        new s2().AR();
    }

    s2() {
        this(new boolean[10], 0);
    }

    private final void Hw(int i, boolean z) {
        int i2;
        j6();
        if (i < 0 || i > (i2 = this.jw)) {
            throw new IndexOutOfBoundsException(VH(i));
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

    private final String VH(int i) {
        int i2 = this.jw;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void v5(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(VH(i));
        }
    }

    public final void DW(boolean z) {
        Hw(this.jw, z);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        Hw(i, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        j6();
        g4.j6(collection);
        if (!(collection instanceof s2)) {
            return super.addAll(collection);
        }
        s2 s2Var = (s2) collection;
        int i = s2Var.jw;
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
        System.arraycopy(s2Var.mb, 0, this.mb, this.jw, s2Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return super.equals(obj);
        }
        s2 s2Var = (s2) obj;
        if (this.jw != s2Var.jw) {
            return false;
        }
        boolean[] zArr = s2Var.mb;
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        v5(i);
        return Boolean.valueOf(this.mb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iTp = 1;
        for (int i = 0; i < this.jw; i++) {
            iTp = (iTp * 31) + g4.tp(this.mb[i]);
        }
        return iTp;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Boolean.valueOf(this.mb[i]))) {
                boolean[] zArr = this.mb;
                System.arraycopy(zArr, i + 1, zArr, i, (this.jw - i) - 1);
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
        v5(i);
        boolean[] zArr = this.mb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.measurement.j4
    public final /* synthetic */ j4<Boolean> tp(int i) {
        if (i >= this.jw) {
            return new s2(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private s2(boolean[] zArr, int i) {
        this.mb = zArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        v5(i);
        boolean[] zArr = this.mb;
        boolean z = zArr[i];
        if (i < this.jw - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
