package abcd;

/* loaded from: classes.dex */
public class i80 extends j80 {

    private static class a extends k80 {
        private y30 EQ;
        private final w30 tp;
        private final if0 u7;
        private a70 we;

        public a(p70 p70Var) {
            super(p70Var);
            this.u7 = new if0(this.DW);
            this.tp = w30.Mr();
        }

        private void EQ(int i, int i2) {
            ef0 ef0VarWe = we(i);
            if (ef0VarWe != null) {
                if (t60.Hw.Hw(this.u7.J8(i))) {
                    this.EQ.gn(this.u7.Ws(), i2, this.DW, this.u7.tp(i));
                    return;
                }
                b40 b40Var = new b40(this.u7.Ws(), i2);
                b40Var.gW(ef0VarWe.QX(), ef0VarWe.aM());
                b40Var.a8(this.u7.gn(i));
                this.EQ.VH(b40Var);
            }
        }

        private static boolean J0(int i) {
            return (i == 0 || t60.Hw.Hw(i)) ? false : true;
        }

        private ef0 we(int i) {
            return this.u7.QX(i, ef0.class);
        }

        @Override // abcd.e80
        public a70 Hw() {
            return this.we;
        }

        @Override // abcd.e80
        public boolean VH() {
            this.u7.DW(u7());
            this.u7.j6(this.VH[0]);
            this.u7.j6(this.VH[1]);
            this.EQ = this.tp.j6();
            boolean z = false;
            while (this.u7.rN()) {
                int iJ8 = this.u7.J8(1);
                int iJ82 = this.u7.J8(2);
                if (iJ8 == iJ82 && this.u7.aM(1, 2)) {
                    EQ(1, 0);
                } else {
                    int iJ83 = this.u7.J8(0);
                    if (iJ83 == iJ8 && this.u7.aM(0, 1)) {
                        EQ(2, 0);
                    } else if (iJ83 == iJ82 && this.u7.aM(0, 2)) {
                        EQ(1, 0);
                    } else {
                        if (J0(iJ83)) {
                            EQ(0, 1);
                            z = true;
                        }
                        if (J0(iJ8)) {
                            EQ(1, 2);
                            z = true;
                        }
                        if (J0(iJ82)) {
                            EQ(2, 3);
                            z = true;
                        }
                        if (this.u7.a8()) {
                            this.u7.FH();
                        }
                    }
                }
            }
            this.EQ.Hw();
            this.EQ = null;
            if (z) {
                return false;
            }
            try {
                e70 e70VarDW = DW();
                this.we = this.tp.SI(e70VarDW);
                e70VarDW.FH();
                return true;
            } catch (k50 unused) {
                this.we = null;
                return false;
            }
        }
    }

    @Override // abcd.d80
    public String j6() {
        return "simple-two-way-in-core";
    }

    @Override // abcd.j80
    /* renamed from: v5 */
    public k80 DW(p70 p70Var) {
        return new a(p70Var);
    }
}
