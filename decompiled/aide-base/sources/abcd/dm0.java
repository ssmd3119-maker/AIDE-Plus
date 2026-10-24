package abcd;

/* loaded from: classes.dex */
public class dm0 extends uh0 implements hl0, jm0 {
    bi0 WB;
    xi0 fY;
    sl0 jw;
    am0 mb;

    public dm0(bi0 bi0Var) {
        this.WB = bi0Var;
        if (bi0Var.j3() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.mb = am0.u7(bi0Var.XL(0));
        this.jw = sl0.gn(bi0Var.XL(1));
        this.fY = xi0.XL(bi0Var.XL(2));
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }

    public sl0 EQ() {
        return this.jw;
    }

    public ol0 J0() {
        return this.mb.Ws();
    }

    public yl0 J8() {
        return this.mb.QX();
    }

    public int QX() {
        return this.mb.aM();
    }

    public bm0 VH() {
        return this.mb.VH();
    }

    public am0 Ws() {
        return this.mb;
    }

    public ol0 gn() {
        return this.mb.tp();
    }

    public xi0 tp() {
        return this.fY;
    }

    public sh0 u7() {
        return this.mb.we();
    }

    public bm0 we() {
        return this.mb.J8();
    }
}
