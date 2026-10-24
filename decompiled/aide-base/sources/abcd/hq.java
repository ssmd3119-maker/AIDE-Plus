package abcd;

/* loaded from: classes.dex */
public final class hq extends qq {
    public static final hq mb = a8((byte) 0);

    private hq(byte b) {
        super(b);
    }

    public static hq a8(byte b) {
        return new hq(b);
    }

    public static hq yS(int i) {
        byte b = (byte) i;
        if (b == i) {
            return a8(b);
        }
        throw new IllegalArgumentException("bogus byte value: " + i);
    }

    @Override // abcd.kt
    public String Zo() {
        return Integer.toString(aM());
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.hK;
    }

    public String toString() {
        int iAM = aM();
        return "byte{0x" + xs.Zo(iAM) + " / " + iAM + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "byte";
    }
}
