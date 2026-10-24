package abcd;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class tf0 {
    private static final byte[] DW;
    private static final byte[] j6;

    static {
        try {
            j6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes("UTF-8");
            byte[] bArr = new byte[128];
            DW = bArr;
            Arrays.fill(bArr, (byte) -3);
            for (int i = 0; i < 64; i++) {
                DW[j6[i]] = (byte) i;
            }
            byte[] bArr2 = DW;
            bArr2[61] = -1;
            bArr2[9] = -2;
            bArr2[10] = -2;
            bArr2[13] = -2;
            bArr2[32] = -2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String DW(byte[] bArr) {
        return FH(bArr, 0, bArr.length);
    }

    public static String FH(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[((i2 * 4) / 3) + (i2 % 3 > 0 ? 4 : 0)];
        int i3 = i2 - 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            j6(bArr, i4 + i, 3, bArr2, i5);
            i4 += 3;
            i5 += 4;
        }
        if (i4 < i2) {
            j6(bArr, i + i4, i2 - i4, bArr2, i5);
            i5 += 4;
        }
        try {
            return new String(bArr2, 0, i5, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2, 0, i5);
        }
    }

    private static void j6(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i2 == 1) {
            i |= (bArr[i] << 24) >>> 8;
        } else {
            if (i2 != 2) {
                i = i2 == 3 ? 0 | ((bArr[i + 2] << 24) >>> 24) : 0;
            }
            i |= (bArr[i + 1] << 24) >>> 16;
            i |= (bArr[i] << 24) >>> 8;
        }
        if (i2 == 1) {
            byte[] bArr3 = j6;
            bArr2[i3] = bArr3[i >>> 18];
            bArr2[i3 + 1] = bArr3[(i >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 == 2) {
            byte[] bArr4 = j6;
            bArr2[i3] = bArr4[i >>> 18];
            bArr2[i3 + 1] = bArr4[(i >>> 12) & 63];
            bArr2[i3 + 2] = bArr4[(i >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 != 3) {
            return;
        }
        byte[] bArr5 = j6;
        bArr2[i3] = bArr5[i >>> 18];
        bArr2[i3 + 1] = bArr5[(i >>> 12) & 63];
        bArr2[i3 + 2] = bArr5[(i >>> 6) & 63];
        bArr2[i3 + 3] = bArr5[i & 63];
    }
}
