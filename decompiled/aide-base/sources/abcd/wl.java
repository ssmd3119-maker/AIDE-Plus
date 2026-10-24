package abcd;

/* loaded from: classes.dex */
public final class wl extends fk {
    public static final fk DW = new wl();

    private wl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return z ? fk.gn(zjVar) : "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 5;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.ei(lsVar, fk.aM(zjVar), ((xj) zjVar).er(), (short) rpVarWe.ef(), (short) (rpVarWe.size() != 0 ? rpVarWe.sG(0).Mr() : 0));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return fk.U2(zjVar.we()) + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        if (!fk.j6 || !(zjVar instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) zjVar;
        bq bqVarRN = xjVar.rN();
        if (!(bqVarRN instanceof vq) && !(bqVarRN instanceof zq)) {
            return false;
        }
        rp rpVarWe = xjVar.we();
        rpVarWe.size();
        return rpVarWe.size() == 0 || (fk.J0(rpVarWe) && fk.gW(rpVarWe.sG(0).Mr()) && fk.gW(rpVarWe.ef()));
    }
}
