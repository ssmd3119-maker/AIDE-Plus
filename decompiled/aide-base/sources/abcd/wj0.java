package abcd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class wj0 extends ai0 implements gi0 {
    private static final char[] mb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private byte[] WB;

    public wj0(byte[] bArr) {
        this.WB = bArr;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    @Override // abcd.gi0
    public String FH() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new yh0(byteArrayOutputStream).tp(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(mb[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(mb[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new RuntimeException("internal error encoding BitString");
        }
    }

    public byte[] J8() {
        return this.WB;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof wj0) {
            return dq0.j6(this.WB, ((wj0) ai0Var).WB);
        }
        return false;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        yh0Var.VH(28, J8());
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
