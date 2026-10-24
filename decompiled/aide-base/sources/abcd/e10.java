package abcd;

import abcd.c70;
import abcd.k70;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class e10 extends m10<f10> {
    private List<k70> FH;

    public e10(p70 p70Var) {
        super(p70Var);
        this.FH = new LinkedList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public f10 call() {
        LinkedList linkedList = new LinkedList();
        j6();
        t90 t90Var = new t90(this.j6);
        try {
            try {
                k70 k70VarJ8 = this.j6.J8("HEAD");
                if (k70VarJ8 == null) {
                    throw new r20(JGitText.DW().commitOnRepoWithoutHEADCurrentlyNotSupported);
                }
                k90 k90VarCa = t90Var.ca(k70VarJ8.DW());
                k90 k90VarV5 = k90VarCa;
                for (k70 k70Var : this.FH) {
                    a70 a70VarFH = k70Var.FH();
                    if (a70VarFH == null) {
                        a70VarFH = k70Var.DW();
                    }
                    k90 k90VarCa2 = t90Var.ca(a70VarFH);
                    if (k90VarCa2.et() != 1) {
                        throw new p20(MessageFormat.format(JGitText.DW().canOnlyCherryPickCommitsWithOneParent, k90VarCa2.BT(), Integer.valueOf(k90VarCa2.et())));
                    }
                    k90 k90VarWc = k90VarCa2.wc(0);
                    t90Var.x9(k90VarWc);
                    f80 f80Var = (f80) d80.Hw.DW(this.j6);
                    f80Var.BT(new hf0(this.j6));
                    f80Var.tp(k90VarWc.Eq());
                    if (!f80Var.v5(k90VarCa, k90VarCa2)) {
                        if (f80Var.QX()) {
                            return new f10(f80Var.XL());
                        }
                        String strDW = new b80().DW(k90VarCa2.jJ(), f80Var.Mr());
                        p70 p70Var = this.j6;
                        k90VarCa2.sy();
                        p70Var.vJ(k90VarCa2);
                        this.j6.Mz(strDW);
                        return f10.Hw;
                    }
                    s90 s90VarEq = k90VarCa.Eq();
                    s90VarEq.sy();
                    if (!j60.Mr(s90VarEq, f80Var.Hw())) {
                        z30 z30Var = new z30(this.j6, k90VarCa.Eq(), this.j6.rN(), f80Var.Hw());
                        z30Var.j3(true);
                        z30Var.DW();
                        h10 h10VarGn = new l10(DW()).gn();
                        h10VarGn.we(k90VarCa2.jJ());
                        h10VarGn.J8("cherry-pick: " + k90VarCa2.Xa());
                        h10VarGn.EQ(k90VarCa2.yO());
                        k90VarV5 = h10VarGn.call();
                        linkedList.add(k70Var);
                    }
                }
                t90Var.lp();
                return new f10(k90VarV5, linkedList);
            } catch (IOException e) {
                throw new o20(MessageFormat.format(JGitText.DW().exceptionCaughtDuringExecutionOfCherryPickCommand, e), e);
            }
        } finally {
            t90Var.lp();
        }
    }

    public e10 VH(k70 k70Var) {
        j6();
        this.FH.add(k70Var);
        return this;
    }

    public e10 Zo(j60 j60Var) {
        v5(j60Var.yS(), j60Var);
        return this;
    }

    public e10 v5(String str, j60 j60Var) {
        VH(new c70.c(k70.a.LOOSE, str, j60Var.Zo()));
        return this;
    }
}
