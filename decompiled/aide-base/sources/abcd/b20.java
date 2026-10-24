package abcd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class b20 extends c20<b20, Collection<String>> {
    private final Collection<String> VH;
    private j70 Zo;

    public b20(p70 p70Var) {
        super(p70Var);
        this.VH = new ArrayList();
    }

    public b20 EQ(j70 j70Var) {
        this.Zo = j70Var;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: tp, reason: merged with bridge method [inline-methods] */
    public Collection<String> call() {
        String strFH;
        j6();
        try {
            lc0 lc0VarJ6 = lc0.j6(this.j6);
            if (!this.VH.isEmpty()) {
                lc0VarJ6.aM(qf0.FH(this.VH));
            }
            ArrayList arrayList = new ArrayList();
            while (lc0VarJ6.XL()) {
                if (lc0VarJ6.v5() != null && (strFH = lc0VarJ6.FH()) != null) {
                    p70 p70VarEQ = lc0VarJ6.EQ();
                    if (p70VarEQ == null) {
                        g10 g10VarVH = l10.VH();
                        Hw(g10VarVH);
                        g10VarVH.a8(strFH);
                        g10VarVH.Mr(lc0VarJ6.Hw());
                        if (this.Zo != null) {
                            g10VarVH.U2(this.Zo);
                        }
                        p70VarEQ = g10VarVH.call().u7();
                    }
                    k90 k90VarCa = new t90(p70VarEQ).ca(lc0VarJ6.gn());
                    String strDW = lc0VarJ6.DW();
                    if ("merge".equals(strDW)) {
                        q10 q10Var = new q10(p70VarEQ);
                        q10Var.VH(k90VarCa);
                        q10Var.call();
                    } else if ("rebase".equals(strDW)) {
                        v10 v10Var = new v10(p70VarEQ);
                        v10Var.rN(k90VarCa);
                        v10Var.call();
                    } else {
                        z30 z30Var = new z30(p70VarEQ, p70VarEQ.rN(), k90VarCa.Eq());
                        z30Var.j3(true);
                        z30Var.DW();
                        n70 n70VarSf = p70VarEQ.Sf("HEAD", true);
                        n70VarSf.er(k90VarCa);
                        n70VarSf.VH();
                    }
                    arrayList.add(lc0VarJ6.u7());
                }
            }
            return arrayList;
        } catch (h40 e) {
            throw new o20(e.getMessage(), e);
        } catch (j20 e2) {
            throw new o20(e2.getMessage(), e2);
        } catch (IOException e3) {
            throw new o20(e3.getMessage(), e3);
        }
    }
}
