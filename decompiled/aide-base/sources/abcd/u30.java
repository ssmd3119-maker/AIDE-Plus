package abcd;

import abcd.p30;

/* loaded from: classes.dex */
public final class u30<S extends p30> extends q30<t30<S>> {
    private final q30<? super S> j6;

    public u30(q30<? super S> q30Var) {
        this.j6 = q30Var;
    }

    @Override // abcd.q30
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public boolean j6(t30<S> t30Var, int i, t30<S> t30Var2, int i2) {
        return this.j6.j6(t30Var.j6, i + t30Var.DW, t30Var2.j6, i2 + t30Var2.DW);
    }

    @Override // abcd.q30
    /* renamed from: v5, reason: merged with bridge method [inline-methods] */
    public int DW(t30<S> t30Var, int i) {
        return this.j6.DW(t30Var.j6, i + t30Var.DW);
    }
}
