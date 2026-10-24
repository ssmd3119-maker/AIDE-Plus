package abcd;

/* loaded from: classes.dex */
public interface k70 {

    public enum a {
        NEW(true, false),
        LOOSE(true, false),
        PACKED(false, true),
        LOOSE_PACKED(true, true),
        NETWORK(false, false);

        private final boolean WB;
        private final boolean mb;

        a(boolean z, boolean z2) {
            this.WB = z;
            this.mb = z2;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }

        public boolean DW() {
            return this.mb;
        }

        public boolean j6() {
            return this.WB;
        }
    }

    a70 DW();

    a70 FH();

    boolean Hw();

    k70 VH();

    String getName();

    boolean gn();

    a j6();

    k70 v5();
}
