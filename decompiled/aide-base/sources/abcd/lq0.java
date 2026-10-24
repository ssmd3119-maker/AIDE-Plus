package abcd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class lq0 implements jq0 {
    protected final byte[] j6 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] DW = new byte[128];

    public lq0() {
        Hw();
    }

    private boolean FH(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // abcd.jq0
    public int DW(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.j6[i4 >>> 4]);
            outputStream.write(this.j6[i4 & 15]);
        }
        return i2 * 2;
    }

    public void Hw() {
        int i = 0;
        while (true) {
            byte[] bArr = this.j6;
            if (i >= bArr.length) {
                byte[] bArr2 = this.DW;
                bArr2[65] = bArr2[97];
                bArr2[66] = bArr2[98];
                bArr2[67] = bArr2[99];
                bArr2[68] = bArr2[100];
                bArr2[69] = bArr2[101];
                bArr2[70] = bArr2[102];
                return;
            }
            this.DW[bArr[i]] = (byte) i;
            i++;
        }
    }

    @Override // abcd.jq0
    public int j6(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && FH(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && FH(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b = this.DW[str.charAt(i)];
            while (i3 < length && FH(str.charAt(i3))) {
                i3++;
            }
            outputStream.write((b << 4) | this.DW[str.charAt(i3)]);
            i2++;
            i = i3 + 1;
        }
        return i2;
    }
}
