package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {
    static Object[] AL;
    static int cT;
    static Object[] hK;
    static int w9;
    final boolean WB;
    int fY;
    Object[] jw;
    int[] mb;
    MapCollections<E, E> qp;
    private static final int[] k2 = new int[0];
    private static final Object[] zh = new Object[0];

    class a extends MapCollections<E, E> {
        public a() {
        }

        @Override // androidx.collection.MapCollections
        public Object DW(int i, int i2) {
            return ArraySet.this.jw[i];
        }

        @Override // androidx.collection.MapCollections
        public Map<E, E> FH() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.MapCollections
        public int Hw() {
            return ArraySet.this.fY;
        }

        @Override // androidx.collection.MapCollections
        public void VH(E e, E e2) {
            ArraySet.this.add(e);
        }

        @Override // androidx.collection.MapCollections
        public int Zo(Object obj) {
            return ArraySet.this.indexOf(obj);
        }

        @Override // androidx.collection.MapCollections
        public void gn(int i) {
            ArraySet.this.EQ(i);
        }

        @Override // androidx.collection.MapCollections
        public void j6() {
            ArraySet.this.clear();
        }

        @Override // androidx.collection.MapCollections
        public E u7(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.MapCollections
        public int v5(Object obj) {
            return ArraySet.this.indexOf(obj);
        }
    }

    public ArraySet() {
        this(0, false);
    }

    private static void Hw(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (cT < 10) {
                    objArr[0] = hK;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    hK = objArr;
                    cT++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (w9 < 10) {
                    objArr[0] = AL;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    AL = objArr;
                    w9++;
                }
            }
        }
    }

    private int VH(Object obj, int i) {
        int i2 = this.fY;
        if (i2 == 0) {
            return -1;
        }
        int iJ6 = ContainerHelpers.j6(this.mb, i2, i);
        if (iJ6 < 0 || obj.equals(this.jw[iJ6])) {
            return iJ6;
        }
        int i3 = iJ6 + 1;
        while (i3 < i2 && this.mb[i3] == i) {
            if (obj.equals(this.jw[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iJ6 - 1; i4 >= 0 && this.mb[i4] == i; i4--) {
            if (obj.equals(this.jw[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    private int gn() {
        int i = this.fY;
        if (i == 0) {
            return -1;
        }
        int iJ6 = ContainerHelpers.j6(this.mb, i, 0);
        if (iJ6 < 0 || this.jw[iJ6] == null) {
            return iJ6;
        }
        int i2 = iJ6 + 1;
        while (i2 < i && this.mb[i2] == 0) {
            if (this.jw[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iJ6 - 1; i3 >= 0 && this.mb[i3] == 0; i3--) {
            if (this.jw[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    private void j6(int i) {
        if (i == 8) {
            synchronized (ArraySet.class) {
                if (hK != null) {
                    Object[] objArr = hK;
                    this.jw = objArr;
                    hK = (Object[]) objArr[0];
                    this.mb = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    cT--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArraySet.class) {
                if (AL != null) {
                    Object[] objArr2 = AL;
                    this.jw = objArr2;
                    AL = (Object[]) objArr2[0];
                    this.mb = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    w9--;
                    return;
                }
            }
        }
        this.mb = new int[i];
        this.jw = new Object[i];
    }

    private MapCollections<E, E> v5() {
        if (this.qp == null) {
            this.qp = new a();
        }
        return this.qp;
    }

    public void DW(int i) {
        int[] iArr = this.mb;
        if (iArr.length < i) {
            Object[] objArr = this.jw;
            j6(i);
            int i2 = this.fY;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.mb, 0, i2);
                System.arraycopy(objArr, 0, this.jw, 0, this.fY);
            }
            Hw(iArr, objArr, this.fY);
        }
    }

    public E EQ(int i) {
        Object[] objArr = this.jw;
        E e = (E) objArr[i];
        int i2 = this.fY;
        if (i2 <= 1) {
            Hw(this.mb, objArr, i2);
            this.mb = k2;
            this.jw = zh;
            this.fY = 0;
        } else {
            int[] iArr = this.mb;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = this.fY - 1;
                this.fY = i3;
                if (i < i3) {
                    int[] iArr2 = this.mb;
                    int i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i3 - i);
                    Object[] objArr2 = this.jw;
                    System.arraycopy(objArr2, i4, objArr2, i, this.fY - i);
                }
                this.jw[this.fY] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr3 = this.mb;
                Object[] objArr3 = this.jw;
                j6(i5);
                this.fY--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.mb, 0, i);
                    System.arraycopy(objArr3, 0, this.jw, 0, i);
                }
                int i6 = this.fY;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.mb, i, i6 - i);
                    System.arraycopy(objArr3, i7, this.jw, i, this.fY - i);
                }
            }
        }
        return e;
    }

    public E J8(int i) {
        return (E) this.jw[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iVH;
        if (e == null) {
            iVH = gn();
            i = 0;
        } else {
            int iIdentityHashCode = this.WB ? System.identityHashCode(e) : e.hashCode();
            i = iIdentityHashCode;
            iVH = VH(e, iIdentityHashCode);
        }
        if (iVH >= 0) {
            return false;
        }
        int i2 = iVH ^ (-1);
        int i3 = this.fY;
        if (i3 >= this.mb.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.mb;
            Object[] objArr = this.jw;
            j6(i4);
            int[] iArr2 = this.mb;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.jw, 0, objArr.length);
            }
            Hw(iArr, objArr, this.fY);
        }
        int i5 = this.fY;
        if (i2 < i5) {
            int[] iArr3 = this.mb;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.jw;
            System.arraycopy(objArr2, i2, objArr2, i6, this.fY - i2);
        }
        this.mb[i2] = i;
        this.jw[i2] = e;
        this.fY++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        DW(this.fY + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.fY;
        if (i != 0) {
            Hw(this.mb, this.jw, i);
            this.mb = k2;
            this.jw = zh;
            this.fY = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.fY; i++) {
                try {
                    if (!set.contains(J8(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.mb;
        int i = this.fY;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return gn();
        }
        return VH(obj, this.WB ? System.identityHashCode(obj) : obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.fY <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return v5().J0().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        EQ(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.fY - 1; i >= 0; i--) {
            if (!collection.contains(this.jw[i])) {
                EQ(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.fY;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.fY;
        Object[] objArr = new Object[i];
        System.arraycopy(this.jw, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.fY * 14);
        sb.append('{');
        for (int i = 0; i < this.fY; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E eJ8 = J8(i);
            if (eJ8 != this) {
                sb.append(eJ8);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ArraySet(int i) {
        this(i, false);
    }

    public ArraySet(int i, boolean z) {
        this.WB = z;
        if (i == 0) {
            this.mb = k2;
            this.jw = zh;
        } else {
            j6(i);
        }
        this.fY = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.fY) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.fY));
        }
        System.arraycopy(this.jw, 0, tArr, 0, this.fY);
        int length = tArr.length;
        int i = this.fY;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
