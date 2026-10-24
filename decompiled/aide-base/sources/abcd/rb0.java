package abcd;

import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public class rb0 {
    public static final byte[] DW(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i = i7 + 1;
            int i10 = bArr2[i7] & 255;
            i8 |= (i10 & 127) << i9;
            i9 += 7;
            if ((i10 & 128) == 0) {
                break;
            }
            i7 = i;
        }
        if (bArr.length != i8) {
            throw new IllegalArgumentException(JGitText.DW().baseLengthIncorrect);
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i2 = i + 1;
            int i13 = bArr2[i] & 255;
            i11 |= (i13 & 127) << i12;
            i12 += 7;
            if ((i13 & 128) == 0) {
                break;
            }
            i = i2;
        }
        if (bArr3 == null) {
            bArr3 = new byte[i11];
        } else if (bArr3.length != i11) {
            throw new IllegalArgumentException(JGitText.DW().resultLengthIncorrect);
        }
        int i14 = 0;
        while (i2 < bArr2.length) {
            int i15 = i2 + 1;
            int i16 = bArr2[i2] & 255;
            if ((i16 & 128) != 0) {
                if ((i16 & 1) != 0) {
                    i3 = i15 + 1;
                    i4 = bArr2[i15] & 255;
                } else {
                    i3 = i15;
                    i4 = 0;
                }
                if ((i16 & 2) != 0) {
                    i4 |= (bArr2[i3] & 255) << 8;
                    i3++;
                }
                if ((i16 & 4) != 0) {
                    i4 |= (bArr2[i3] & 255) << 16;
                    i3++;
                }
                if ((i16 & 8) != 0) {
                    i4 |= (bArr2[i3] & 255) << 24;
                    i3++;
                }
                if ((i16 & 16) != 0) {
                    i5 = i3 + 1;
                    i6 = bArr2[i3] & 255;
                } else {
                    i5 = i3;
                    i6 = 0;
                }
                if ((i16 & 32) != 0) {
                    i6 |= (bArr2[i5] & 255) << 8;
                    i5++;
                }
                if ((i16 & 64) != 0) {
                    i2 = i5 + 1;
                    i6 |= (bArr2[i5] & 255) << 16;
                } else {
                    i2 = i5;
                }
                if (i6 == 0) {
                    i6 = 65536;
                }
                System.arraycopy(bArr, i4, bArr3, i14, i6);
                i14 += i6;
            } else {
                if (i16 == 0) {
                    throw new IllegalArgumentException(JGitText.DW().unsupportedCommand0);
                }
                System.arraycopy(bArr2, i15, bArr3, i14, i16);
                i14 += i16;
                i2 = i15 + i16;
            }
        }
        return bArr3;
    }

    public static long FH(byte[] bArr) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i3 + 1;
            if ((bArr[i3] & 255 & 128) == 0) {
                break;
            }
            i3 = i;
        }
        long j = 0;
        while (true) {
            int i4 = i + 1;
            j |= (r2 & 127) << i2;
            i2 += 7;
            if ((bArr[i] & 255 & 128) == 0) {
                return j;
            }
            i = i4;
        }
    }

    public static final byte[] j6(byte[] bArr, byte[] bArr2) {
        return DW(bArr, bArr2, null);
    }
}
