package abcd;

/* loaded from: classes.dex */
public final class mn extends vm implements Comparable {
    private ln jw;
    private final yq mb;

    public mn(yq yqVar) {
        if (yqVar == null) {
            throw new NullPointerException("value == null");
        }
        this.mb = yqVar;
        this.jw = null;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_STRING_ID_ITEM;
    }

    public yq QX() {
        return this.mb;
    }

    @Override // abcd.wm
    public void Zo(km kmVar, ls lsVar) {
        int iWe = this.jw.we();
        if (lsVar.EQ()) {
            lsVar.Hw(0, we() + ' ' + this.mb.BT(100));
            StringBuilder sb = new StringBuilder();
            sb.append("  string_data_off: ");
            sb.append(xs.tp(iWe));
            lsVar.Hw(4, sb.toString());
        }
        lsVar.writeInt(iWe);
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.mb.compareTo(((mn) obj).mb);
    }

    public boolean equals(Object obj) {
        if (obj instanceof mn) {
            return this.mb.equals(((mn) obj).mb);
        }
        return false;
    }

    public int hashCode() {
        return this.mb.hashCode();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        if (this.jw == null) {
            en enVarXL = kmVar.XL();
            ln lnVar = new ln(this.mb);
            this.jw = lnVar;
            enVarXL.XL(lnVar);
        }
    }

    @Override // abcd.wm
    public int v5() {
        return 4;
    }
}
