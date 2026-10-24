package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class p10 extends m10<Iterable<k90>> {
    private t90 FH;
    private boolean Hw;
    private int VH;
    private int Zo;
    private final List<pf0> v5;

    public p10(p70 p70Var) {
        super(p70Var);
        this.Hw = false;
        this.v5 = new ArrayList();
        this.Zo = -1;
        this.VH = -1;
        this.FH = new t90(p70Var);
    }

    private p10 v5(boolean z, j60 j60Var) throws j40, q40 {
        j6();
        try {
            if (z) {
                this.FH.ef(this.FH.ro(j60Var));
                this.Hw = true;
            } else {
                this.FH.Sf(this.FH.ro(j60Var));
            }
            return this;
        } catch (j40 e) {
            throw e;
        } catch (q40 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new o20(MessageFormat.format(JGitText.DW().exceptionOccurredDuringAddingOfOptionToALogCommand, j60Var), e3);
        }
    }

    public p10 Hw(j60 j60Var) throws j40, q40 {
        v5(true, j60Var);
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: VH, reason: merged with bridge method [inline-methods] */
    public Iterable<k90> call() throws r20 {
        j6();
        if (this.v5.size() > 0) {
            this.FH.jJ(mf0.v5(qf0.j6(this.v5), sf0.DW));
        }
        int i = this.VH;
        if (i <= -1 || this.Zo <= -1) {
            int i2 = this.VH;
            if (i2 > -1) {
                this.FH.XG(ca0.Hw(i2));
            } else {
                int i3 = this.Zo;
                if (i3 > -1) {
                    this.FH.XG(aa0.Hw(i3));
                }
            }
        } else {
            this.FH.XG(y90.Hw(ca0.Hw(i), aa0.Hw(this.Zo)));
        }
        if (!this.Hw) {
            try {
                a70 a70VarRo = this.j6.ro("HEAD");
                if (a70VarRo == null) {
                    throw new r20(JGitText.DW().noHEADExistsAndNoExplicitStartingRevisionWasSpecified);
                }
                Hw(a70VarRo);
            } catch (IOException e) {
                throw new o20(JGitText.DW().anExceptionOccurredWhileTryingToAddTheIdOfHEAD, e);
            }
        }
        FH(false);
        return this.FH;
    }

    public p10 Zo(j60 j60Var, j60 j60Var2) throws j40, q40 {
        gn(j60Var);
        Hw(j60Var2);
        return this;
    }

    public p10 gn(j60 j60Var) throws j40, q40 {
        v5(false, j60Var);
        return this;
    }
}
