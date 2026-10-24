package abcd;

/* loaded from: classes.dex */
public final class uj extends ws implements Comparable<uj> {
    public static final uj jw = new uj(0);

    public static class a implements Comparable<a> {
        private final zq WB;
        private final int mb;

        public a(zq zqVar, int i) {
            if (i < 0) {
                throw new IllegalArgumentException("handler < 0");
            }
            if (zqVar == null) {
                throw new NullPointerException("exceptionType == null");
            }
            this.mb = i;
            this.WB = zqVar;
        }

        public zq DW() {
            return this.WB;
        }

        public int FH() {
            return this.mb;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && compareTo((a) obj) == 0;
        }

        public int hashCode() {
            return (this.mb * 31) + this.WB.hashCode();
        }

        @Override // java.lang.Comparable
        /* renamed from: j6, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int i = this.mb;
            int i2 = aVar.mb;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return this.WB.compareTo(aVar.WB);
        }
    }

    public uj(int i) {
        super(i);
    }

    public a Sf(int i) {
        return (a) BT(i);
    }

    @Override // abcd.ws, abcd.kt
    public String Zo() {
        return g3("", "");
    }

    @Override // java.lang.Comparable
    /* renamed from: ef, reason: merged with bridge method [inline-methods] */
    public int compareTo(uj ujVar) {
        if (this == ujVar) {
            return 0;
        }
        int size = size();
        int size2 = ujVar.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = Sf(i).compareTo(ujVar.Sf(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public String g3(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            a aVarSf = Sf(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i == size - 1 && sG()) {
                sb.append("<any>");
            } else {
                sb.append(aVarSf.DW().Zo());
            }
            sb.append(" -> ");
            sb.append(xs.gn(aVarSf.FH()));
        }
        return sb.toString();
    }

    public boolean sG() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return Sf(size - 1).DW().equals(zq.fY);
    }

    public void vJ(int i, zq zqVar, int i2) {
        KD(i, new a(zqVar, i2));
    }
}
