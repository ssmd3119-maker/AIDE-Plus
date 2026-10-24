package abcd;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class gj0 extends ai0 {
    byte[] WB;

    public gj0(int i) {
        this.WB = BigInteger.valueOf(i).toByteArray();
    }

    public static sh0 J8(Object obj) {
        if (obj == null || (obj instanceof sh0)) {
            return (sh0) obj;
        }
        if (obj instanceof gj0) {
            return new sh0(((gj0) obj).XL());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static sh0 Ws(hi0 hi0Var, boolean z) {
        ai0 ai0VarWs = hi0Var.Ws();
        return (z || (ai0VarWs instanceof gj0)) ? J8(ai0VarWs) : new sh0(wh0.J8(hi0Var.Ws()).Ws());
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    public BigInteger QX() {
        return new BigInteger(1, this.WB);
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof gj0) {
            return dq0.j6(this.WB, ((gj0) ai0Var).WB);
        }
        return false;
    }

    public BigInteger XL() {
        return new BigInteger(this.WB);
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(2, this.WB);
    }

    @Override // abcd.uh0
    public int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.WB;
            if (i == bArr.length) {
                return i2;
            }
            i2 ^= (bArr[i] & 255) << (i % 4);
            i++;
        }
    }

    public String toString() {
        return XL().toString();
    }

    @Override // abcd.ai0
    public int u7() {
        return jk0.j6(this.WB.length) + 1 + this.WB.length;
    }

    public gj0(BigInteger bigInteger) {
        this.WB = bigInteger.toByteArray();
    }

    public gj0(byte[] bArr) {
        this.WB = bArr;
    }
}
