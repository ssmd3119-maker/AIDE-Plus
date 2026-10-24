package abcd;

/* loaded from: classes.dex */
public class ir extends xr {
    private int DW;
    private at j6;

    public ir(int i) {
        this.j6 = new at(i);
    }

    @Override // abcd.xr
    public qp DW(qp qpVar) {
        int iRo;
        if (qpVar == null) {
            return null;
        }
        try {
            iRo = this.j6.ro(qpVar.Mr());
        } catch (IndexOutOfBoundsException unused) {
            iRo = -1;
        }
        if (iRo >= 0) {
            return qpVar.g3(iRo);
        }
        throw new RuntimeException("no mapping specified for register");
    }

    public void Hw(int i, int i2, int i3) {
        if (i >= this.j6.size()) {
            for (int size = i - this.j6.size(); size >= 0; size--) {
                this.j6.BT(-1);
            }
        }
        this.j6.g3(i, i2);
        int i4 = i2 + i3;
        if (this.DW < i4) {
            this.DW = i4;
        }
    }

    @Override // abcd.xr
    public int j6() {
        return this.DW;
    }

    public int v5(int i) {
        if (i >= this.j6.size()) {
            return -1;
        }
        return this.j6.ro(i);
    }
}
