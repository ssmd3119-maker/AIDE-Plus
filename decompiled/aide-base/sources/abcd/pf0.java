package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class pf0 extends sf0 {
    final String FH;
    final byte[] Hw;

    private pf0(String str) {
        this.FH = str;
        this.Hw = r60.DW(str);
    }

    public static pf0 v5(String str) {
        while (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.length() != 0) {
            return new pf0(str);
        }
        throw new IllegalArgumentException(JGitText.DW().emptyPathNotPermitted);
    }

    @Override // abcd.sf0
    public boolean DW(jf0 jf0Var) {
        byte[] bArr = this.Hw;
        return jf0Var.j3(bArr, bArr.length) == 0;
    }

    @Override // abcd.sf0
    public boolean FH() {
        for (byte b : this.Hw) {
            if (b == 47) {
                return true;
            }
        }
        return false;
    }

    public pf0 Hw() {
        return this;
    }

    public boolean VH(jf0 jf0Var) {
        return this.Hw.length == jf0Var.we();
    }

    public String Zo() {
        return this.FH;
    }

    @Override // abcd.sf0
    /* renamed from: j6 */
    public /* bridge */ /* synthetic */ sf0 clone() {
        Hw();
        return this;
    }

    @Override // abcd.sf0
    public String toString() {
        return "PATH(\"" + this.FH + "\")";
    }
}
