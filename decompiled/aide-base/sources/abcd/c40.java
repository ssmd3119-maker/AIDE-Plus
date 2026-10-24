package abcd;

/* loaded from: classes.dex */
public class c40 extends ef0 {
    private final int EQ;
    private final byte[] J0;
    protected int J8;
    protected b40 QX;
    private int Ws;
    protected d40 XL;
    private final d40 tp;
    protected final w30 u7;
    private final int we;

    public c40(w30 w30Var) {
        this.u7 = w30Var;
        d40 d40VarEQ = w30Var.EQ(true);
        this.tp = d40VarEQ;
        this.EQ = 0;
        this.we = d40VarEQ.Zo();
        this.J0 = new byte[20];
        if (VH()) {
            return;
        }
        P8();
    }

    private void P8() {
        b40 b40VarWe = this.u7.we(this.J8);
        this.QX = b40VarWe;
        byte[] bArr = b40VarWe.FH;
        if (this.Ws != this.tp.v5()) {
            d40 d40VarHw = this.tp.Hw(this.Ws);
            if (d40VarHw.FH(bArr, this.Zo, bArr.length)) {
                this.XL = d40VarHw;
                this.Ws++;
                if (d40VarHw.u7()) {
                    d40VarHw.VH().tp(this.J0, 0);
                }
                this.Hw = t60.Hw.Zo();
                this.v5 = bArr;
                this.VH = this.Zo + d40VarHw.tp();
                return;
            }
        }
        this.Hw = this.QX.EQ();
        this.v5 = bArr;
        this.VH = bArr.length;
        this.XL = null;
    }

    @Override // abcd.ef0
    public void DW(int i) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (this.XL != null) {
                this.Ws--;
            }
            this.J8--;
            P8();
            if (this.XL != null) {
                this.J8 -= r0.Zo() - 1;
            }
        }
    }

    @Override // abcd.ef0
    public gf0 FH() {
        byte[] bArr = new byte[Math.max(this.VH + 1, 128)];
        System.arraycopy(this.v5, 0, bArr, 0, this.VH);
        int i = this.VH;
        bArr[i] = 47;
        return new gf0(this, bArr, i + 1);
    }

    @Override // abcd.ef0
    public ef0 Hw(g70 g70Var) throws j40 {
        d40 d40Var = this.XL;
        if (d40Var != null) {
            return new c40(this, d40Var);
        }
        throw new j40(tp(), "tree");
    }

    @Override // abcd.ef0
    public void Mr(int i) {
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            d40 d40Var = this.XL;
            if (d40Var != null) {
                this.J8 += d40Var.Zo();
            } else {
                this.J8++;
            }
            if (VH()) {
                return;
            } else {
                P8();
            }
        }
    }

    @Override // abcd.ef0
    public byte[] QX() {
        d40 d40Var = this.XL;
        if (d40Var != null) {
            return d40Var.u7() ? this.J0 : ef0.gn;
        }
        b40 b40Var = this.QX;
        return b40Var != null ? b40Var.J0() : ef0.gn;
    }

    @Override // abcd.ef0
    public boolean VH() {
        return this.J8 == this.we;
    }

    @Override // abcd.ef0
    public boolean Ws() {
        d40 d40Var = this.XL;
        return d40Var != null ? d40Var.u7() : this.QX != null;
    }

    @Override // abcd.ef0
    public int aM() {
        b40 b40Var;
        if (this.XL == null && (b40Var = this.QX) != null) {
            return b40Var.J8();
        }
        return 0;
    }

    @Override // abcd.ef0
    public void er() {
        if (gn()) {
            return;
        }
        this.J8 = this.EQ;
        if (VH()) {
            return;
        }
        P8();
    }

    @Override // abcd.ef0
    public boolean gn() {
        return this.J8 == this.EQ;
    }

    public b40 vy() {
        if (this.XL == null) {
            return this.QX;
        }
        return null;
    }

    public c40(c40 c40Var, d40 d40Var) {
        super(c40Var, c40Var.v5, c40Var.VH + 1);
        this.u7 = c40Var.u7;
        this.tp = d40Var;
        int i = c40Var.J8;
        this.EQ = i;
        this.we = i + d40Var.Zo();
        this.J0 = c40Var.J0;
        this.J8 = c40Var.J8;
        P8();
    }
}
