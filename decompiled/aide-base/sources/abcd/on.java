package abcd;

/* loaded from: classes.dex */
public final class on extends um {
    public on(zq zqVar) {
        super(zqVar);
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_TYPE_ID_ITEM;
    }

    @Override // abcd.wm
    public void Zo(km kmVar, ls lsVar) {
        yq yqVarQX = QX().QX();
        int iJ3 = kmVar.aM().j3(yqVarQX);
        if (lsVar.EQ()) {
            lsVar.Hw(0, we() + ' ' + yqVarQX.Zo());
            StringBuilder sb = new StringBuilder();
            sb.append("  descriptor_idx: ");
            sb.append(xs.tp(iJ3));
            lsVar.Hw(4, sb.toString());
        }
        lsVar.writeInt(iJ3);
    }

    @Override // abcd.um, abcd.wm
    public void j6(km kmVar) {
        kmVar.aM().U2(QX().QX());
    }

    @Override // abcd.wm
    public int v5() {
        return 4;
    }
}
