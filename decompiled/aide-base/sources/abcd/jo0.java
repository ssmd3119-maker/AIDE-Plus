package abcd;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class jo0 {
    private static final BigInteger j6 = BigInteger.valueOf(1);
    private static final BigInteger DW = BigInteger.valueOf(2);

    public static BigInteger DW(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerModPow;
        BigInteger bigIntegerSubtract = bigInteger.subtract(DW);
        do {
            bigIntegerModPow = eq0.j6(DW, bigIntegerSubtract, secureRandom).modPow(DW, bigInteger);
        } while (bigIntegerModPow.equals(j6));
        return bigIntegerModPow;
    }

    public static BigInteger[] j6(int i, int i2, SecureRandom secureRandom) {
        BigInteger bigInteger;
        BigInteger bigIntegerAdd;
        int i3 = i - 1;
        while (true) {
            bigInteger = new BigInteger(i3, 2, secureRandom);
            bigIntegerAdd = bigInteger.shiftLeft(1).add(j6);
            if (bigIntegerAdd.isProbablePrime(i2) && (i2 <= 2 || bigInteger.isProbablePrime(i2))) {
                break;
            }
        }
        return new BigInteger[]{bigIntegerAdd, bigInteger};
    }
}
