package abcd;

@Deprecated
/* loaded from: classes.dex */
public class zx {
    public int DW;
    wx EQ;
    public int FH;
    public long Hw;
    qx J0;
    public int VH;
    public int Zo;
    public long gn;
    public byte[] j6;
    rx tp;
    public String u7;
    public byte[] v5;
    int we;

    public zx() {
        this(new ox());
    }

    public int DW(int i) {
        return FH(i, 15);
    }

    public int FH(int i, int i2) {
        return Hw(i, i2, false);
    }

    public int Hw(int i, int i2, boolean z) {
        rx rxVar = new rx(this);
        this.tp = rxVar;
        if (z) {
            i2 = -i2;
        }
        return rxVar.J0(i, i2);
    }

    public int VH() {
        return gn(15);
    }

    public int Zo(int i) {
        wx wxVar = this.EQ;
        if (wxVar == null) {
            return -2;
        }
        return wxVar.DW(i);
    }

    public int gn(int i) {
        return u7(i, false);
    }

    public int j6(int i) {
        rx rxVar = this.tp;
        if (rxVar == null) {
            return -2;
        }
        return rxVar.we(i);
    }

    public int tp(byte[] bArr, int i, int i2) {
        int i3 = this.FH;
        if (i3 <= i2) {
            i2 = i3;
        }
        if (i2 == 0) {
            return 0;
        }
        this.FH -= i2;
        if (this.tp.zh != 0) {
            this.J0.j6(this.j6, this.DW, i2);
        }
        System.arraycopy(this.j6, this.DW, bArr, i, i2);
        this.DW += i2;
        this.Hw += i2;
        return i2;
    }

    public int u7(int i, boolean z) {
        wx wxVar = new wx(this);
        this.EQ = wxVar;
        if (z) {
            i = -i;
        }
        return wxVar.Hw(i);
    }

    public void v5() {
        int i = this.tp.k2;
        int i2 = this.VH;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        rx rxVar = this.tp;
        byte[] bArr = rxVar.jw;
        int length = bArr.length;
        int i3 = rxVar.qp;
        if (length > i3) {
            byte[] bArr2 = this.v5;
            if (bArr2.length > this.Zo && bArr.length >= i3 + i) {
                int length2 = bArr2.length;
            }
        }
        rx rxVar2 = this.tp;
        System.arraycopy(rxVar2.jw, rxVar2.qp, this.v5, this.Zo, i);
        this.Zo += i;
        rx rxVar3 = this.tp;
        rxVar3.qp += i;
        this.gn += i;
        this.VH -= i;
        int i4 = rxVar3.k2 - i;
        rxVar3.k2 = i4;
        if (i4 == 0) {
            rxVar3.qp = 0;
        }
    }

    public zx(qx qxVar) {
        this.J0 = qxVar;
    }
}
