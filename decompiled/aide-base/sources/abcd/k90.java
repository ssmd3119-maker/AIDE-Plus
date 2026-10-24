package abcd;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class k90 extends o90 {
    static final k90[] Jl = new k90[0];
    int Q6;
    k90[] Z1;
    private byte[] kf;
    int n5;
    private s90 q7;

    public k90(j60 j60Var) {
        super(j60Var);
    }

    public static void XX(k90 k90Var, int i) {
        int length;
        while (true) {
            k90[] k90VarArr = k90Var.Z1;
            if (k90VarArr == null || (length = k90VarArr.length) == 0) {
                return;
            }
            for (int i2 = 1; i2 < length; i2++) {
                k90 k90Var2 = k90VarArr[i2];
                int i3 = k90Var2.cT;
                if ((i3 & i) != i) {
                    k90Var2.cT = i3 | i;
                    XX(k90Var2, i);
                }
            }
            k90Var = k90VarArr[0];
            int i4 = k90Var.cT;
            if ((i4 & i) == i) {
                return;
            } else {
                k90Var.cT = i4 | i;
            }
        }
    }

    public static boolean hz(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            if (bArr[i] == 10) {
                return true;
            }
            i = i3;
        }
        return false;
    }

    public final k90[] CU() {
        return this.Z1;
    }

    public final s90 Eq() {
        return this.q7;
    }

    public void FN(t90 t90Var, byte[] bArr) {
        int i;
        w60 w60Var = t90Var.jw;
        w60Var.Sf(bArr, 5);
        this.q7 = t90Var.dx(w60Var);
        int i2 = 46;
        if (this.Z1 == null) {
            k90[] k90VarArr = new k90[1];
            int i3 = 0;
            while (bArr[i2] == 112) {
                w60Var.Sf(bArr, i2 + 7);
                k90 k90VarRo = t90Var.ro(w60Var);
                if (i3 == 0) {
                    i = i3 + 1;
                    k90VarArr[i3] = k90VarRo;
                } else if (i3 == 1) {
                    k90VarArr = new k90[]{k90VarArr[0], k90VarRo};
                    i3 = 2;
                    i2 += 48;
                } else {
                    if (k90VarArr.length <= i3) {
                        k90[] k90VarArr2 = new k90[k90VarArr.length + 32];
                        System.arraycopy(k90VarArr, 0, k90VarArr2, 0, i3);
                        k90VarArr = k90VarArr2;
                    }
                    i = i3 + 1;
                    k90VarArr[i3] = k90VarRo;
                }
                i3 = i;
                i2 += 48;
            }
            if (i3 != k90VarArr.length) {
                k90[] k90VarArr3 = new k90[i3];
                System.arraycopy(k90VarArr, 0, k90VarArr3, 0, i3);
                k90VarArr = k90VarArr3;
            }
            this.Z1 = k90VarArr;
        }
        int iHw = kg0.Hw(bArr, i2);
        if (iHw > 0) {
            this.n5 = kg0.Mr(bArr, kg0.j3(bArr, iHw, '>'), null);
        }
        if (t90Var.nw()) {
            this.kf = bArr;
        }
        this.cT |= 1;
    }

    @Override // abcd.o90
    public void OW(t90 t90Var) {
        FN(t90Var, t90Var.Mr(this));
    }

    public final int XG() {
        return this.n5;
    }

    public final String Xa() {
        byte[] bArr = this.kf;
        int iFH = kg0.FH(bArr, 0);
        if (iFH < 0) {
            return "";
        }
        Charset charsetU2 = kg0.U2(bArr);
        int iEQ = kg0.EQ(bArr, iFH);
        String strZo = kg0.Zo(charsetU2, bArr, iFH, iEQ);
        return hz(bArr, iFH, iEQ) ? strZo.replace('\n', ' ') : strZo;
    }

    @Override // abcd.o90
    public final int aj() {
        return 1;
    }

    public void aq(t90 t90Var) {
        if (this.kf == null) {
            byte[] bArrMr = t90Var.Mr(this);
            this.kf = bArrMr;
            if ((this.cT & 1) == 0) {
                FN(t90Var, bArrMr);
            }
        }
    }

    public void br(m90 m90Var) {
        int i = m90Var.FH & this.cT;
        if (i != 0) {
            XX(this, i);
        }
    }

    public final int et() {
        return this.Z1.length;
    }

    public final String jJ() {
        byte[] bArr = this.kf;
        int iFH = kg0.FH(bArr, 0);
        return iFH < 0 ? "" : kg0.Zo(kg0.U2(bArr), bArr, iFH, bArr.length);
    }

    public void jO() {
        this.Q6 = 0;
    }

    public final void kQ() {
        this.kf = null;
    }

    @Override // abcd.o90, abcd.j60
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r60.VH(aj()));
        sb.append(' ');
        sb.append(BT());
        sb.append(' ');
        sb.append(this.n5);
        sb.append(' ');
        Qq(sb);
        return sb.toString();
    }

    public final k90 wc(int i) {
        return this.Z1[i];
    }

    public final i70 yO() {
        byte[] bArr = this.kf;
        int iJ6 = kg0.j6(bArr, 0);
        if (iJ6 < 0) {
            return null;
        }
        return kg0.yS(bArr, iJ6);
    }
}
