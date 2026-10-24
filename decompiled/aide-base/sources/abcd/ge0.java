package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public abstract class ge0 extends ie0 {
    private fe0 aM;
    private be0 j3;

    public ge0(p70 p70Var, ue0 ue0Var) {
        super(p70Var, ue0Var);
        this.aM = fe0.j6();
    }

    @Override // abcd.le0
    public void Hw() {
        be0 be0Var = this.j3;
        if (be0Var != null) {
            try {
                this.aM.FH(be0Var);
            } finally {
                this.j3 = null;
            }
        }
    }

    public void Qq(fe0 fe0Var) {
        if (fe0Var == null) {
            throw new NullPointerException(JGitText.DW().theFactoryMustNotBeNull);
        }
        if (this.j3 != null) {
            throw new IllegalStateException(JGitText.DW().anSSHSessionHasBeenAlreadyCreated);
        }
        this.aM = fe0Var;
    }

    public be0 x9() {
        be0 be0Var = this.j3;
        if (be0Var != null) {
            return be0Var;
        }
        be0 be0VarDW = this.aM.DW(this.DW, EQ(), this.j6.tp(), QX() > 0 ? QX() * 1000 : 0);
        this.j3 = be0VarDW;
        return be0VarDW;
    }
}
