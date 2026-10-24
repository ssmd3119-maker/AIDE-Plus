package abcd;

/* loaded from: classes.dex */
public class ud0 {
    private final a70 DW;
    private final String FH;
    private b Hw;
    private String VH;
    private a Zo;
    private final a70 j6;
    private k70 v5;

    public enum a {
        NOT_ATTEMPTED,
        REJECTED_NOCREATE,
        REJECTED_NODELETE,
        REJECTED_NONFASTFORWARD,
        REJECTED_CURRENT_BRANCH,
        REJECTED_MISSING_OBJECT,
        REJECTED_OTHER_REASON,
        LOCK_FAILURE,
        OK;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public enum b {
        CREATE,
        UPDATE,
        UPDATE_NONFASTFORWARD,
        DELETE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] bVarArrValuesCustom = values();
            int length = bVarArrValuesCustom.length;
            b[] bVarArr = new b[length];
            System.arraycopy(bVarArrValuesCustom, 0, bVarArr, 0, length);
            return bVarArr;
        }
    }

    public ud0(a70 a70Var, a70 a70Var2, String str) {
        this.j6 = a70Var;
        this.DW = a70Var2;
        this.FH = str;
        this.Hw = b.UPDATE;
        if (a70.ca().aM(a70Var)) {
            this.Hw = b.CREATE;
        }
        if (a70.ca().aM(a70Var2)) {
            this.Hw = b.DELETE;
        }
        this.Zo = a.NOT_ATTEMPTED;
    }

    public a70 DW() {
        return this.DW;
    }

    public void EQ(b bVar) {
        this.Hw = bVar;
    }

    public a70 FH() {
        return this.j6;
    }

    public k70 Hw() {
        return this.v5;
    }

    public b VH() {
        return this.Hw;
    }

    public a Zo() {
        return this.Zo;
    }

    public void gn(k70 k70Var) {
        this.v5 = k70Var;
    }

    public String j6() {
        return this.VH;
    }

    public String toString() {
        return String.valueOf(VH().name()) + ": " + FH().BT() + " " + DW().BT() + " " + v5();
    }

    public void tp(a aVar, String str) {
        this.Zo = aVar;
        this.VH = str;
    }

    public void u7(a aVar) {
        tp(aVar, null);
    }

    public String v5() {
        return this.FH;
    }
}
