package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class hs {
    private final ArrayList<bt> j6;

    public hs(int i) {
        this.j6 = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.j6.add(zr.DW(i));
        }
    }

    private void DW(int i) {
        this.j6.ensureCapacity(i);
        for (int size = this.j6.size(); size < i; size++) {
            this.j6.add(zr.DW(i));
        }
    }

    public void FH(int i, bt btVar) {
        if (i < this.j6.size()) {
            btVar.j6(this.j6.get(i));
        }
    }

    public void j6(int i, int i2) {
        DW(Math.max(i, i2) + 1);
        this.j6.get(i).add(i2);
        this.j6.get(i2).add(i);
    }
}
