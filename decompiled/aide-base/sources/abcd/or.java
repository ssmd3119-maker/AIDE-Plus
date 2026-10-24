package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class or extends ir {
    private final ArrayList<ms> FH;
    private final hs Hw;

    public or(hs hsVar, int i) {
        super(i);
        this.FH = new ArrayList<>();
        this.Hw = hsVar;
    }

    private void Zo(int i, int i2) {
        int i3 = i + 1;
        this.FH.ensureCapacity(i3);
        while (i >= this.FH.size()) {
            this.FH.add(new ms(i3));
        }
        this.Hw.FH(i2, this.FH.get(i));
    }

    @Override // abcd.ir
    public void Hw(int i, int i2, int i3) {
        super.Hw(i, i2, i3);
        Zo(i2, i);
        if (i3 == 2) {
            Zo(i2 + 1, i);
        }
    }

    public boolean VH(rp rpVar, int i, int i2) {
        int size = rpVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            qp qpVarSG = rpVar.sG(i3);
            int iV5 = v5(qpVarSG.Mr());
            if (iV5 == i) {
                return true;
            }
            if (qpVarSG.J0() == 2 && iV5 + 1 == i) {
                return true;
            }
            if (i2 == 2 && iV5 == i + 1) {
                return true;
            }
        }
        return false;
    }

    public boolean gn(int i, int i2, int i3) {
        ms msVar;
        if (i2 < this.FH.size() && (msVar = this.FH.get(i2)) != null) {
            return i3 == 1 ? msVar.FH(i) : msVar.FH(i) || gn(i, i2 + 1, i3 - 1);
        }
        return false;
    }

    public boolean u7(qp qpVar, int i) {
        return gn(qpVar.Mr(), i, qpVar.J0());
    }
}
