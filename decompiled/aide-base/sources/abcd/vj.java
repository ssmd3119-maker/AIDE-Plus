package abcd;

/* loaded from: classes.dex */
public final class vj extends ws implements Comparable<vj> {
    public static final vj jw = new vj(0);

    public static class a implements Comparable<a> {
        private final int WB;
        private final uj jw;
        private final int mb;

        public a(int i, int i2, uj ujVar) {
            if (i < 0) {
                throw new IllegalArgumentException("start < 0");
            }
            if (i2 <= i) {
                throw new IllegalArgumentException("end <= start");
            }
            if (ujVar.FH()) {
                throw new IllegalArgumentException("handlers.isMutable()");
            }
            this.WB = i;
            this.mb = i2;
            this.jw = ujVar;
        }

        public int DW() {
            return this.mb;
        }

        public uj FH() {
            return this.jw;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && compareTo((a) obj) == 0;
        }

        public int hashCode() {
            return (((this.WB * 31) + this.mb) * 31) + this.jw.hashCode();
        }

        @Override // java.lang.Comparable
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i = this.WB;
            int i2 = aVar.WB;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = this.mb;
            int i4 = aVar.mb;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4) {
                return 1;
            }
            return this.jw.compareTo(aVar.jw);
        }

        public int v5() {
            return this.WB;
        }
    }

    public vj(int i) {
        super(i);
    }

    public void Sf(int i, a aVar) {
        KD(i, aVar);
    }

    public a ef(int i) {
        return (a) BT(i);
    }

    @Override // java.lang.Comparable
    /* renamed from: sG, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj vjVar) {
        if (this == vjVar) {
            return 0;
        }
        int size = size();
        int size2 = vjVar.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ef(i).compareTo(vjVar.ef(i));
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
