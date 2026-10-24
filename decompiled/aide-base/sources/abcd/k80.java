package abcd;

/* loaded from: classes.dex */
public abstract class k80 extends e80 {
    private s90 gn;

    public k80(p70 p70Var) {
        super(p70Var);
    }

    public void tp(j60 j60Var) {
        if (j60Var != null) {
            this.gn = this.FH.sy(j60Var);
        } else {
            this.gn = null;
        }
    }

    public ef0 u7() {
        s90 s90Var = this.gn;
        return s90Var != null ? gn(s90Var) : Zo(0, 1);
    }

    @Override // abcd.e80
    public boolean v5(j60... j60VarArr) {
        if (j60VarArr.length != 2) {
            return false;
        }
        return super.v5(j60VarArr);
    }
}
