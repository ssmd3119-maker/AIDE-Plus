package abcd;

/* loaded from: classes.dex */
public final class cn extends zm {
    public cn(fq fqVar) {
        super(fqVar);
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_METHOD_ID_ITEM;
    }

    @Override // abcd.zm
    public String Mr() {
        return "proto_idx";
    }

    public fq U2() {
        return (fq) XL();
    }

    @Override // abcd.zm
    public int aM(km kmVar) {
        return kmVar.Ws().aM(U2().aM());
    }

    @Override // abcd.zm, abcd.um, abcd.wm
    public void j6(km kmVar) {
        super.j6(kmVar);
        kmVar.Ws().j3(U2().aM());
    }
}
