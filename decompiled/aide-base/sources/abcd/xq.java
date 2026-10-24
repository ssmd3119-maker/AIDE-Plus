package abcd;

/* loaded from: classes.dex */
public final class xq extends qq {
    public static final xq mb = yS(0);

    private xq(short s) {
        super(s);
    }

    public static xq a8(int i) {
        short s = (short) i;
        if (s == i) {
            return yS(s);
        }
        throw new IllegalArgumentException("bogus short value: " + i);
    }

    public static xq yS(short s) {
        return new xq(s);
    }

    @Override // abcd.kt
    public String Zo() {
        return Integer.toString(aM());
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.kf;
    }

    public String toString() {
        int iAM = aM();
        return "short{0x" + xs.VH(iAM) + " / " + iAM + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "short";
    }
}
