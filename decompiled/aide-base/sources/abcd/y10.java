package abcd;

/* loaded from: classes.dex */
public class y10 extends m10<x10> {
    private kf0 FH;

    public y10(p70 p70Var) {
        super(p70Var);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public x10 call() {
        if (this.FH == null) {
            this.FH = new hf0(this.j6);
        }
        u60 u60Var = new u60(this.j6, "HEAD", this.FH);
        u60Var.j6();
        return new x10(u60Var);
    }
}
