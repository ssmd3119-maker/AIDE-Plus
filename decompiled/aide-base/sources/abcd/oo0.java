package abcd;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class oo0 implements mn0 {
    private BigInteger DW;
    private BigInteger FH;
    private int Hw;
    private BigInteger j6;
    private int v5;

    public oo0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, j6(i), i, null, null);
    }

    private static int j6(int i) {
        if (i != 0 && i < 160) {
            return i;
        }
        return 160;
    }

    public BigInteger DW() {
        return this.j6;
    }

    public int FH() {
        return this.v5;
    }

    public int Hw() {
        return this.Hw;
    }

    public BigInteger Zo() {
        return this.FH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof oo0)) {
            return false;
        }
        oo0 oo0Var = (oo0) obj;
        if (Zo() != null) {
            if (!Zo().equals(oo0Var.Zo())) {
                return false;
            }
        } else if (oo0Var.Zo() != null) {
            return false;
        }
        return oo0Var.v5().equals(this.DW) && oo0Var.DW().equals(this.j6);
    }

    public int hashCode() {
        return (v5().hashCode() ^ DW().hashCode()) ^ (Zo() != null ? Zo().hashCode() : 0);
    }

    public BigInteger v5() {
        return this.DW;
    }

    public oo0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ro0 ro0Var) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, ro0Var);
    }

    public oo0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, ro0 ro0Var) {
        if (i2 != 0) {
            if (BigInteger.valueOf(2 ^ (i2 - 1)).compareTo(bigInteger) == 1) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.j6 = bigInteger2;
        this.DW = bigInteger;
        this.FH = bigInteger3;
        this.Hw = i;
        this.v5 = i2;
    }
}
