package abcd;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class qo0 extends no0 {
    private BigInteger FH;

    public qo0(BigInteger bigInteger, oo0 oo0Var) {
        super(false, oo0Var);
        this.FH = bigInteger;
    }

    public BigInteger FH() {
        return this.FH;
    }

    @Override // abcd.no0
    public boolean equals(Object obj) {
        return (obj instanceof qo0) && ((qo0) obj).FH().equals(this.FH) && super.equals(obj);
    }

    @Override // abcd.no0
    public int hashCode() {
        return this.FH.hashCode() ^ super.hashCode();
    }
}
