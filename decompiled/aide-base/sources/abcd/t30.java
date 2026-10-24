package abcd;

import abcd.p30;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t30<S extends p30> extends p30 {
    final int DW;
    private final int FH;
    final S j6;

    public t30(S s, int i, int i2) {
        this.j6 = s;
        this.DW = i;
        this.FH = i2 - i;
    }

    public static <S extends p30> t30<S> DW(S s, d30 d30Var) {
        return new t30<>(s, d30Var.j6, d30Var.DW);
    }

    public static <S extends p30> t30<S> FH(S s, d30 d30Var) {
        return new t30<>(s, d30Var.FH, d30Var.Hw);
    }

    public static <S extends p30> e30 Hw(e30 e30Var, t30<S> t30Var, t30<S> t30Var2) {
        Iterator<d30> it = e30Var.iterator();
        while (it.hasNext()) {
            v5(it.next(), t30Var, t30Var2);
        }
        return e30Var;
    }

    public static <S extends p30> void v5(d30 d30Var, t30<S> t30Var, t30<S> t30Var2) {
        int i = d30Var.j6;
        int i2 = t30Var.DW;
        d30Var.j6 = i + i2;
        d30Var.DW += i2;
        int i3 = d30Var.FH;
        int i4 = t30Var2.DW;
        d30Var.FH = i3 + i4;
        d30Var.Hw += i4;
    }

    @Override // abcd.p30
    public int j6() {
        return this.FH;
    }
}
