package abcd;

/* loaded from: classes.dex */
public final class vh extends ws {
    public static final vh jw = new vh(0);

    public static class a {
        private final int DW;
        private final int j6;

        public a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("startPc < 0");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("lineNumber < 0");
            }
            this.j6 = i;
            this.DW = i2;
        }

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    public vh(int i) {
        super(i);
    }

    public static vh sG(vh vhVar, vh vhVar2) {
        if (vhVar == jw) {
            return vhVar2;
        }
        int size = vhVar.size();
        int size2 = vhVar2.size();
        vh vhVar3 = new vh(size + size2);
        for (int i = 0; i < size; i++) {
            vhVar3.g3(i, vhVar.ef(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            vhVar3.g3(size + i2, vhVar2.ef(i2));
        }
        return vhVar3;
    }

    public int Sf(int i) {
        int size = size();
        int i2 = -1;
        int iJ6 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            a aVarEf = ef(i3);
            int iDW = aVarEf.DW();
            if (iDW <= i && iDW > i2) {
                iJ6 = aVarEf.j6();
                if (iDW == i) {
                    break;
                }
                i2 = iDW;
            }
        }
        return iJ6;
    }

    public a ef(int i) {
        return (a) BT(i);
    }

    public void g3(int i, a aVar) {
        if (aVar == null) {
            throw new NullPointerException("item == null");
        }
        KD(i, aVar);
    }

    public void vJ(int i, int i2, int i3) {
        KD(i, new a(i2, i3));
    }
}
