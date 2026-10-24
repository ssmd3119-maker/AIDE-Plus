package abcd;

import abcd.z70;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y70 {
    private static final d30 DW = new d30(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private final z20 j6;

    public y70(z20 z20Var) {
        this.j6 = z20Var;
    }

    private static d30 DW(Iterator<d30> it) {
        return it.hasNext() ? it.next() : DW;
    }

    public <S extends p30> c80<S> j6(q30<S> q30Var, S s, S s2, S s3) {
        d30 d30Var;
        Iterator<d30> it;
        d30 d30Var2;
        int i;
        q30<S> q30Var2 = q30Var;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(s);
        arrayList.add(s2);
        arrayList.add(s3);
        c80<S> c80Var = new c80<>(arrayList);
        int i2 = 2;
        int i3 = 1;
        int i4 = 0;
        if (s2.j6() == 0) {
            if (s3.j6() == 0 || this.j6.Hw(q30Var2, s, s3).isEmpty()) {
                c80Var.Hw(1, 0, 0, z70.a.NO_CONFLICT);
            } else {
                c80Var.Hw(1, 0, 0, z70.a.FIRST_CONFLICTING_RANGE);
                c80Var.Hw(2, 0, s3.j6(), z70.a.NEXT_CONFLICTING_RANGE);
            }
            return c80Var;
        }
        if (s3.j6() == 0) {
            if (this.j6.Hw(q30Var2, s, s2).isEmpty()) {
                c80Var.Hw(2, 0, 0, z70.a.NO_CONFLICT);
            } else {
                c80Var.Hw(1, 0, s2.j6(), z70.a.FIRST_CONFLICTING_RANGE);
                c80Var.Hw(2, 0, 0, z70.a.NEXT_CONFLICTING_RANGE);
            }
            return c80Var;
        }
        Iterator<d30> it2 = this.j6.Hw(q30Var2, s, s2).iterator();
        Iterator<d30> it3 = this.j6.Hw(q30Var2, s, s3).iterator();
        d30 d30VarDW = DW(it2);
        d30 d30VarDW2 = DW(it3);
        int iVH = 0;
        while (true) {
            d30 d30Var3 = DW;
            if (d30VarDW2 == d30Var3 && d30VarDW == d30Var3) {
                break;
            }
            if (d30VarDW.VH() < d30VarDW2.v5()) {
                if (iVH != d30VarDW.v5()) {
                    c80Var.Hw(i4, iVH, d30VarDW.v5(), z70.a.NO_CONFLICT);
                }
                c80Var.Hw(i3, d30VarDW.Zo(), d30VarDW.gn(), z70.a.NO_CONFLICT);
                iVH = d30VarDW.VH();
                d30VarDW = DW(it2);
            } else if (d30VarDW2.VH() < d30VarDW.v5()) {
                if (iVH != d30VarDW2.v5()) {
                    c80Var.Hw(i4, iVH, d30VarDW2.v5(), z70.a.NO_CONFLICT);
                }
                c80Var.Hw(i2, d30VarDW2.Zo(), d30VarDW2.gn(), z70.a.NO_CONFLICT);
                iVH = d30VarDW2.VH();
                d30VarDW2 = DW(it3);
            } else {
                if (d30VarDW.v5() != iVH && d30VarDW2.v5() != iVH) {
                    c80Var.Hw(i4, iVH, Math.min(d30VarDW.v5(), d30VarDW2.v5()), z70.a.NO_CONFLICT);
                }
                int iZo = d30VarDW.Zo();
                int iZo2 = d30VarDW2.Zo();
                if (d30VarDW.v5() < d30VarDW2.v5()) {
                    iZo2 -= d30VarDW2.v5() - d30VarDW.v5();
                } else {
                    iZo -= d30VarDW.v5() - d30VarDW2.v5();
                }
                d30 d30VarDW3 = DW(it2);
                d30 d30Var4 = d30VarDW2;
                d30 d30VarDW4 = DW(it3);
                while (true) {
                    if (d30VarDW.VH() < d30VarDW4.v5()) {
                        if (d30Var4.VH() < d30VarDW3.v5()) {
                            break;
                        }
                        d30VarDW = d30VarDW3;
                        d30VarDW3 = DW(it2);
                    } else {
                        d30Var4 = d30VarDW4;
                        d30VarDW4 = DW(it3);
                    }
                }
                int iGn = d30VarDW.gn();
                int iGn2 = d30Var4.gn();
                if (d30VarDW.VH() < d30Var4.VH()) {
                    iGn += d30Var4.VH() - d30VarDW.VH();
                } else {
                    iGn2 += d30VarDW.VH() - d30Var4.VH();
                }
                int i5 = iGn - iZo;
                int i6 = i5 - (iGn2 - iZo2);
                if (i6 > 0) {
                    i5 -= i6;
                }
                Iterator<d30> it4 = it2;
                int i7 = 0;
                while (true) {
                    d30Var = d30VarDW3;
                    if (i7 >= i5) {
                        it = it3;
                        break;
                    }
                    it = it3;
                    if (!q30Var2.j6(s2, iZo + i7, s3, iZo2 + i7)) {
                        break;
                    }
                    i7++;
                    d30VarDW3 = d30Var;
                    it3 = it;
                }
                int i8 = i5 - i7;
                int i9 = 0;
                while (true) {
                    if (i9 >= i8) {
                        d30Var2 = d30VarDW4;
                        break;
                    }
                    d30Var2 = d30VarDW4;
                    if (!q30Var2.j6(s2, (iGn - i9) - 1, s3, (iGn2 - i9) - 1)) {
                        break;
                    }
                    i9++;
                    d30VarDW4 = d30Var2;
                }
                int i10 = i8 - i9;
                if (i7 > 0) {
                    i = 1;
                    c80Var.Hw(1, iZo, iZo + i7, z70.a.NO_CONFLICT);
                } else {
                    i = 1;
                }
                if (i10 > 0 || i6 != 0) {
                    c80Var.Hw(i, iZo + i7, iGn - i9, z70.a.FIRST_CONFLICTING_RANGE);
                    c80Var.Hw(2, iZo2 + i7, iGn2 - i9, z70.a.NEXT_CONFLICTING_RANGE);
                }
                if (i9 > 0) {
                    c80Var.Hw(i, iGn - i9, iGn, z70.a.NO_CONFLICT);
                }
                iVH = Math.max(d30VarDW.VH(), d30Var4.VH());
                q30Var2 = q30Var;
                it2 = it4;
                d30VarDW = d30Var;
                it3 = it;
                d30VarDW2 = d30Var2;
                i2 = 2;
                i3 = 1;
                i4 = 0;
            }
        }
        if (iVH < s.j6()) {
            c80Var.Hw(i4, iVH, s.j6(), z70.a.NO_CONFLICT);
        }
        return c80Var;
    }
}
