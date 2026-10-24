package abcd;

/* loaded from: classes.dex */
public final class jh extends ws {

    public static class a {
        private final zq DW;
        private final yq FH;
        private final int Hw;
        private final zq j6;

        public a(zq zqVar, zq zqVar2, yq yqVar, int i) {
            if (zqVar == null) {
                throw new NullPointerException("innerClass == null");
            }
            this.j6 = zqVar;
            this.DW = zqVar2;
            this.FH = yqVar;
            this.Hw = i;
        }

        public zq DW() {
            return this.j6;
        }

        public yq FH() {
            return this.FH;
        }

        public zq Hw() {
            return this.DW;
        }

        public int j6() {
            return this.Hw;
        }
    }

    public jh(int i) {
        super(i);
    }

    public void ef(int i, zq zqVar, zq zqVar2, yq yqVar, int i2) {
        KD(i, new a(zqVar, zqVar2, yqVar, i2));
    }

    public a sG(int i) {
        return (a) BT(i);
    }
}
