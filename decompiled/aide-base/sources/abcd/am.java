package abcd;

/* loaded from: classes.dex */
public final class am extends fn {
    private zl qp;

    public am(zl zlVar) {
        super(4, 4);
        if (zlVar == null) {
            throw new NullPointerException("annotations == null");
        }
        this.qp = zlVar;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // abcd.fn
    public String a8() {
        return this.qp.a8();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        this.qp = (zl) kmVar.U2().aM(this.qp);
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        int iWe = this.qp.we();
        if (lsVar.EQ()) {
            lsVar.Hw(4, "  annotations_off: " + xs.tp(iWe));
        }
        lsVar.writeInt(iWe);
    }
}
