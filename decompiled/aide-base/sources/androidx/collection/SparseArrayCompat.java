package androidx.collection;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {
    private static final Object qp = new Object();
    private boolean WB;
    private int fY;
    private Object[] jw;
    private int[] mb;

    public SparseArrayCompat() {
        this(10);
    }

    private void Zo() {
        int i = this.fY;
        int[] iArr = this.mb;
        Object[] objArr = this.jw;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != qp) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.WB = false;
        this.fY = i2;
    }

    public void EQ(int i) {
        Hw(i);
    }

    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> clone() {
        SparseArrayCompat<E> sparseArrayCompat = null;
        try {
            SparseArrayCompat<E> sparseArrayCompat2 = (SparseArrayCompat) super.clone();
            try {
                sparseArrayCompat2.mb = (int[]) this.mb.clone();
                sparseArrayCompat2.jw = (Object[]) this.jw.clone();
                return sparseArrayCompat2;
            } catch (CloneNotSupportedException unused) {
                sparseArrayCompat = sparseArrayCompat2;
                return sparseArrayCompat;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public void Hw(int i) {
        int iJ6 = ContainerHelpers.j6(this.mb, this.fY, i);
        if (iJ6 >= 0) {
            Object[] objArr = this.jw;
            Object obj = objArr[iJ6];
            Object obj2 = qp;
            if (obj != obj2) {
                objArr[iJ6] = obj2;
                this.WB = true;
            }
        }
    }

    public E J0(int i) {
        if (this.WB) {
            Zo();
        }
        return (E) this.jw[i];
    }

    public E VH(int i) {
        return gn(i, null);
    }

    public E gn(int i, E e) {
        int iJ6 = ContainerHelpers.j6(this.mb, this.fY, i);
        if (iJ6 >= 0) {
            Object[] objArr = this.jw;
            if (objArr[iJ6] != qp) {
                return (E) objArr[iJ6];
            }
        }
        return e;
    }

    public void j6() {
        int i = this.fY;
        Object[] objArr = this.jw;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.fY = 0;
        this.WB = false;
    }

    public String toString() {
        if (we() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.fY * 28);
        sb.append('{');
        for (int i = 0; i < this.fY; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(u7(i));
            sb.append('=');
            E eJ0 = J0(i);
            if (eJ0 != this) {
                sb.append(eJ0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void tp(int i, E e) {
        int iJ6 = ContainerHelpers.j6(this.mb, this.fY, i);
        if (iJ6 >= 0) {
            this.jw[iJ6] = e;
            return;
        }
        int iJ62 = iJ6 ^ (-1);
        if (iJ62 < this.fY) {
            Object[] objArr = this.jw;
            if (objArr[iJ62] == qp) {
                this.mb[iJ62] = i;
                objArr[iJ62] = e;
                return;
            }
        }
        if (this.WB && this.fY >= this.mb.length) {
            Zo();
            iJ62 = ContainerHelpers.j6(this.mb, this.fY, i) ^ (-1);
        }
        int i2 = this.fY;
        if (i2 >= this.mb.length) {
            int iHw = ContainerHelpers.Hw(i2 + 1);
            int[] iArr = new int[iHw];
            Object[] objArr2 = new Object[iHw];
            int[] iArr2 = this.mb;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.jw;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mb = iArr;
            this.jw = objArr2;
        }
        int i3 = this.fY;
        if (i3 - iJ62 != 0) {
            int[] iArr3 = this.mb;
            int i4 = iJ62 + 1;
            System.arraycopy(iArr3, iJ62, iArr3, i4, i3 - iJ62);
            Object[] objArr4 = this.jw;
            System.arraycopy(objArr4, iJ62, objArr4, i4, this.fY - iJ62);
        }
        this.mb[iJ62] = i;
        this.jw[iJ62] = e;
        this.fY++;
    }

    public int u7(int i) {
        if (this.WB) {
            Zo();
        }
        return this.mb[i];
    }

    public int we() {
        if (this.WB) {
            Zo();
        }
        return this.fY;
    }

    public SparseArrayCompat(int i) {
        this.WB = false;
        if (i == 0) {
            this.mb = ContainerHelpers.j6;
            this.jw = ContainerHelpers.DW;
        } else {
            int iHw = ContainerHelpers.Hw(i);
            this.mb = new int[iHw];
            this.jw = new Object[iHw];
        }
        this.fY = 0;
    }
}
