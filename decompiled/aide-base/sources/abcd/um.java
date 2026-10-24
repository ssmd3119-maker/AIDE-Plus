package abcd;

/* loaded from: classes.dex */
public abstract class um extends vm {
    private final zq mb;

    public um(zq zqVar) {
        if (zqVar == null) {
            throw new NullPointerException("type == null");
        }
        this.mb = zqVar;
    }

    public final zq QX() {
        return this.mb;
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        kmVar.j3().U2(this.mb);
    }
}
