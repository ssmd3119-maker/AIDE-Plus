package abcd;

import abcd.n70;

/* loaded from: classes.dex */
public class je0 {
    private final n70 j6;

    public je0(p70 p70Var, yd0 yd0Var, j60 j60Var, String str) {
        this(p70Var, yd0Var.VH(), yd0Var.gn(), yd0Var.u7(), j60Var, str);
    }

    public String DW() {
        return this.j6.gn();
    }

    public a70 FH() {
        return this.j6.u7();
    }

    public a70 Hw() {
        return this.j6.tp();
    }

    public void Zo(t90 t90Var) {
        this.j6.nw(t90Var);
    }

    public void j6(t90 t90Var) {
        this.j6.DW(t90Var);
    }

    public n70.c v5() {
        return this.j6.QX();
    }

    public je0(p70 p70Var, String str, String str2, boolean z, j60 j60Var, String str3) {
        n70 n70VarEf = p70Var.ef(str);
        this.j6 = n70VarEf;
        n70VarEf.rN(z);
        this.j6.er(j60Var);
        this.j6.BT(str3, true);
    }
}
