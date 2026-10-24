package abcd;

import abcd.u80;

/* loaded from: classes.dex */
public class e90 extends u80 {
    private u80.a Hw;

    public e90(d90 d90Var) {
        super(d90Var);
    }

    @Override // abcd.r80
    public void Hw(k90 k90Var) {
        u80.a aVarDW = this.Hw;
        if (aVarDW == null || !aVarDW.DW()) {
            aVarDW = this.FH.DW();
            aVarDW.VH();
            aVarDW.j6 = this.Hw;
            this.Hw = aVarDW;
        }
        aVarDW.u7(k90Var);
    }

    @Override // abcd.r80, abcd.d90
    public k90 j6() {
        u80.a aVar = this.Hw;
        if (aVar == null) {
            return null;
        }
        k90 k90VarZo = aVar.Zo();
        if (aVar.Hw()) {
            this.Hw = aVar.j6;
            this.FH.j6(aVar);
        }
        return k90VarZo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (u80.a aVar = this.Hw; aVar != null; aVar = aVar.j6) {
            for (int i = aVar.FH; i < aVar.Hw; i++) {
                r80.Zo(sb, aVar.DW[i]);
            }
        }
        return sb.toString();
    }

    @Override // abcd.r80
    public boolean v5(int i) {
        for (u80.a aVar = this.Hw; aVar != null; aVar = aVar.j6) {
            for (int i2 = aVar.FH; i2 < aVar.Hw; i2++) {
                if ((aVar.DW[i2].cT & i) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
