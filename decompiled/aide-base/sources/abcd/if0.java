package abcd;

/* loaded from: classes.dex */
public class if0 extends jf0 {
    private static final int J0 = t60.Hw.Zo();
    private boolean EQ;
    private ef0 we;

    public if0(p70 p70Var) {
        this(p70Var.yS());
    }

    private ef0 cn(ef0 ef0Var) {
        ef0 ef0Var2 = null;
        for (ef0 ef0Var3 : this.Hw) {
            if (ef0Var3.DW != ef0Var && !ef0Var3.VH()) {
                while (true) {
                    int iA8 = ef0Var3.a8(ef0Var, J0);
                    if (iA8 < 0) {
                        ef0Var3.FH++;
                        ef0Var3.Mr(1);
                        if (ef0Var3.VH()) {
                            ef0Var3.DW(ef0Var3.FH);
                            ef0Var3.FH = 0;
                            break;
                        }
                    } else if (iA8 == 0) {
                        ef0Var3.DW = ef0Var;
                        ef0Var2 = ef0Var3;
                    } else {
                        int i = ef0Var3.FH;
                        if (i != 0) {
                            ef0Var3.DW(i);
                            ef0Var3.FH = 0;
                        }
                    }
                }
            }
        }
        if (ef0Var2 == null) {
            return ef0Var;
        }
        for (ef0 ef0Var4 : this.Hw) {
            if (ef0Var4.DW == ef0Var) {
                ef0Var4.DW = ef0Var2;
            }
        }
        if (this.we == null) {
            this.we = ef0Var2;
        }
        return ef0Var2;
    }

    private static boolean dx(ef0 ef0Var) {
        return t60.Hw.Hw(ef0Var.Hw);
    }

    private boolean ef(ef0 ef0Var) {
        for (ef0 ef0Var2 : this.Hw) {
            if (ef0Var2.DW != ef0Var && !ef0Var2.gn()) {
                int i = 0;
                do {
                    i++;
                    ef0Var2.DW(1);
                    int iA8 = ef0Var2.a8(ef0Var, 0);
                    if (iA8 == 0) {
                        ef0Var2.Mr(i);
                        return true;
                    }
                    if (iA8 < 0) {
                        break;
                    }
                } while (!ef0Var2.gn());
                ef0Var2.Mr(i);
            }
        }
        return false;
    }

    private static boolean sG(ef0 ef0Var, ef0 ef0Var2) {
        return ef0Var.a8(ef0Var2, J0) == 0;
    }

    private ef0 sh() {
        this.EQ = true;
        ef0 ef0Var = this.Hw[0];
        int i = 0;
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
        boolean z = false;
        while (true) {
            i++;
            ef0[] ef0VarArr2 = this.Hw;
            if (i >= ef0VarArr2.length) {
                break;
            }
            ef0 ef0Var2 = ef0VarArr2[i];
            if (!ef0Var2.VH()) {
                int iU2 = ef0Var2.U2(ef0Var);
                if (iU2 < 0) {
                    if (this.EQ && dx(ef0Var) && !dx(ef0Var2) && sG(ef0Var, ef0Var2)) {
                        ef0Var2.DW = ef0Var;
                        z = true;
                    } else {
                        this.EQ = false;
                        ef0Var2.DW = ef0Var2;
                        ef0Var = ef0Var2;
                    }
                } else if (iU2 == 0) {
                    ef0Var2.DW = ef0Var;
                } else if (this.EQ && dx(ef0Var2) && !dx(ef0Var) && sG(ef0Var2, ef0Var)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        ef0 ef0Var3 = this.Hw[i2];
                        if (ef0Var3.DW == ef0Var) {
                            ef0Var3.DW = ef0Var2;
                        }
                    }
                    ef0Var2.DW = ef0Var2;
                    ef0Var = ef0Var2;
                    z = true;
                } else {
                    this.EQ = false;
                }
            }
        }
        if (z && this.EQ && this.we == null) {
            this.we = ef0Var;
        }
        return ef0Var;
    }

    @Override // abcd.jf0
    public void BT() {
        ef0 ef0Var = this.u7;
        int i = 0;
        while (true) {
            ef0[] ef0VarArr = this.Hw;
            if (i >= ef0VarArr.length) {
                break;
            }
            ef0 ef0Var2 = ef0VarArr[i];
            if (ef0Var2.DW == ef0Var) {
                int i2 = ef0Var2.FH;
                if (i2 == 0) {
                    ef0Var2.Mr(1);
                } else {
                    ef0Var2.DW(i2);
                    ef0Var2.FH = 0;
                }
                ef0Var2.DW = null;
            }
            i++;
        }
        if (ef0Var == this.we) {
            this.we = null;
        }
    }

    public boolean cb() {
        return this.we != null;
    }

    @Override // abcd.jf0
    public ef0 lg() {
        while (true) {
            ef0 ef0VarSh = sh();
            if (this.EQ) {
                return ef0VarSh;
            }
            if (!dx(ef0VarSh)) {
                return cn(ef0VarSh);
            }
            if (!ef(ef0VarSh)) {
                return ef0VarSh;
            }
            for (ef0 ef0Var : this.Hw) {
                if (ef0Var.DW == ef0VarSh) {
                    ef0Var.Mr(1);
                    ef0Var.DW = null;
                }
            }
        }
    }

    @Override // abcd.jf0
    public void ro() {
        ef0 ef0Var = this.u7;
        int i = 0;
        while (true) {
            ef0[] ef0VarArr = this.Hw;
            if (i >= ef0VarArr.length) {
                break;
            }
            ef0 ef0Var2 = ef0VarArr[i];
            if (ef0Var2.DW == ef0Var) {
                int i2 = ef0Var2.FH;
                if (i2 == 0) {
                    ef0Var2.gW();
                } else {
                    ef0Var2.DW(i2);
                    ef0Var2.FH = 0;
                }
                ef0Var2.DW = null;
            }
            i++;
        }
        if (ef0Var == this.we) {
            this.we = null;
        }
    }

    public if0(g70 g70Var) {
        super(g70Var);
    }
}
