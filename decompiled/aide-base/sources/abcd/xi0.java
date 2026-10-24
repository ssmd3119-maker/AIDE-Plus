package abcd;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class xi0 extends ai0 implements gi0 {
    private static final char[] jw = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected byte[] WB;
    protected int mb;

    public xi0(byte[] bArr, int i) {
        this.WB = bArr;
        this.mb = i;
    }

    public static xi0 J8(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i2 = inputStream.read();
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        if (i3 == 0 || mq0.FH(inputStream, bArr) == i3) {
            return new xi0(bArr, i2);
        }
        throw new EOFException("EOF encountered in middle of BIT STRING");
    }

    public static xi0 Ws(byte[] bArr) {
        if (bArr.length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte b = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new xi0(bArr2, b);
    }

    public static xi0 XL(Object obj) {
        if (obj == null || (obj instanceof xi0)) {
            return (xi0) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static xi0 aM(hi0 hi0Var, boolean z) {
        ai0 ai0VarWs = hi0Var.Ws();
        return (z || (ai0VarWs instanceof xi0)) ? XL(ai0VarWs) : Ws(((wh0) ai0VarWs).Ws());
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
                stringBuffer.append(jw[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(jw[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            throw new RuntimeException("internal error encoding BitString");
        }
    }

    public byte[] QX() {
        return this.WB;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (!(ai0Var instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) ai0Var;
        return this.mb == xi0Var.mb && dq0.j6(this.WB, xi0Var.WB);
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        int length = QX().length + 1;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) j3();
        System.arraycopy(QX(), 0, bArr, 1, length - 1);
        yh0Var.VH(3, bArr);
    }

    @Override // abcd.uh0
    public int hashCode() {
        return this.mb ^ dq0.Hw(this.WB);
    }

    public int j3() {
        return this.mb;
    }

    public String toString() {
        return FH();
    }

    @Override // abcd.ai0
    public int u7() {
        return jk0.j6(this.WB.length + 1) + 1 + this.WB.length + 1;
    }

    public xi0(byte[] bArr) {
        this(bArr, 0);
    }

    public xi0(mh0 mh0Var) {
        try {
            this.WB = mh0Var.DW().Zo("DER");
            this.mb = 0;
        } catch (IOException e) {
            throw new IllegalArgumentException("Error processing object : " + e.toString());
        }
    }
}
