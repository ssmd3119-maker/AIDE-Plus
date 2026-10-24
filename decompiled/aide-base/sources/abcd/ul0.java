package abcd;

/* loaded from: classes.dex */
public class ul0 extends uh0 {
    bi0 WB;
    zl0 mb;

    private ul0(bi0 bi0Var) {
        this.WB = bi0Var;
        if (bi0Var.j3() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.mb = zl0.gn(bi0Var.XL(0));
        sl0.gn(bi0Var.XL(1));
        xi0.XL(bi0Var.XL(2));
    }

    public static ul0 VH(Object obj) {
        if (obj instanceof ul0) {
            return (ul0) obj;
        }
        if (obj != null) {
            return new ul0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }

    public ol0 gn() {
        return this.mb.u7();
    }

    public zl0 tp() {
        return this.mb;
    }

    public sh0 u7() {
        return this.mb.tp();
    }
}
