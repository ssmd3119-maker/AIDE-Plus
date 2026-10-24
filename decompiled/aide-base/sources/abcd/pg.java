package abcd;

/* loaded from: classes.dex */
public final class pg extends gh {
    private final int DW;
    private final int FH;
    private final rh Hw;
    private final ui Zo;
    private final ph v5;

    public pg(int i, int i2, rh rhVar, ph phVar, ui uiVar) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        if (rhVar == null) {
            throw new NullPointerException("code == null");
        }
        try {
            if (phVar.FH()) {
                throw new ht("catches.isMutable()");
            }
            try {
                if (uiVar.FH()) {
                    throw new ht("attributes.isMutable()");
                }
                this.DW = i;
                this.FH = i2;
                this.Hw = rhVar;
                this.v5 = phVar;
                this.Zo = uiVar;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // abcd.ti
    public int DW() {
        return this.Hw.j6() + 10 + this.v5.DW() + this.Zo.DW();
    }

    public ph FH() {
        return this.v5;
    }

    public rh Hw() {
        return this.Hw;
    }

    public int Zo() {
        return this.DW;
    }

    public ui j6() {
        return this.Zo;
    }

    public int v5() {
        return this.FH;
    }
}
