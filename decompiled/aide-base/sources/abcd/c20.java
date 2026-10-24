package abcd;

import abcd.m10;

/* loaded from: classes.dex */
public abstract class c20<C extends m10, T> extends m10<T> {
    protected vc0 FH;
    protected int Hw;
    protected d20 v5;

    public c20(p70 p70Var) {
        super(p70Var);
    }

    public C Hw(c20 c20Var) {
        c20Var.VH(this.FH);
        c20Var.gn(this.Hw);
        c20Var.u7(this.v5);
        Zo();
        return this;
    }

    public C VH(vc0 vc0Var) {
        this.FH = vc0Var;
        Zo();
        return this;
    }

    public final C Zo() {
        return this;
    }

    public C gn(int i) {
        this.Hw = i;
        Zo();
        return this;
    }

    public C u7(d20 d20Var) {
        this.v5 = d20Var;
        Zo();
        return this;
    }

    public C v5(le0 le0Var) {
        vc0 vc0Var = this.FH;
        if (vc0Var != null) {
            le0Var.dx(vc0Var);
        }
        le0Var.ca(this.Hw);
        d20 d20Var = this.v5;
        if (d20Var != null) {
            d20Var.j6(le0Var);
        }
        Zo();
        return this;
    }
}
