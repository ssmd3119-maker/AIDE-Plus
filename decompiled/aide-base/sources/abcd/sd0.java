package abcd;

import abcd.ae0;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class sd0 {
    static final String v5 = JGitText.DW().openingConnection;
    private rd0 DW;
    private final Map<String, ae0> FH = new HashMap();
    private final t90 Hw;
    private final le0 j6;

    public sd0(le0 le0Var, Collection<ae0> collection) throws j50 {
        this.Hw = new t90(le0Var.j6);
        this.j6 = le0Var;
        for (ae0 ae0Var : collection) {
            if (this.FH.put(ae0Var.FH(), ae0Var) != null) {
                throw new j50(MessageFormat.format(JGitText.DW().duplicateRemoteRefUpdateIsIllegal, ae0Var.FH()));
            }
        }
    }

    private void DW() {
        for (ae0 ae0Var : this.FH.values()) {
            if (ae0Var.Hw() == ae0.a.NOT_ATTEMPTED) {
                ae0Var.we(ae0.a.OK);
            }
        }
    }

    private Map<String, ae0> FH() throws j50 {
        o90 o90VarI;
        o90 o90VarI2;
        HashMap map = new HashMap();
        for (ae0 ae0Var : this.FH.values()) {
            k70 k70VarDW = this.DW.DW(ae0Var.FH());
            a70 a70VarCa = k70VarDW == null ? a70.ca() : k70VarDW.DW();
            if (ae0Var.DW().aM(a70VarCa)) {
                if (ae0Var.VH()) {
                    ae0Var.we(ae0.a.NON_EXISTING);
                } else {
                    ae0Var.we(ae0.a.UP_TO_DATE);
                }
            } else if (ae0Var.gn() && !ae0Var.j6().aM(a70VarCa)) {
                ae0Var.we(ae0.a.REJECTED_REMOTE_CHANGED);
            } else if (a70VarCa.aM(a70.ca()) || ae0Var.VH()) {
                ae0Var.tp(true);
                map.put(ae0Var.FH(), ae0Var);
            } else {
                try {
                    o90VarI = this.Hw.I(a70VarCa);
                    o90VarI2 = this.Hw.I(ae0Var.DW());
                } catch (q40 unused) {
                } catch (Exception e) {
                    throw new j50(this.j6.aM(), MessageFormat.format(JGitText.DW().readingObjectsFromLocalRepositoryFailed, e.getMessage()), e);
                }
                boolean z = (o90VarI instanceof k90) && (o90VarI2 instanceof k90) && this.Hw.P8((k90) o90VarI, (k90) o90VarI2);
                ae0Var.tp(z);
                if (z || ae0Var.u7()) {
                    map.put(ae0Var.FH(), ae0Var);
                } else {
                    ae0Var.we(ae0.a.REJECTED_NONFASTFORWARD);
                }
            }
        }
        return map;
    }

    private void Hw() {
        for (ae0 ae0Var : this.FH.values()) {
            ae0.a aVarHw = ae0Var.Hw();
            if (ae0Var.Zo() && (aVarHw == ae0.a.UP_TO_DATE || aVarHw == ae0.a.OK)) {
                try {
                    ae0Var.J0(this.Hw);
                } catch (IOException unused) {
                }
            }
        }
    }

    public td0 j6(j70 j70Var) {
        try {
            j70Var.j6(v5, 0);
            td0 td0Var = new td0();
            this.DW = this.j6.SI();
            try {
                td0Var.Zo(this.j6.aM(), this.DW.u7());
                td0Var.gn(this.FH);
                j70Var.FH();
                Map<String, ae0> mapFH = FH();
                if (this.j6.U2()) {
                    DW();
                } else if (!mapFH.isEmpty()) {
                    this.DW.tp(j70Var, mapFH);
                }
                this.DW.close();
                td0Var.DW(this.DW.Hw());
                if (!this.j6.U2()) {
                    Hw();
                }
                Iterator<ae0> it = this.FH.values().iterator();
                while (it.hasNext()) {
                    je0 je0VarV5 = it.next().v5();
                    if (je0VarV5 != null) {
                        td0Var.j6(je0VarV5);
                    }
                }
                return td0Var;
            } catch (Throwable th) {
                this.DW.close();
                td0Var.DW(this.DW.Hw());
                throw th;
            }
        } finally {
            this.Hw.lp();
        }
    }
}
