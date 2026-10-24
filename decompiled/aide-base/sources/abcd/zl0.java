package abcd;

/* loaded from: classes.dex */
public class zl0 extends uh0 {
    bi0 WB;
    wl0 fY;
    ol0 jw;
    sh0 mb;

    private zl0(bi0 bi0Var) {
        int i;
        this.WB = bi0Var;
        if (bi0Var.XL(0) instanceof tj0) {
            gj0.Ws((hi0) bi0Var.XL(0), true);
            i = 0;
        } else {
            new sh0(0);
            i = -1;
        }
        this.mb = gj0.J8(bi0Var.XL(i + 1));
        sl0.gn(bi0Var.XL(i + 2));
        this.jw = ol0.VH(bi0Var.XL(i + 3));
        bi0 bi0Var2 = (bi0) bi0Var.XL(i + 4);
        bm0.gn(bi0Var2.XL(0));
        bm0.gn(bi0Var2.XL(1));
        ol0.VH(bi0Var.XL(i + 5));
        int i2 = i + 6;
        yl0.gn(bi0Var.XL(i2));
        for (int iJ3 = (bi0Var.j3() - i2) - 1; iJ3 > 0; iJ3--) {
            tj0 tj0Var = (tj0) bi0Var.XL(i2 + iJ3);
            int iQX = tj0Var.QX();
            if (iQX == 1) {
                xi0.aM(tj0Var, false);
            } else if (iQX == 2) {
                xi0.aM(tj0Var, false);
            } else if (iQX == 3) {
                this.fY = wl0.gn(bi0.Ws(tj0Var, true));
            }
        }
    }

    public static zl0 gn(Object obj) {
        if (obj instanceof zl0) {
            return (zl0) obj;
        }
        if (obj != null) {
            return new zl0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }

    public wl0 VH() {
        return this.fY;
    }

    public sh0 tp() {
        return this.mb;
    }

    public ol0 u7() {
        return this.jw;
    }
}
