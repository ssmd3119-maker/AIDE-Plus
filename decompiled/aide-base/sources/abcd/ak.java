package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ak extends ws {
    private final int jw;

    public ak(int i, int i2) {
        super(i);
        this.jw = i2;
    }

    public static ak g3(ArrayList<zj> arrayList, int i) {
        int size = arrayList.size();
        ak akVar = new ak(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            akVar.Mz(i2, arrayList.get(i2));
        }
        akVar.Mr();
        return akVar;
    }

    public void I(ls lsVar) {
        int iFH = lsVar.FH();
        int size = size();
        if (lsVar.EQ()) {
            boolean zVH = lsVar.VH();
            for (int i = 0; i < size; i++) {
                zj zjVar = (zj) BT(i);
                int iDW = zjVar.DW() * 2;
                String strQX = (iDW != 0 || zVH) ? zjVar.QX("  ", lsVar.DW(), true) : null;
                if (strQX != null) {
                    lsVar.Hw(iDW, strQX);
                } else if (iDW != 0) {
                    lsVar.Hw(iDW, "");
                }
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            zj zjVar2 = (zj) BT(i2);
            try {
                zjVar2.lg(lsVar);
            } catch (RuntimeException e) {
                throw us.DW(e, "...while writing " + zjVar2);
            }
        }
        int iFH2 = (lsVar.FH() - iFH) / 2;
        if (iFH2 == sG()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + sG() + " but actually wrote " + iFH2);
    }

    public void Mz(int i, zj zjVar) {
        KD(i, zjVar);
    }

    public int Sf() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zj zjVar = (zj) BT(i2);
            if (zjVar instanceof xj) {
                bq bqVarRN = ((xj) zjVar).rN();
                if (bqVarRN instanceof fq) {
                    int iQX = ((fq) bqVarRN).QX(zjVar.tp().j6() == 113);
                    if (iQX > i) {
                        i = iQX;
                    }
                }
            }
        }
        return i;
    }

    public zj ef(int i) {
        return (zj) BT(i);
    }

    public int sG() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        return ef(size - 1).u7();
    }

    public int vJ() {
        return this.jw;
    }
}
