package abcd;

/* loaded from: classes.dex */
public final class iq extends qq {
    public static final iq mb = a8(0);

    private iq(char c) {
        super(c);
    }

    public static iq a8(char c) {
        return new iq(c);
    }

    public static iq yS(int i) {
        char c = (char) i;
        if (c == i) {
            return a8(c);
        }
        throw new IllegalArgumentException("bogus char value: " + i);
    }

    @Override // abcd.kt
    public String Zo() {
        return Integer.toString(aM());
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.cT;
    }

    public String toString() {
        int iAM = aM();
        return "char{0x" + xs.VH(iAM) + " / " + iAM + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "char";
    }
}
