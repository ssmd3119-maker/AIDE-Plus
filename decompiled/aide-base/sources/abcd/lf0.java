package abcd;

import abcd.q60;
import abcd.s60;

/* loaded from: classes.dex */
public class lf0 {
    public static final q60.b<lf0> FH = new a();
    private final s60.b DW;
    private final boolean j6;

    class a implements q60.b<lf0> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public lf0 j6(q60 q60Var) {
            return new lf0(q60Var, null);
        }
    }

    private lf0(q60 q60Var) {
        this.j6 = q60Var.J0("core", "filemode", true);
        this.DW = (s60.b) q60Var.J8("core", null, "autocrlf", s60.b.FALSE);
    }

    public boolean DW() {
        return this.j6;
    }

    public s60.b j6() {
        return this.DW;
    }

    public /* synthetic */ lf0(q60 q60Var, lf0 lf0Var) {
        this(q60Var);
    }
}
