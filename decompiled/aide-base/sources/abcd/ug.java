package abcd;

/* loaded from: classes.dex */
public final class ug extends gh {
    private final jh DW;

    public ug(jh jhVar) {
        super("InnerClasses");
        try {
            if (jhVar.FH()) {
                throw new ht("innerClasses.isMutable()");
            }
            this.DW = jhVar;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // abcd.ti
    public int DW() {
        return (this.DW.size() * 8) + 8;
    }

    public jh j6() {
        return this.DW;
    }
}
