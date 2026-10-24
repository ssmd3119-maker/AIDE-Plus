package abcd;

/* loaded from: classes.dex */
public final class nk extends ws {
    public static final nk jw = new nk(0);

    public static class a {
        private final wp DW;
        private final int j6;

        public a(int i, wp wpVar) {
            if (i < 0) {
                throw new IllegalArgumentException("address < 0");
            }
            if (wpVar == null) {
                throw new NullPointerException("position == null");
            }
            this.j6 = i;
            this.DW = wpVar;
        }

        public wp DW() {
            return this.DW;
        }

        public int j6() {
            return this.j6;
        }
    }

    public nk(int i) {
        super(i);
    }

    public static nk ef(ak akVar, int i) {
        if (i == 1) {
            return jw;
        }
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException("bogus howMuch");
        }
        wp wpVar = wp.Hw;
        int size = akVar.size();
        a[] aVarArr = new a[size];
        wp wpVar2 = wpVar;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            zj zjVarEf = akVar.ef(i3);
            if (zjVarEf instanceof wj) {
                z = true;
            } else {
                wp wpVarEQ = zjVarEf.EQ();
                if (!wpVarEQ.equals(wpVar) && !wpVarEQ.DW(wpVar2) && (i != 3 || z)) {
                    aVarArr[i2] = new a(zjVarEf.Zo(), wpVarEQ);
                    i2++;
                    wpVar2 = wpVarEQ;
                    z = false;
                }
            }
        }
        nk nkVar = new nk(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            nkVar.Sf(i4, aVarArr[i4]);
        }
        nkVar.Mr();
        return nkVar;
    }

    public void Sf(int i, a aVar) {
        KD(i, aVar);
    }

    public a sG(int i) {
        return (a) BT(i);
    }
}
