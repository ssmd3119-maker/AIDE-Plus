package abcd;

import abcd.b70;
import java.io.IOException;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class qb0 {
    private final g70 DW;
    private final a70[] FH;
    private final b70<dc0> Hw;
    private final j70 j6;
    private final List<dc0> v5;
    private static final int tp = t60.Zo.Zo();
    private static final int EQ = t60.Hw.Zo();
    private final bc0 Zo = new bc0();
    private final b70<a> VH = new b70<>();
    private final ff0 gn = new ff0();
    private final w60 u7 = new w60();

    private static class a extends b70.b {
        final byte[] cT;

        public a(j60 j60Var, byte[] bArr) {
            super(j60Var);
            this.cT = bArr;
        }
    }

    public qb0(j70 j70Var, Set<s90> set, b70<dc0> b70Var, List<dc0> list, g70 g70Var) {
        this.j6 = j70Var;
        this.DW = g70Var;
        this.FH = (a70[]) set.toArray(new a70[set.size()]);
        this.Hw = b70Var;
        this.v5 = list;
    }

    private static int FH(int i) {
        if (i == 2) {
            return EQ;
        }
        if (i != 3) {
            return 0;
        }
        return tp;
    }

    private static int Hw(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 47) {
            i++;
        }
        return i;
    }

    private void j6(j60 j60Var, int i, int i2) {
        dc0 dc0Var = new dc0(j60Var, i);
        dc0Var.mb();
        dc0Var.jw(i2);
        if (this.Hw.VH(dc0Var) == dc0Var) {
            this.v5.add(dc0Var);
            this.j6.v5(1);
        }
    }

    private byte[] v5(j60 j60Var) throws IOException {
        a aVar = (a) this.VH.Ws(j60Var);
        if (aVar != null) {
            return aVar.cT;
        }
        byte[] bArrV5 = this.DW.QX(j60Var, 2).v5(Integer.MAX_VALUE);
        this.VH.v5(new a(j60Var, bArrV5));
        return bArrV5;
    }

    public void DW(int i, byte[] bArr, int i2, int i3) {
        int iFH = FH(i);
        if (iFH != 0 && this.Zo.j6(i3)) {
            if (i2 == 0) {
                for (a70 a70Var : this.FH) {
                    j6(a70Var, 2, i3);
                }
                return;
            }
            int iHw = Hw(bArr, 0, i2);
            for (a70 a70Var2 : this.FH) {
                int i4 = iHw != i2 ? EQ : iFH;
                this.gn.ro(v5(a70Var2));
                int iHw2 = iHw;
                int i5 = 0;
                while (true) {
                    if (!this.gn.VH()) {
                        int iLg = this.gn.lg(bArr, i5, iHw2, i4);
                        if (iLg < 0) {
                            this.gn.nw();
                        } else if (iLg <= 0) {
                            if (iHw2 != i2) {
                                if (!t60.Hw.Hw(this.gn.J0())) {
                                    break;
                                }
                                i5 = iHw2 + 1;
                                iHw2 = Hw(bArr, i5, i2);
                                i4 = iHw2 != i2 ? EQ : iFH;
                                this.u7.sG(this.gn.QX(), this.gn.aM());
                                this.gn.ro(v5(this.u7));
                            } else if (this.gn.u7().VH() == i) {
                                this.u7.sG(this.gn.QX(), this.gn.aM());
                                j6(this.u7, i, i3);
                            }
                        }
                    }
                }
            }
        }
    }
}
