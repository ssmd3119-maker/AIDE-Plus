package abcd;

/* loaded from: classes.dex */
public final class bn implements kt, Comparable<bn> {
    private final vq WB;
    private zl mb;

    public bn(vq vqVar, zl zlVar) {
        if (vqVar == null) {
            throw new NullPointerException("method == null");
        }
        if (zlVar == null) {
            throw new NullPointerException("annotations == null");
        }
        this.WB = vqVar;
        this.mb = zlVar;
    }

    public void DW(km kmVar) {
        dn dnVarJ8 = kmVar.J8();
        en enVarU2 = kmVar.U2();
        dnVarJ8.Mr(this.WB);
        this.mb = (zl) enVarU2.aM(this.mb);
    }

    @Override // java.lang.Comparable
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public int compareTo(bn bnVar) {
        return this.WB.compareTo(bnVar.WB);
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB.Zo() + ": " + this.mb;
    }

    public boolean equals(Object obj) {
        if (obj instanceof bn) {
            return this.WB.equals(((bn) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    public void v5(km kmVar, ls lsVar) {
        int iJ3 = kmVar.J8().j3(this.WB);
        int iWe = this.mb.we();
        if (lsVar.EQ()) {
            lsVar.Hw(0, "    " + this.WB.Zo());
            lsVar.Hw(4, "      method_idx:      " + xs.tp(iJ3));
            lsVar.Hw(4, "      annotations_off: " + xs.tp(iWe));
        }
        lsVar.writeInt(iJ3);
        lsVar.writeInt(iWe);
    }
}
