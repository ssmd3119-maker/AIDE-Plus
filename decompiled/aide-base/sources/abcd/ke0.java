package abcd;

import abcd.q60;

/* loaded from: classes.dex */
public class ke0 {
    public static final q60.b<ke0> DW = new a();
    private final boolean j6;

    class a implements q60.b<ke0> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public ke0 j6(q60 q60Var) {
            return new ke0(q60Var, null);
        }
    }

    private ke0(q60 q60Var) {
        this.j6 = q60Var.J0("receive", "fsckobjects", false);
    }

    public boolean j6() {
        return this.j6;
    }

    public /* synthetic */ ke0(q60 q60Var, ke0 ke0Var) {
        this(q60Var);
    }
}
