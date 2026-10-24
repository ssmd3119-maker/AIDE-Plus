package org.codehaus.groovy.syntax;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class Numbers {
    private static final BigDecimal DW;
    private static final BigDecimal j6;

    static {
        BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger.valueOf(2147483647L);
        BigInteger.valueOf(-2147483648L);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(Double.MAX_VALUE));
        j6 = bigDecimal;
        bigDecimal.negate();
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(Float.MAX_VALUE));
        DW = bigDecimal2;
        bigDecimal2.negate();
    }
}
