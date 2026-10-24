package abcd;

import com.probelytics.api.UserTouchAction;
import java.io.UTFDataFormatException;

/* loaded from: classes.dex */
public class vo {
    private int FH;
    private to j6 = new to();
    private byte[] DW = new byte[8192];
    private StringBuffer Hw = new StringBuffer();
    private StringBuffer v5 = new StringBuffer();

    private void DW(int i, StringBuffer stringBuffer) {
        byte[] bArr = this.DW;
        while (i < bArr.length) {
            int i2 = i + 1;
            int i3 = bArr[i] & 255;
            if (i3 == 0) {
                return;
            }
            switch (i3 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case UserTouchAction.ITEM_CLICK_KIND /* 6 */:
                case UserTouchAction.CLICK_KIND /* 7 */:
                    stringBuffer.append((char) i3);
                    i = i2;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new RuntimeException(new UTFDataFormatException("Malformed input"));
                case 12:
                case 13:
                    if (i2 >= bArr.length) {
                        throw new RuntimeException(new UTFDataFormatException("End index not on boundary"));
                    }
                    stringBuffer.append((char) (((i3 & 31) << 6) | (bArr[i2] & 255 & 63)));
                    i = i2 + 1;
                    break;
                case 14:
                    int i4 = i2 + 1;
                    if (i4 >= bArr.length) {
                        throw new RuntimeException(new UTFDataFormatException("End index not on boundary"));
                    }
                    stringBuffer.append((char) (((i3 & 15) << 12) | (((bArr[i2] & 255) & 63) << 6) | (((bArr[i4] & 255) & 63) << 0)));
                    i = i4 + 1;
                    break;
            }
        }
    }

    private int Zo(byte[] bArr, int i, int i2, int i3) {
        if (i2 == 0) {
            throw new IllegalArgumentException();
        }
        byte[] bArr2 = this.DW;
        this.j6.j6.FH(i3);
        while (this.j6.j6.j6()) {
            int iV5 = this.j6.j6.v5();
            if (iV5 + i2 <= this.FH) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (bArr2[iV5 + i4] != bArr[i + i4]) {
                        break;
                    }
                }
                return iV5;
            }
        }
        v5(this.FH + i2);
        byte[] bArr3 = this.DW;
        int i5 = this.FH;
        System.arraycopy(bArr, i, bArr3, i5, i2);
        this.FH += i2;
        this.j6.Zo(i3, i5);
        return i5;
    }

    private void v5(int i) {
        byte[] bArr = this.DW;
        if (bArr.length < i) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (length < i);
            byte[] bArr2 = new byte[length];
            System.arraycopy(this.DW, 0, bArr2, 0, this.FH);
            this.DW = bArr2;
        }
    }

    public int FH(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            char cCharAt = str.charAt(i);
            char cCharAt2 = str2.charAt(i);
            if (cCharAt != cCharAt2) {
                return cCharAt - cCharAt2;
            }
        }
        return length - length2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r5 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r12.Hw.setLength(0);
        DW(r4, r12.Hw);
        r12.v5.setLength(0);
        DW(r9, r12.v5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        return FH(r12.Hw.toString(), r12.v5.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Hw(int r13, int r14) {
        /*
            r12 = this;
            byte[] r0 = r12.DW
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            int r4 = r13 + 1
            r13 = r0[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r5 = r13 & 127(0x7f, float:1.78E-43)
            int r6 = r3 * 7
            int r5 = r5 << r6
            r2 = r2 | r5
            r5 = 1
            int r3 = r3 + r5
            r6 = 128(0x80, float:1.8E-43)
            r13 = r13 & r6
            r7 = 5
            if (r13 != r6) goto L1e
            if (r3 < r7) goto L1c
            goto L1e
        L1c:
            r13 = r4
            goto L5
        L1e:
            java.lang.String r3 = "invalid LEB128 sequence"
            if (r13 == r6) goto L8f
            r13 = 0
            r8 = 0
        L24:
            int r9 = r14 + 1
            r14 = r0[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r10 = r14 & 127(0x7f, float:1.78E-43)
            int r11 = r8 * 7
            int r10 = r10 << r11
            r13 = r13 | r10
            int r8 = r8 + r5
            r14 = r14 & r6
            if (r14 != r6) goto L39
            if (r8 < r7) goto L37
            goto L39
        L37:
            r14 = r9
            goto L24
        L39:
            if (r14 == r6) goto L89
            int r2 = r2 + r5
            int r13 = r13 + r5
            int r13 = java.lang.Math.min(r2, r13)
            r14 = 0
        L42:
            if (r14 >= r13) goto L60
            int r2 = r4 + r14
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r9 + r14
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r6 = r2 & 128(0x80, float:1.8E-43)
            if (r6 != 0) goto L61
            r6 = r3 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L59
            goto L61
        L59:
            int r2 = r2 - r3
            if (r2 == 0) goto L5d
            return r2
        L5d:
            int r14 = r14 + 1
            goto L42
        L60:
            r5 = 0
        L61:
            if (r5 != 0) goto L64
            return r1
        L64:
            java.lang.StringBuffer r13 = r12.Hw
            r13.setLength(r1)
            java.lang.StringBuffer r13 = r12.Hw
            r12.DW(r4, r13)
            java.lang.StringBuffer r13 = r12.v5
            r13.setLength(r1)
            java.lang.StringBuffer r13 = r12.v5
            r12.DW(r9, r13)
            java.lang.StringBuffer r13 = r12.Hw
            java.lang.String r13 = r13.toString()
            java.lang.StringBuffer r14 = r12.v5
            java.lang.String r14 = r14.toString()
            int r13 = r12.FH(r13, r14)
            return r13
        L89:
            abcd.ts r13 = new abcd.ts
            r13.<init>(r3)
            throw r13
        L8f:
            abcd.ts r13 = new abcd.ts
            r13.<init>(r3)
            goto L96
        L95:
            throw r13
        L96:
            goto L95
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.vo.Hw(int, int):int");
    }

    public byte[] VH() {
        return this.DW;
    }

    public int gn() {
        return this.j6.u7();
    }

    public int j6(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = i;
        while (true) {
            i2 = i4 + 1;
            int i5 = bArr[i4] & 255;
            i3 = (i3 * 37) + i5;
            if ((i5 & 128) != 128) {
                break;
            }
            i4 = i2;
        }
        while (true) {
            int i6 = i2 + 1;
            byte b = bArr[i2];
            if (b == 0) {
                return Zo(bArr, i, i6 - i, i3);
            }
            i3 = (i3 * 37) + b;
            i2 = i6;
        }
    }

    public int u7() {
        return this.FH;
    }
}
