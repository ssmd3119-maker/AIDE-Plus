package abcd;

/* loaded from: classes.dex */
public final class wk extends fk {
    public static final fk DW = new wk();

    private wk() {
    }

    @Override // abcd.fk
    public boolean DW(tk tkVar) {
        int iYS = tkVar.yS();
        return iYS != 0 && fk.a8(iYS);
    }

    @Override // abcd.fk
    public String EQ(zj zjVar, boolean z) {
        return fk.j6(zjVar);
    }

    @Override // abcd.fk
    public int Hw() {
        return 1;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        fk.BT(lsVar, fk.j3(zjVar, ((tk) zjVar).yS() & 255));
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
