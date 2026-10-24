package abcd;

import abcd.tb0;

/* loaded from: classes.dex */
public class dc0 extends ld0 {
    private int Q6;
    private a70 Z1;
    private tb0.a kf;
    private int n5;

    public dc0(j60 j60Var, int i) {
        super(j60Var);
        this.n5 = i << 5;
    }

    public boolean CU() {
        return (this.n5 & 4) != 0;
    }

    public boolean Eq() {
        return (this.n5 & 2) != 0;
    }

    public void Ev(a70 a70Var) {
        this.Z1 = a70Var;
    }

    public tb0.a FN() {
        tb0.a aVar = this.kf;
        if (aVar != null) {
            this.kf = null;
        }
        return aVar;
    }

    public void OW() {
        this.n5 &= -3;
    }

    public void WB(boolean z) {
        if (z) {
            this.n5 |= 4;
        } else {
            this.n5 &= -5;
        }
    }

    public int XG() {
        return this.Q6;
    }

    public dc0 XX() {
        a70 a70Var = this.Z1;
        if (a70Var instanceof dc0) {
            return (dc0) a70Var;
        }
        return null;
    }

    public boolean Xa() {
        return (this.n5 & 8) != 0;
    }

    public void aq() {
        this.n5 |= 1;
    }

    public int br() {
        return this.Q6;
    }

    public boolean et() {
        return this.Z1 != null;
    }

    public void fY() {
        this.n5 |= 2;
    }

    public boolean hz() {
        return Qq() != 0;
    }

    public int jJ() {
        return (this.n5 >> 5) & 7;
    }

    public void jO(hc0 hc0Var) {
    }

    public void jw(int i) {
        this.Q6 = i;
    }

    public boolean k2() {
        return (this.n5 & 1) != 0;
    }

    public a70 kQ() {
        return this.Z1;
    }

    public void ko(int i) {
        this.Q6 = i;
    }

    public void lp() {
        this.Z1 = null;
        tb0.a aVar = this.kf;
        if (aVar != null) {
            aVar.clear();
            this.kf.enqueue();
            this.kf = null;
        }
    }

    public void mb() {
        this.n5 |= 8;
    }

    public void oY(tb0.a aVar) {
        this.kf = aVar;
    }

    public void qp(int i) {
        sy(i);
    }

    @Override // abcd.j60
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectToPack[");
        sb.append(r60.VH(jJ()));
        sb.append(" ");
        sb.append(BT());
        if (k2()) {
            sb.append(" wantWrite");
        }
        if (Eq()) {
            sb.append(" reuseAsIs");
        }
        if (CU()) {
            sb.append(" doNotDelta");
        }
        if (Xa()) {
            sb.append(" edge");
        }
        if (yO() > 0) {
            sb.append(" depth=" + yO());
        }
        if (et()) {
            if (XX() != null) {
                sb.append(" base=inpack:" + XX().BT());
            } else {
                sb.append(" base=edge:" + kQ().BT());
            }
        }
        if (hz()) {
            sb.append(" offset=" + Qq());
        }
        sb.append("]");
        return sb.toString();
    }

    public int wc() {
        return x9();
    }

    public int yO() {
        return this.n5 >>> 12;
    }

    public void ye(int i) {
        this.n5 = (i << 12) | (this.n5 & 4095);
    }

    public dc0(o90 o90Var) {
        this(o90Var, o90Var.aj());
    }
}
