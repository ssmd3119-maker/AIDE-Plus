package abcd;

/* loaded from: classes.dex */
public class z70 {
    private final int DW;
    private final int FH;
    private final a Hw;
    private final int j6;

    public enum a {
        NO_CONFLICT,
        FIRST_CONFLICTING_RANGE,
        NEXT_CONFLICTING_RANGE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public z70(int i, int i2, int i3, a aVar) {
        this.j6 = i;
        this.DW = i2;
        this.FH = i3;
        this.Hw = aVar;
    }

    public a DW() {
        return this.Hw;
    }

    public int FH() {
        return this.FH;
    }

    public int Hw() {
        return this.j6;
    }

    public int j6() {
        return this.DW;
    }
}
