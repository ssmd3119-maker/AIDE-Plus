package abcd;

/* loaded from: classes.dex */
public final class dq extends bq {
    private final wo WB;

    public dq(wo woVar) {
        if (woVar == null) {
            throw new NullPointerException("annotation == null");
        }
        woVar.yS();
        this.WB = woVar;
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        return this.WB.compareTo(((dq) bqVar).WB);
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof dq) {
            return this.WB.equals(((dq) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    public String toString() {
        return this.WB.toString();
    }

    @Override // abcd.bq
    public String tp() {
        return "annotation";
    }

    @Override // abcd.bq
    public boolean v5() {
        return false;
    }

    public wo we() {
        return this.WB;
    }
}
