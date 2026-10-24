package abcd;

/* loaded from: classes.dex */
public final class ph extends ws {
    public static final ph jw = new ph(0);

    public static class a {
        private final int DW;
        private final int FH;
        private final zq Hw;
        private final int j6;

        public a(int i, int i2, int i3, zq zqVar) {
            if (i < 0) {
                throw new IllegalArgumentException("startPc < 0");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("endPc < startPc");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("handlerPc < 0");
            }
            this.j6 = i;
            this.DW = i2;
            this.FH = i3;
            this.Hw = zqVar;
        }

        public int DW() {
            return this.DW;
        }

        public zq FH() {
            zq zqVar = this.Hw;
            return zqVar != null ? zqVar : zq.fY;
        }

        public int Hw() {
            return this.FH;
        }

        public boolean j6(int i) {
            return i >= this.j6 && i < this.DW;
        }

        public int v5() {
            return this.j6;
        }
    }

    public ph(int i) {
        super(i);
    }

    private static boolean I(a aVar, a[] aVarArr, int i) {
        zq zqVarFH = aVar.FH();
        for (int i2 = 0; i2 < i; i2++) {
            zq zqVarFH2 = aVarArr[i2].FH();
            if (zqVarFH2 == zqVarFH || zqVarFH2 == zq.fY) {
                return false;
            }
        }
        return true;
    }

    public int DW() {
        return (size() * 8) + 2;
    }

    public at Mz(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i2 = i >= 0 ? 1 : 0;
        int size = size();
        if (size == 0) {
            return i2 != 0 ? at.dx(i) : at.qp;
        }
        at atVar = new at(size + i2);
        for (int i3 = 0; i3 < size; i3++) {
            atVar.BT(sG(i3).Hw());
        }
        if (i2 != 0) {
            atVar.BT(i);
        }
        atVar.Mr();
        return atVar;
    }

    public void Sf(int i, int i2, int i3, int i4, zq zqVar) {
        KD(i, new a(i2, i3, i4, zqVar));
    }

    public ph ef(int i) {
        int size = size();
        a[] aVarArr = new a[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            a aVarSG = sG(i3);
            if (aVarSG.j6(i) && I(aVarSG, aVarArr, i2)) {
                aVarArr[i2] = aVarSG;
                i2++;
            }
        }
        if (i2 == 0) {
            return jw;
        }
        ph phVar = new ph(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            phVar.vJ(i4, aVarArr[i4]);
        }
        phVar.Mr();
        return phVar;
    }

    public hr g3() {
        int size = size();
        if (size == 0) {
            return er.jw;
        }
        er erVar = new er(size);
        for (int i = 0; i < size; i++) {
            erVar.Qq(i, sG(i).FH().J0());
        }
        erVar.Mr();
        return erVar;
    }

    public a sG(int i) {
        return (a) BT(i);
    }

    public void vJ(int i, a aVar) {
        if (aVar == null) {
            throw new NullPointerException("item == null");
        }
        KD(i, aVar);
    }
}
