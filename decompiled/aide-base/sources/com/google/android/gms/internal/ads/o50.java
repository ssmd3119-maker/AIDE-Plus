package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class o50 extends c40<Float> implements x50<Float>, l70, RandomAccess {
    private int jw;
    private float[] mb;

    static {
        new o50().rN();
    }

    o50() {
        this(new float[10], 0);
    }

    private final void DW(int i, float f) {
        int i2;
        j6();
        if (i < 0 || i > (i2 = this.jw)) {
            throw new IndexOutOfBoundsException(v5(i));
        }
        float[] fArr = this.mb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.mb, i, fArr2, i + 1, this.jw - i);
            this.mb = fArr2;
        }
        this.mb[i] = f;
        this.jw++;
        ((AbstractList) this).modCount++;
    }

    private final void Hw(int i) {
        if (i < 0 || i >= this.jw) {
            throw new IndexOutOfBoundsException(v5(i));
        }
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

    public final void VH(float f) {
        DW(this.jw, f);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        DW(i, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        j6();
        t50.j6(collection);
        if (!(collection instanceof o50)) {
            return super.addAll(collection);
        }
        o50 o50Var = (o50) collection;
        int i = o50Var.jw;
        if (i == 0) {
            return false;
        }
        int i2 = this.jw;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.mb;
        if (i3 > fArr.length) {
            this.mb = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(o50Var.mb, 0, this.mb, this.jw, o50Var.jw);
        this.jw = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o50)) {
            return super.equals(obj);
        }
        o50 o50Var = (o50) obj;
        if (this.jw != o50Var.jw) {
            return false;
        }
        float[] fArr = o50Var.mb;
        for (int i = 0; i < this.jw; i++) {
            if (this.mb[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Hw(i);
        return Float.valueOf(this.mb[i]);
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.jw; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.mb[i]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.android.gms.internal.ads.c40, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j6();
        for (int i = 0; i < this.jw; i++) {
            if (obj.equals(Float.valueOf(this.mb[i]))) {
                float[] fArr = this.mb;
                System.arraycopy(fArr, i + 1, fArr, i, this.jw - i);
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
        float[] fArr = this.mb;
        System.arraycopy(fArr, i2, fArr, i, this.jw - i2);
        this.jw -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        j6();
        Hw(i);
        float[] fArr = this.mb;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.jw;
    }

    @Override // com.google.android.gms.internal.ads.x50
    public final /* synthetic */ x50<Float> yS(int i) {
        if (i >= this.jw) {
            return new o50(Arrays.copyOf(this.mb, i), this.jw);
        }
        throw new IllegalArgumentException();
    }

    private o50(float[] fArr, int i) {
        this.mb = fArr;
        this.jw = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        j6();
        Hw(i);
        float[] fArr = this.mb;
        float f = fArr[i];
        int i2 = this.jw;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, i2 - i);
        }
        this.jw--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }
}
