package abcd;

/* loaded from: classes.dex */
public abstract class zm extends um {
    private final uq jw;

    public zm(uq uqVar) {
        super(uqVar.we());
        this.jw = uqVar;
    }

    public abstract String Mr();

    public final uq XL() {
        return this.jw;
    }

    @Override // abcd.wm
    public final void Zo(km kmVar, ls lsVar) {
        pn pnVarJ3 = kmVar.j3();
        nn nnVarAM = kmVar.aM();
        wq wqVarJ0 = this.jw.J0();
        int iJ3 = pnVarJ3.j3(QX());
        int iJ32 = nnVarAM.j3(wqVarJ0.QX());
        int iAM = aM(kmVar);
        if (lsVar.EQ()) {
            lsVar.Hw(0, we() + ' ' + this.jw.Zo());
            StringBuilder sb = new StringBuilder();
            sb.append("  class_idx: ");
            sb.append(xs.VH(iJ3));
            lsVar.Hw(2, sb.toString());
            lsVar.Hw(2, String.format("  %-10s %s", Mr() + ':', xs.VH(iAM)));
            lsVar.Hw(4, "  name_idx:  " + xs.tp(iJ32));
        }
        lsVar.writeShort(iJ3);
        lsVar.writeShort(iAM);
        lsVar.writeInt(iJ32);
    }

    public abstract int aM(km kmVar);

    @Override // abcd.um, abcd.wm
    public void j6(km kmVar) {
        super.j6(kmVar);
        kmVar.aM().U2(XL().J0().QX());
    }

    @Override // abcd.wm
    public int v5() {
        return 8;
    }
}
