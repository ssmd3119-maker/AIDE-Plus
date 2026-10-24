package abcd;

/* loaded from: classes.dex */
public final class mq extends qq {
    public static final mq mb = a8(Float.floatToIntBits(0.0f));
    public static final mq jw = a8(Float.floatToIntBits(1.0f));
    public static final mq fY = a8(Float.floatToIntBits(2.0f));

    private mq(int i) {
        super(i);
    }

    public static mq a8(int i) {
        return new mq(i);
    }

    @Override // abcd.kt
    public String Zo() {
        return Float.toString(Float.intBitsToFloat(aM()));
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.Z1;
    }

    public String toString() {
        int iAM = aM();
        return "float{0x" + xs.tp(iAM) + " / " + Float.intBitsToFloat(iAM) + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "float";
    }
}
