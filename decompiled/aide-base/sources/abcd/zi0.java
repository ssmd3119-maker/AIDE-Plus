package abcd;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class zi0 extends ai0 {
    private static oh0[] mb = new oh0[12];
    byte[] WB;

    public zi0(byte[] bArr) {
        this.WB = bArr;
    }

    public static oh0 J8(byte[] bArr) {
        if (bArr.length > 1) {
            return new oh0(dq0.FH(bArr));
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        oh0[] oh0VarArr = mb;
        if (i >= oh0VarArr.length) {
            return new oh0(dq0.FH(bArr));
        }
        oh0 oh0Var = oh0VarArr[i];
        if (oh0Var != null) {
            return oh0Var;
        }
        oh0 oh0Var2 = new oh0(dq0.FH(bArr));
        oh0VarArr[i] = oh0Var2;
        return oh0Var2;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof zi0) {
            return dq0.j6(this.WB, ((zi0) ai0Var).WB);
        }
        return false;
    }

    public BigInteger Ws() {
        return new BigInteger(this.WB);
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(10, this.WB);
    }

    @Override // abcd.uh0
    public int hashCode() {
        return dq0.Hw(this.WB);
    }

    @Override // abcd.ai0
    public int u7() {
        return jk0.j6(this.WB.length) + 1 + this.WB.length;
    }
}
