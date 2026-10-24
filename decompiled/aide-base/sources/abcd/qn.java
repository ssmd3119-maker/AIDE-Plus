package abcd;

/* loaded from: classes.dex */
public final class qn extends fn {
    private final hr qp;

    public qn(hr hrVar) {
        super(4, (hrVar.size() * 2) + 4);
        this.qp = hrVar;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_TYPE_LIST;
    }

    @Override // abcd.fn
    public String a8() {
        throw new RuntimeException("unsupported");
    }

    public int hashCode() {
        return er.g3(this.qp);
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        pn pnVarJ3 = kmVar.j3();
        int size = this.qp.size();
        for (int i = 0; i < size; i++) {
            pnVarJ3.a8(this.qp.v5(i));
        }
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        pn pnVarJ3 = kmVar.j3();
        int size = this.qp.size();
        if (lsVar.EQ()) {
            lsVar.Hw(0, XL() + " type_list");
            lsVar.Hw(4, "  size: " + xs.tp(size));
            for (int i = 0; i < size; i++) {
                fr frVarV5 = this.qp.v5(i);
                lsVar.Hw(2, "  " + xs.VH(pnVarJ3.Mr(frVarV5)) + " // " + frVarV5.Zo());
            }
        }
        lsVar.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            lsVar.writeShort(pnVarJ3.Mr(this.qp.v5(i2)));
        }
    }

    @Override // abcd.fn
    public int tp(fn fnVar) {
        return er.sG(this.qp, ((qn) fnVar).qp);
    }

    public hr yS() {
        return this.qp;
    }
}
