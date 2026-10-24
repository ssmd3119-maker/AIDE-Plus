package abcd;

/* loaded from: classes.dex */
public abstract class hh extends gh {
    private final wh DW;

    public hh(String str, wh whVar) {
        super(str);
        try {
            if (whVar.FH()) {
                throw new ht("localVariables.isMutable()");
            }
            this.DW = whVar;
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // abcd.ti
    public final int DW() {
        return (this.DW.size() * 10) + 8;
    }

    public final wh j6() {
        return this.DW;
    }
}
