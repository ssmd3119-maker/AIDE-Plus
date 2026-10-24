package abcd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class u60 {
    private final s90 DW;
    private final kf0 Hw;
    private nf0 J0;
    private final p70 j6;
    private w30 we;
    private sf0 FH = null;
    private Set<String> v5 = new HashSet();
    private Set<String> Zo = new HashSet();
    private Set<String> VH = new HashSet();
    private Set<String> gn = new HashSet();
    private Set<String> u7 = new HashSet();
    private Set<String> tp = new HashSet();
    private Set<String> EQ = new HashSet();

    public u60(p70 p70Var, String str, kf0 kf0Var) {
        this.j6 = p70Var;
        a70 a70VarRo = p70Var.ro(str);
        if (a70VarRo != null) {
            this.DW = new t90(p70Var).sy(a70VarRo);
        } else {
            this.DW = null;
        }
        this.Hw = kf0Var;
    }

    public boolean DW(j70 j70Var, int i, int i2, String str) {
        b40 b40VarVy;
        this.we = this.j6.ei();
        jf0 jf0Var = new jf0(this.j6);
        jf0Var.KD(true);
        s90 s90Var = this.DW;
        if (s90Var != null) {
            jf0Var.j6(s90Var);
        } else {
            jf0Var.DW(new gf0());
        }
        jf0Var.DW(new c40(this.we));
        jf0Var.DW(this.Hw);
        ArrayList arrayList = new ArrayList(4);
        if (j70Var != null) {
            if (i2 == 0) {
                i2 = this.we.J8();
            }
            int iMax = Math.max((i2 * 10) / 9, (i * 10) / 9);
            j70Var.j6(str, iMax);
            arrayList.add(new a(j70Var, iMax, null));
        }
        sf0 sf0Var = this.FH;
        if (sf0Var != null) {
            arrayList.add(sf0Var);
        }
        arrayList.add(new rf0(1));
        nf0 nf0Var = new nf0(1, 2);
        this.J0 = nf0Var;
        arrayList.add(nf0Var);
        jf0Var.SI(mf0.Hw(arrayList));
        while (jf0Var.rN()) {
            ef0 ef0VarQX = jf0Var.QX(0, ef0.class);
            c40 c40Var = (c40) jf0Var.QX(1, c40.class);
            kf0 kf0Var = (kf0) jf0Var.QX(2, kf0.class);
            if (c40Var == null || (b40VarVy = c40Var.vy()) == null || b40VarVy.we() <= 0) {
                if (ef0VarQX != null) {
                    if (c40Var == null) {
                        this.VH.add(jf0Var.J0());
                        if (kf0Var != null) {
                            this.tp.add(jf0Var.J0());
                        }
                    } else if (!ef0VarQX.XL(c40Var) || ef0VarQX.J0() != c40Var.J0()) {
                        this.Zo.add(jf0Var.J0());
                    }
                } else if (c40Var != null) {
                    this.v5.add(jf0Var.J0());
                } else if (kf0Var != null && !kf0Var.aj()) {
                    this.tp.add(jf0Var.J0());
                }
                if (c40Var != null) {
                    if (kf0Var == null) {
                        this.gn.add(jf0Var.J0());
                    } else if (kf0Var.OW(c40Var.vy(), true)) {
                        this.u7.add(jf0Var.J0());
                    }
                }
            } else {
                this.EQ.add(jf0Var.J0());
            }
        }
        if (j70Var != null) {
            j70Var.FH();
        }
        this.J0.v5();
        return (this.v5.isEmpty() && this.Zo.isEmpty() && this.VH.isEmpty() && this.gn.isEmpty() && this.u7.isEmpty() && this.tp.isEmpty()) ? false : true;
    }

    public Set<String> FH() {
        return this.v5;
    }

    public Set<String> Hw() {
        return this.Zo;
    }

    public Set<String> VH() {
        return this.u7;
    }

    public Set<String> Zo() {
        return this.gn;
    }

    public Set<String> gn() {
        return this.VH;
    }

    public boolean j6() {
        return DW(null, 0, 0, "");
    }

    public Set<String> u7() {
        return this.tp;
    }

    public Set<String> v5() {
        return this.EQ;
    }

    private static final class a extends sf0 {
        private final j70 FH;
        private int Hw;
        private final int Zo;
        private int v5;

        private a(j70 j70Var, int i) {
            this.Hw = 0;
            this.FH = j70Var;
            this.Zo = i;
            int i2 = i / 100;
            this.v5 = i2;
            if (i2 == 0) {
                this.v5 = 1000;
            }
        }

        @Override // abcd.sf0
        public boolean DW(jf0 jf0Var) {
            int i = this.Hw + 1;
            this.Hw = i;
            int i2 = this.v5;
            if (i % i2 == 0) {
                if (i <= this.Zo) {
                    this.FH.v5(i2);
                }
                if (this.FH.isCancelled()) {
                    throw d50.WB;
                }
            }
            return true;
        }

        @Override // abcd.sf0
        public boolean FH() {
            return false;
        }

        @Override // abcd.sf0
        /* renamed from: j6 */
        public sf0 clone() {
            throw new IllegalStateException("Do not clone this kind of filter: " + a.class.getName());
        }

        public /* synthetic */ a(j70 j70Var, int i, a aVar) {
            this(j70Var, i);
        }
    }
}
