package abcd;

/* loaded from: classes.dex */
public abstract class uq extends br {
    private final zq WB;
    private final wq mb;

    public uq(zq zqVar, wq wqVar) {
        if (zqVar == null) {
            throw new NullPointerException("definingClass == null");
        }
        if (wqVar == null) {
            throw new NullPointerException("nat == null");
        }
        this.WB = zqVar;
        this.mb = wqVar;
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        uq uqVar = (uq) bqVar;
        int iCompareTo = this.WB.compareTo(uqVar.WB);
        return iCompareTo != 0 ? iCompareTo : this.mb.QX().compareTo(uqVar.mb.QX());
    }

    public final wq J0() {
        return this.mb;
    }

    @Override // abcd.kt
    public final String Zo() {
        return this.WB.Zo() + '.' + this.mb.Zo();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uq uqVar = (uq) obj;
        return this.WB.equals(uqVar.WB) && this.mb.equals(uqVar.mb);
    }

    public final int hashCode() {
        return (this.WB.hashCode() * 31) ^ this.mb.hashCode();
    }

    public final String toString() {
        return tp() + '{' + Zo() + '}';
    }

    @Override // abcd.bq
    public final boolean v5() {
        return false;
    }

    public final zq we() {
        return this.WB;
    }
}
