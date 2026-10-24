package abcd;

import abcd.p30;

/* loaded from: classes.dex */
public abstract class q30<S extends p30> {
    public abstract int DW(S s, int i);

    public d30 FH(S s, S s2, d30 d30Var) {
        int i;
        while (true) {
            int i2 = d30Var.j6;
            if (i2 >= d30Var.DW || (i = d30Var.FH) >= d30Var.Hw || !j6(s, i2, s2, i)) {
                break;
            }
            d30Var.j6++;
            d30Var.FH++;
        }
        while (true) {
            int i3 = d30Var.j6;
            int i4 = d30Var.DW;
            if (i3 >= i4) {
                break;
            }
            int i5 = d30Var.FH;
            int i6 = d30Var.Hw;
            if (i5 >= i6 || !j6(s, i4 - 1, s2, i6 - 1)) {
                break;
            }
            d30Var.DW--;
            d30Var.Hw--;
        }
        return d30Var;
    }

    public abstract boolean j6(S s, int i, S s2, int i2);
}
