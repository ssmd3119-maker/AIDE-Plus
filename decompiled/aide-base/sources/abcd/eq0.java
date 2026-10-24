package abcd;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class eq0 {
    private static final BigInteger j6 = BigInteger.valueOf(0);

    public static BigInteger j6(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return j6(j6, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        for (int i = 0; i < 1000; i++) {
            BigInteger bigInteger3 = new BigInteger(bigInteger2.bitLength(), secureRandom);
            if (bigInteger3.compareTo(bigInteger) >= 0 && bigInteger3.compareTo(bigInteger2) <= 0) {
                return bigInteger3;
            }
        }
        return new BigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }
}
