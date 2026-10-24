package abcd;

/* loaded from: classes.dex */
public final class bo {
    private final int DW;
    private final int FH;
    private final int Hw;
    private final a[] VH;
    private final b[] Zo;
    private final int j6;
    private final short[] v5;

    public static class a {
        final int[] DW;
        final int[] FH;
        final int Hw;
        final int j6;

        public a(int i, int[] iArr, int[] iArr2, int i2) {
            this.j6 = i;
            this.DW = iArr;
            this.FH = iArr2;
            this.Hw = i2;
        }

        public int DW() {
            return this.Hw;
        }

        public int FH() {
            return this.j6;
        }

        public int[] Hw() {
            return this.DW;
        }

        public int[] j6() {
            return this.FH;
        }
    }

    public static class b {
        final int DW;
        final int FH;
        final int j6;

        public b(int i, int i2, int i3) {
            this.j6 = i;
            this.DW = i2;
            this.FH = i3;
        }

        public int DW() {
            return this.DW;
        }

        public int FH() {
            return this.j6;
        }

        public int j6() {
            return this.FH;
        }
    }

    public bo(int i, int i2, int i3, int i4, short[] sArr, b[] bVarArr, a[] aVarArr) {
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = i4;
        this.v5 = sArr;
        this.Zo = bVarArr;
        this.VH = aVarArr;
    }

    public int DW() {
        return this.Hw;
    }

    public int FH() {
        return this.DW;
    }

    public short[] Hw() {
        return this.v5;
    }

    public b[] VH() {
        return this.Zo;
    }

    public int Zo() {
        return this.j6;
    }

    public a[] j6() {
        return this.VH;
    }

    public int v5() {
        return this.FH;
    }
}
