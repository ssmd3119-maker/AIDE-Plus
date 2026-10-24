package abcd;

/* loaded from: classes.dex */
public final class up {
    private final int DW;
    private at[] FH;
    private at Hw;
    private final dp j6;

    public up(dp dpVar, int i) {
        if (dpVar == null) {
            throw new NullPointerException("blocks == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("firstLabel < 0");
        }
        this.j6 = dpVar;
        this.DW = i;
        this.FH = null;
        this.Hw = null;
    }

    private void j6() {
        int iEf = this.j6.ef();
        at[] atVarArr = new at[iEf];
        at atVar = new at(10);
        int size = this.j6.size();
        for (int i = 0; i < size; i++) {
            cp cpVarCa = this.j6.ca(i);
            int iJ6 = cpVarCa.j6();
            at atVarGn = cpVarCa.gn();
            int size2 = atVarGn.size();
            if (size2 == 0) {
                atVar.BT(iJ6);
            } else {
                for (int i2 = 0; i2 < size2; i2++) {
                    int iRo = atVarGn.ro(i2);
                    at atVar2 = atVarArr[iRo];
                    if (atVar2 == null) {
                        atVar2 = new at(10);
                        atVarArr[iRo] = atVar2;
                    }
                    atVar2.BT(iJ6);
                }
            }
        }
        for (int i3 = 0; i3 < iEf; i3++) {
            at atVar3 = atVarArr[i3];
            if (atVar3 != null) {
                atVar3.I();
                atVar3.Mr();
            }
        }
        atVar.I();
        atVar.Mr();
        int i4 = this.DW;
        if (atVarArr[i4] == null) {
            atVarArr[i4] = at.qp;
        }
        this.FH = atVarArr;
        this.Hw = atVar;
    }

    public dp DW() {
        return this.j6;
    }

    public int FH() {
        return this.DW;
    }

    public at Hw(int i) {
        if (this.Hw == null) {
            j6();
        }
        at atVar = this.FH[i];
        if (atVar != null) {
            return atVar;
        }
        throw new RuntimeException("no such block: " + xs.VH(i));
    }
}
