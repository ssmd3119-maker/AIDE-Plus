package abcd;

/* loaded from: classes.dex */
public final class wq extends bq {
    public static final wq jw = new wq(new yq("TYPE"), new yq("Ljava/lang/Class;"));
    private final yq WB;
    private final yq mb;

    public wq(yq yqVar, yq yqVar2) {
        if (yqVar == null) {
            throw new NullPointerException("name == null");
        }
        if (yqVar2 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.WB = yqVar;
        this.mb = yqVar2;
    }

    @Override // abcd.bq
    public int FH(bq bqVar) {
        wq wqVar = (wq) bqVar;
        int iCompareTo = this.WB.compareTo(wqVar.WB);
        return iCompareTo != 0 ? iCompareTo : this.mb.compareTo(wqVar.mb);
    }

    public fr J0() {
        return fr.a8(this.mb.J0());
    }

    public final boolean Mr() {
        return this.WB.J0().equals("<init>");
    }

    public yq QX() {
        return this.WB;
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB.Zo() + ':' + this.mb.Zo();
    }

    public final boolean aM() {
        return this.WB.J0().equals("<clinit>");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wq)) {
            return false;
        }
        wq wqVar = (wq) obj;
        return this.WB.equals(wqVar.WB) && this.mb.equals(wqVar.mb);
    }

    public int hashCode() {
        return (this.WB.hashCode() * 31) ^ this.mb.hashCode();
    }

    public String toString() {
        return "nat{" + Zo() + '}';
    }

    @Override // abcd.bq
    public String tp() {
        return "nat";
    }

    @Override // abcd.bq
    public boolean v5() {
        return false;
    }

    public yq we() {
        return this.mb;
    }
}
