package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lk {
    private ArrayList<zj> DW;
    private final mk j6;

    public lk(kj kjVar, int i, int i2, int i3) {
        this.j6 = new mk(kjVar, i, i3);
        this.DW = new ArrayList<>(i2);
    }

    private void FH() {
        int size = this.DW.size();
        for (int i = 0; i < size; i++) {
            this.j6.j6(this.DW.get(i));
        }
        this.DW = null;
    }

    public void DW(zj zjVar) {
        this.DW.add(zjVar);
    }

    public mk Hw() {
        if (this.DW == null) {
            throw new UnsupportedOperationException("already processed");
        }
        FH();
        return this.j6;
    }

    public void j6(zj zjVar) {
        this.j6.j6(zjVar);
    }

    public void v5(int i, wj wjVar) {
        this.j6.a8(i, wjVar);
    }
}
