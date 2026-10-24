package abcd;

/* loaded from: classes.dex */
public class w80 extends r80 {
    private a FH;
    private a Hw;

    static class a {
        k90 DW;
        a j6;
    }

    public w80() {
    }

    private a tp(k90 k90Var) {
        a aVar = this.Hw;
        if (aVar == null) {
            aVar = new a();
        } else {
            this.Hw = aVar.j6;
        }
        aVar.DW = k90Var;
        return aVar;
    }

    private void u7(a aVar) {
        aVar.j6 = this.Hw;
        this.Hw = aVar;
    }

    @Override // abcd.r80, abcd.d90
    public int DW() {
        return this.j6 | 1;
    }

    public k90 EQ() {
        a aVar = this.FH;
        if (aVar != null) {
            return aVar.DW;
        }
        return null;
    }

    @Override // abcd.r80
    public void Hw(k90 k90Var) {
        a aVar;
        a aVar2 = this.FH;
        long j = k90Var.n5;
        a aVarTp = tp(k90Var);
        if (aVar2 == null || j > aVar2.DW.n5) {
            aVarTp.j6 = aVar2;
            this.FH = aVarTp;
            return;
        }
        a aVar3 = aVar2.j6;
        while (true) {
            a aVar4 = aVar3;
            aVar = aVar2;
            aVar2 = aVar4;
            if (aVar2 == null || aVar2.DW.n5 <= j) {
                break;
            } else {
                aVar3 = aVar2.j6;
            }
        }
        aVarTp.j6 = aVar.j6;
        aVar.j6 = aVarTp;
    }

    public void VH() {
        this.FH = null;
        this.Hw = null;
    }

    public boolean gn(int i) {
        for (a aVar = this.FH; aVar != null; aVar = aVar.j6) {
            if ((aVar.DW.cT & i) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // abcd.r80, abcd.d90
    public k90 j6() {
        a aVar = this.FH;
        if (aVar == null) {
            return null;
        }
        this.FH = aVar.j6;
        u7(aVar);
        return aVar.DW;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (a aVar = this.FH; aVar != null; aVar = aVar.j6) {
            r80.Zo(sb, aVar.DW);
        }
        return sb.toString();
    }

    @Override // abcd.r80
    public boolean v5(int i) {
        for (a aVar = this.FH; aVar != null; aVar = aVar.j6) {
            if ((aVar.DW.cT & i) != 0) {
                return true;
            }
        }
        return false;
    }

    public w80(d90 d90Var) {
        while (true) {
            k90 k90VarJ6 = d90Var.j6();
            if (k90VarJ6 == null) {
                return;
            } else {
                Hw(k90VarJ6);
            }
        }
    }
}
