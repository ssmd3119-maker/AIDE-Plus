package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public class gs {
    private final dp DW;
    private final dp FH;
    private final up j6;

    public gs(up upVar) {
        this.j6 = upVar;
        dp dpVarDW = upVar.DW();
        this.DW = dpVarDW;
        this.FH = dpVarDW.sy();
    }

    private static boolean DW(cp cpVar, cp cpVar2) {
        return cpVar.Hw().sG(cpVar2.Hw());
    }

    private void Hw(cp cpVar, int i, int i2) {
        at atVarEf = cpVar.gn().ef();
        atVarEf.g3(atVarEf.sh(i), i2);
        int iZo = cpVar.Zo();
        if (iZo != i) {
            i2 = iZo;
        }
        atVarEf.Mr();
        cp cpVar2 = new cp(cpVar.j6(), cpVar.Hw(), atVarEf, i2);
        dp dpVar = this.FH;
        dpVar.br(dpVar.Sf(cpVar.j6()), cpVar2);
    }

    private void j6(int i, at atVar) {
        int size = atVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iRo = atVar.ro(i2);
            at atVarHw = this.j6.Hw(this.DW.lp(iRo).j6());
            int size2 = atVarHw.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Hw(this.FH.lp(atVarHw.ro(i3)), iRo, i);
            }
        }
    }

    public up FH() {
        int size = this.DW.size();
        BitSet bitSet = new BitSet(this.DW.ef());
        for (int i = 0; i < size; i++) {
            cp cpVarCa = this.DW.ca(i);
            if (!bitSet.get(cpVarCa.j6())) {
                at atVarHw = this.j6.Hw(cpVarCa.j6());
                int size2 = atVarHw.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iRo = atVarHw.ro(i2);
                    cp cpVarLp = this.DW.lp(iRo);
                    if (!bitSet.get(iRo) && cpVarLp.gn().size() <= 1 && cpVarLp.FH().EQ().Hw() != 55) {
                        at atVar = new at();
                        for (int i3 = i2 + 1; i3 < size2; i3++) {
                            int iRo2 = atVarHw.ro(i3);
                            cp cpVarLp2 = this.DW.lp(iRo2);
                            if (cpVarLp2.gn().size() == 1 && DW(cpVarLp, cpVarLp2)) {
                                atVar.BT(iRo2);
                                bitSet.set(iRo2);
                            }
                        }
                        j6(iRo, atVar);
                    }
                }
            }
        }
        for (int i4 = size - 1; i4 >= 0; i4--) {
            if (bitSet.get(this.FH.ca(i4).j6())) {
                this.FH.br(i4, null);
            }
        }
        this.FH.ro();
        this.FH.Mr();
        return new up(this.FH, this.j6.FH());
    }
}
