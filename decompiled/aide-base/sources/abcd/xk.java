package abcd;

/* loaded from: classes.dex */
public final class xk extends fk {
    public static final fk DW = new xk();

    private xk() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 1;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        fk.BT(lsVar, fk.j3(zjVar, 0));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return "";
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        return (zjVar instanceof qk) && zjVar.we().size() == 0;
    }
}
