package abcd;

/* loaded from: classes.dex */
public final class bk {
    private final int DW;
    private final int FH;
    private final fk Hw;
    private final int j6;
    private final boolean v5;

    public bk(int i, int i2, int i3, fk fkVar, boolean z) {
        if (!jo.DW(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!jo.DW(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!jo.DW(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (fkVar == null) {
            throw new NullPointerException("format == null");
        }
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = fkVar;
        this.v5 = z;
    }

    public fk DW() {
        return this.Hw;
    }

    public String FH() {
        return io.DW(this.j6);
    }

    public int Hw() {
        return this.FH;
    }

    public boolean VH() {
        return this.v5;
    }

    public bk Zo() {
        switch (this.j6) {
            case 50:
                return ck.br;
            case 51:
                return ck.OW;
            case 52:
                return ck.kQ;
            case 53:
                return ck.XX;
            case 54:
                return ck.XG;
            case 55:
                return ck.yO;
            case 56:
                return ck.wc;
            case 57:
                return ck.jJ;
            case 58:
                return ck.CU;
            case 59:
                return ck.et;
            case 60:
                return ck.Eq;
            case 61:
                return ck.Xa;
            default:
                throw new IllegalArgumentException("bogus opcode: " + this);
        }
    }

    public int j6() {
        return this.DW;
    }

    public String toString() {
        return FH();
    }

    public int v5() {
        return this.j6;
    }
}
