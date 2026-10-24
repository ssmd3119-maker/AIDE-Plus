package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f4 extends q2<Integer> implements j4<Integer>, x5, RandomAccess {
    private int jw;
    private int[] mb;

    static {
        new f4().AR();
    }

    f4() {
        this(new int[10], 0);
    }

    private final void Hw(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(v5(i));
        }
    }

    private final void gn(int i, int i2) {
        int i3;
        j6();
        if (i < 0 || i > (i3 = this.jw)) {
            throw new IndexOutOfBoundsException(v5(i));
        }
        int[] iArr = this.mb;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.mb, i, iArr2, i + 1, this.jw - i);
            this.mb = iArr2;
        }
        this.mb[i] = i2;
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

    public final int DW(int i) {
        Hw(i);
        return this.mb[i];
    }

    public final void VH(int i) {
        gn(this.jw, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        gn(i, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        j6();
        g4.j6(collection);
        if (!(collection instanceof f4)) {
            return super.addAll(collection);
        }
        f4 f4Var = (f4) collection;
        int i = f4Var.jw;
        if (i == 0) {
            return false;
        }
        int i2 = this.jw;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.mb;
        if (i3 > iArr.length) {
            this.mb = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(f4Var.mb, 0, this.mb, this.jw, f4Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return super.equals(obj);
        }
        f4 f4Var = (f4) obj;
        if (this.jw != f4Var.jw) {
            return false;
        }
        int[] iArr = f4Var.mb;
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(DW(i));
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.jw; i2++) {
            i = (i * 31) + this.mb[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.q2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Integer.valueOf(this.mb[i]))) {
                int[] iArr = this.mb;
                System.arraycopy(iArr, i + 1, iArr, i, (this.jw - i) - 1);
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
        int[] iArr = this.mb;
        System.arraycopy(iArr, i2, iArr, i, this.jw - i2);
        this.jw -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        j6();
        Hw(i);
        int[] iArr = this.mb;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.measurement.j4
    public final /* synthetic */ j4<Integer> tp(int i) {
        if (i >= this.jw) {
            return new f4(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private f4(int[] iArr, int i) {
        this.mb = iArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        Hw(i);
        int[] iArr = this.mb;
        int i2 = iArr[i];
        if (i < this.jw - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}
