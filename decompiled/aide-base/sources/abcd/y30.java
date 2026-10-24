package abcd;

import java.text.MessageFormat;
import java.util.Arrays;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class y30 extends v30 {
    private boolean Hw;

    public y30(w30 w30Var, int i) {
        super(w30Var, i);
    }

    private b40 J0(int i, jf0 jf0Var) {
        b40 b40Var = new b40(jf0Var.Ws(), i);
        ef0 ef0VarQX = jf0Var.QX(0, ef0.class);
        b40Var.a8(jf0Var.gn(0));
        b40Var.gW(ef0VarQX.QX(), ef0VarQX.aM());
        return b40Var;
    }

    private void tp(b40 b40Var) {
        int i;
        if (!this.Hw || (i = this.FH) <= 0) {
            return;
        }
        b40 b40Var2 = this.DW[i - 1];
        int iFH = w30.FH(b40Var2, b40Var);
        if (iFH > 0) {
            this.Hw = false;
            return;
        }
        if (iFH == 0) {
            int iWe = b40Var2.we();
            int iWe2 = b40Var.we();
            if (iWe == iWe2) {
                throw u7(b40Var, JGitText.DW().duplicateStagesNotAllowed);
            }
            if (iWe == 0 || iWe2 == 0) {
                throw u7(b40Var, JGitText.DW().mixedStagesNotAllowed);
            }
            if (iWe > iWe2) {
                this.Hw = false;
            }
        }
    }

    private static IllegalStateException u7(b40 b40Var, String str) {
        return new IllegalStateException(String.valueOf(str) + ": " + b40Var.we() + " " + b40Var.tp());
    }

    private void we() {
        Arrays.sort(this.DW, 0, this.FH, w30.J8);
        for (int i = 1; i < this.FH; i++) {
            b40[] b40VarArr = this.DW;
            b40 b40Var = b40VarArr[i - 1];
            b40 b40Var2 = b40VarArr[i];
            if (w30.FH(b40Var, b40Var2) == 0) {
                int iWe = b40Var.we();
                int iWe2 = b40Var2.we();
                if (iWe == iWe2) {
                    throw u7(b40Var2, JGitText.DW().duplicateStagesNotAllowed);
                }
                if (iWe == 0 || iWe2 == 0) {
                    throw u7(b40Var2, JGitText.DW().mixedStagesNotAllowed);
                }
            }
        }
        this.Hw = true;
    }

    public void EQ(int i, int i2) {
        tp(this.j6.we(i));
        FH(i, i2);
    }

    @Override // abcd.v30
    public void Hw() {
        if (!this.Hw) {
            we();
        }
        Zo();
    }

    public void VH(b40 b40Var) {
        if (b40Var.EQ() == 0) {
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().fileModeNotSetForPath, b40Var.tp()));
        }
        tp(b40Var);
        DW(b40Var);
    }

    public void gn(byte[] bArr, int i, g70 g70Var, j60 j60Var) {
        jf0 jf0Var = new jf0(g70Var);
        jf0Var.DW(new ff0(bArr, g70Var, j60Var.cn()));
        jf0Var.KD(true);
        if (jf0Var.rN()) {
            b40 b40VarJ0 = J0(i, jf0Var);
            tp(b40VarJ0);
            DW(b40VarJ0);
            while (jf0Var.rN()) {
                DW(J0(i, jf0Var));
            }
        }
    }
}
