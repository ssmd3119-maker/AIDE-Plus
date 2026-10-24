package abcd;

/* loaded from: classes.dex */
public final class qm extends zm {
    public qm(lq lqVar) {
        super(lqVar);
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_FIELD_ID_ITEM;
    }

    @Override // abcd.zm
    public String Mr() {
        return "type_idx";
    }

    public lq U2() {
        return (lq) XL();
    }

    @Override // abcd.zm
    public int aM(km kmVar) {
        return kmVar.j3().Mr(U2().j6());
    }

    @Override // abcd.zm, abcd.um, abcd.wm
    public void j6(km kmVar) {
        super.j6(kmVar);
        kmVar.j3().a8(U2().j6());
    }
}
