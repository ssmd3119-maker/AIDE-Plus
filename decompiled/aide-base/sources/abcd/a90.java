package abcd;

import abcd.u80;

/* loaded from: classes.dex */
public class a90 extends u80 {
    private u80.a Hw;
    private u80.a v5;

    public a90() {
    }

    @Override // abcd.r80
    public void Hw(k90 k90Var) {
        u80.a aVarDW = this.v5;
        if (aVarDW == null) {
            u80.a aVarDW2 = this.FH.DW();
            aVarDW2.j6(k90Var);
            this.Hw = aVarDW2;
            this.v5 = aVarDW2;
            return;
        }
        if (aVarDW.v5()) {
            aVarDW = this.FH.DW();
            this.v5.j6 = aVarDW;
            this.v5 = aVarDW;
        }
        aVarDW.j6(k90Var);
    }

    public void VH(int i) {
        int i2 = i ^ (-1);
        for (u80.a aVar = this.Hw; aVar != null; aVar = aVar.j6) {
            for (int i3 = aVar.FH; i3 < aVar.Hw; i3++) {
                aVar.DW[i3].cT &= i2;
            }
        }
    }

    public void gn(k90 k90Var) {
        u80.a aVar = this.Hw;
        if (aVar == null) {
            u80.a aVarDW = this.FH.DW();
            aVarDW.gn();
            aVarDW.j6(k90Var);
            this.Hw = aVarDW;
            this.v5 = aVarDW;
            return;
        }
        if (aVar.DW()) {
            aVar.u7(k90Var);
            return;
        }
        u80.a aVarDW2 = this.FH.DW();
        aVarDW2.VH();
        aVarDW2.u7(k90Var);
        aVarDW2.j6 = this.Hw;
        this.Hw = aVarDW2;
    }

    @Override // abcd.r80, abcd.d90
    public k90 j6() {
        u80.a aVar = this.Hw;
        if (aVar == null) {
            return null;
        }
        k90 k90VarZo = aVar.Zo();
        if (aVar.Hw()) {
            u80.a aVar2 = aVar.j6;
            this.Hw = aVar2;
            if (aVar2 == null) {
                this.v5 = null;
            }
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

    public a90(d90 d90Var) {
        super(d90Var);
    }
}
