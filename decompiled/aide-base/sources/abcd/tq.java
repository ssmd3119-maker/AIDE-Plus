package abcd;

/* loaded from: classes.dex */
public final class tq extends rq {
    public static final tq mb = yS(0);
    public static final tq jw = yS(1);

    private tq(long j) {
        super(j);
    }

    public static tq yS(long j) {
        return new tq(j);
    }

    @Override // abcd.kt
    public String Zo() {
        return Long.toString(Mr());
    }

    public long a8() {
        return Mr();
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.Q6;
    }

    public String toString() {
        long jMr = Mr();
        return "long{0x" + xs.EQ(jMr) + " / " + jMr + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "long";
    }
}
