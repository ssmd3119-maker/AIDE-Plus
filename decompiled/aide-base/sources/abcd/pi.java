package abcd;

/* loaded from: classes.dex */
public final class pi extends qi {
    private final fj VH;

    public pi(oi oiVar, zq zqVar, int i, li liVar) {
        super(oiVar, zqVar, i, liVar);
        this.VH = new fj(DW());
    }

    public fj EQ() {
        gn();
        return this.VH;
    }

    @Override // abcd.qi
    public String Zo() {
        return "field";
    }

    @Override // abcd.qi
    public int j6() {
        return 1;
    }

    @Override // abcd.qi
    public yi u7(int i, int i2, wq wqVar, ui uiVar) {
        ej ejVar = new ej(FH(), i2, wqVar, uiVar);
        this.VH.sG(i, ejVar);
        return ejVar;
    }

    @Override // abcd.qi
    public String v5(int i) {
        return bp.DW(i);
    }
}
