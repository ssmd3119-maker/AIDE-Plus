package abcd;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class lc0 {
    private final jf0 DW;
    private t70 FH;
    private ia0 Hw;
    private final p70 j6;
    private String v5;

    public lc0(p70 p70Var) {
        this.j6 = p70Var;
        this.FH = p70Var.gn();
        jf0 jf0Var = new jf0(p70Var);
        this.DW = jf0Var;
        jf0Var.KD(true);
    }

    public static String J0(p70 p70Var, String str) throws IOException {
        if (!str.startsWith("./") && !str.startsWith("../")) {
            return str;
        }
        String strLg = null;
        k70 k70VarJ8 = p70Var.J8("HEAD");
        if (k70VarJ8 != null) {
            if (k70VarJ8.gn()) {
                k70VarJ8 = k70VarJ8.v5();
            }
            strLg = p70Var.gn().lg("branch", p70.sG(k70VarJ8.getName()), "remote");
        }
        if (strLg == null) {
            strLg = AppMeasurementSdk.ConditionalUserProperty.ORIGIN;
        }
        String strLg2 = p70Var.gn().lg("remote", strLg, "url");
        if (strLg2 == null) {
            strLg2 = p70Var.XL().getAbsolutePath();
            if ('\\' == File.separatorChar) {
                strLg2 = strLg2.replace('\\', '/');
            }
        }
        if (strLg2.charAt(strLg2.length() - 1) == '/') {
            strLg2 = strLg2.substring(0, strLg2.length() - 1);
        }
        char c = '/';
        while (str.length() > 0) {
            if (!str.startsWith("./")) {
                if (!str.startsWith("../")) {
                    break;
                }
                int iLastIndexOf = strLg2.lastIndexOf(47);
                if (iLastIndexOf < 1) {
                    iLastIndexOf = strLg2.lastIndexOf(58);
                    c = ':';
                }
                if (iLastIndexOf < 1) {
                    throw new IOException(MessageFormat.format(JGitText.DW().submoduleParentRemoteUrlInvalid, strLg2));
                }
                strLg2 = strLg2.substring(0, iLastIndexOf);
                str = str.substring(3);
            } else {
                str = str.substring(2);
            }
        }
        return String.valueOf(strLg2) + c + str;
    }

    public static p70 J8(File file, String str) {
        if (!new File(file, str).isDirectory()) {
            return null;
        }
        File file2 = new File(file, str);
        try {
            q70 q70Var = new q70();
            q70Var.er(true);
            q70 q70Var2 = q70Var;
            q70Var2.a8(wf0.FH);
            q70 q70Var3 = q70Var2;
            q70Var3.gW(file2);
            return q70Var3.FH();
        } catch (a50 unused) {
            return null;
        }
    }

    private void QX() throws h40, IOException {
        if (this.Hw == null) {
            ia0 ia0Var = new ia0(new File(this.j6.XL(), ".gitmodules"), this.j6.tp());
            ia0Var.Mz();
            this.Hw = ia0Var;
        }
    }

    public static p70 Ws(p70 p70Var, String str) {
        return J8(p70Var.XL(), str);
    }

    public static lc0 j6(p70 p70Var) {
        lc0 lc0Var = new lc0(p70Var);
        lc0Var.j3(new c40(p70Var.ei()));
        return lc0Var;
    }

    public static File we(p70 p70Var, String str) {
        return new File(p70Var.XL(), str);
    }

    public String DW() {
        return this.FH.lg("submodule", this.v5, "update");
    }

    public p70 EQ() {
        return Ws(this.j6, this.v5);
    }

    public String FH() {
        return this.FH.lg("submodule", this.v5, "url");
    }

    public File Hw() {
        return we(this.j6, this.v5);
    }

    public String VH() throws h40, IOException {
        QX();
        return this.Hw.lg("submodule", this.v5, "url");
    }

    public boolean XL() {
        while (this.DW.rN()) {
            if (t60.gn == this.DW.gn(0)) {
                this.v5 = this.DW.J0();
                return true;
            }
        }
        this.v5 = null;
        return false;
    }

    public String Zo() throws h40, IOException {
        QX();
        return this.Hw.lg("submodule", this.v5, "update");
    }

    public lc0 aM(sf0 sf0Var) {
        this.DW.SI(sf0Var);
        return this;
    }

    public a70 gn() {
        return this.DW.tp(0);
    }

    public lc0 j3(ef0 ef0Var) {
        this.DW.DW(ef0Var);
        return this;
    }

    public String tp() throws h40, IOException {
        String strVH = VH();
        if (strVH != null) {
            return J0(this.j6, strVH);
        }
        return null;
    }

    public String u7() {
        return this.v5;
    }

    public String v5() throws h40, IOException {
        QX();
        return this.Hw.lg("submodule", this.v5, "path");
    }
}
