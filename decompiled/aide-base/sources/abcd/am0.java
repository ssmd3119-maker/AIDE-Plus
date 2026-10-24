package abcd;

/* loaded from: classes.dex */
public class am0 extends uh0 implements hl0, jm0 {
    ol0 AL;
    bi0 WB;
    xi0 cT;
    sl0 fY;
    xi0 hK;
    sh0 jw;
    bm0 k2;
    sh0 mb;
    fm0 q7;
    ol0 qp;
    yl0 w9;
    bm0 zh;

    public am0(bi0 bi0Var) {
        int i;
        this.WB = bi0Var;
        if (bi0Var.XL(0) instanceof tj0) {
            this.mb = gj0.Ws((hi0) bi0Var.XL(0), true);
            i = 0;
        } else {
            this.mb = new sh0(0);
            i = -1;
        }
        this.jw = gj0.J8(bi0Var.XL(i + 1));
        this.fY = sl0.gn(bi0Var.XL(i + 2));
        this.qp = ol0.VH(bi0Var.XL(i + 3));
        bi0 bi0Var2 = (bi0) bi0Var.XL(i + 4);
        this.k2 = bm0.gn(bi0Var2.XL(0));
        this.zh = bm0.gn(bi0Var2.XL(1));
        this.AL = ol0.VH(bi0Var.XL(i + 5));
        int i2 = i + 6;
        this.w9 = yl0.gn(bi0Var.XL(i2));
        for (int iJ3 = (bi0Var.j3() - i2) - 1; iJ3 > 0; iJ3--) {
            tj0 tj0Var = (tj0) bi0Var.XL(i2 + iJ3);
            int iQX = tj0Var.QX();
            if (iQX == 1) {
                this.hK = xi0.aM(tj0Var, false);
            } else if (iQX == 2) {
                this.cT = xi0.aM(tj0Var, false);
            } else if (iQX == 3) {
                this.q7 = fm0.gn(tj0Var);
            }
        }
    }

    public static am0 u7(Object obj) {
        if (obj instanceof am0) {
            return (am0) obj;
        }
        if (obj != null) {
            return new am0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }

    public xi0 EQ() {
        return this.hK;
    }

    public sl0 J0() {
        return this.fY;
    }

    public bm0 J8() {
        return this.k2;
    }

    public yl0 QX() {
        return this.w9;
    }

    public bm0 VH() {
        return this.zh;
    }

    public ol0 Ws() {
        return this.AL;
    }

    public xi0 XL() {
        return this.cT;
    }

    public int aM() {
        return this.mb.XL().intValue() + 1;
    }

    public fm0 gn() {
        return this.q7;
    }

    public ol0 tp() {
        return this.qp;
    }

    public sh0 we() {
        return this.jw;
    }
}
