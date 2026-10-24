package abcd;

/* loaded from: classes.dex */
public class t10 {
    private final r10 DW;
    private final w10 FH;
    private final bd0 j6;

    public t10(bd0 bd0Var, String str, r10 r10Var) {
        this.j6 = bd0Var;
        this.DW = r10Var;
        this.FH = null;
    }

    public boolean DW() {
        r10 r10Var = this.DW;
        if (r10Var != null) {
            return r10Var.DW().j6();
        }
        w10 w10Var = this.FH;
        if (w10Var != null) {
            return w10Var.j6().j6();
        }
        return true;
    }

    public r10 j6() {
        return this.DW;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        bd0 bd0Var = this.j6;
        if (bd0Var != null) {
            sb.append(bd0Var.toString());
        } else {
            sb.append("No fetch result");
        }
        sb.append("\n");
        r10 r10Var = this.DW;
        if (r10Var != null) {
            sb.append(r10Var.toString());
        } else {
            w10 w10Var = this.FH;
            if (w10Var != null) {
                sb.append(w10Var.toString());
            } else {
                sb.append("No update result");
            }
        }
        return sb.toString();
    }

    public t10(bd0 bd0Var, String str, w10 w10Var) {
        this.j6 = bd0Var;
        this.DW = null;
        this.FH = w10Var;
    }
}
