package abcd;

/* loaded from: classes.dex */
public class jf0 {
    private static final ef0[] tp = new ef0[0];
    private final w60 DW;
    private sf0 FH;
    ef0[] Hw;
    private int VH;
    private boolean Zo;
    private boolean gn;
    private final g70 j6;
    ef0 u7;
    private boolean v5;

    public jf0(p70 p70Var) {
        this(p70Var.yS());
    }

    private void Hw() {
        ef0[] ef0VarArr;
        this.VH--;
        int i = 0;
        while (true) {
            ef0VarArr = this.Hw;
            if (i >= ef0VarArr.length) {
                break;
            }
            ef0VarArr[i] = ef0VarArr[i].j6;
            i++;
        }
        ef0 ef0Var = null;
        for (ef0 ef0Var2 : ef0VarArr) {
            if (ef0Var2.DW == ef0Var2 && (ef0Var == null || ef0Var2.U2(ef0Var) < 0)) {
                ef0Var = ef0Var2;
            }
        }
        this.u7 = ef0Var;
    }

    public static jf0 VH(p70 p70Var, String str, j60... j60VarArr) {
        g70 g70VarYS = p70Var.yS();
        try {
            return v5(g70VarYS, str, j60VarArr);
        } finally {
            g70VarYS.XL();
        }
    }

    public static jf0 Zo(p70 p70Var, String str, s90 s90Var) {
        return VH(p70Var, str, s90Var);
    }

    private ff0 er(j60 j60Var) {
        ff0 ff0Var = new ff0();
        ff0Var.KD(this.j6, j60Var);
        return ff0Var;
    }

    public static String gW(byte[] bArr, int i, int i2) {
        return kg0.Zo(r60.Zo, bArr, i, i2);
    }

    public static jf0 v5(g70 g70Var, String str, j60... j60VarArr) {
        jf0 jf0Var = new jf0(g70Var);
        pf0 pf0VarV5 = pf0.v5(str);
        jf0Var.SI(pf0VarV5);
        jf0Var.nw(j60VarArr);
        jf0Var.KD(false);
        while (jf0Var.rN()) {
            if (pf0VarV5.VH(jf0Var)) {
                return jf0Var;
            }
            if (jf0Var.a8()) {
                jf0Var.FH();
            }
        }
        return null;
    }

    public static String yS(ef0 ef0Var) {
        return kg0.Zo(r60.Zo, ef0Var.v5, 0, ef0Var.VH);
    }

    public void BT() {
        ef0 ef0Var = this.u7;
        int i = 0;
        while (true) {
            ef0[] ef0VarArr = this.Hw;
            if (i >= ef0VarArr.length) {
                return;
            }
            ef0 ef0Var2 = ef0VarArr[i];
            if (ef0Var2.DW == ef0Var) {
                ef0Var2.Mr(1);
                ef0Var2.DW = null;
            }
            i++;
        }
    }

    public int DW(ef0 ef0Var) {
        ef0[] ef0VarArr = this.Hw;
        int length = ef0VarArr.length;
        ef0[] ef0VarArr2 = new ef0[length + 1];
        System.arraycopy(ef0VarArr, 0, ef0VarArr2, 0, length);
        ef0VarArr2[length] = ef0Var;
        ef0Var.DW = null;
        ef0Var.FH = 0;
        this.Hw = ef0VarArr2;
        return length;
    }

    public void EQ(w60 w60Var, int i) {
        ef0 ef0Var = this.Hw[i];
        if (ef0Var.DW == this.u7) {
            ef0Var.EQ(w60Var);
        } else {
            w60Var.cb();
        }
    }

    public void FH() {
        ef0 ef0Var = this.u7;
        ef0[] ef0VarArr = new ef0[this.Hw.length];
        int i = 0;
        while (true) {
            ef0[] ef0VarArr2 = this.Hw;
            if (i >= ef0VarArr2.length) {
                this.VH++;
                this.gn = false;
                System.arraycopy(ef0VarArr, 0, ef0VarArr2, 0, ef0VarArr2.length);
                return;
            } else {
                ef0 ef0Var2 = ef0VarArr2[i];
                ef0VarArr[i] = (ef0Var2.DW == ef0Var && !ef0Var2.VH() && t60.Hw.Hw(ef0Var2.Hw)) ? ef0Var2.v5(this.j6, this.DW) : ef0Var2.FH();
                i++;
            }
        }
    }

    public String J0() {
        return yS(this.u7);
    }

    public int J8(int i) {
        ef0 ef0Var = this.Hw[i];
        if (ef0Var.DW == this.u7) {
            return ef0Var.Hw;
        }
        return 0;
    }

    public void KD(boolean z) {
        this.v5 = z;
    }

    public boolean Mr() {
        return this.Zo;
    }

    public void P8() {
        this.Hw = tp;
        this.gn = false;
        this.VH = 0;
    }

    public <T extends ef0> T QX(int i, Class<T> cls) {
        T t = (T) this.Hw[i];
        if (t.DW == this.u7) {
            return t;
        }
        return null;
    }

    public void SI(sf0 sf0Var) {
        if (sf0Var == null) {
            sf0Var = sf0.j6;
        }
        this.FH = sf0Var;
    }

    public boolean U2() {
        return this.v5;
    }

    public byte[] Ws() {
        ef0 ef0Var = this.u7;
        int i = ef0Var.VH;
        byte[] bArr = new byte[i];
        System.arraycopy(ef0Var.v5, 0, bArr, 0, i);
        return bArr;
    }

    public int XL() {
        return this.Hw.length;
    }

    public boolean a8() {
        return t60.Hw.Hw(this.u7.Hw);
    }

    public boolean aM(int i, int i2) {
        ef0 ef0Var = this.u7;
        ef0[] ef0VarArr = this.Hw;
        ef0 ef0Var2 = ef0VarArr[i];
        ef0 ef0Var3 = ef0VarArr[i2];
        if (ef0Var2.DW != ef0Var && ef0Var3.DW != ef0Var) {
            return true;
        }
        if (ef0Var2.Ws() && ef0Var3.Ws() && ef0Var2.DW == ef0Var && ef0Var3.DW == ef0Var) {
            return ef0Var2.XL(ef0Var3);
        }
        return false;
    }

    public void ei(j60 j60Var) {
        ef0[] ef0VarArr = this.Hw;
        if (ef0VarArr.length == 1) {
            ef0 ef0Var = ef0VarArr[0];
            while (true) {
                ef0 ef0Var2 = ef0Var.j6;
                if (ef0Var2 == null) {
                    break;
                } else {
                    ef0Var = ef0Var2;
                }
            }
            if (ef0Var instanceof ff0) {
                ef0Var.DW = null;
                ef0Var.FH = 0;
                ((ff0) ef0Var).KD(this.j6, j60Var);
                this.Hw[0] = ef0Var;
            } else {
                this.Hw[0] = er(j60Var);
            }
        } else {
            this.Hw = new ef0[]{er(j60Var)};
        }
        this.gn = false;
        this.VH = 0;
    }

    public t60 gn(int i) {
        return t60.v5(J8(i));
    }

    public int j3(byte[] bArr, int i) {
        ef0 ef0Var = this.u7;
        byte[] bArr2 = ef0Var.v5;
        int i2 = ef0Var.VH;
        int i3 = 0;
        while (i3 < i2 && i3 < i) {
            int i4 = (bArr2[i3] & 255) - (bArr[i3] & 255);
            if (i4 != 0) {
                return i4;
            }
            i3++;
        }
        return i3 < i2 ? bArr2[i3] == 47 ? 0 : -1 : (i3 >= i || bArr[i3] == 47) ? 0 : -1;
    }

    public int j6(j60 j60Var) {
        return DW(er(j60Var));
    }

    public ef0 lg() {
        int i = 0;
        ef0 ef0Var = this.Hw[0];
        while (ef0Var.VH()) {
            i++;
            ef0[] ef0VarArr = this.Hw;
            if (i >= ef0VarArr.length) {
                break;
            }
            ef0Var = ef0VarArr[i];
        }
        if (ef0Var.VH()) {
            return ef0Var;
        }
        ef0Var.DW = ef0Var;
        while (true) {
            i++;
            ef0[] ef0VarArr2 = this.Hw;
            if (i >= ef0VarArr2.length) {
                return ef0Var;
            }
            ef0 ef0Var2 = ef0VarArr2[i];
            if (!ef0Var2.VH()) {
                int iU2 = ef0Var2.U2(ef0Var);
                if (iU2 < 0) {
                    ef0Var2.DW = ef0Var2;
                    ef0Var = ef0Var2;
                } else if (iU2 == 0) {
                    ef0Var2.DW = ef0Var;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void nw(abcd.j60... r10) {
        /*
            r9 = this;
            abcd.ef0[] r0 = r9.Hw
            int r1 = r0.length
            int r2 = r10.length
            if (r2 != r1) goto L7
            goto L9
        L7:
            abcd.ef0[] r0 = new abcd.ef0[r2]
        L9:
            r3 = 0
            r4 = 0
        Lb:
            if (r4 < r2) goto L14
            r9.Hw = r0
            r9.gn = r3
            r9.VH = r3
            return
        L14:
            if (r4 >= r1) goto L3a
            abcd.ef0[] r5 = r9.Hw
            r5 = r5[r4]
        L1a:
            abcd.ef0 r6 = r5.j6
            if (r6 != 0) goto L38
            boolean r6 = r5 instanceof abcd.ff0
            if (r6 == 0) goto L3a
            int r6 = r5.Zo
            if (r6 != 0) goto L3a
            r6 = 0
            r5.DW = r6
            r5.FH = r3
            r6 = r5
            abcd.ff0 r6 = (abcd.ff0) r6
            abcd.g70 r7 = r9.j6
            r8 = r10[r4]
            r6.KD(r7, r8)
            r0[r4] = r5
            goto L42
        L38:
            r5 = r6
            goto L1a
        L3a:
            r5 = r10[r4]
            abcd.ff0 r5 = r9.er(r5)
            r0[r4] = r5
        L42:
            int r4 = r4 + 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.jf0.nw(abcd.j60[]):void");
    }

    public boolean rN() {
        try {
            if (this.gn) {
                this.gn = false;
                BT();
            }
            while (true) {
                ef0 ef0VarLg = lg();
                if (!ef0VarLg.VH()) {
                    this.u7 = ef0VarLg;
                    if (!this.FH.DW(this)) {
                        ro();
                    } else {
                        if (!this.v5 || !t60.Hw.Hw(ef0VarLg.Hw)) {
                            break;
                        }
                        FH();
                    }
                } else {
                    if (this.VH <= 0) {
                        return false;
                    }
                    Hw();
                    if (this.Zo) {
                        this.gn = true;
                        return true;
                    }
                    BT();
                }
            }
            this.gn = true;
            return true;
        } catch (d50 unused) {
            for (ef0 ef0Var : this.Hw) {
                ef0Var.BT();
            }
            return false;
        }
    }

    public void ro() {
        ef0 ef0Var = this.u7;
        int i = 0;
        while (true) {
            ef0[] ef0VarArr = this.Hw;
            if (i >= ef0VarArr.length) {
                return;
            }
            ef0 ef0Var2 = ef0VarArr[i];
            if (ef0Var2.DW == ef0Var) {
                ef0Var2.gW();
                ef0Var2.DW = null;
            }
            i++;
        }
    }

    public a70 tp(int i) {
        ef0 ef0Var = this.Hw[i];
        return ef0Var.DW == this.u7 ? ef0Var.tp() : a70.ca();
    }

    public sf0 u7() {
        return this.FH;
    }

    public void vy() {
        this.j6.XL();
    }

    public int we() {
        return this.u7.VH;
    }

    public jf0(g70 g70Var) {
        this.DW = new w60();
        this.j6 = g70Var;
        this.FH = sf0.j6;
        this.Hw = tp;
    }
}
