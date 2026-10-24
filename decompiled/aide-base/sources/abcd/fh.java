package abcd;

/* loaded from: classes.dex */
public abstract class fh extends gh {
    private final yo DW;
    private final int FH;

    public fh(String str, yo yoVar, int i) {
        super(str);
        try {
            if (yoVar.FH()) {
                throw new ht("annotations.isMutable()");
            }
            this.DW = yoVar;
            this.FH = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // abcd.ti
    public final int DW() {
        return this.FH + 6;
    }

    public final yo j6() {
        return this.DW;
    }
}
