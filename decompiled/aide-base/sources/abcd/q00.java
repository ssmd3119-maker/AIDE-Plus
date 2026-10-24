package abcd;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q00 {
    private int j6 = 0;
    private int DW = 0;
    private p00 FH = new p00();
    private ArrayList<r00> Hw = new ArrayList<>();

    public void DW(int i, String str) {
        int i2 = this.DW + 1;
        this.DW = i2;
        int i3 = (i2 * 100) / this.j6;
        Iterator<r00> it = this.Hw.iterator();
        while (it.hasNext()) {
            r00 next = it.next();
            this.FH.j6(str);
            this.FH.DW(i3);
            this.FH.FH(i);
            next.j6(this.FH);
        }
    }

    public void FH(int i) {
        this.DW = i;
    }

    public void Hw(int i) {
        this.j6 = i;
    }

    public void j6() {
        this.j6 = 10000;
        this.DW = 0;
    }
}
