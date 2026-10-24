package abcd;

/* loaded from: classes.dex */
public abstract class ih extends gh {
    private final zo DW;
    private final int FH;

    public ih(String str, zo zoVar, int i) {
        super(str);
        try {
            if (zoVar.FH()) {
                throw new ht("parameterAnnotations.isMutable()");
            }
            this.DW = zoVar;
            this.FH = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // abcd.ti
    public final int DW() {
        return this.FH + 6;
    }

    public final zo j6() {
        return this.DW;
    }
}
