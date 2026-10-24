package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a50 extends c40<Double> implements x50<Double>, l70, RandomAccess {
    private int jw;
    private double[] mb;

    static {
        new a50().rN();
    }

    a50() {
        this(new double[10], 0);
    }

    private final void Hw(int i, double d) {
        int i2;
        j6();
        if (i < 0 || i > (i2 = this.jw)) {
            throw new IndexOutOfBoundsException(VH(i));
        }
        double[] dArr = this.mb;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.mb, i, dArr2, i + 1, this.jw - i);
            this.mb = dArr2;
        }
        this.mb[i] = d;
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

    public final void DW(double d) {
        Hw(this.jw, d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        Hw(i, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        j6();
        t50.j6(collection);
        if (!(collection instanceof a50)) {
            return super.addAll(collection);
        }
        a50 a50Var = (a50) collection;
        int i = a50Var.jw;
        if (i == 0) {
            return false;
        }
        int i2 = this.jw;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.mb;
        if (i3 > dArr.length) {
            this.mb = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(a50Var.mb, 0, this.mb, this.jw, a50Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a50)) {
            return super.equals(obj);
        }
        a50 a50Var = (a50) obj;
        if (this.jw != a50Var.jw) {
            return false;
        }
        double[] dArr = a50Var.mb;
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        v5(i);
        return Double.valueOf(this.mb[i]);
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iVH = 1;
        for (int i = 0; i < this.jw; i++) {
            iVH = (iVH * 31) + t50.VH(Double.doubleToLongBits(this.mb[i]));
        }
        return iVH;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Double.valueOf(this.mb[i]))) {
                double[] dArr = this.mb;
                System.arraycopy(dArr, i + 1, dArr, i, this.jw - i);
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
        double[] dArr = this.mb;
        System.arraycopy(dArr, i2, dArr, i, this.jw - i2);
        this.jw -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        j6();
        v5(i);
        double[] dArr = this.mb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50<Double> yS(int i) {
        if (i >= this.jw) {
            return new a50(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private a50(double[] dArr, int i) {
        this.mb = dArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        v5(i);
        double[] dArr = this.mb;
        double d = dArr[i];
        int i2 = this.jw;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, i2 - i);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}
