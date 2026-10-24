package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class f90 extends d90 {
    private final w80 DW = new w80();
    private int FH;
    private int Hw;
    private final t90 j6;
    private int v5;

    public f90(t90 t90Var) {
        this.j6 = t90Var;
    }

    private void Hw(k90 k90Var) {
        int iVH = this.j6.VH();
        int i = this.FH | iVH;
        this.FH = i;
        int i2 = k90Var.cT;
        if ((i & i2) != 0) {
            throw new IllegalStateException(MessageFormat.format(JGitText.DW().staleRevFlagsOn, k90Var.BT()));
        }
        k90Var.cT = iVH | i2;
        this.DW.Hw(k90Var);
    }

    private boolean Zo(k90 k90Var, int i) {
        boolean z = (k90Var.cT & i) == i;
        int i2 = i | k90Var.cT;
        k90Var.cT = i2;
        if ((this.v5 & i2) != this.Hw) {
            return z;
        }
        k90Var.cT = i2 & (-17);
        this.DW.Hw(k90Var);
        v5(k90Var, this.FH | 8);
        return true;
    }

    private void v5(k90 k90Var, int i) {
        int length;
        do {
            k90[] k90VarArr = k90Var.Z1;
            if (k90VarArr == null || (length = k90VarArr.length) == 0) {
                return;
            }
            for (int i2 = 1; i2 < length; i2++) {
                k90 k90Var2 = k90VarArr[i2];
                if (!Zo(k90Var2, i)) {
                    v5(k90Var2, i);
                }
            }
            k90Var = k90VarArr[0];
        } while (!Zo(k90Var, i));
    }

    @Override // abcd.d90
    public int DW() {
        return 0;
    }

    public void VH(r80 r80Var) {
        while (true) {
            try {
                k90 k90VarJ6 = r80Var.j6();
                if (k90VarJ6 == null) {
                    return;
                } else {
                    Hw(k90VarJ6);
                }
            } finally {
                this.j6.j3(this.FH);
                int i = this.FH;
                this.Hw = i | 16;
                this.v5 = i | 16 | 8;
            }
        }
    }

    @Override // abcd.d90
    public k90 j6() {
        while (true) {
            k90 k90VarJ6 = this.DW.j6();
            if (k90VarJ6 == null) {
                this.j6.mb.U2();
                return null;
            }
            for (k90 k90Var : k90VarJ6.Z1) {
                int i = k90Var.cT;
                if ((i & 2) == 0) {
                    if ((i & 1) == 0) {
                        k90Var.OW(this.j6);
                    }
                    k90Var.cT |= 2;
                    this.DW.Hw(k90Var);
                }
            }
            int i2 = k90VarJ6.cT;
            int i3 = this.FH;
            int i4 = i2 & i3;
            boolean z = i4 == i3;
            if (z) {
                i4 |= 8;
            }
            v5(k90VarJ6, i4);
            int i5 = k90VarJ6.cT;
            if ((i5 & 8) == 0) {
                int i6 = i5 | 16;
                k90VarJ6.cT = i6;
                if (z) {
                    k90VarJ6.cT = i6 | 8;
                    return k90VarJ6;
                }
            } else if (this.DW.gn(8)) {
                return null;
            }
        }
    }
}
