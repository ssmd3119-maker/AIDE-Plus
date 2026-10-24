package abcd;

import abcd.q60;

/* loaded from: classes.dex */
public class pb0 {
    static final q60.b<pb0> Hw = new a();
    private final boolean DW;
    private final boolean FH;
    private final int j6;

    class a implements q60.b<pb0> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public pb0 j6(q60 q60Var) {
            return new pb0(q60Var, null);
        }
    }

    private pb0(q60 q60Var) {
        this.j6 = ((s60) q60Var.tp(s60.v5)).j6();
        this.DW = q60Var.J0("core", "fsyncobjectfiles", false);
        this.FH = q60Var.J0("core", "fsyncreffiles", false);
    }

    public boolean DW() {
        return this.DW;
    }

    public boolean FH() {
        return this.FH;
    }

    public int j6() {
        return this.j6;
    }

    public /* synthetic */ pb0(q60 q60Var, pb0 pb0Var) {
        this(q60Var);
    }
}
