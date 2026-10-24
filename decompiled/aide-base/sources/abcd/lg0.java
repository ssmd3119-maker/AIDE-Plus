package abcd;

import abcd.k70;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class lg0<T extends k70> implements Iterable<k70> {
    private static final lg0<k70> jw = new lg0<>(new k70[0], 0);
    private final k70[] WB;
    private final int mb;

    class a implements Iterator<k70> {
        private int WB;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB < lg0.this.mb;
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public k70 next() {
            if (this.WB >= lg0.this.mb) {
                throw new NoSuchElementException();
            }
            k70[] k70VarArr = lg0.this.WB;
            int i = this.WB;
            this.WB = i + 1;
            return k70VarArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static class b<T extends k70> {
        private int DW;
        private k70[] j6;

        public b() {
            this(16);
        }

        public void DW(k70[] k70VarArr, int i, int i2) {
            int length = this.j6.length;
            int i3 = this.DW;
            if (length < i3 + i2) {
                k70[] k70VarArr2 = new k70[Math.max(i3 * 2, i3 + i2)];
                System.arraycopy(this.j6, 0, k70VarArr2, 0, this.DW);
                this.j6 = k70VarArr2;
            }
            System.arraycopy(k70VarArr, i, this.j6, this.DW, i2);
            this.DW += i2;
        }

        public T FH(int i) {
            return (T) this.j6[i];
        }

        public void Hw(int i) {
            k70[] k70VarArr = this.j6;
            int i2 = i + 1;
            System.arraycopy(k70VarArr, i2, k70VarArr, i, this.DW - i2);
            this.DW--;
        }

        public void VH() {
            Arrays.sort(this.j6, 0, this.DW, l70.WB);
        }

        public int Zo() {
            return this.DW;
        }

        public lg0<T> gn() {
            return new lg0<>(this.j6, this.DW);
        }

        public void j6(T t) {
            k70[] k70VarArr = this.j6;
            int length = k70VarArr.length;
            int i = this.DW;
            if (length == i) {
                k70[] k70VarArr2 = new k70[i * 2];
                System.arraycopy(k70VarArr, 0, k70VarArr2, 0, i);
                this.j6 = k70VarArr2;
            }
            k70[] k70VarArr3 = this.j6;
            int i2 = this.DW;
            this.DW = i2 + 1;
            k70VarArr3[i2] = t;
        }

        public String toString() {
            return gn().toString();
        }

        public void v5(int i, T t) {
            this.j6[i] = t;
        }

        public b(int i) {
            this.j6 = new k70[i];
        }
    }

    public lg0(k70[] k70VarArr, int i) {
        this.WB = k70VarArr;
        this.mb = i;
    }

    public static <T extends k70> lg0<T> EQ() {
        return (lg0<T>) jw;
    }

    public final lg0<T> Hw(int i, T t) {
        if (i < 0) {
            i = -(i + 1);
        }
        k70[] k70VarArr = new k70[this.mb + 1];
        if (i > 0) {
            System.arraycopy(this.WB, 0, k70VarArr, 0, i);
        }
        k70VarArr[i] = t;
        int i2 = this.mb;
        if (i < i2) {
            System.arraycopy(this.WB, i, k70VarArr, i + 1, i2 - i);
        }
        return new lg0<>(k70VarArr, this.mb + 1);
    }

    public final int J8(String str) {
        int i = this.mb;
        if (i == 0) {
            return -1;
        }
        int i2 = 0;
        do {
            int i3 = (i2 + i) >>> 1;
            int iDW = l70.DW(this.WB[i3], str);
            if (iDW < 0) {
                i2 = i3 + 1;
            } else {
                if (iDW == 0) {
                    return i3;
                }
                i = i3;
            }
        } while (i2 < i);
        return -(i2 + 1);
    }

    public final lg0<T> Mr(int i, T t) {
        int i2 = this.mb;
        k70[] k70VarArr = new k70[i2];
        System.arraycopy(this.WB, 0, k70VarArr, 0, i2);
        k70VarArr[i] = t;
        return new lg0<>(k70VarArr, this.mb);
    }

    public final T QX(String str) {
        int iJ8 = J8(str);
        if (iJ8 >= 0) {
            return (T) Ws(iJ8);
        }
        return null;
    }

    public final boolean VH(String str) {
        return J8(str) >= 0;
    }

    public final T Ws(int i) {
        return (T) this.WB[i];
    }

    public final lg0<T> aM(T t) {
        int iJ8 = J8(t.getName());
        return iJ8 >= 0 ? Mr(iJ8, t) : Hw(iJ8, t);
    }

    public final b<T> gn(int i) {
        b<T> bVar = new b<>(Math.max(16, i));
        bVar.DW(this.WB, 0, i);
        return bVar;
    }

    public final boolean isEmpty() {
        return this.mb == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<k70> iterator() {
        return new a();
    }

    public final lg0<T> j3(int i) {
        int i2 = this.mb;
        if (i2 == 1) {
            return EQ();
        }
        k70[] k70VarArr = new k70[i2 - 1];
        if (i > 0) {
            System.arraycopy(this.WB, 0, k70VarArr, 0, i);
        }
        int i3 = i + 1;
        int i4 = this.mb;
        if (i3 < i4) {
            System.arraycopy(this.WB, i3, k70VarArr, i, i4 - i3);
        }
        return new lg0<>(k70VarArr, this.mb - 1);
    }

    public final int size() {
        return this.mb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.mb > 0) {
            sb.append(this.WB[0]);
            for (int i = 1; i < this.mb; i++) {
                sb.append(", ");
                sb.append(this.WB[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final List<k70> v5() {
        return Collections.unmodifiableList(Arrays.asList(this.WB).subList(0, this.mb));
    }

    public lg0(lg0<T> lg0Var) {
        this.WB = lg0Var.WB;
        this.mb = lg0Var.mb;
    }
}
