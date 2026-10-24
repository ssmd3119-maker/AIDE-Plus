package abcd;

import java.util.Enumeration;

/* loaded from: classes.dex */
public class ol0 extends uh0 implements lh0 {
    private static pl0 qp = ql0.j6;
    private boolean WB;
    private nl0[] fY;
    private pl0 jw;
    private int mb;

    private ol0(bi0 bi0Var) {
        this(qp, bi0Var);
    }

    public static ol0 VH(Object obj) {
        if (obj instanceof ol0) {
            return (ol0) obj;
        }
        if (obj != null) {
            return new ol0(bi0.J8(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return new oj0(this.fY);
    }

    @Override // abcd.uh0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ol0) && !(obj instanceof bi0)) {
            return false;
        }
        if (DW().equals(((mh0) obj).DW())) {
            return true;
        }
        try {
            return this.jw.j6(this, new ol0(bi0.J8(((mh0) obj).DW())));
        } catch (Exception unused) {
            return false;
        }
    }

    public nl0[] gn() {
        nl0[] nl0VarArr = this.fY;
        int length = nl0VarArr.length;
        nl0[] nl0VarArr2 = new nl0[length];
        System.arraycopy(nl0VarArr, 0, nl0VarArr2, 0, length);
        return nl0VarArr2;
    }

    @Override // abcd.uh0
    public int hashCode() {
        if (this.WB) {
            return this.mb;
        }
        this.WB = true;
        int iFH = this.jw.FH(this);
        this.mb = iFH;
        return iFH;
    }

    public String toString() {
        return this.jw.DW(this);
    }

    private ol0(pl0 pl0Var, bi0 bi0Var) {
        this.jw = pl0Var;
        this.fY = new nl0[bi0Var.j3()];
        Enumeration enumerationAM = bi0Var.aM();
        int i = 0;
        while (enumerationAM.hasMoreElements()) {
            this.fY[i] = nl0.gn(enumerationAM.nextElement());
            i++;
        }
    }
}
