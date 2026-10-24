package abcd;

/* loaded from: classes.dex */
public final class vg extends gh {
    private final vh DW;

    public vg(vh vhVar) {
        super("LineNumberTable");
        try {
            if (vhVar.FH()) {
                throw new ht("lineNumbers.isMutable()");
            }
            this.DW = vhVar;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // abcd.ti
    public int DW() {
        return (this.DW.size() * 4) + 8;
    }

    public vh j6() {
        return this.DW;
    }
}
