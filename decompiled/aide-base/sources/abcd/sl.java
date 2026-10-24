package abcd;

/* loaded from: classes.dex */
public final class sl extends fk {
    public static final fk DW = new sl();

    private sl() {
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return z ? fk.gn(zjVar) : "";
    }

    @Override // abcd.fk
    public int Hw() {
        return 3;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        rp rpVarWe = zjVar.we();
        fk.KD(lsVar, fk.j3(zjVar, rpVarWe.ef()), (short) ((xj) zjVar).er(), (short) (rpVarWe.size() != 0 ? rpVarWe.sG(0).Mr() : 0));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return fk.U2(zjVar.we()) + ", " + fk.u7(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        if (!(zjVar instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) zjVar;
        int iEr = xjVar.er();
        bq bqVarRN = xjVar.rN();
        if (!fk.gW(iEr)) {
            return false;
        }
        if (!(bqVarRN instanceof vq) && !(bqVarRN instanceof zq)) {
            return false;
        }
        rp rpVarWe = xjVar.we();
        rpVarWe.size();
        return rpVarWe.size() == 0 || (fk.J0(rpVarWe) && fk.gW(rpVarWe.sG(0).Mr()) && fk.er(rpVarWe.ef()));
    }
}
