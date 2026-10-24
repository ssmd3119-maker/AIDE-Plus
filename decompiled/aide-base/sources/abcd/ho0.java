package abcd;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class ho0 {
    static final ho0 j6 = new ho0();
    private static final BigInteger DW = BigInteger.valueOf(1);
    private static final BigInteger FH = BigInteger.valueOf(2);

    private ho0() {
    }

    public BigInteger DW(oo0 oo0Var, BigInteger bigInteger) {
        return oo0Var.DW().modPow(bigInteger, oo0Var.v5());
    }

    public BigInteger j6(oo0 oo0Var, SecureRandom secureRandom) {
        BigInteger bigIntegerV5 = oo0Var.v5();
        int iFH = oo0Var.FH();
        if (iFH != 0) {
            return new BigInteger(iFH, secureRandom).setBit(iFH - 1);
        }
        BigInteger bigIntegerShiftLeft = FH;
        int iHw = oo0Var.Hw();
        if (iHw != 0) {
            bigIntegerShiftLeft = DW.shiftLeft(iHw - 1);
        }
        BigInteger bigIntegerSubtract = bigIntegerV5.subtract(FH);
        BigInteger bigIntegerZo = oo0Var.Zo();
        if (bigIntegerZo != null) {
            bigIntegerSubtract = bigIntegerZo.subtract(FH);
        }
        return eq0.j6(bigIntegerShiftLeft, bigIntegerSubtract, secureRandom);
    }
}
