package abcd;

import abcd.b70.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class b70<V extends b> implements Iterable<V> {
    private V[][] WB;
    private int mb;
    private int fY = 0;
    private int qp = 0;
    private int jw = gn(0);

    class a implements Iterator<V> {
        private int WB;
        private V fY;
        private int jw;
        private int mb;

        public a() {
        }

        private V j6(V v) {
            this.WB++;
            this.fY = (V) v.hK;
            return v;
        }

        @Override // java.util.Iterator
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public V next() {
            V v;
            V v2 = this.fY;
            if (v2 != null) {
                j6(v2);
                return v2;
            }
            while (true) {
                b[][] bVarArr = b70.this.WB;
                int i = this.mb;
                b[] bVarArr2 = bVarArr[i];
                if (this.jw == bVarArr2.length) {
                    int i2 = i + 1;
                    this.mb = i2;
                    if (i2 >= (1 << b70.this.fY)) {
                        throw new NoSuchElementException();
                    }
                    bVarArr2 = b70.this.WB[this.mb];
                    this.jw = 0;
                }
                do {
                    int i3 = this.jw;
                    if (i3 >= bVarArr2.length) {
                        break;
                    }
                    this.jw = i3 + 1;
                    v = (V) bVarArr2[i3];
                } while (v == null);
                j6(v);
                return v;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB < b70.this.mb;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static abstract class b extends a70 {
        b hK;

        public b(j60 j60Var) {
            super(j60Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b70() {
        V[][] vArr = (V[][]) new b[1024][];
        this.WB = vArr;
        vArr[0] = aM();
    }

    private static final boolean J8(j60 j60Var, j60 j60Var2) {
        return j60Var.mb == j60Var2.mb && j60Var.jw == j60Var2.jw && j60Var.fY == j60Var2.fY && j60Var.qp == j60Var2.qp && j60Var.WB == j60Var2.WB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [abcd.b70$b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [V extends abcd.b70$b[][]] */
    private void QX() {
        int i = this.fY;
        int i2 = 1 << i;
        int i3 = 1 << i;
        int i4 = i + 1;
        this.fY = i4;
        this.qp = (1 << i4) - 1;
        this.jw = gn(i4);
        int i5 = 1 << this.fY;
        V[][] vArr = this.WB;
        if (vArr.length < i5) {
            V[][] vArr2 = (V[][]) new b[i5 << 1][];
            System.arraycopy(vArr, 0, vArr2, 0, i2);
            this.WB = vArr2;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            V[] vArr3 = this.WB[i6];
            b[] bVarArrAM = aM();
            for (int i7 = 0; i7 < vArr3.length; i7++) {
                V v = vArr3[i7];
                V v2 = null;
                V v3 = null;
                while (v != null) {
                    ?? r10 = v.hK;
                    if ((v.WB & i3) == 0) {
                        v.hK = v2;
                        v2 = v;
                    } else {
                        v.hK = v3;
                        v3 = v;
                    }
                    v = r10;
                }
                vArr3[i7] = v2;
                bVarArrAM[i7] = v3;
            }
            this.WB[i2 + i6] = bVarArrAM;
        }
    }

    private final V[] aM() {
        return (V[]) new b[2048];
    }

    private static final int gn(int i) {
        return 1 << (i + 11);
    }

    public boolean EQ(j60 j60Var) {
        return Ws(j60Var) != null;
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)TV; */
    public b VH(b bVar) {
        int i = bVar.WB;
        b[] bVarArr = this.WB[this.qp & i];
        int i2 = i >>> 21;
        for (b bVar2 = bVarArr[i2]; bVar2 != null; bVar2 = bVar2.hK) {
            if (J8(bVar2, bVar)) {
                return bVar2;
            }
        }
        bVar.hK = bVarArr[i2];
        bVarArr[i2] = bVar;
        int i3 = this.mb + 1;
        this.mb = i3;
        if (i3 == this.jw) {
            QX();
        }
        return bVar;
    }

    public V Ws(j60 j60Var) {
        int i = j60Var.WB;
        for (V v = this.WB[this.qp & i][i >>> 21]; v != null; v = (V) v.hK) {
            if (J8(v, j60Var)) {
                return v;
            }
        }
        return null;
    }

    public void clear() {
        this.mb = 0;
        for (V[] vArr : this.WB) {
            if (vArr == null) {
                return;
            }
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<V> iterator() {
        return new a();
    }

    public int size() {
        return this.mb;
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)V */
    public void v5(b bVar) {
        int i = this.mb + 1;
        this.mb = i;
        if (i == this.jw) {
            QX();
        }
        int i2 = bVar.WB;
        b[] bVarArr = this.WB[this.qp & i2];
        int i3 = i2 >>> 21;
        bVar.hK = bVarArr[i3];
        bVarArr[i3] = bVar;
    }
}
