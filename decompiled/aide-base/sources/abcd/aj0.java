package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class aj0 extends ai0 {
    private vh0 WB;
    private int fY;
    private ai0 jw;
    private sh0 mb;
    private ai0 qp;

    public aj0(nh0 nh0Var) {
        int i = 0;
        ai0 ai0VarJ3 = j3(nh0Var, 0);
        if (ai0VarJ3 instanceof vh0) {
            this.WB = (vh0) ai0VarJ3;
            ai0VarJ3 = j3(nh0Var, 1);
            i = 1;
        }
        if (ai0VarJ3 instanceof sh0) {
            this.mb = (sh0) ai0VarJ3;
            i++;
            ai0VarJ3 = j3(nh0Var, i);
        }
        if (!(ai0VarJ3 instanceof tj0)) {
            this.jw = ai0VarJ3;
            i++;
            ai0VarJ3 = j3(nh0Var, i);
        }
        if (nh0Var.FH() != i + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(ai0VarJ3 instanceof tj0)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        tj0 tj0Var = (tj0) ai0VarJ3;
        Mr(tj0Var.QX());
        this.qp = tj0Var.Ws();
    }

    private void Mr(int i) {
        if (i >= 0 && i <= 2) {
            this.fY = i;
        } else {
            throw new IllegalArgumentException("invalid encoding value: " + i);
        }
    }

    private ai0 j3(nh0 nh0Var, int i) {
        if (nh0Var.FH() > i) {
            return nh0Var.DW(i).DW();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return true;
    }

    public ai0 J8() {
        return this.jw;
    }

    public int QX() {
        return this.fY;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        ai0 ai0Var2;
        sh0 sh0Var;
        vh0 vh0Var;
        if (!(ai0Var instanceof aj0)) {
            return false;
        }
        if (this == ai0Var) {
            return true;
        }
        aj0 aj0Var = (aj0) ai0Var;
        vh0 vh0Var2 = this.WB;
        if (vh0Var2 != null && ((vh0Var = aj0Var.WB) == null || !vh0Var.equals(vh0Var2))) {
            return false;
        }
        sh0 sh0Var2 = this.mb;
        if (sh0Var2 != null && ((sh0Var = aj0Var.mb) == null || !sh0Var.equals(sh0Var2))) {
            return false;
        }
        ai0 ai0Var3 = this.jw;
        if (ai0Var3 == null || ((ai0Var2 = aj0Var.jw) != null && ai0Var2.equals(ai0Var3))) {
            return this.qp.equals(aj0Var.qp);
        }
        return false;
    }

    public vh0 Ws() {
        return this.WB;
    }

    public ai0 XL() {
        return this.qp;
    }

    public sh0 aM() {
        return this.mb;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vh0 vh0Var = this.WB;
        if (vh0Var != null) {
            byteArrayOutputStream.write(vh0Var.Zo("DER"));
        }
        sh0 sh0Var = this.mb;
        if (sh0Var != null) {
            byteArrayOutputStream.write(sh0Var.Zo("DER"));
        }
        ai0 ai0Var = this.jw;
        if (ai0Var != null) {
            byteArrayOutputStream.write(ai0Var.Zo("DER"));
        }
        byteArrayOutputStream.write(new tj0(true, this.fY, this.qp).Zo("DER"));
        yh0Var.Zo(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // abcd.uh0
    public int hashCode() {
        vh0 vh0Var = this.WB;
        int iHashCode = vh0Var != null ? vh0Var.hashCode() : 0;
        sh0 sh0Var = this.mb;
        if (sh0Var != null) {
            iHashCode ^= sh0Var.hashCode();
        }
        ai0 ai0Var = this.jw;
        if (ai0Var != null) {
            iHashCode ^= ai0Var.hashCode();
        }
        return iHashCode ^ this.qp.hashCode();
    }

    @Override // abcd.ai0
    public int u7() {
        return v5().length;
    }
}
