package abcd;

/* loaded from: classes.dex */
public enum kc0 {
    MISSING,
    UNINITIALIZED,
    INITIALIZED,
    REV_CHECKED_OUT;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static kc0[] valuesCustom() {
        kc0[] kc0VarArrValuesCustom = values();
        int length = kc0VarArrValuesCustom.length;
        kc0[] kc0VarArr = new kc0[length];
        System.arraycopy(kc0VarArrValuesCustom, 0, kc0VarArr, 0, length);
        return kc0VarArr;
    }
}
