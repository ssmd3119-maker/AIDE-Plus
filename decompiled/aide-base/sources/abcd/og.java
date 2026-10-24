package abcd;

/* loaded from: classes.dex */
public final class og extends gh {
    private final bq DW;
    private final int FH;

    public og(bq bqVar, int i) {
        super("AnnotationDefault");
        if (bqVar == null) {
            throw new NullPointerException("value == null");
        }
        this.DW = bqVar;
        this.FH = i;
    }

    @Override // abcd.ti
    public int DW() {
        return this.FH + 6;
    }

    public bq j6() {
        return this.DW;
    }
}
