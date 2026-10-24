package abcd;

/* loaded from: classes.dex */
public final class ln extends fn {
    private final yq qp;

    public ln(yq yqVar) {
        super(1, yS(yqVar));
        this.qp = yqVar;
    }

    private static int yS(yq yqVar) {
        return et.FH(yqVar.QX()) + yqVar.aM() + 1;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_STRING_DATA_ITEM;
    }

    @Override // abcd.fn
    public String a8() {
        return this.qp.yS();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        os osVarWe = this.qp.we();
        int iQX = this.qp.QX();
        if (lsVar.EQ()) {
            lsVar.Hw(et.FH(iQX), "utf16_size: " + xs.tp(iQX));
            lsVar.Hw(osVarWe.XL() + 1, this.qp.yS());
        }
        lsVar.gn(iQX);
        lsVar.tp(osVarWe);
        lsVar.writeByte(0);
    }

    @Override // abcd.fn
    public int tp(fn fnVar) {
        return this.qp.compareTo(((ln) fnVar).qp);
    }
}
