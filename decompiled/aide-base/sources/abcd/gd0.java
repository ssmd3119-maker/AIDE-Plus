package abcd;

/* loaded from: classes.dex */
public final class gd0<V> {
    private int DW;
    private int FH;
    private a<V>[] j6 = j6(64);

    private static class a<V> {
        V DW;
        a<V> FH;
        final long j6;

        public a(long j, V v) {
            this.j6 = j;
            this.DW = v;
        }
    }

    public gd0() {
        this.FH = (int) (r0.length * 0.75f);
    }

    private void DW() {
        a<V>[] aVarArr = this.j6;
        this.j6 = j6(aVarArr.length << 1);
        this.FH = (int) (r2.length * 0.75f);
        for (a<V> aVar : aVarArr) {
            while (aVar != null) {
                a<V> aVar2 = aVar.FH;
                Hw(aVar);
                aVar = aVar2;
            }
        }
    }

    private final int FH(long j) {
        int i = ((int) j) >>> 1;
        return (i ^ ((i >>> 20) ^ (i >>> 12))) & (this.j6.length - 1);
    }

    private void Hw(a<V> aVar) {
        int iFH = FH(aVar.j6);
        a<V>[] aVarArr = this.j6;
        aVar.FH = aVarArr[iFH];
        aVarArr[iFH] = aVar;
    }

    private static final <V> a<V>[] j6(int i) {
        return new a[i];
    }

    public V Zo(long j) {
        a<V> aVar = null;
        for (a<V> aVar2 = this.j6[FH(j)]; aVar2 != null; aVar2 = aVar2.FH) {
            if (aVar2.j6 == j) {
                if (aVar == null) {
                    this.j6[FH(j)] = aVar2.FH;
                } else {
                    aVar.FH = aVar2.FH;
                }
                this.DW--;
                return aVar2.DW;
            }
            aVar = aVar2;
        }
        return null;
    }

    public V v5(long j, V v) {
        for (a<V> aVar = this.j6[FH(j)]; aVar != null; aVar = aVar.FH) {
            if (aVar.j6 == j) {
                V v2 = aVar.DW;
                aVar.DW = v;
                return v2;
            }
        }
        int i = this.DW + 1;
        this.DW = i;
        if (i == this.FH) {
            DW();
        }
        Hw(new a<>(j, v));
        return null;
    }
}
