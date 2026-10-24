package abcd;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class uf0<T> extends AbstractList<T> {
    private T[][] WB;
    private int fY;
    private int jw;
    private int mb;
    private T[] qp;

    /* JADX WARN: Multi-variable type inference failed */
    public uf0() {
        T[][] tArr = (T[][]) J8(256);
        this.WB = tArr;
        tArr[0] = EQ();
        this.qp = this.WB[0];
    }

    private static <T> T[] EQ() {
        return (T[]) new Object[1024];
    }

    private static <T> T[][] J8(int i) {
        return (T[][]) new Object[i][];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int QX(int i) {
        return i & 1023;
    }

    private void Ws() {
        this.jw = aM(this.mb);
        this.fY = QX(this.mb);
        this.qp = this.WB[this.jw];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int aM(int i) {
        return i >>> 10;
    }

    public void VH(uf0<T> uf0Var) {
        if (uf0Var.mb == 0) {
            return;
        }
        for (int i = 0; i < uf0Var.jw; i++) {
            gn(uf0Var.WB[i], 0, 1024);
        }
        int i2 = uf0Var.fY;
        if (i2 != 0) {
            gn(uf0Var.qp, 0, i2);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        int i = this.fY;
        if (i < 1024) {
            this.qp[i] = t;
            this.fY = i + 1;
            this.mb++;
            return true;
        }
        int i2 = this.jw + 1;
        this.jw = i2;
        T[][] tArr = this.WB;
        if (i2 == tArr.length) {
            T[][] tArr2 = (T[][]) J8(tArr.length << 1);
            T[][] tArr3 = this.WB;
            System.arraycopy(tArr3, 0, tArr2, 0, tArr3.length);
            this.WB = tArr2;
        }
        T[] tArr4 = this.WB[this.jw];
        if (tArr4 == null) {
            tArr4 = (T[]) EQ();
            this.WB[this.jw] = tArr4;
        }
        tArr4[0] = t;
        this.qp = tArr4;
        this.fY = 1;
        this.mb++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        for (T[] tArr : this.WB) {
            if (tArr != null) {
                Arrays.fill(tArr, (Object) null);
            }
        }
        this.mb = 0;
        this.jw = 0;
        this.fY = 0;
        this.qp = this.WB[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        if (i < 0 || this.mb <= i) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        return this.WB[aM(i)][QX(i)];
    }

    public void gn(T[] tArr, int i, int i2) {
        while (i2 > 0) {
            int i3 = this.fY;
            int iMin = Math.min(i2, 1024 - i3);
            if (iMin == 0) {
                add(tArr[i]);
                i2--;
                i++;
            } else {
                System.arraycopy(tArr, i, this.qp, i3, iMin);
                this.fY += iMin;
                this.mb += iMin;
                i += iMin;
                i2 -= iMin;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public T remove(int i) {
        int i2 = this.mb;
        if (i == i2 - 1) {
            T[] tArr = this.WB[aM(i)];
            int iQX = QX(i);
            T t = tArr[iQX];
            tArr[iQX] = null;
            this.mb--;
            int i3 = this.fY;
            if (i3 > 0) {
                this.fY = i3 - 1;
            } else {
                Ws();
            }
            return t;
        }
        if (i < 0 || i2 <= i) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        T t2 = get(i);
        while (true) {
            int i4 = this.mb;
            if (i >= i4 - 1) {
                set(i4 - 1, null);
                this.mb--;
                Ws();
                return t2;
            }
            int i5 = i + 1;
            set(i, get(i5));
            i = i5;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        if (i < 0 || this.mb <= i) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        T[] tArr = this.WB[aM(i)];
        int iQX = QX(i);
        T t2 = tArr[iQX];
        tArr[iQX] = t;
        return t2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mb;
    }

    private class a implements Iterator<T> {
        private int WB;
        private T[] fY;
        private int jw;
        private int mb;

        private a() {
            this.fY = (T[]) uf0.this.WB[0];
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB < uf0.this.mb;
        }

        @Override // java.util.Iterator
        public T next() {
            if (uf0.this.mb <= this.WB) {
                throw new NoSuchElementException();
            }
            T[] tArr = this.fY;
            int i = this.jw;
            T t = tArr[i];
            int i2 = i + 1;
            this.jw = i2;
            if (i2 == 1024) {
                int i3 = this.mb + 1;
                this.mb = i3;
                if (i3 < uf0.this.WB.length) {
                    this.fY = (T[]) uf0.this.WB[this.mb];
                } else {
                    this.fY = null;
                }
                this.jw = 0;
            }
            this.WB++;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.WB;
            if (i == 0) {
                throw new IllegalStateException();
            }
            uf0 uf0Var = uf0.this;
            int i2 = i - 1;
            this.WB = i2;
            uf0Var.remove(i2);
            this.mb = uf0.aM(this.WB);
            this.jw = uf0.QX(this.WB);
            this.fY = (T[]) uf0.this.WB[this.mb];
        }

        public /* synthetic */ a(uf0 uf0Var, a aVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uf0(int i) {
        int iAM = aM(i);
        T[][] tArr = (T[][]) J8(((i & 1023) != 0 || iAM == 0) ? iAM + 1 : iAM);
        this.WB = tArr;
        tArr[0] = EQ();
        this.qp = this.WB[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int i2 = this.mb;
        if (i == i2) {
            add(t);
            return;
        }
        if (i >= 0 && i2 >= i) {
            add(null);
            for (int i3 = this.mb - 2; i <= i3; i3--) {
                set(i3 + 1, get(i3));
            }
            set(i, t);
            return;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }
}
