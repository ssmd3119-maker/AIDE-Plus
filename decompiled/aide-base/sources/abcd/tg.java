package abcd;

/* loaded from: classes.dex */
public final class tg extends gh {
    private final hr DW;

    public tg(hr hrVar) {
        super("Exceptions");
        try {
            if (hrVar.FH()) {
                throw new ht("exceptions.isMutable()");
            }
            this.DW = hrVar;
        } catch (NullPointerException unused) {
            throw new NullPointerException("exceptions == null");
        }
    }

    @Override // abcd.ti
    public int DW() {
        return (this.DW.size() * 2) + 8;
    }

    public hr j6() {
        return this.DW;
    }
}
