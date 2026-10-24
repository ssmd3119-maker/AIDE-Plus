package abcd;

import abcd.v10;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class s10 extends c20<s10, t10> {
    private j70 Zo;

    public s10(p70 p70Var) {
        super(p70Var);
        this.Zo = x60.j6;
    }

    public s10 EQ(j70 j70Var) {
        this.Zo = j70Var;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: tp, reason: merged with bridge method [inline-methods] */
    public t10 call() throws Throwable {
        String strLg;
        bd0 bd0VarTp;
        a70 a70VarRo;
        t10 t10Var;
        j6();
        this.Zo.j6(JGitText.DW().pullTaskName, 2);
        try {
            String strEQ = this.j6.EQ();
            if (strEQ == null) {
                throw new r20(JGitText.DW().pullOnRepoWithoutHEADCurrentlyNotSupported);
            }
            if (!strEQ.startsWith("refs/heads/")) {
                throw new i20();
            }
            String strSubstring = strEQ.substring(11);
            if (!this.j6.QX().equals(s70.SAFE)) {
                throw new x20(MessageFormat.format(JGitText.DW().cannotPullOnARepoWithState, this.j6.QX().name()));
            }
            t70 t70VarGn = this.j6.gn();
            String strLg2 = t70VarGn.lg("branch", strSubstring, "remote");
            if (strLg2 == null) {
                strLg2 = AppMeasurementSdk.ConditionalUserProperty.ORIGIN;
            }
            String strLg3 = t70VarGn.lg("branch", strSubstring, "merge");
            boolean zWe = t70VarGn.we("branch", strSubstring, "rebase", false);
            if (strLg3 == null) {
                throw new k20(MessageFormat.format(JGitText.DW().missingConfigurationForKey, "branch." + strSubstring + ".merge"));
            }
            boolean z = !strLg2.equals(".");
            k70 k70VarFH = null;
            if (z) {
                strLg = t70VarGn.lg("remote", strLg2, "url");
                if (strLg == null) {
                    throw new k20(MessageFormat.format(JGitText.DW().missingConfigurationForKey, "remote." + strLg2 + ".url"));
                }
                if (this.Zo.isCancelled()) {
                    throw new e20(MessageFormat.format(JGitText.DW().operationCanceled, JGitText.DW().pullTaskName));
                }
                k10 k10Var = new k10(this.j6);
                k10Var.J0(strLg2);
                k10Var.EQ(this.Zo);
                Hw(k10Var);
                bd0VarTp = k10Var.call();
            } else {
                strLg = "local repository";
                bd0VarTp = null;
            }
            this.Zo.v5(1);
            if (this.Zo.isCancelled()) {
                throw new e20(MessageFormat.format(JGitText.DW().operationCanceled, JGitText.DW().pullTaskName));
            }
            if (z) {
                if (bd0VarTp != null && (k70VarFH = bd0VarTp.FH(strLg3)) == null) {
                    k70VarFH = bd0VarTp.FH("refs/heads/" + strLg3);
                }
                if (k70VarFH == null) {
                    throw new o20(MessageFormat.format(JGitText.DW().couldNotGetAdvertisedRef, strLg3));
                }
                a70VarRo = k70VarFH.DW();
            } else {
                try {
                    a70VarRo = this.j6.ro(strLg3);
                    if (a70VarRo == null) {
                        throw new v20(MessageFormat.format(JGitText.DW().refNotResolved, strLg3));
                    }
                } catch (IOException e) {
                    throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfPullCommand, e);
                }
            }
            if (zWe) {
                v10 v10Var = new v10(this.j6);
                try {
                    v10Var.lg(a70VarRo);
                    v10Var.a8(this.Zo);
                    v10Var.U2(v10.b.BEGIN);
                    t10Var = new t10(bd0VarTp, strLg2, v10Var.call());
                } catch (r20 e2) {
                    throw new o20(e2.getMessage(), e2);
                } catch (j20 e3) {
                    throw new o20(e3.getMessage(), e3);
                } catch (o20 e4) {
                    throw new o20(e4.getMessage(), e4);
                } catch (v20 e5) {
                    throw new o20(e5.getMessage(), e5);
                }
            } else {
                q10 q10Var = new q10(this.j6);
                q10Var.Zo("branch '" + p70.sG(strLg3) + "' of " + strLg, a70VarRo);
                try {
                    r10 r10VarCall = q10Var.call();
                    this.Zo.v5(1);
                    t10Var = new t10(bd0VarTp, strLg2, r10VarCall);
                } catch (g20 e6) {
                    throw new o20(e6.getMessage(), e6);
                } catch (h20 e7) {
                    throw new o20(e7.getMessage(), e7);
                } catch (l20 e8) {
                    throw new o20(e8.getMessage(), e8);
                } catch (r20 e9) {
                    throw new o20(e9.getMessage(), e9);
                } catch (s20 e10) {
                    throw new o20(e10.getMessage(), e10);
                } catch (x20 e11) {
                    throw new o20(e11.getMessage(), e11);
                }
            }
            this.Zo.FH();
            return t10Var;
        } catch (IOException e12) {
            throw new o20(JGitText.DW().exceptionCaughtDuringExecutionOfPullCommand, e12);
        }
    }
}
