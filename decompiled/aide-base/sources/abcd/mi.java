package abcd;

/* loaded from: classes.dex */
public final class mi {
    private final int DW;
    private final int FH;
    private final li Hw;
    private cj VH;
    private int Zo;
    private final oi j6;
    private final dj v5;

    public mi(oi oiVar, int i, int i2, li liVar) {
        if (oiVar == null) {
            throw new NullPointerException("cf == null");
        }
        if (liVar == null) {
            throw new NullPointerException("attributeFactory == null");
        }
        int iJ8 = oiVar.Hw().J8(i2);
        this.j6 = oiVar;
        this.DW = i;
        this.FH = i2;
        this.Hw = liVar;
        this.v5 = new dj(iJ8);
        this.Zo = -1;
    }

    private void FH() {
        int size = this.v5.size();
        int iDW = this.FH + 2;
        os osVarHw = this.j6.Hw();
        cj cjVar = this.VH;
        if (cjVar != null) {
            cjVar.FH(osVarHw, this.FH, 2, "attributes_count: " + xs.VH(size));
        }
        for (int i = 0; i < size; i++) {
            try {
                if (this.VH != null) {
                    this.VH.FH(osVarHw, iDW, 0, "\nattributes[" + i + "]:\n");
                    this.VH.DW(1);
                }
                ti tiVarJ6 = this.Hw.j6(this.j6, this.DW, iDW, this.VH);
                iDW += tiVarJ6.DW();
                this.v5.ef(i, tiVarJ6);
                if (this.VH != null) {
                    this.VH.DW(-1);
                    this.VH.FH(osVarHw, iDW, 0, "end attributes[" + i + "]\n");
                }
            } catch (bj e) {
                e.j6("...while parsing attributes[" + i + "]");
                throw e;
            } catch (RuntimeException e2) {
                bj bjVar = new bj(e2);
                bjVar.j6("...while parsing attributes[" + i + "]");
                throw bjVar;
            }
        }
        this.Zo = iDW;
    }

    private void Hw() {
        if (this.Zo < 0) {
            FH();
        }
    }

    public dj DW() {
        Hw();
        return this.v5;
    }

    public int j6() {
        Hw();
        return this.Zo;
    }

    public void v5(cj cjVar) {
        this.VH = cjVar;
    }
}
