package abcd;

import java.io.Serializable;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class yd0 implements Serializable {
    private boolean WB;
    private String fY;
    private String jw;
    private boolean mb;

    public yd0() {
        this.WB = false;
        this.mb = false;
        this.jw = "HEAD";
        this.fY = null;
    }

    public static boolean EQ(String str) {
        return str != null && str.endsWith("/*");
    }

    private yd0 FH(String str) {
        String str2 = this.jw;
        String str3 = this.fY;
        this.mb = false;
        this.jw = String.valueOf(str2.substring(0, str2.length() - 1)) + str.substring(str3.length() - 1);
        this.fY = str;
        return this;
    }

    private yd0 Zo(String str) {
        String str2 = this.jw;
        String str3 = this.fY;
        this.mb = false;
        this.jw = str;
        this.fY = String.valueOf(str3.substring(0, str3.length() - 1)) + str.substring(str2.length() - 1);
        return this;
    }

    private static boolean j6(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    private boolean we(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return tp() ? str.startsWith(str2.substring(0, str2.length() - 1)) : str.equals(str2);
    }

    public yd0 DW(String str) {
        if (!tp()) {
            return this;
        }
        yd0 yd0Var = new yd0(this);
        yd0Var.FH(str);
        return yd0Var;
    }

    public yd0 Hw(String str) {
        if (!tp()) {
            return this;
        }
        yd0 yd0Var = new yd0(this);
        yd0Var.Zo(str);
        return yd0Var;
    }

    public boolean J0(String str) {
        return we(str, VH());
    }

    public boolean J8(String str) {
        return we(str, gn());
    }

    public yd0 QX(String str) {
        yd0 yd0Var = new yd0(this);
        yd0Var.fY = str;
        if (EQ(str) && yd0Var.jw == null) {
            throw new IllegalStateException(JGitText.DW().sourceIsNotAWildcard);
        }
        if (EQ(yd0Var.jw) == EQ(yd0Var.fY)) {
            return yd0Var;
        }
        throw new IllegalStateException(JGitText.DW().sourceDestinationMustMatch);
    }

    public String VH() {
        return this.fY;
    }

    public boolean Ws(k70 k70Var) {
        return we(k70Var.getName(), gn());
    }

    public yd0 XL(boolean z) {
        yd0 yd0Var = new yd0(this);
        yd0Var.WB = z;
        return yd0Var;
    }

    public yd0 aM(String str) {
        yd0 yd0Var = new yd0(this);
        yd0Var.jw = str;
        if (EQ(str) && yd0Var.fY == null) {
            throw new IllegalStateException(JGitText.DW().destinationIsNotAWildcard);
        }
        if (EQ(yd0Var.jw) == EQ(yd0Var.fY)) {
            return yd0Var;
        }
        throw new IllegalStateException(JGitText.DW().sourceDestinationMustMatch);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof yd0)) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        return u7() == yd0Var.u7() && tp() == yd0Var.tp() && j6(gn(), yd0Var.gn()) && j6(VH(), yd0Var.VH());
    }

    public String gn() {
        return this.jw;
    }

    public int hashCode() {
        int iHashCode = gn() != null ? 0 + gn().hashCode() : 0;
        return VH() != null ? (iHashCode * 31) + VH().hashCode() : iHashCode;
    }

    public yd0 j3(String str, String str2) {
        if (EQ(str) != EQ(str2)) {
            throw new IllegalStateException(JGitText.DW().sourceDestinationMustMatch);
        }
        yd0 yd0Var = new yd0(this);
        yd0Var.mb = EQ(str);
        yd0Var.jw = str;
        yd0Var.fY = str2;
        return yd0Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (u7()) {
            sb.append('+');
        }
        if (gn() != null) {
            sb.append(gn());
        }
        if (VH() != null) {
            sb.append(':');
            sb.append(VH());
        }
        return sb.toString();
    }

    public boolean tp() {
        return this.mb;
    }

    public boolean u7() {
        return this.WB;
    }

    public yd0 v5(k70 k70Var) {
        return Hw(k70Var.getName());
    }

    public yd0(String str) {
        String strSubstring;
        if (str.startsWith("+")) {
            this.WB = true;
            strSubstring = str.substring(1);
        } else {
            strSubstring = str;
        }
        int iLastIndexOf = strSubstring.lastIndexOf(58);
        if (iLastIndexOf == 0) {
            String strSubstring2 = strSubstring.substring(1);
            if (!EQ(strSubstring2)) {
                this.fY = strSubstring2;
                return;
            }
            throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidWildcards, str));
        }
        if (iLastIndexOf > 0) {
            this.jw = strSubstring.substring(0, iLastIndexOf);
            this.fY = strSubstring.substring(iLastIndexOf + 1);
            if (EQ(this.jw) && EQ(this.fY)) {
                this.mb = true;
                return;
            } else {
                if (EQ(this.jw) || EQ(this.fY)) {
                    throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidWildcards, str));
                }
                return;
            }
        }
        if (!EQ(strSubstring)) {
            this.jw = strSubstring;
            return;
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().invalidWildcards, str));
    }

    private yd0(yd0 yd0Var) {
        this.WB = yd0Var.u7();
        this.mb = yd0Var.tp();
        this.jw = yd0Var.gn();
        this.fY = yd0Var.VH();
    }
}
