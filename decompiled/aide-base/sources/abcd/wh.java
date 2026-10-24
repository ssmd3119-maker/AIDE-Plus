package abcd;

/* loaded from: classes.dex */
public final class wh extends ws {
    public static final wh jw = new wh(0);

    public static class a {
        private final int DW;
        private final yq FH;
        private final yq Hw;
        private final int Zo;
        private final int j6;
        private final yq v5;

        public a(int i, int i2, yq yqVar, yq yqVar2, yq yqVar3, int i3) {
            if (i < 0) {
                throw new IllegalArgumentException("startPc < 0");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("length < 0");
            }
            if (yqVar == null) {
                throw new NullPointerException("name == null");
            }
            if (yqVar2 == null && yqVar3 == null) {
                throw new NullPointerException("(descriptor == null) && (signature == null)");
            }
            if (i3 < 0) {
                throw new IllegalArgumentException("index < 0");
            }
            this.j6 = i;
            this.DW = i2;
            this.FH = yqVar;
            this.Hw = yqVar2;
            this.v5 = yqVar3;
            this.Zo = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public yq FH() {
            return this.v5;
        }

        public kp DW() {
            return kp.Zo(this.FH, this.v5);
        }

        public fr Hw() {
            return fr.a8(this.Hw.J0());
        }

        public a VH(yq yqVar) {
            return new a(this.j6, this.DW, this.FH, this.Hw, yqVar, this.Zo);
        }

        public boolean Zo(int i, int i2) {
            int i3;
            return i2 == this.Zo && i >= (i3 = this.j6) && i < i3 + this.DW;
        }

        public boolean v5(a aVar) {
            return this.j6 == aVar.j6 && this.DW == aVar.DW && this.Zo == aVar.Zo && this.FH.equals(aVar.FH);
        }
    }

    public wh(int i) {
        super(i);
    }

    public static wh sG(wh whVar, wh whVar2) {
        if (whVar == jw) {
            return whVar2;
        }
        int size = whVar.size();
        int size2 = whVar2.size();
        wh whVar3 = new wh(size + size2);
        for (int i = 0; i < size; i++) {
            whVar3.I(i, whVar.ef(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            whVar3.I(size + i2, whVar2.ef(i2));
        }
        whVar3.Mr();
        return whVar3;
    }

    public static wh vJ(wh whVar, wh whVar2) {
        int size = whVar.size();
        wh whVar3 = new wh(size);
        for (int i = 0; i < size; i++) {
            a aVarEf = whVar.ef(i);
            a aVarSf = whVar2.Sf(aVarEf);
            if (aVarSf != null) {
                aVarEf = aVarEf.VH(aVarSf.FH());
            }
            whVar3.I(i, aVarEf);
        }
        whVar3.Mr();
        return whVar3;
    }

    public void I(int i, a aVar) {
        if (aVar == null) {
            throw new NullPointerException("item == null");
        }
        KD(i, aVar);
    }

    public void Mz(int i, int i2, int i3, yq yqVar, yq yqVar2, yq yqVar3, int i4) {
        KD(i, new a(i2, i3, yqVar, yqVar2, yqVar3, i4));
    }

    public a Sf(a aVar) {
        int size = size();
        for (int i = 0; i < size; i++) {
            a aVar2 = (a) BT(i);
            if (aVar2 != null && aVar2.v5(aVar)) {
                return aVar2;
            }
        }
        return null;
    }

    public a ef(int i) {
        return (a) BT(i);
    }

    public a g3(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) BT(i3);
            if (aVar != null && aVar.Zo(i, i2)) {
                return aVar;
            }
        }
        return null;
    }
}
