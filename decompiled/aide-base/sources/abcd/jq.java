package abcd;

/* loaded from: classes.dex */
public final class jq extends rq {
    public static final jq mb = new jq(Double.doubleToLongBits(0.0d));
    public static final jq jw = new jq(Double.doubleToLongBits(1.0d));

    private jq(long j) {
        super(j);
    }

    public static jq a8(long j) {
        return new jq(j);
    }

    @Override // abcd.kt
    public String Zo() {
        return Double.toString(Double.longBitsToDouble(Mr()));
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.q7;
    }

    public String toString() {
        long jMr = Mr();
        return "double{0x" + xs.EQ(jMr) + " / " + Double.longBitsToDouble(jMr) + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "double";
    }
}
