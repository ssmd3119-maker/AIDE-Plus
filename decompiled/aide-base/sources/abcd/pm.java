package abcd;

/* loaded from: classes.dex */
public final class pm implements kt, Comparable<pm> {
    private final lq WB;
    private zl mb;

    public pm(lq lqVar, zl zlVar) {
        if (lqVar == null) {
            throw new NullPointerException("field == null");
        }
        if (zlVar == null) {
            throw new NullPointerException("annotations == null");
        }
        this.WB = lqVar;
        this.mb = zlVar;
    }

    public void DW(km kmVar) {
        rm rmVarU7 = kmVar.u7();
        en enVarU2 = kmVar.U2();
        rmVarU7.Mr(this.WB);
        this.mb = (zl) enVarU2.aM(this.mb);
    }

    @Override // java.lang.Comparable
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public int compareTo(pm pmVar) {
        return this.WB.compareTo(pmVar.WB);
    }

    @Override // abcd.kt
    public String Zo() {
        return this.WB.Zo() + ": " + this.mb;
    }

    public boolean equals(Object obj) {
        if (obj instanceof pm) {
            return this.WB.equals(((pm) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    public void v5(km kmVar, ls lsVar) {
        int iJ3 = kmVar.u7().j3(this.WB);
        int iWe = this.mb.we();
        if (lsVar.EQ()) {
            lsVar.Hw(0, "    " + this.WB.Zo());
            lsVar.Hw(4, "      field_idx:       " + xs.tp(iJ3));
            lsVar.Hw(4, "      annotations_off: " + xs.tp(iWe));
        }
        lsVar.writeInt(iJ3);
        lsVar.writeInt(iWe);
    }
}
