package abcd;

/* loaded from: classes.dex */
public class p80 {
    final int DW;
    int FH;
    private final b Hw;
    private e30 VH;
    int Zo;
    final o80 j6;
    int v5;

    class a extends b {
        public a(o80 o80Var) {
        }
    }

    public static abstract class b {
        int DW;
        int j6;

        public int DW() {
            return this.j6;
        }

        public int j6() {
            return this.DW;
        }
    }

    public p80(o80 o80Var, int i) {
        this(o80Var, i, new a(o80Var));
    }

    public int DW() {
        return this.Zo;
    }

    public int FH() {
        return this.v5;
    }

    public b Hw() {
        return this.Hw;
    }

    public e30 Zo() {
        if (this.VH == null) {
            this.VH = new e30();
            byte[] bArr = this.j6.EQ;
            int i = this.Hw.j6;
            int i2 = this.v5;
            d30 d30Var = null;
            for (int iAM = kg0.aM(bArr, this.DW); iAM < this.FH; iAM = kg0.aM(bArr, iAM)) {
                byte b2 = bArr[iAM];
                if (b2 != 10 && b2 != 32) {
                    if (b2 != 43) {
                        if (b2 != 45) {
                            if (b2 != 92) {
                                break;
                            }
                        } else {
                            if (d30Var == null) {
                                d30Var = new d30(i - 1, i2 - 1);
                                this.VH.add(d30Var);
                            }
                            i++;
                            d30Var.FH();
                        }
                    } else {
                        if (d30Var == null) {
                            d30Var = new d30(i - 1, i2 - 1);
                            this.VH.add(d30Var);
                        }
                        i2++;
                        d30Var.Hw();
                    }
                } else {
                    i++;
                    i2++;
                    d30Var = null;
                }
            }
        }
        return this.VH;
    }

    public o80 j6() {
        return this.j6;
    }

    public String toString() {
        return "HunkHeader[" + Hw().DW() + ',' + Hw().j6() + "->" + FH() + ',' + DW() + ']';
    }

    public int v5() {
        return this.DW;
    }

    public p80(o80 o80Var, int i, b bVar) {
        this.j6 = o80Var;
        this.DW = i;
        this.Hw = bVar;
    }

    public p80(o80 o80Var, e30 e30Var) {
        this(o80Var, o80Var.EQ.length);
        this.VH = e30Var;
        this.FH = this.DW;
        if (e30Var.isEmpty()) {
            this.v5 = 0;
            this.Zo = 0;
        } else {
            this.v5 = e30Var.get(0).Zo();
            this.Zo = e30Var.get(e30Var.size() - 1).gn() - this.v5;
        }
    }
}
