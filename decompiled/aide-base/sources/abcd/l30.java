package abcd;

import abcd.d30;
import abcd.p30;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class l30<S extends p30> {
    public static final z20 Zo = new a();
    protected g30<S> DW;
    protected f30<S> FH;
    protected f30<S> Hw;
    protected e30 j6;
    l30<S>.b v5;

    class a extends k30 {
        @Override // abcd.k30
        public <S extends p30> void VH(e30 e30Var, g30<S> g30Var, f30<S> f30Var, f30<S> f30Var2, d30 d30Var) {
            new l30(e30Var, g30Var, f30Var, f30Var2, d30Var, null);
        }
    }

    class b {
        protected int FH;
        protected int Hw;
        protected d30 VH;
        protected int Zo;
        protected int v5;
        l30<S>.b.AbstractC0006b j6 = new c();
        l30<S>.b.AbstractC0006b DW = new a();

        class a extends l30<S>.b.AbstractC0006b {
            public a() {
                super();
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final int J8(int i, int i2) {
                int i3;
                while (true) {
                    b bVar = b.this;
                    if (i2 <= bVar.FH || (i3 = i + i2) <= bVar.v5 || !l30.this.DW.j6(l30.this.FH, i2 - 1, l30.this.Hw, i3 - 1)) {
                        break;
                    }
                    i2--;
                }
                return i2;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final int Zo(int i) {
                return i;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final void j6(int i, int i2) {
                b bVar = b.this;
                if (i2 <= bVar.FH || i2 + i <= bVar.v5) {
                    if (i > b.this.j6.v5) {
                        this.u7 = i;
                    } else {
                        this.gn = i;
                    }
                }
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final boolean tp(int i, int i2) {
                return i < i2;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final int v5(int i) {
                return i - 1;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final boolean we(int i, int i2, int i3, long j) {
                l30<S>.b.AbstractC0006b abstractC0006b = b.this.j6;
                if (i2 < abstractC0006b.FH || i2 > abstractC0006b.Hw || ((i + i2) - abstractC0006b.v5) % 2 != 0 || i3 > abstractC0006b.gn(i, i2)) {
                    return false;
                }
                EQ(b.this.j6.VH(i, i2), j);
                return true;
            }
        }

        /* renamed from: abcd.l30$b$b, reason: collision with other inner class name */
        abstract class AbstractC0006b {
            int FH;
            int Hw;
            int VH;
            int Zo;
            int gn;
            int u7;
            int v5;
            private fg0 j6 = new fg0();
            private gg0 DW = new gg0();

            public AbstractC0006b() {
            }

            private int FH(int i) {
                int i2 = this.gn;
                if (i < i2) {
                    return i2 + ((i ^ i2) & 1);
                }
                int i3 = this.u7;
                return i > i3 ? i3 - ((i ^ i3) & 1) : i;
            }

            public boolean DW(int i) {
                long jJ0;
                int iV5;
                this.Zo = this.FH;
                this.VH = this.Hw;
                this.FH = FH(this.v5 - i);
                int iFH = FH(this.v5 + i);
                this.Hw = iFH;
                for (int i2 = iFH; i2 >= this.FH; i2 -= 2) {
                    long j = -1;
                    int i3 = -1;
                    if (i2 > this.Zo) {
                        int i4 = i2 - 1;
                        int iHw = Hw(i - 1, i4);
                        int iHw2 = this.j6.Hw(iHw);
                        int iJ8 = J8(i4, iHw2);
                        jJ0 = iHw2 != iJ8 ? J0(i4, iJ8) : this.DW.Hw(iHw);
                        if (we(i, i4, iJ8, jJ0)) {
                            return true;
                        }
                        iV5 = v5(iJ8);
                    } else {
                        jJ0 = -1;
                        iV5 = -1;
                    }
                    if (i2 < this.VH) {
                        int i5 = i2 + 1;
                        int iHw3 = Hw(i - 1, i5);
                        int iHw4 = this.j6.Hw(iHw3);
                        int iJ82 = J8(i5, iHw4);
                        long jJ02 = iHw4 != iJ82 ? J0(i5, iJ82) : this.DW.Hw(iHw3);
                        if (we(i, i5, iJ82, jJ02)) {
                            return true;
                        }
                        int iZo = Zo(iJ82);
                        j = jJ02;
                        i3 = iZo;
                    }
                    if (i2 < this.VH && (i2 <= this.Zo || !tp(iV5, i3))) {
                        jJ0 = j;
                        iV5 = i3;
                    }
                    if (we(i, i2, iV5, jJ0)) {
                        return true;
                    }
                    j6(i2, iV5);
                    int iHw5 = Hw(i, i2);
                    this.j6.Zo(iHw5, iV5);
                    this.DW.Zo(iHw5, jJ0);
                }
                return false;
            }

            public final boolean EQ(long j, long j2) {
                int iWs = Ws(j);
                int iWs2 = Ws(j2);
                int iQX = QX(j);
                int iQX2 = QX(j2);
                if (iWs > iWs2 || iQX > iQX2) {
                    iQX = iQX2;
                    iWs = iWs2;
                }
                b.this.VH = new d30(iWs, iWs2, iQX, iQX2);
                return true;
            }

            public final int Hw(int i, int i2) {
                int i3 = i + i2;
                int i4 = this.v5;
                if ((i3 - i4) % 2 == 0) {
                    return (i3 - i4) / 2;
                }
                throw new RuntimeException(MessageFormat.format(JGitText.DW().unexpectedOddResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.v5)));
            }

            public final long J0(int i, int i2) {
                return (i2 << 32) | (i + i2);
            }

            public abstract int J8(int i, int i2);

            public final int QX(long j) {
                return (int) j;
            }

            public final long VH(int i, int i2) {
                if (i2 < this.FH || i2 > this.Hw) {
                    throw new RuntimeException(MessageFormat.format(JGitText.DW().kNotInRange, Integer.valueOf(i2), Integer.valueOf(this.FH), Integer.valueOf(this.Hw)));
                }
                return this.DW.Hw(Hw(i, i2));
            }

            public final int Ws(long j) {
                return (int) (j >>> 32);
            }

            public abstract int Zo(int i);

            public final int gn(int i, int i2) {
                if (i2 < this.FH || i2 > this.Hw) {
                    throw new RuntimeException(MessageFormat.format(JGitText.DW().kNotInRange, Integer.valueOf(i2), Integer.valueOf(this.FH), Integer.valueOf(this.Hw)));
                }
                return this.j6.Hw(Hw(i, i2));
            }

            public abstract void j6(int i, int i2);

            public abstract boolean tp(int i, int i2);

            public void u7(int i, int i2, int i3, int i4) {
                this.gn = i3;
                this.u7 = i4;
                this.v5 = i;
                this.Hw = i;
                this.FH = i;
                this.j6.DW();
                this.j6.j6(i2);
                this.DW.DW();
                this.DW.j6(J0(i, i2));
            }

            public abstract int v5(int i);

            public abstract boolean we(int i, int i2, int i3, long j);
        }

        class c extends l30<S>.b.AbstractC0006b {
            public c() {
                super();
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final int J8(int i, int i2) {
                int i3;
                while (true) {
                    b bVar = b.this;
                    if (i2 >= bVar.Hw || (i3 = i + i2) >= bVar.Zo || !l30.this.DW.j6(l30.this.FH, i2, l30.this.Hw, i3)) {
                        break;
                    }
                    i2++;
                }
                return i2;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final int Zo(int i) {
                return i + 1;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final void j6(int i, int i2) {
                b bVar = b.this;
                if (i2 >= bVar.Hw || i2 + i >= bVar.Zo) {
                    if (i > b.this.DW.v5) {
                        this.u7 = i;
                    } else {
                        this.gn = i;
                    }
                }
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final boolean tp(int i, int i2) {
                return i > i2;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final int v5(int i) {
                return i;
            }

            @Override // abcd.l30.b.AbstractC0006b
            public final boolean we(int i, int i2, int i3, long j) {
                l30<S>.b.AbstractC0006b abstractC0006b = b.this.DW;
                if (i2 < abstractC0006b.FH || i2 > abstractC0006b.Hw) {
                    return false;
                }
                int i4 = i - 1;
                if (((i4 + i2) - abstractC0006b.v5) % 2 != 0 || i3 < abstractC0006b.gn(i4, i2)) {
                    return false;
                }
                EQ(j, b.this.DW.VH(i4, i2));
                return true;
            }
        }

        public b() {
        }

        public d30 DW(int i, int i2, int i3, int i4) {
            if (i == i2 || i3 == i4) {
                return new d30(i, i2, i3, i4);
            }
            this.FH = i;
            this.Hw = i2;
            this.v5 = i3;
            this.Zo = i4;
            int i5 = i3 - i2;
            int i6 = i4 - i;
            this.j6.u7(i3 - i, i, i5, i6);
            this.DW.u7(i4 - i2, i2, i5, i6);
            for (int i7 = 1; !this.j6.DW(i7) && !this.DW.DW(i7); i7++) {
            }
            return this.VH;
        }

        public void FH(int i, int i2, int i3, int i4) {
            this.FH = i;
            this.Hw = i2;
            this.v5 = i3;
            this.Zo = i4;
            int i5 = i3 - i;
            int iJ8 = this.j6.J8(i5, i);
            this.FH = iJ8;
            this.v5 = i5 + iJ8;
            int i6 = i4 - i2;
            int iJ82 = this.DW.J8(i6, i2);
            this.Hw = iJ82;
            this.Zo = i6 + iJ82;
        }
    }

    private l30(e30 e30Var, g30<S> g30Var, f30<S> f30Var, f30<S> f30Var2, d30 d30Var) {
        this.v5 = new b();
        this.j6 = e30Var;
        this.DW = g30Var;
        this.FH = f30Var;
        this.Hw = f30Var2;
        DW(d30Var);
    }

    private void DW(d30 d30Var) {
        this.v5.FH(d30Var.j6, d30Var.DW, d30Var.FH, d30Var.Hw);
        l30<S>.b bVar = this.v5;
        if (bVar.FH < bVar.Hw || bVar.v5 < bVar.Zo) {
            l30<S>.b bVar2 = this.v5;
            j6(bVar2.FH, bVar2.Hw, bVar2.v5, bVar2.Zo);
        }
    }

    public void j6(int i, int i2, int i3, int i4) {
        d30 d30VarDW = this.v5.DW(i, i2, i3, i4);
        if (i < d30VarDW.j6 || i3 < d30VarDW.FH) {
            int i5 = d30VarDW.FH;
            int i6 = d30VarDW.j6;
            int i7 = i5 - i6;
            int iJ8 = this.v5.DW.J8(i7, i6);
            j6(i, iJ8, i3, i7 + iJ8);
        }
        if (d30VarDW.tp() != d30.a.EMPTY) {
            e30 e30Var = this.j6;
            e30Var.add(e30Var.size(), d30VarDW);
        }
        if (i2 > d30VarDW.DW || i4 > d30VarDW.Hw) {
            int i8 = d30VarDW.Hw;
            int i9 = d30VarDW.DW;
            int i10 = i8 - i9;
            int iJ82 = this.v5.j6.J8(i10, i9);
            j6(iJ82, i2, i10 + iJ82, i4);
        }
    }

    public /* synthetic */ l30(e30 e30Var, g30 g30Var, f30 f30Var, f30 f30Var2, d30 d30Var, l30 l30Var) {
        this(e30Var, g30Var, f30Var, f30Var2, d30Var);
    }
}
