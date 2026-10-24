package abcd;

/* loaded from: classes.dex */
public class nl0 extends uh0 {
    private di0 WB;

    private nl0(di0 di0Var) {
        this.WB = di0Var;
    }

    public static nl0 gn(Object obj) {
        if (obj instanceof nl0) {
            return (nl0) obj;
        }
        if (obj != null) {
            return new nl0(di0.Ws(obj));
        }
        return null;
    }

    @Override // abcd.uh0, abcd.mh0
    public ai0 DW() {
        return this.WB;
    }

    public ml0 VH() {
        if (this.WB.U2() == 0) {
            return null;
        }
        return ml0.VH(this.WB.aM(0));
    }

    public boolean tp() {
        return this.WB.U2() > 1;
    }

    public ml0[] u7() {
        int iU2 = this.WB.U2();
        ml0[] ml0VarArr = new ml0[iU2];
        for (int i = 0; i != iU2; i++) {
            ml0VarArr[i] = ml0.VH(this.WB.aM(i));
        }
        return ml0VarArr;
    }
}
