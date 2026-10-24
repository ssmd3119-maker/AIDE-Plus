package abcd;

/* loaded from: classes.dex */
public class sj0 extends ai0 implements gi0 {
    private byte[] WB;

    public sj0(byte[] bArr) {
        this.WB = bArr;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    @Override // abcd.gi0
    public String FH() {
        return iq0.DW(this.WB);
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof sj0) {
            return dq0.j6(this.WB, ((sj0) ai0Var).WB);
        }
        return false;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(20, this.WB);
    }

    @Override // abcd.uh0
    public int hashCode() {
        return dq0.Hw(this.WB);
    }

    public String toString() {
        return FH();
    }

    @Override // abcd.ai0
    public int u7() {
        return jk0.j6(this.WB.length) + 1 + this.WB.length;
    }
}
