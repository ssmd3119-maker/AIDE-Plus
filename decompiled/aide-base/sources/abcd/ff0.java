package abcd;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ff0 extends ef0 {
    private static final byte[] J0 = new byte[0];
    private int EQ;
    private int tp;
    private byte[] u7;
    private int we;

    public ff0() {
        ro(J0);
    }

    private void SI() {
        int i;
        int i2 = this.EQ;
        int i3 = i2 + 1;
        int i4 = this.u7[i2] - 48;
        while (true) {
            i = i3 + 1;
            byte b = this.u7[i3];
            if (32 == b) {
                break;
            }
            i4 = (i4 << 3) + (b - 48);
            i3 = i;
        }
        this.Hw = i4;
        int i5 = this.Zo;
        while (true) {
            int i6 = i + 1;
            byte b2 = this.u7[i];
            if (b2 == 0) {
                this.VH = i5;
                this.we = i6 + 20;
                return;
            } else {
                try {
                    this.v5[i5] = b2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    J8(i5);
                    this.v5[i5] = b2;
                }
                i5++;
                i = i6;
            }
        }
    }

    @Override // abcd.ef0
    public void DW(int i) {
        int i2;
        if (i == 1 && (i2 = this.tp) >= 0) {
            this.EQ = i2;
            this.tp = -1;
            if (VH()) {
                return;
            }
            SI();
            return;
        }
        if (i <= 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        int[] iArr = new int[i + 1];
        Arrays.fill(iArr, -1);
        int i3 = 0;
        while (i3 != this.EQ) {
            System.arraycopy(iArr, 1, iArr, 0, i);
            iArr[i] = i3;
            while (this.u7[i3] != 0) {
                i3++;
            }
            i3 += 21;
        }
        if (iArr[1] == -1) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        this.tp = iArr[0];
        this.EQ = iArr[1];
        SI();
    }

    public void KD(g70 g70Var, j60 j60Var) {
        ro(g70Var.QX(j60Var, 2).Hw());
    }

    @Override // abcd.ef0
    public void Mr(int i) {
        if (i == 1) {
            this.tp = this.EQ;
            this.EQ = this.we;
            if (VH()) {
                return;
            }
            SI();
            return;
        }
        int length = this.u7.length;
        int i2 = this.we;
        while (true) {
            i--;
            if (i <= 0 || i2 == length) {
                break;
            }
            this.tp = i2;
            while (this.u7[i2] != 0) {
                i2++;
            }
            i2 += 21;
        }
        if (i != 0) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        this.EQ = i2;
        if (VH()) {
            return;
        }
        SI();
    }

    @Override // abcd.ef0
    /* renamed from: P8, reason: merged with bridge method [inline-methods] */
    public ff0 v5(g70 g70Var, w60 w60Var) throws j40 {
        w60Var.sG(QX(), aM());
        if (t60.Hw.Hw(this.Hw)) {
            return ei(g70Var, w60Var);
        }
        throw new j40(w60Var.cn(), "tree");
    }

    @Override // abcd.ef0
    public byte[] QX() {
        return this.u7;
    }

    @Override // abcd.ef0
    public boolean VH() {
        return this.EQ == this.u7.length;
    }

    @Override // abcd.ef0
    public boolean Ws() {
        return true;
    }

    @Override // abcd.ef0
    public int aM() {
        return this.we - 20;
    }

    public final ff0 ei(g70 g70Var, j60 j60Var) {
        ff0 ff0Var = new ff0(this);
        ff0Var.KD(g70Var, j60Var);
        return ff0Var;
    }

    @Override // abcd.ef0
    public void er() {
        if (gn()) {
            return;
        }
        ro(this.u7);
    }

    @Override // abcd.ef0
    public boolean gn() {
        return this.EQ == 0;
    }

    public ff0 nw() {
        ff0 ff0Var = this;
        while (true) {
            int i = ff0Var.we;
            if (i != ff0Var.u7.length) {
                ff0Var.tp = ff0Var.EQ;
                ff0Var.EQ = i;
                ff0Var.SI();
                return ff0Var;
            }
            ef0 ef0Var = ff0Var.j6;
            if (ef0Var == null) {
                ff0Var.EQ = i;
                return ff0Var;
            }
            ff0Var = (ff0) ef0Var;
        }
    }

    public void ro(byte[] bArr) {
        this.u7 = bArr;
        this.tp = -1;
        this.EQ = 0;
        if (VH()) {
            this.we = 0;
        } else {
            SI();
        }
    }

    @Override // abcd.ef0
    /* renamed from: vy, reason: merged with bridge method [inline-methods] */
    public ff0 Hw(g70 g70Var) {
        return v5(g70Var, new w60());
    }

    public ff0(byte[] bArr, g70 g70Var, j60 j60Var) {
        super(bArr);
        KD(g70Var, j60Var);
    }

    private ff0(ff0 ff0Var) {
        super(ff0Var);
    }
}
