package abcd;

/* loaded from: classes.dex */
public final class ri extends qi {
    private final ij VH;

    public ri(oi oiVar, zq zqVar, int i, li liVar) {
        super(oiVar, zqVar, i, liVar);
        this.VH = new ij(DW());
    }

    public ij EQ() {
        gn();
        return this.VH;
    }

    @Override // abcd.qi
    public String Zo() {
        return "method";
    }

    @Override // abcd.qi
    public int j6() {
        return 2;
    }

    @Override // abcd.qi
    public yi u7(int i, int i2, wq wqVar, ui uiVar) {
        hj hjVar = new hj(FH(), i2, wqVar, uiVar);
        this.VH.sG(i, hjVar);
        return hjVar;
    }

    @Override // abcd.qi
    public String v5(int i) {
        return bp.EQ(i);
    }
}
