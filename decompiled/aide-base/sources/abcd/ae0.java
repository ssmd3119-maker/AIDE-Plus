package abcd;

import java.io.IOException;
import java.text.MessageFormat;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class ae0 {
    private final a70 DW;
    private final String FH;
    private final je0 Hw;
    private a VH;
    private final boolean Zo;
    private boolean gn;
    private final a70 j6;
    private String u7;
    private final String v5;

    public enum a {
        NOT_ATTEMPTED,
        UP_TO_DATE,
        REJECTED_NONFASTFORWARD,
        REJECTED_NODELETE,
        REJECTED_REMOTE_CHANGED,
        REJECTED_OTHER_REASON,
        NON_EXISTING,
        AWAITING_REPORT,
        OK;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] aVarArrValuesCustom = values();
            int length = aVarArrValuesCustom.length;
            a[] aVarArr = new a[length];
            System.arraycopy(aVarArrValuesCustom, 0, aVarArr, 0, length);
            return aVarArr;
        }
    }

    public ae0(p70 p70Var, String str, String str2, boolean z, String str3, a70 a70Var) {
        this(p70Var, str, str != null ? p70Var.ro(str) : a70.ca(), str2, z, str3, a70Var);
    }

    public a70 DW() {
        return this.DW;
    }

    public void EQ(String str) {
        this.u7 = str;
    }

    public String FH() {
        return this.FH;
    }

    public a Hw() {
        return this.VH;
    }

    public void J0(t90 t90Var) {
        if (VH()) {
            this.Hw.j6(t90Var);
        } else {
            this.Hw.Zo(t90Var);
        }
    }

    public boolean VH() {
        return a70.ca().aM(this.DW);
    }

    public boolean Zo() {
        return this.Hw != null;
    }

    public boolean gn() {
        return this.j6 != null;
    }

    public a70 j6() {
        return this.j6;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RemoteRefUpdate[remoteName=");
        sb.append(this.FH);
        sb.append(", ");
        sb.append(this.VH);
        sb.append(", ");
        a70 a70Var = this.j6;
        sb.append(a70Var != null ? a70Var.BT() : "(null)");
        sb.append("...");
        a70 a70Var2 = this.DW;
        sb.append(a70Var2 != null ? a70Var2.BT() : "(null)");
        sb.append(this.gn ? ", fastForward" : "");
        sb.append(", srcRef=");
        sb.append(this.v5);
        sb.append(this.Zo ? ", forceUpdate" : "");
        sb.append(", message=");
        if (this.u7 != null) {
            str = "\"" + this.u7 + "\"";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public void tp(boolean z) {
        this.gn = z;
    }

    public boolean u7() {
        return this.Zo;
    }

    public je0 v5() {
        return this.Hw;
    }

    public void we(a aVar) {
        this.VH = aVar;
    }

    public ae0(p70 p70Var, String str, a70 a70Var, String str2, boolean z, String str3, a70 a70Var2) throws IOException {
        if (str2 == null) {
            throw new IllegalArgumentException(JGitText.DW().remoteNameCantBeNull);
        }
        if (a70Var == null && str != null) {
            throw new IOException(MessageFormat.format(JGitText.DW().sourceRefDoesntResolveToAnyObject, str));
        }
        if (str != null) {
            this.v5 = str;
        } else if (a70Var != null && !a70Var.aM(a70.ca())) {
            this.v5 = a70Var.BT();
        } else {
            this.v5 = null;
        }
        if (a70Var != null) {
            this.DW = a70Var;
        } else {
            this.DW = a70.ca();
        }
        this.FH = str2;
        this.Zo = z;
        if (str3 != null && p70Var != null) {
            this.Hw = new je0(p70Var, str3, str2, true, this.DW, "push");
        } else {
            this.Hw = null;
        }
        this.j6 = a70Var2;
        this.VH = a.NOT_ATTEMPTED;
    }
}
