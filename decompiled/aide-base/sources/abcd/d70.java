package abcd;

import abcd.a70;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class d70<V extends a70> implements Iterable<V> {
    private int WB;
    private V[] fY;
    private int jw;
    private int mb;

    class a implements Iterator<V> {
        private int WB;
        private int mb;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.WB < d70.this.WB;
        }

        @Override // java.util.Iterator
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public V next() {
            while (this.mb < d70.this.fY.length) {
                a70[] a70VarArr = d70.this.fY;
                int i = this.mb;
                this.mb = i + 1;
                V v = (V) a70VarArr[i];
                if (v != null) {
                    this.WB++;
                    return v;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public d70() {
        J8(2048);
    }

    private void EQ() {
        V[] vArr = this.fY;
        J8(vArr.length << 1);
        for (V v : vArr) {
            if (v != null) {
                Ws(v);
            }
        }
    }

    private void J8(int i) {
        this.mb = i >> 1;
        this.jw = i - 1;
        this.fY = (V[]) VH(i);
    }

    private final V[] VH(int i) {
        return (V[]) new a70[i];
    }

    private void Ws(V v) {
        int i = this.jw;
        int i2 = v.WB & i;
        V[] vArr = this.fY;
        while (vArr[i2] != null) {
            i2 = (i2 + 1) & i;
        }
        vArr[i2] = v;
    }

    /* JADX WARN: Incorrect types in method signature: <Q:TV;>(TQ;)V */
    public void Hw(a70 a70Var) {
        int i = this.WB + 1;
        this.WB = i;
        if (i == this.mb) {
            EQ();
        }
        Ws(a70Var);
    }

    public V gn(j60 j60Var) {
        int i = this.jw;
        int i2 = j60Var.WB & i;
        V[] vArr = this.fY;
        while (true) {
            V v = vArr[i2];
            if (v == null) {
                return null;
            }
            if (j60.Mr(v, j60Var)) {
                return v;
            }
            i2 = (i2 + 1) & i;
        }
    }

    public boolean isEmpty() {
        return this.WB == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<V> iterator() {
        return new a();
    }

    public boolean v5(j60 j60Var) {
        return gn(j60Var) != null;
    }
}
