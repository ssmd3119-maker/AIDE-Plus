package abcd;

/* loaded from: classes.dex */
public class jl0 extends uh0 {
    private sl0 WB;
    private sh0 fY;
    private sh0 jw;
    private sl0 mb;
    public static final sl0 qp = new sl0(fl0.Hw, (mh0) new hj0());
    public static final sl0 k2 = new sl0(hl0.u7, (mh0) qp);
    public static final sh0 zh = new sh0(20);
    public static final sh0 AL = new sh0(1);

    public jl0() {
        this.WB = qp;
        this.mb = k2;
        this.jw = zh;
        this.fY = AL;
    }

    public static jl0 gn(Object obj) {
        if (obj instanceof jl0) {
            return (jl0) obj;
        }
        if (obj != null) {
            return new jl0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        nh0 nh0Var = new nh0();
        if (!this.WB.equals(qp)) {
            nh0Var.j6(new tj0(true, 0, this.WB));
        }
        if (!this.mb.equals(k2)) {
            nh0Var.j6(new tj0(true, 1, this.mb));
        }
        if (!this.jw.equals(zh)) {
            nh0Var.j6(new tj0(true, 2, this.jw));
        }
        if (!this.fY.equals(AL)) {
            nh0Var.j6(new tj0(true, 3, this.fY));
        }
        return new oj0(nh0Var);
    }

    public sl0 VH() {
        return this.WB;
    }

    public jl0(sl0 sl0Var, sl0 sl0Var2, sh0 sh0Var, sh0 sh0Var2) {
        this.WB = sl0Var;
        this.mb = sl0Var2;
        this.jw = sh0Var;
        this.fY = sh0Var2;
    }

    private jl0(bi0 bi0Var) {
        this.WB = qp;
        this.mb = k2;
        this.jw = zh;
        this.fY = AL;
        for (int i = 0; i != bi0Var.j3(); i++) {
            hi0 hi0Var = (hi0) bi0Var.XL(i);
            int iQX = hi0Var.QX();
            if (iQX == 0) {
                this.WB = sl0.u7(hi0Var, true);
            } else if (iQX == 1) {
                this.mb = sl0.u7(hi0Var, true);
            } else if (iQX == 2) {
                this.jw = gj0.Ws(hi0Var, true);
            } else if (iQX == 3) {
                this.fY = gj0.Ws(hi0Var, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }
}
