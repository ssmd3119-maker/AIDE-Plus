package abcd;

/* loaded from: classes.dex */
public final class kh extends gh {
    private final os DW;

    public kh(String str, os osVar, cq cqVar) {
        super(str);
        if (osVar == null) {
            throw new NullPointerException("data == null");
        }
        this.DW = osVar;
    }

    @Override // abcd.ti
    public int DW() {
        return this.DW.XL() + 6;
    }

    public kh(String str, os osVar, int i, int i2, cq cqVar) {
        this(str, osVar.aM(i, i2 + i), cqVar);
    }
}
