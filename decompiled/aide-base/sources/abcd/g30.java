package abcd;

import abcd.p30;

/* loaded from: classes.dex */
public final class g30<S extends p30> extends q30<f30<S>> {
    private final q30<? super S> j6;

    public g30(q30<? super S> q30Var) {
        this.j6 = q30Var;
    }

    @Override // abcd.q30
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public boolean j6(f30<S> f30Var, int i, f30<S> f30Var2, int i2) {
        return f30Var.DW[i] == f30Var2.DW[i2] && this.j6.j6(f30Var.j6, i, f30Var2.j6, i2);
    }

    @Override // abcd.q30
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public int DW(f30<S> f30Var, int i) {
        return f30Var.DW[i];
    }
}
