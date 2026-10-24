package abcd;

/* loaded from: classes.dex */
public final class ci implements gr {
    private final int WB;

    public ci(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.WB = i;
    }

    public int DW() {
        return this.WB;
    }

    @Override // abcd.gr
    public int U2() {
        return fr.eU.U2();
    }

    @Override // abcd.gr
    public boolean XL() {
        return false;
    }

    @Override // abcd.kt
    public String Zo() {
        return toString();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ci) && this.WB == ((ci) obj).WB;
    }

    public int hashCode() {
        return this.WB;
    }

    @Override // abcd.gr
    public fr j6() {
        return fr.eU;
    }

    @Override // abcd.gr
    public gr rN() {
        return this;
    }

    public String toString() {
        return "<addr:" + xs.VH(this.WB) + ">";
    }

    @Override // abcd.gr
    public int u7() {
        return fr.eU.u7();
    }
}
