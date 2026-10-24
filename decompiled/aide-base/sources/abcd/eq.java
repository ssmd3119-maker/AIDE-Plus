package abcd;

/* loaded from: classes.dex */
public final class eq extends bq {
    private final a WB;

    public static final class a extends ws implements Comparable<a> {
        public a(int i) {
            super(i);
        }

        public void ef(int i, bq bqVar) {
            KD(i, bqVar);
        }

        public bq get(int i) {
            return (bq) BT(i);
        }

        @Override // java.lang.Comparable
        /* renamed from: sG, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int size = size();
            int size2 = aVar.size();
            int i = size < size2 ? size : size2;
            for (int i2 = 0; i2 < i; i2++) {
                int iCompareTo = ((bq) BT(i2)).compareTo((bq) aVar.BT(i2));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (size < size2) {
                return -1;
            }
            return size > size2 ? 1 : 0;
        }
    }

    public eq(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("list == null");
        }
        aVar.yS();
        this.WB = aVar;
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        return this.WB.compareTo(((eq) bqVar).WB);
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB.sh("{", ", ", "}");
    }

    public boolean equals(Object obj) {
        if (obj instanceof eq) {
            return this.WB.equals(((eq) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    public String toString() {
        return this.WB.cb("array{", ", ", "}");
    }

    @Override // abcd.bq
    public String tp() {
        return "array";
    }

    @Override // abcd.bq
    public boolean v5() {
        return false;
    }

    public a we() {
        return this.WB;
    }
}
