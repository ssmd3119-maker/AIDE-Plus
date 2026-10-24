package abcd;

/* loaded from: classes.dex */
public final class ap implements Comparable<ap> {
    private final yq WB;
    private final bq mb;

    public ap(yq yqVar, bq bqVar) {
        if (yqVar == null) {
            throw new NullPointerException("name == null");
        }
        if (bqVar == null) {
            throw new NullPointerException("value == null");
        }
        this.WB = yqVar;
        this.mb = bqVar;
    }

    public yq DW() {
        return this.WB;
    }

    public bq FH() {
        return this.mb;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.WB.equals(apVar.WB) && this.mb.equals(apVar.mb);
    }

    public int hashCode() {
        return (this.WB.hashCode() * 31) + this.mb.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: j6, reason: merged with bridge method [inline-methods] */
    public int compareTo(ap apVar) {
        int iCompareTo = this.WB.compareTo(apVar.WB);
        return iCompareTo != 0 ? iCompareTo : this.mb.compareTo(apVar.mb);
    }

    public String toString() {
        return this.WB.Zo() + ":" + this.mb;
    }
}
