package abcd;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class io0 {
    private static final BigInteger Hw = BigInteger.valueOf(2);
    private int DW;
    private SecureRandom FH;
    private int j6;

    public void DW(int i, int i2, SecureRandom secureRandom) {
        this.j6 = i;
        this.DW = i2;
        this.FH = secureRandom;
    }

    public oo0 j6() {
        BigInteger[] bigIntegerArrJ6 = jo0.j6(this.j6, this.DW, this.FH);
        BigInteger bigInteger = bigIntegerArrJ6[0];
        BigInteger bigInteger2 = bigIntegerArrJ6[1];
        return new oo0(bigInteger, jo0.DW(bigInteger, bigInteger2, this.FH), bigInteger2, Hw, null);
    }
}
