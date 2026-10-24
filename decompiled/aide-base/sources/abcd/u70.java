package abcd;

import abcd.k70;

/* loaded from: classes.dex */
public class u70 implements k70 {
    private final k70 DW;
    private final String j6;

    public u70(String str, k70 k70Var) {
        this.j6 = str;
        this.DW = k70Var;
    }

    @Override // abcd.k70
    public a70 DW() {
        return v5().DW();
    }

    @Override // abcd.k70
    public a70 FH() {
        return v5().FH();
    }

    @Override // abcd.k70
    public boolean Hw() {
        return v5().Hw();
    }

    @Override // abcd.k70
    public k70 VH() {
        return this.DW;
    }

    @Override // abcd.k70
    public String getName() {
        return this.j6;
    }

    @Override // abcd.k70
    public boolean gn() {
        return true;
    }

    @Override // abcd.k70
    public k70.a j6() {
        return k70.a.LOOSE;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SymbolicRef[");
        k70 k70VarVH = this;
        while (k70VarVH.gn()) {
            sb.append(k70VarVH.getName());
            sb.append(" -> ");
            k70VarVH = k70VarVH.VH();
        }
        sb.append(k70VarVH.getName());
        sb.append('=');
        sb.append(a70.I(k70VarVH.DW()));
        sb.append("]");
        return sb.toString();
    }

    @Override // abcd.k70
    public k70 v5() {
        k70 k70VarVH = VH();
        while (k70VarVH.gn()) {
            k70VarVH = k70VarVH.VH();
        }
        return k70VarVH;
    }
}
