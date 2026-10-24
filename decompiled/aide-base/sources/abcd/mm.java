package abcd;

/* loaded from: classes.dex */
public final class mm extends nm implements Comparable<mm> {
    private final lq mb;

    public mm(lq lqVar, int i) {
        super(i);
        if (lqVar == null) {
            throw new NullPointerException("field == null");
        }
        this.mb = lqVar;
    }

    @Override // abcd.nm
    public int DW(km kmVar, ls lsVar, int i, int i2) {
        int iJ3 = kmVar.u7().j3(this.mb);
        int i3 = iJ3 - i;
        int iFH = FH();
        if (lsVar.EQ()) {
            lsVar.Hw(0, String.format("  [%x] %s", Integer.valueOf(i2), this.mb.Zo()));
            lsVar.Hw(et.FH(i3), "    field_idx:    " + xs.tp(iJ3));
            lsVar.Hw(et.FH(iFH), "    access_flags: " + bp.DW(iFH));
        }
        lsVar.gn(i3);
        lsVar.gn(iFH);
        return iJ3;
    }

    @Override // abcd.kt
    public String Zo() {
        return this.mb.Zo();
    }

    public boolean equals(Object obj) {
        return (obj instanceof mm) && compareTo((mm) obj) == 0;
    }

    public int hashCode() {
        return this.mb.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(mm.class.getName());
        stringBuffer.append('{');
        stringBuffer.append(xs.VH(FH()));
        stringBuffer.append(' ');
        stringBuffer.append(this.mb);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: tp, reason: merged with bridge method [inline-methods] */
    public int compareTo(mm mmVar) {
        return this.mb.compareTo(mmVar.mb);
    }

    public void v5(km kmVar) {
        kmVar.u7().Mr(this.mb);
    }

    public lq we() {
        return this.mb;
    }
}
