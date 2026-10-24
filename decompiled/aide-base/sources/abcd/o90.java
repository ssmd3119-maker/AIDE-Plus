package abcd;

import abcd.b70;

/* loaded from: classes.dex */
public abstract class o90 extends b70.b {
    int cT;

    public o90(j60 j60Var) {
        super(j60Var);
    }

    public abstract void OW(t90 t90Var);

    public void Qq(StringBuilder sb) {
        sb.append((this.cT & 32) != 0 ? 'o' : '-');
        sb.append((this.cT & 16) != 0 ? 't' : '-');
        sb.append((this.cT & 8) != 0 ? 'r' : '-');
        sb.append((this.cT & 4) != 0 ? 'u' : '-');
        sb.append((this.cT & 2) != 0 ? 's' : '-');
        sb.append((this.cT & 1) != 0 ? 'p' : '-');
    }

    public abstract int aj();

    public final boolean lp(m90 m90Var) {
        return (m90Var.FH & this.cT) != 0;
    }

    public final a70 sy() {
        return this;
    }

    @Override // abcd.j60
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r60.VH(aj()));
        sb.append(' ');
        sb.append(BT());
        sb.append(' ');
        Qq(sb);
        return sb.toString();
    }

    public final void x9(m90 m90Var) {
        this.cT = m90Var.FH | this.cT;
    }
}
