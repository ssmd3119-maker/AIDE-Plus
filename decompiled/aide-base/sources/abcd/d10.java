package abcd;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d10 {
    public static final d10 DW = new d10(a.OK, null);
    public static final d10 FH = new d10(a.ERROR, null);
    public static final d10 Hw = new d10(a.NOT_TRIED, null);
    private final a j6;

    public enum a {
        NOT_TRIED,
        OK,
        CONFLICTS,
        NONDELETED,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public d10(a aVar, List<String> list) {
        this.j6 = aVar;
        if (aVar != a.CONFLICTS) {
            new ArrayList(0);
        }
        if (aVar == a.NONDELETED) {
            return;
        }
        new ArrayList(0);
    }

    public a j6() {
        return this.j6;
    }
}
