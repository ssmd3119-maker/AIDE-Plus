package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {
    static Object[] fY;
    static Object[] k2;
    static int qp;
    static int zh;
    int[] WB;
    int jw;
    Object[] mb;

    public SimpleArrayMap() {
        this.WB = ContainerHelpers.j6;
        this.mb = ContainerHelpers.DW;
        this.jw = 0;
    }

    private static int DW(int[] iArr, int i, int i2) {
        try {
            return ContainerHelpers.j6(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void Hw(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArrayMap.class) {
                if (zh < 10) {
                    objArr[0] = k2;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    k2 = objArr;
                    zh++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArrayMap.class) {
                if (qp < 10) {
                    objArr[0] = fY;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    fY = objArr;
                    qp++;
                }
            }
        }
    }

    private void j6(int i) {
        if (i == 8) {
            synchronized (ArrayMap.class) {
                if (k2 != null) {
                    Object[] objArr = k2;
                    this.mb = objArr;
                    k2 = (Object[]) objArr[0];
                    this.WB = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    zh--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArrayMap.class) {
                if (fY != null) {
                    Object[] objArr2 = fY;
                    this.mb = objArr2;
                    fY = (Object[]) objArr2[0];
                    this.WB = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    qp--;
                    return;
                }
            }
        }
        this.WB = new int[i];
        this.mb = new Object[i << 1];
    }

    public V EQ(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.mb;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public void FH(int i) {
        int i2 = this.jw;
        int[] iArr = this.WB;
        if (iArr.length < i) {
            Object[] objArr = this.mb;
            j6(i);
            if (this.jw > 0) {
                System.arraycopy(iArr, 0, this.WB, 0, i2);
                System.arraycopy(objArr, 0, this.mb, 0, i2 << 1);
            }
            Hw(iArr, objArr, i2);
        }
        if (this.jw != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public int VH() {
        int i = this.jw;
        if (i == 0) {
            return -1;
        }
        int iDW = DW(this.WB, i, 0);
        if (iDW < 0 || this.mb[iDW << 1] == null) {
            return iDW;
        }
        int i2 = iDW + 1;
        while (i2 < i && this.WB[i2] == 0) {
            if (this.mb[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iDW - 1; i3 >= 0 && this.WB[i3] == 0; i3--) {
            if (this.mb[i3 << 1] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public int Zo(Object obj) {
        return obj == null ? VH() : v5(obj, obj.hashCode());
    }

    public void clear() {
        int i = this.jw;
        if (i > 0) {
            int[] iArr = this.WB;
            Object[] objArr = this.mb;
            this.WB = ContainerHelpers.j6;
            this.mb = ContainerHelpers.DW;
            this.jw = 0;
            Hw(iArr, objArr, i);
        }
        if (this.jw > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return Zo(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return gn(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i = 0; i < this.jw; i++) {
                try {
                    K kKeyAt = keyAt(i);
                    V vValueAt = valueAt(i);
                    Object obj2 = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!vValueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.jw; i2++) {
                try {
                    K kKeyAt2 = keyAt(i2);
                    V vValueAt2 = valueAt(i2);
                    Object obj3 = map.get(kKeyAt2);
                    if (vValueAt2 == null) {
                        if (obj3 != null || !map.containsKey(kKeyAt2)) {
                            return false;
                        }
                    } else if (!vValueAt2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int iZo = Zo(obj);
        if (iZo >= 0) {
            return (V) this.mb[(iZo << 1) + 1];
        }
        return null;
    }

    public int gn(Object obj) {
        int i = this.jw * 2;
        Object[] objArr = this.mb;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.WB;
        Object[] objArr = this.mb;
        int i = this.jw;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.jw <= 0;
    }

    public K keyAt(int i) {
        return (K) this.mb[i << 1];
    }

    public V put(K k, V v) {
        int i;
        int iV5;
        int i2 = this.jw;
        if (k == null) {
            iV5 = VH();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iV5 = v5(k, iHashCode);
        }
        if (iV5 >= 0) {
            int i3 = (iV5 << 1) + 1;
            Object[] objArr = this.mb;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = iV5 ^ (-1);
        if (i2 >= this.WB.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.WB;
            Object[] objArr2 = this.mb;
            j6(i5);
            if (i2 != this.jw) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.WB;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mb, 0, objArr2.length);
            }
            Hw(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.WB;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.mb;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.jw - i4) << 1);
        }
        int i7 = this.jw;
        if (i2 == i7) {
            int[] iArr4 = this.WB;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.mb;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.jw = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int iZo = Zo(obj);
        if (iZo >= 0) {
            return tp(iZo);
        }
        return null;
    }

    public int size() {
        return this.jw;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.jw * 28);
        sb.append('{');
        for (int i = 0; i < this.jw; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V tp(int i) {
        Object[] objArr = this.mb;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.jw;
        int i4 = 0;
        if (i3 <= 1) {
            Hw(this.WB, objArr, i3);
            this.WB = ContainerHelpers.j6;
            this.mb = ContainerHelpers.DW;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.WB;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.WB;
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.mb;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.mb;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                int i9 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr3 = this.WB;
                Object[] objArr4 = this.mb;
                j6(i9);
                if (i3 != this.jw) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.WB, 0, i);
                    System.arraycopy(objArr4, 0, this.mb, 0, i2);
                }
                if (i < i5) {
                    int i10 = i + 1;
                    int i11 = i5 - i;
                    System.arraycopy(iArr3, i10, this.WB, i, i11);
                    System.arraycopy(objArr4, i10 << 1, this.mb, i2, i11 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.jw) {
            throw new ConcurrentModificationException();
        }
        this.jw = i4;
        return v;
    }

    public int v5(Object obj, int i) {
        int i2 = this.jw;
        if (i2 == 0) {
            return -1;
        }
        int iDW = DW(this.WB, i2, i);
        if (iDW < 0 || obj.equals(this.mb[iDW << 1])) {
            return iDW;
        }
        int i3 = iDW + 1;
        while (i3 < i2 && this.WB[i3] == i) {
            if (obj.equals(this.mb[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iDW - 1; i4 >= 0 && this.WB[i4] == i; i4--) {
            if (obj.equals(this.mb[i4 << 1])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public V valueAt(int i) {
        return (V) this.mb[(i << 1) + 1];
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.WB = ContainerHelpers.j6;
            this.mb = ContainerHelpers.DW;
        } else {
            j6(i);
        }
        this.jw = 0;
    }
}
