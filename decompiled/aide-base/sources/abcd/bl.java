package abcd;

/* loaded from: classes.dex */
public final class bl extends fk {
    public static final fk DW = new bl();

    private bl() {
    }

    @Override // abcd.fk
    public boolean DW(tk tkVar) {
        int iYS = tkVar.yS();
        return iYS != 0 && fk.rN(iYS);
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.j6(zjVar);
    }

    @Override // abcd.fk
    public int Hw() {
        return 2;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        fk.SI(lsVar, fk.j3(zjVar, 0), (short) ((tk) zjVar).yS());
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return fk.FH(zjVar);
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        if (!(zjVar instanceof tk) || zjVar.we().size() != 0) {
            return false;
        }
        tk tkVar = (tk) zjVar;
        if (tkVar.gW()) {
            return DW(tkVar);
        }
        return true;
    }
}
