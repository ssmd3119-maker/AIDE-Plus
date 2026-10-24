package abcd;

/* loaded from: classes.dex */
public class wi0 extends ai0 implements gi0 {
    private char[] WB;

    public wi0(char[] cArr) {
        this.WB = cArr;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    @Override // abcd.gi0
    public String FH() {
        return new String(this.WB);
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof wi0) {
            return dq0.DW(this.WB, ((wi0) ai0Var).WB);
        }
        return false;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.FH(30);
        yh0Var.u7(this.WB.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.WB;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            yh0Var.FH((byte) (c >> '\b'));
            yh0Var.FH((byte) c);
            i++;
        }
    }

    @Override // abcd.uh0
    public int hashCode() {
        return dq0.v5(this.WB);
    }

    public String toString() {
        return FH();
    }

    @Override // abcd.ai0
    public int u7() {
        return jk0.j6(this.WB.length * 2) + 1 + (this.WB.length * 2);
    }
}
