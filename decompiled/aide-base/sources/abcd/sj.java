package abcd;

/* loaded from: classes.dex */
public final class sj {
    private final wj[] DW;
    private final wj[] FH;
    private final wj[] j6;

    public sj(up upVar) {
        int iEf = upVar.DW().ef();
        this.j6 = new wj[iEf];
        this.DW = new wj[iEf];
        this.FH = new wj[iEf];
        v5(upVar);
    }

    private void v5(up upVar) {
        dp dpVarDW = upVar.DW();
        int size = dpVarDW.size();
        for (int i = 0; i < size; i++) {
            cp cpVarCa = dpVarDW.ca(i);
            int iJ6 = cpVarCa.j6();
            this.j6[iJ6] = new wj(cpVarCa.Hw().Sf(0).we());
            wp wpVarWe = cpVarCa.v5().we();
            this.DW[iJ6] = new wj(wpVarWe);
            this.FH[iJ6] = new wj(wpVarWe);
        }
    }

    public wj DW(cp cpVar) {
        return this.DW[cpVar.j6()];
    }

    public wj FH(int i) {
        return this.j6[i];
    }

    public wj Hw(cp cpVar) {
        return this.j6[cpVar.j6()];
    }

    public wj j6(cp cpVar) {
        return this.FH[cpVar.j6()];
    }
}
