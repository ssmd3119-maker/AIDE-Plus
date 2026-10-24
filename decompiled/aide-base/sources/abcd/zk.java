package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class zk extends fk {
    public static final fk DW = new zk();

    private zk() {
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
    public BitSet VH(zj zjVar) {
        rp rpVarWe = zjVar.we();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, fk.er(rpVarWe.sG(0).Mr()));
        return bitSet;
    }

    @Override // abcd.fk
    public void sh(ls lsVar, zj zjVar) {
        fk.BT(lsVar, fk.j3(zjVar, zjVar.we().sG(0).Mr()));
    }

    @Override // abcd.fk
    public String tp(zj zjVar) {
        return zjVar.we().sG(0).dx();
    }

    @Override // abcd.fk
    public boolean we(zj zjVar) {
        rp rpVarWe = zjVar.we();
        return (zjVar instanceof qk) && rpVarWe.size() == 1 && fk.er(rpVarWe.sG(0).Mr());
    }
}
