package abcd;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public class nf0 extends sf0 {
    private final int FH;
    private final int Hw;
    private final LinkedList<String> VH;
    private final Set<String> Zo;
    private final LinkedList<String> gn;
    private final boolean v5;

    public nf0(int i, int i2) {
        this(i, i2, true);
    }

    private void Hw(String str) {
        String strRemoveFirst = null;
        while (!this.VH.isEmpty()) {
            if (str.startsWith(String.valueOf(this.VH.getFirst()) + "/")) {
                break;
            } else {
                strRemoveFirst = this.VH.removeFirst();
            }
        }
        if (strRemoveFirst != null) {
            while (!this.gn.isEmpty() && this.gn.getLast().startsWith(strRemoveFirst)) {
                this.gn.removeLast();
            }
            this.gn.addLast(strRemoveFirst);
        }
    }

    private kf0 Zo(jf0 jf0Var) {
        return (kf0) jf0Var.QX(this.Hw, kf0.class);
    }

    @Override // abcd.sf0
    public boolean DW(jf0 jf0Var) {
        int iXL = jf0Var.XL();
        int iJ8 = jf0Var.J8(this.Hw);
        String strJ0 = jf0Var.J0();
        if (!jf0Var.Mr()) {
            if (t60.Hw.Hw(iJ8)) {
                Hw(strJ0);
                this.VH.addFirst(strJ0);
            }
            int i = 0;
            while (true) {
                if (i >= iXL) {
                    break;
                }
                int iJ82 = jf0Var.J8(i);
                if (i != this.Hw && iJ82 != 0 && t60.Hw.Hw(iJ82)) {
                    this.VH.clear();
                    break;
                }
                i++;
            }
        }
        if (iJ8 == 0) {
            return true;
        }
        int iJ83 = jf0Var.J8(this.FH);
        kf0 kf0VarZo = Zo(jf0Var);
        if (iJ83 != 0) {
            if (jf0Var.a8()) {
                return true;
            }
            for (int i2 = 0; i2 < iXL; i2++) {
                if (i2 != this.FH && i2 != this.Hw && (jf0Var.J8(i2) != iJ83 || !jf0Var.aM(i2, this.FH))) {
                    return true;
                }
            }
            return kf0VarZo.OW(((c40) jf0Var.QX(this.FH, c40.class)).vy(), true);
        }
        if (!this.v5 || !kf0VarZo.aj()) {
            return true;
        }
        this.Zo.add(kf0VarZo.we());
        int i3 = 0;
        while (i3 < iXL && (i3 == this.FH || i3 == this.Hw || jf0Var.J8(i3) == 0)) {
            i3++;
        }
        return i3 != iXL;
    }

    @Override // abcd.sf0
    public boolean FH() {
        return true;
    }

    @Override // abcd.sf0
    /* renamed from: j6 */
    public sf0 clone() {
        return this;
    }

    @Override // abcd.sf0
    public String toString() {
        return "INDEX_DIFF_FILTER";
    }

    public Set<String> v5() {
        return this.Zo;
    }

    public nf0(int i, int i2, boolean z) {
        this.Zo = new HashSet();
        this.VH = new LinkedList<>();
        this.gn = new LinkedList<>();
        this.FH = i;
        this.Hw = i2;
        this.v5 = z;
    }
}
