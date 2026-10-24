package abcd;

/* loaded from: classes.dex */
public final class gq extends qq {
    public static final gq mb = new gq(false);
    public static final gq jw = new gq(true);

    private gq(boolean z) {
        super(z ? 1 : 0);
    }

    public static gq yS(int i) {
        if (i == 0) {
            return mb;
        }
        if (i == 1) {
            return jw;
        }
        throw new IllegalArgumentException("bogus value: " + i);
    }

    @Override // abcd.kt
    public String Zo() {
        return a8() ? "true" : "false";
    }

    public boolean a8() {
        return aM() != 0;
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.w9;
    }

    public String toString() {
        return a8() ? "boolean{true}" : "boolean{false}";
    }

    @Override // abcd.bq
    public String tp() {
        return "boolean";
    }
}
