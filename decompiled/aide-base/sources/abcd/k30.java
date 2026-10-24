package abcd;

/* loaded from: classes.dex */
public abstract class k30 extends z20 {
    public abstract <S extends p30> void VH(e30 e30Var, g30<S> g30Var, f30<S> f30Var, f30<S> f30Var2, d30 d30Var);

    @Override // abcd.z20
    public <S extends p30> e30 v5(q30<? super S> q30Var, S s, S s2) {
        h30 h30Var = new h30(q30Var, s, s2);
        g30<S> g30VarFH = h30Var.FH();
        f30<S> f30VarJ6 = h30Var.j6();
        f30<S> f30VarDW = h30Var.DW();
        e30 e30Var = new e30();
        VH(e30Var, g30VarFH, f30VarJ6, f30VarDW, new d30(0, s.j6(), 0, s2.j6()));
        return e30Var;
    }
}
