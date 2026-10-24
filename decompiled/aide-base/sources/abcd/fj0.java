package abcd;

/* loaded from: classes.dex */
public class fj0 extends ai0 implements gi0 {
    private byte[] WB;

    public fj0(byte[] bArr) {
        this.WB = bArr;
    }

    public static boolean J8(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
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
        if (ai0Var instanceof fj0) {
            return dq0.j6(this.WB, ((fj0) ai0Var).WB);
        }
        return false;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(22, this.WB);
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

    public fj0(String str) {
        this(str, false);
    }

    public fj0(String str, boolean z) {
        if (str != null) {
            if (z && !J8(str)) {
                throw new IllegalArgumentException("string contains illegal characters");
            }
            this.WB = iq0.Hw(str);
            return;
        }
        throw new NullPointerException("string cannot be null");
    }
}
