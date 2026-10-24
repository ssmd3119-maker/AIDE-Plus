package abcd;

import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class w90 extends d90 {
    private final t90 j6;

    public w90(t90 t90Var) {
        this.j6 = t90Var;
    }

    @Override // abcd.d90
    public int DW() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // abcd.d90
    public k90 j6() {
        int i;
        d90 x80Var;
        d90 b90Var;
        t90 t90Var = this.j6;
        ba0 ba0VarEr = t90Var.er();
        sf0 sf0VarGW = t90Var.gW();
        r80 r80Var = this.j6.w9;
        t90Var.mb.j3(t90Var, t90Var.AL);
        if (ba0VarEr == ba0.DW) {
            if (sf0VarGW != sf0.j6) {
                throw new IllegalStateException(MessageFormat.format(JGitText.DW().cannotCombineTreeFilterWithRevFilter, sf0VarGW, ba0VarEr));
            }
            f90 f90Var = new f90(t90Var);
            t90 t90Var2 = this.j6;
            t90Var2.hK = f90Var;
            t90Var2.w9 = r80.DW;
            f90Var.VH(r80Var);
            return f90Var.j6();
        }
        boolean zV5 = r80Var.v5(4);
        boolean zVy = this.j6.vy(q90.BOUNDARY);
        boolean z = (zVy || !(this.j6 instanceof g90)) ? zVy : true;
        if (z && !zV5) {
            z = false;
        }
        w80 w80Var = r80Var instanceof w80 ? (w80) r80Var : new w80(r80Var);
        if (sf0VarGW != sf0.j6) {
            ba0VarEr = y90.Hw(ba0VarEr, new v90(t90Var, sf0VarGW));
            i = 6;
        } else {
            i = 0;
        }
        t90 t90Var3 = this.j6;
        t90Var3.w9 = r80Var;
        if (t90Var3 instanceof z80) {
            x80Var = new y80((z80) t90Var3, w80Var);
        } else {
            h90 h90Var = new h90(t90Var, w80Var, ba0VarEr, i);
            if (z) {
                h90Var.VH = false;
            }
            x80Var = h90Var;
        }
        if ((x80Var.DW() & 4) != 0) {
            x80Var = new u90(new a90(x80Var));
        }
        if (this.j6.vy(q90.TOPO) && (x80Var.DW() & 8) == 0) {
            x80Var = new x90(x80Var);
        }
        if (this.j6.vy(q90.REVERSE)) {
            x80Var = new e90(x80Var);
        }
        if (!z) {
            if (zV5) {
                if (w80Var.EQ() != null) {
                    x80Var = new x80(x80Var);
                }
                b90Var = new b90(x80Var);
            }
            t90Var.hK = x80Var;
            return x80Var.j6();
        }
        b90Var = new v80(t90Var, x80Var);
        x80Var = b90Var;
        t90Var.hK = x80Var;
        return x80Var.j6();
    }
}
