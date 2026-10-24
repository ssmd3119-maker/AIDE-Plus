package abcd;

import abcd.q60;

/* loaded from: classes.dex */
public class s60 {
    public static final q60.b<s60> v5 = new a();
    private final int DW;
    private final boolean FH;
    private final String Hw;
    private final int j6;

    class a implements q60.b<s60> {
        @Override // abcd.q60.b
        /* renamed from: DW, reason: merged with bridge method [inline-methods] */
        public s60 j6(q60 q60Var) {
            return new s60(q60Var, null);
        }
    }

    public enum b {
        FALSE,
        TRUE,
        INPUT;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    private s60(q60 q60Var) {
        this.j6 = q60Var.QX("core", "compression", -1);
        this.DW = q60Var.QX("pack", "indexversion", 2);
        this.FH = q60Var.J0("core", "logallrefupdates", true);
        this.Hw = q60Var.lg("core", null, "excludesfile");
    }

    public String DW() {
        return this.Hw;
    }

    public int FH() {
        return this.DW;
    }

    public boolean Hw() {
        return this.FH;
    }

    public int j6() {
        return this.j6;
    }

    public /* synthetic */ s60(q60 q60Var, s60 s60Var) {
        this(q60Var);
    }
}
