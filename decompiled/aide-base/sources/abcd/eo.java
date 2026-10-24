package abcd;

/* loaded from: classes.dex */
public class eo {
    protected final rs j6;

    public eo(rs rsVar) {
        this.j6 = rsVar;
    }

    private int FH(rs rsVar, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i2 += (rsVar.readByte() & 255) << i3;
            i3 += 8;
        }
        return i2;
    }

    public final void DW() {
        int iDW = et.DW(this.j6);
        gn(iDW);
        for (int i = 0; i < iDW; i++) {
            Hw();
        }
    }

    public void EQ(int i) {
    }

    public final void Hw() {
        int i = this.j6.readByte() & 255;
        int i2 = i & 31;
        int i3 = (i & 224) >> 5;
        int i4 = i3 + 1;
        if (i2 == 0 || i2 == 6 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 16 || i2 == 17) {
            J8(i, i2, i3, i4);
        }
        switch (i2) {
            case 23:
                Ws(i2, FH(this.j6, i4));
                break;
            case 24:
                QX(i2, FH(this.j6, i4));
                break;
            case 25:
            case 27:
                we(i2, FH(this.j6, i4));
                break;
            case 26:
                J0(i2, FH(this.j6, i4));
                break;
            case 28:
                u7(i);
                DW();
                break;
            case 29:
                VH(i);
                j6();
                break;
            case 30:
                EQ(i);
                break;
            case 31:
                tp(i);
                break;
        }
    }

    public void J0(int i, int i2) {
    }

    public void J8(int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            this.j6.readByte();
        }
    }

    public void QX(int i, int i2) {
    }

    public void VH(int i) {
    }

    public void Ws(int i, int i2) {
    }

    public void Zo(int i) {
    }

    public void gn(int i) {
    }

    public final void j6() {
        int iDW = et.DW(this.j6);
        int iDW2 = et.DW(this.j6);
        v5(iDW, iDW2);
        for (int i = 0; i < iDW2; i++) {
            Zo(et.DW(this.j6));
            Hw();
        }
    }

    public void tp(int i) {
    }

    public void u7(int i) {
    }

    public void v5(int i, int i2) {
    }

    public void we(int i, int i2) {
    }

    public eo(dodo dodoVar) {
        this(dodoVar.j6());
    }
}
