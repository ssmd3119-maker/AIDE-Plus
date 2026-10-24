package abcd;

/* loaded from: classes.dex */
public class sk0 extends uh0 implements lh0 {
    private mh0 WB;

    public sk0(qk0 qk0Var) {
        this.WB = qk0Var;
    }

    public static sk0 VH(Object obj) {
        if (obj == null || (obj instanceof sk0)) {
            return (sk0) obj;
        }
        if (obj instanceof qk0) {
            return new sk0((qk0) obj);
        }
        if (obj instanceof wh0) {
            return new sk0((wh0) obj);
        }
        if (obj instanceof ai0) {
            return new sk0((ai0) obj);
        }
        throw new IllegalArgumentException("Illegal object in SignerIdentifier: " + obj.getClass().getName());
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB.DW();
    }

    public boolean gn() {
        return this.WB instanceof hi0;
    }

    public sk0(wh0 wh0Var) {
        this.WB = new tj0(false, 0, wh0Var);
    }

    public sk0(ai0 ai0Var) {
        this.WB = ai0Var;
    }
}
