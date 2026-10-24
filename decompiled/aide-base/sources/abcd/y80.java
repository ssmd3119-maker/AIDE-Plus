package abcd;

import abcd.z80;

/* loaded from: classes.dex */
public class y80 extends d90 {
    private final int DW;
    private final t90 FH;
    private final m90 Hw;
    private final a90 j6 = new a90();
    private final m90 v5;

    /* JADX WARN: Multi-variable type inference failed */
    public y80(z80 z80Var, d90 d90Var) {
        this.FH = (t90) z80Var;
        this.DW = z80Var.DW();
        this.Hw = z80Var.j6();
        this.v5 = z80Var.Hw();
        d90Var.FH(this.j6);
        while (true) {
            k90 k90VarJ6 = d90Var.j6();
            if (k90VarJ6 == null) {
                return;
            }
            if (((z80.a) k90VarJ6).oY() == 0) {
                this.j6.Hw(k90VarJ6);
            }
        }
    }

    @Override // abcd.d90
    public int DW() {
        return this.j6.DW() | 16;
    }

    @Override // abcd.d90
    public void FH(u80 u80Var) {
        this.j6.FH(u80Var);
    }

    @Override // abcd.d90
    public k90 j6() {
        z80.a aVar;
        boolean z;
        do {
            aVar = (z80.a) this.j6.j6();
            if (aVar == null) {
                return null;
            }
            if ((aVar.cT & 1) == 0) {
                aVar.OW(this.FH);
            }
            int i = aVar.iW + 1;
            z = false;
            for (k90 k90Var : aVar.Z1) {
                z80.a aVar2 = (z80.a) k90Var;
                if (aVar2.iW == -1) {
                    aVar2.iW = i;
                    if (i <= this.DW) {
                        this.j6.Hw(k90Var);
                    }
                }
                if (aVar.lp(this.Hw) || aVar.lp(this.v5)) {
                    k90Var.x9(this.v5);
                    k90Var.cT &= -5;
                }
            }
            boolean z2 = aVar.iW <= this.DW;
            if ((aVar.cT & 4) == 0 || aVar.lp(this.Hw)) {
                z = z2;
            }
        } while (!z);
        return aVar;
    }
}
