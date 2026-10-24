package abcd;

import abcd.d30;

/* loaded from: classes.dex */
public class i30 extends k30 {
    private z20 FH = l30.Zo;
    private int Hw = 64;

    private class a<S extends p30> {
        private static /* synthetic */ int[] Zo;
        private final f30<S> DW;
        private final f30<S> FH;
        final e30 Hw;
        private final g30<S> j6;

        public a(e30 e30Var, g30<S> g30Var, f30<S> f30Var, f30<S> f30Var2) {
            this.j6 = g30Var;
            this.DW = f30Var;
            this.FH = f30Var2;
            this.Hw = e30Var;
        }

        private void DW(d30 d30Var) {
            int i = j6()[d30Var.tp().ordinal()];
            if (i == 1 || i == 2) {
                this.Hw.add(d30Var);
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                FH(d30Var);
            }
        }

        private u30<f30<S>> Hw() {
            return new u30<>(this.j6);
        }

        public static /* synthetic */ int[] j6() {
            int[] iArr = Zo;
            if (iArr != null) {
                return iArr;
            }
            int[] iArr2 = new int[d30.a.valuesCustom().length];
            try {
                iArr2[d30.a.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr2[d30.a.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[d30.a.INSERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d30.a.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            Zo = iArr2;
            return iArr2;
        }

        public void FH(d30 d30Var) {
            d30 d30VarJ6 = new j30(i30.this.Hw, this.j6, this.DW, this.FH, d30Var).j6();
            if (d30VarJ6 != null) {
                if (d30VarJ6.EQ()) {
                    this.Hw.add(d30Var);
                    return;
                } else {
                    DW(d30Var.DW(d30VarJ6));
                    DW(d30Var.j6(d30VarJ6));
                    return;
                }
            }
            if (i30.this.FH instanceof k30) {
                ((k30) i30.this.FH).VH(this.Hw, this.j6, this.DW, this.FH, d30Var);
                return;
            }
            if (i30.this.FH == null) {
                this.Hw.add(d30Var);
                return;
            }
            u30<f30<S>> u30VarHw = Hw();
            t30 t30VarDW = t30.DW(this.DW, d30Var);
            t30 t30VarFH = t30.FH(this.FH, d30Var);
            e30 e30VarV5 = i30.this.FH.v5(u30VarHw, t30VarDW, t30VarFH);
            e30 e30Var = this.Hw;
            t30.Hw(e30VarV5, t30VarDW, t30VarFH);
            e30Var.addAll(e30VarV5);
        }
    }

    @Override // abcd.k30
    public <S extends p30> void VH(e30 e30Var, g30<S> g30Var, f30<S> f30Var, f30<S> f30Var2, d30 d30Var) {
        new a(e30Var, g30Var, f30Var, f30Var2).FH(d30Var);
    }
}
