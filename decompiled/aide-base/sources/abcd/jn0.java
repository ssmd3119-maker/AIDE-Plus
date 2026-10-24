package abcd;

import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public class jn0 {
    private hn0 j6;

    public jn0(tp0 tp0Var) {
        this.j6 = new hn0(tp0Var);
    }

    public gn0 DW(op0 op0Var, om0 om0Var) {
        return this.j6.j6(op0Var, om0Var);
    }

    public gn0 FH(op0 op0Var, byte[] bArr) {
        return this.j6.DW(op0Var, bArr);
    }

    public jn0 Hw(boolean z) {
        this.j6.Hw(z);
        return this;
    }

    public jn0 Zo(sm0 sm0Var) {
        this.j6.Zo(sm0Var);
        return this;
    }

    public gn0 j6(op0 op0Var, X509Certificate x509Certificate) {
        return DW(op0Var, new qm0(x509Certificate));
    }

    public jn0 v5(sm0 sm0Var) {
        this.j6.v5(sm0Var);
        return this;
    }
}
