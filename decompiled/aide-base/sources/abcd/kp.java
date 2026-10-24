package abcd;

/* loaded from: classes.dex */
public class kp implements Comparable<kp> {
    private final yq WB;
    private final yq mb;

    private kp(yq yqVar, yq yqVar2) {
        this.WB = yqVar;
        this.mb = yqVar2;
    }

    public static kp Zo(yq yqVar, yq yqVar2) {
        if (yqVar == null && yqVar2 == null) {
            return null;
        }
        return new kp(yqVar, yqVar2);
    }

    private static int j6(yq yqVar, yq yqVar2) {
        if (yqVar == yqVar2) {
            return 0;
        }
        if (yqVar == null) {
            return -1;
        }
        if (yqVar2 == null) {
            return 1;
        }
        return yqVar.compareTo(yqVar2);
    }

    @Override // java.lang.Comparable
    /* renamed from: DW, reason: merged with bridge method [inline-methods] */
    public int compareTo(kp kpVar) {
        int iJ6 = j6(this.WB, kpVar.WB);
        return iJ6 != 0 ? iJ6 : j6(this.mb, kpVar.mb);
    }

    public yq FH() {
        return this.WB;
    }

    public boolean equals(Object obj) {
        return (obj instanceof kp) && compareTo((kp) obj) == 0;
    }

    public int hashCode() {
        yq yqVar = this.WB;
        int iHashCode = (yqVar == null ? 0 : yqVar.hashCode()) * 31;
        yq yqVar2 = this.mb;
        return iHashCode + (yqVar2 != null ? yqVar2.hashCode() : 0);
    }

    public String toString() {
        yq yqVar = this.WB;
        if (yqVar != null && this.mb == null) {
            return yqVar.yS();
        }
        if (this.WB == null && this.mb == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        yq yqVar2 = this.WB;
        sb.append(yqVar2 == null ? "" : yqVar2.yS());
        sb.append("|");
        yq yqVar3 = this.mb;
        sb.append(yqVar3 != null ? yqVar3.yS() : "");
        return sb.toString();
    }

    public yq v5() {
        return this.mb;
    }
}
