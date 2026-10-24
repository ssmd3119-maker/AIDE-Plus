package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class s50 extends c40<Integer> implements x50<Integer>, l70, RandomAccess {
    private static final s50 fY;
    private int jw;
    private int[] mb;

    static {
        s50 s50Var = new s50();
        fY = s50Var;
        s50Var.rN();
    }

    s50() {
        this(new int[10], 0);
    }

    private final void Hw(int i, int i2) {
        int i3;
        j6();
        if (i < 0 || i > (i3 = this.jw)) {
            throw new IndexOutOfBoundsException(gn(i));
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

    private final void VH(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(gn(i));
        }
    }

    private final String gn(int i) {
        int i2 = this.jw;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static s50 v5() {
        return fY;
    }

    public final int DW(int i) {
        VH(i);
        return this.mb[i];
    }

    public final void EQ(int i) {
        Hw(this.jw, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        Hw(i, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        j6();
        t50.j6(collection);
        if (!(collection instanceof s50)) {
            return super.addAll(collection);
        }
        s50 s50Var = (s50) collection;
        int i = s50Var.jw;
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
        System.arraycopy(s50Var.mb, 0, this.mb, this.jw, s50Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s50)) {
            return super.equals(obj);
        }
        s50 s50Var = (s50) obj;
        if (this.jw != s50Var.jw) {
            return false;
        }
        int[] iArr = s50Var.mb;
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

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.jw; i2++) {
            i = (i * 31) + this.mb[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Integer.valueOf(this.mb[i]))) {
                int[] iArr = this.mb;
                System.arraycopy(iArr, i + 1, iArr, i, this.jw - i);
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
        VH(i);
        int[] iArr = this.mb;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50<Integer> yS(int i) {
        if (i >= this.jw) {
            return new s50(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private s50(int[] iArr, int i) {
        this.mb = iArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        VH(i);
        int[] iArr = this.mb;
        int i2 = iArr[i];
        int i3 = this.jw;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, i3 - i);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}
