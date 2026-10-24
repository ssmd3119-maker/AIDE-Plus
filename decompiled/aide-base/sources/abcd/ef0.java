package abcd;

/* loaded from: classes.dex */
public abstract class ef0 {
    protected static final byte[] gn = new byte[20];
    ef0 DW;
    int FH;
    protected int Hw;
    protected int VH;
    protected final int Zo;
    final ef0 j6;
    protected byte[] v5;

    public ef0() {
        this.j6 = null;
        this.v5 = new byte[128];
        this.Zo = 0;
    }

    private static int j3(int i) {
        return t60.Hw.Hw(i) ? 47 : 0;
    }

    private static int j6(ef0 ef0Var, ef0 ef0Var2) {
        while (true) {
            ef0 ef0Var3 = ef0Var.j6;
            ef0Var2 = ef0Var2.j6;
            if (ef0Var3 == null || ef0Var2 == null) {
                return 0;
            }
            if (ef0Var3.DW == ef0Var2.DW) {
                return ef0Var.Zo;
            }
            ef0Var = ef0Var3;
        }
    }

    private int rN(byte[] bArr, int i, int i2, int i3, int i4) {
        int iJ3;
        int iJ32;
        byte[] bArr2 = this.v5;
        int i5 = this.VH;
        while (i4 < i5 && i < i2) {
            int i6 = (bArr2[i4] & 255) - (bArr[i] & 255);
            if (i6 != 0) {
                return i6;
            }
            i4++;
            i++;
        }
        if (i4 < i5) {
            iJ3 = bArr2[i4] & 255;
            iJ32 = j3(i3);
        } else {
            if (i < i2) {
                return j3(this.Hw) - (bArr[i] & 255);
            }
            iJ3 = j3(this.Hw);
            iJ32 = j3(i3);
        }
        return iJ3 - iJ32;
    }

    private void yS(int i, int i2) {
        byte[] bArr = this.v5;
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (ef0 ef0Var = this; ef0Var != null && ef0Var.v5 == bArr; ef0Var = ef0Var.j6) {
            ef0Var.v5 = bArr2;
        }
    }

    public void BT() {
    }

    public abstract void DW(int i);

    public void EQ(w60 w60Var) {
        w60Var.sG(QX(), aM());
    }

    public gf0 FH() {
        return new gf0(this);
    }

    public abstract ef0 Hw(g70 g70Var);

    public int J0() {
        return this.Hw;
    }

    public void J8(int i) {
        yS(this.v5.length << 1, i);
    }

    public abstract void Mr(int i);

    public abstract byte[] QX();

    public int U2(ef0 ef0Var) {
        return a8(ef0Var, ef0Var.Hw);
    }

    public abstract boolean VH();

    public abstract boolean Ws();

    public boolean XL(ef0 ef0Var) {
        return a70.cb(QX(), aM(), ef0Var.QX(), ef0Var.aM());
    }

    public void Zo(int i, int i2) {
        byte[] bArr = this.v5;
        if (bArr.length >= i) {
            return;
        }
        int length = bArr.length;
        while (length < i && length > 0) {
            length <<= 1;
        }
        yS(length, i2);
    }

    public int a8(ef0 ef0Var, int i) {
        int iJ6 = j6(this, ef0Var);
        return rN(ef0Var.v5, iJ6, ef0Var.VH, i, iJ6);
    }

    public abstract int aM();

    public void er() {
        while (!gn()) {
            DW(1);
        }
    }

    public void gW() {
        Mr(1);
    }

    public abstract boolean gn();

    public int lg(byte[] bArr, int i, int i2, int i3) {
        return rN(bArr, i, i2, i3, 0);
    }

    public a70 tp() {
        return a70.ef(QX(), aM());
    }

    public t60 u7() {
        return t60.v5(this.Hw);
    }

    public ef0 v5(g70 g70Var, w60 w60Var) {
        return Hw(g70Var);
    }

    public String we() {
        return jf0.yS(this);
    }

    public ef0(byte[] bArr) {
        this.j6 = null;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            this.VH = length;
            byte[] bArr2 = new byte[Math.max(128, length + 1)];
            this.v5 = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, this.VH);
            byte[] bArr3 = this.v5;
            int i = this.VH;
            if (bArr3[i - 1] != 47) {
                this.VH = i + 1;
                bArr3[i] = 47;
            }
            this.Zo = this.VH;
            return;
        }
        this.v5 = new byte[128];
        this.Zo = 0;
    }

    public ef0(ef0 ef0Var) {
        this.j6 = ef0Var;
        byte[] bArr = ef0Var.v5;
        this.v5 = bArr;
        int i = ef0Var.VH + 1;
        this.Zo = i;
        try {
            bArr[i - 1] = 47;
        } catch (ArrayIndexOutOfBoundsException unused) {
            J8(ef0Var.VH);
            this.v5[this.Zo - 1] = 47;
        }
    }

    public ef0(ef0 ef0Var, byte[] bArr, int i) {
        this.j6 = ef0Var;
        this.v5 = bArr;
        this.Zo = i;
    }
}
