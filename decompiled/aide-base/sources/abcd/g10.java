package abcd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class g10 extends c20<g10, l10> {
    private j70 EQ;
    private boolean J0;
    private boolean J8;
    private File VH;
    private Collection<String> Ws;
    private String Zo;
    private boolean gn;
    private String tp;
    private String u7;
    private boolean we;

    public g10() {
        super(null);
        this.u7 = AppMeasurementSdk.ConditionalUserProperty.ORIGIN;
        this.tp = "HEAD";
        this.EQ = x60.j6;
    }

    private List<yd0> EQ(String str) {
        yd0 yd0VarJ3 = new yd0().XL(true).j3("refs/heads/*", String.valueOf(str) + "/*");
        ArrayList arrayList = new ArrayList();
        if (this.we) {
            arrayList.add(yd0VarJ3);
        } else {
            Collection<String> collection = this.Ws;
            if (collection != null && collection.size() > 0) {
                for (String str2 : this.Ws) {
                    if (yd0VarJ3.J8(str2)) {
                        arrayList.add(yd0VarJ3.Hw(str2));
                    }
                }
            }
        }
        return arrayList;
    }

    private void J0(p70 p70Var, bd0 bd0Var) {
        k70 k70VarQX;
        k70 k70VarFH = bd0Var.FH(this.tp);
        if (this.tp.equals("HEAD") && (k70VarQX = QX(bd0Var)) != null) {
            k70VarFH = k70VarQX;
        }
        if (k70VarFH == null || k70VarFH.DW() == null) {
            return;
        }
        if (k70VarFH.getName().startsWith("refs/heads/")) {
            n70 n70VarEf = p70Var.ef("HEAD");
            n70VarEf.FH();
            n70VarEf.j3(k70VarFH.getName());
            tp(p70Var, k70VarFH);
        }
        k90 k90VarAM = aM(p70Var, k70VarFH);
        n70 n70VarSf = p70Var.Sf("HEAD", !k70VarFH.getName().startsWith("refs/heads/"));
        k90VarAM.sy();
        n70VarSf.er(k90VarAM);
        n70VarSf.VH();
        if (this.gn) {
            return;
        }
        new z30(p70Var, p70Var.rN(), k90VarAM.Eq()).DW();
        if (this.J0) {
            J8(p70Var);
        }
    }

    private void J8(p70 p70Var) {
        if (new z10(p70Var).call().isEmpty()) {
            return;
        }
        b20 b20Var = new b20(p70Var);
        Hw(b20Var);
        b20Var.EQ(this.EQ);
        b20Var.call();
    }

    private k70 QX(bd0 bd0Var) {
        k70 k70VarFH = bd0Var.FH("HEAD");
        if (k70VarFH == null) {
            return null;
        }
        k70 k70VarFH2 = bd0Var.FH("refs/heads/master");
        if (k70VarFH2 != null && k70VarFH2.DW().aM(k70VarFH.DW())) {
            return k70VarFH2;
        }
        for (k70 k70Var : bd0Var.Hw()) {
            if (k70Var.getName().startsWith("refs/heads/") && k70Var.DW().aM(k70VarFH.DW())) {
                return k70Var;
            }
        }
        return null;
    }

    private bd0 Ws(p70 p70Var, ue0 ue0Var) {
        String str;
        zd0 zd0Var = new zd0(p70Var.gn(), this.u7);
        zd0Var.DW(ue0Var);
        if (this.gn) {
            str = "refs/heads/";
        } else {
            str = "refs/remotes/" + zd0Var.Hw();
        }
        zd0Var.j6(new yd0().XL(true).j3("refs/heads/*", String.valueOf(str) + "/*"));
        zd0Var.QX(p70Var.gn());
        p70Var.gn().ef();
        k10 k10Var = new k10(p70Var);
        k10Var.J0(this.u7);
        k10Var.EQ(this.EQ);
        k10Var.J8(he0.FETCH_TAGS);
        Hw(k10Var);
        k10Var.we(EQ(str));
        return k10Var.call();
    }

    private p70 XL(ue0 ue0Var) {
        n10 n10VarTp = l10.tp();
        n10VarTp.DW(this.gn);
        if (this.VH == null) {
            this.VH = new File(ue0Var.Zo(), ".git");
        }
        if (this.VH.exists() && this.VH.listFiles().length != 0) {
            throw new o20(MessageFormat.format(JGitText.DW().cloneNonEmptyDirectory, this.VH.getName()));
        }
        n10VarTp.FH(this.VH);
        return n10VarTp.call().u7();
    }

    private k90 aM(p70 p70Var, k70 k70Var) {
        t90 t90Var = new t90(p70Var);
        try {
            return t90Var.ca(k70Var.DW());
        } finally {
            t90Var.lp();
        }
    }

    private void tp(p70 p70Var, k70 k70Var) {
        String strSG = p70.sG(k70Var.getName());
        p70Var.gn().ro("branch", strSG, "remote", this.u7);
        p70Var.gn().ro("branch", strSG, "merge", k70Var.getName());
        p70Var.gn().ef();
    }

    public g10 Mr(File file) {
        this.VH = file;
        return this;
    }

    public g10 U2(j70 j70Var) {
        this.EQ = j70Var;
        return this;
    }

    public g10 a8(String str) {
        this.Zo = str;
        return this;
    }

    public g10 j3(boolean z) {
        this.we = z;
        return this;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: we, reason: merged with bridge method [inline-methods] */
    public l10 call() {
        try {
            ue0 ue0Var = new ue0(this.Zo);
            p70 p70VarXL = XL(ue0Var);
            bd0 bd0VarWs = Ws(p70VarXL, ue0Var);
            if (!this.J8) {
                J0(p70VarXL, bd0VarWs);
            }
            return new l10(p70VarXL);
        } catch (n20 e) {
            throw new o20(e.getMessage(), e);
        } catch (IOException e2) {
            throw new o20(e2.getMessage(), e2);
        } catch (URISyntaxException e3) {
            throw new o20(e3.getMessage(), e3);
        }
    }
}
