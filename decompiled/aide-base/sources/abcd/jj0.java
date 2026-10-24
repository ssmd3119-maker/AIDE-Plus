package abcd;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class jj0 extends ai0 {
    private static vh0[][] jw = new vh0[255][];
    String WB;
    private byte[] mb;

    public jj0(byte[] bArr) {
        long j;
        StringBuffer stringBuffer = new StringBuffer();
        BigInteger bigIntegerOr = null;
        long j2 = 0;
        boolean z = true;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j2 < 36028797018963968L) {
                j2 = (j2 * 128) + (i2 & 127);
                if ((i2 & 128) == 0) {
                    if (z) {
                        int i3 = ((int) j2) / 40;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                stringBuffer.append('2');
                                j = 80;
                            } else {
                                stringBuffer.append('1');
                                j = 40;
                            }
                            j2 -= j;
                        } else {
                            stringBuffer.append('0');
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j2 = 0;
                }
            } else {
                bigIntegerOr = (bigIntegerOr == null ? BigInteger.valueOf(j2) : bigIntegerOr).shiftLeft(7).or(BigInteger.valueOf(i2 & 127));
                if ((i2 & 128) == 0) {
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    bigIntegerOr = null;
                    j2 = 0;
                }
            }
        }
        this.WB = stringBuffer.toString();
    }

    private void J8(ByteArrayOutputStream byteArrayOutputStream) {
        ik0 ik0Var = new ik0(this.WB);
        Mr(byteArrayOutputStream, (Integer.parseInt(ik0Var.DW()) * 40) + Integer.parseInt(ik0Var.DW()));
        while (ik0Var.j6()) {
            String strDW = ik0Var.DW();
            if (strDW.length() < 18) {
                Mr(byteArrayOutputStream, Long.parseLong(strDW));
            } else {
                U2(byteArrayOutputStream, new BigInteger(strDW));
            }
        }
    }

    private void Mr(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private void U2(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i = iBitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & 127);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    public static vh0 Ws(byte[] bArr) {
        if (bArr.length < 3) {
            return new vh0(bArr);
        }
        int i = bArr[bArr.length - 2] & 255;
        vh0[][] vh0VarArr = jw;
        vh0[] vh0VarArr2 = vh0VarArr[i];
        if (vh0VarArr2 == null) {
            vh0VarArr2 = new vh0[255];
            vh0VarArr[i] = vh0VarArr2;
        }
        int i2 = bArr[bArr.length - 1] & 255;
        vh0 vh0Var = vh0VarArr2[i2];
        if (vh0Var == null) {
            vh0 vh0Var2 = new vh0(bArr);
            vh0VarArr2[i2] = vh0Var2;
            return vh0Var2;
        }
        if (dq0.j6(bArr, vh0Var.QX())) {
            return vh0Var;
        }
        int i3 = (i + 1) % 256;
        vh0[][] vh0VarArr3 = jw;
        vh0[] vh0VarArr4 = vh0VarArr3[i3];
        if (vh0VarArr4 == null) {
            vh0VarArr4 = new vh0[255];
            vh0VarArr3[i3] = vh0VarArr4;
        }
        vh0 vh0Var3 = vh0VarArr4[i2];
        if (vh0Var3 == null) {
            vh0 vh0Var4 = new vh0(bArr);
            vh0VarArr4[i2] = vh0Var4;
            return vh0Var4;
        }
        if (dq0.j6(bArr, vh0Var3.QX())) {
            return vh0Var3;
        }
        int i4 = (i2 + 1) % 256;
        vh0 vh0Var5 = vh0VarArr4[i4];
        if (vh0Var5 != null) {
            return dq0.j6(bArr, vh0Var5.QX()) ? vh0Var5 : new vh0(bArr);
        }
        vh0 vh0Var6 = new vh0(bArr);
        vh0VarArr4[i4] = vh0Var6;
        return vh0Var6;
    }

    public static vh0 aM(Object obj) {
        if (obj == null || (obj instanceof vh0)) {
            return (vh0) obj;
        }
        if (obj instanceof jj0) {
            return new vh0(((jj0) obj).XL());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private static boolean j3(String str) {
        char cCharAt;
        if (str.length() >= 3 && str.charAt(1) == '.' && (cCharAt = str.charAt(0)) >= '0' && cCharAt <= '2') {
            boolean z = false;
            for (int length = str.length() - 1; length >= 2; length--) {
                char cCharAt2 = str.charAt(length);
                if ('0' <= cCharAt2 && cCharAt2 <= '9') {
                    z = true;
                } else {
                    if (cCharAt2 != '.' || !z) {
                        return false;
                    }
                    z = false;
                }
            }
            return z;
        }
        return false;
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return false;
    }

    public byte[] QX() {
        if (this.mb == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            J8(byteArrayOutputStream);
            this.mb = byteArrayOutputStream.toByteArray();
        }
        return this.mb;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (ai0Var instanceof jj0) {
            return this.WB.equals(((jj0) ai0Var).WB);
        }
        return false;
    }

    public String XL() {
        return this.WB;
    }

    @Override // abcd.ai0
    public void gn(yh0 yh0Var) {
        byte[] bArrQX = QX();
        yh0Var.FH(6);
        yh0Var.u7(bArrQX.length);
        yh0Var.Hw(bArrQX);
    }

    @Override // abcd.uh0
    public int hashCode() {
        return this.WB.hashCode();
    }

    public String toString() {
        return XL();
    }

    @Override // abcd.ai0
    public int u7() {
        int length = QX().length;
        return jk0.j6(length) + 1 + length;
    }

    public jj0(String str) {
        if (j3(str)) {
            this.WB = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }
}
