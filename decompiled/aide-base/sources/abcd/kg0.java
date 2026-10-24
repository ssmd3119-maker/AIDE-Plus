package abcd;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class kg0 {
    private static final byte[] DW;
    private static final byte[] FH;
    private static final Map<String, Charset> Hw;
    private static final byte[] j6;
    private static final byte[] v5;

    static {
        HashMap map = new HashMap();
        Hw = map;
        map.put("latin-1", Charset.forName("ISO-8859-1"));
        byte[] bArr = new byte[58];
        j6 = bArr;
        Arrays.fill(bArr, (byte) -1);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            j6[c] = (byte) (c - '0');
        }
        byte[] bArr2 = new byte[103];
        DW = bArr2;
        Arrays.fill(bArr2, (byte) -1);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            DW[c2] = (byte) (c2 - '0');
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            DW[c3] = (byte) ((c3 - 'a') + 10);
        }
        for (char c4 = 'A'; c4 <= 'F'; c4 = (char) (c4 + 1)) {
            DW[c4] = (byte) ((c4 - 'A') + 10);
        }
        byte[] bArr3 = new byte[123];
        FH = bArr3;
        bArr3[45] = 1;
        for (char c5 = '0'; c5 <= '9'; c5 = (char) (c5 + 1)) {
            FH[c5] = 1;
        }
        for (char c6 = 'A'; c6 <= 'Z'; c6 = (char) (c6 + 1)) {
            FH[c6] = 1;
        }
        for (char c7 = 'a'; c7 <= 'z'; c7 = (char) (c7 + 1)) {
            FH[c7] = 1;
        }
        v5 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    }

    public static final int BT(byte[] bArr, int i) {
        int iMr = Mr(bArr, i, null);
        return ((iMr / 100) * 60) + (iMr % 100);
    }

    private static Charset DW(String str) {
        return Hw.get(ng0.gn(str));
    }

    public static final int EQ(byte[] bArr, int i) {
        int length = bArr.length;
        int iAM = i;
        while (iAM < length && bArr[iAM] != 10) {
            iAM = aM(bArr, iAM);
        }
        while (iAM > 0 && i < iAM && bArr[iAM - 1] == 10) {
            iAM--;
        }
        return iAM;
    }

    public static final int FH(byte[] bArr, int i) {
        int length = bArr.length;
        if (i == 0) {
            i += 46;
        }
        while (i < length && bArr[i] == 112) {
            i += 48;
        }
        return ei(bArr, i);
    }

    public static final int Hw(byte[] bArr, int i) {
        int length = bArr.length;
        if (i == 0) {
            i += 46;
        }
        while (i < length && bArr[i] == 112) {
            i += 48;
        }
        if (i < length && bArr[i] == 97) {
            i = aM(bArr, i);
        }
        return QX(bArr, i, y60.Zo);
    }

    public static int J0(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            int i3 = i - 1;
            bArr[i3] = 48;
            return i3;
        }
        boolean z = i2 < 0;
        if (z) {
            i2 = -i2;
        }
        while (i2 != 0) {
            i--;
            bArr[i] = v5[i2 % 10];
            i2 /= 10;
        }
        if (!z) {
            return i;
        }
        int i4 = i - 1;
        bArr[i4] = 45;
        return i4;
    }

    private static int J8(byte[] bArr, char c, int i) {
        while (i >= 0 && bArr[i] == 32) {
            i--;
        }
        while (i >= 0 && bArr[i] != c) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x002f -> B:18:0x001d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int Mr(byte[] r5, int r6, abcd.hg0 r7) {
        /*
            r0 = 0
            int r1 = r5.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
        L2:
            if (r6 >= r1) goto Le
            r2 = r5[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r3 = 32
            if (r2 == r3) goto Lb
            goto Le
        Lb:
            int r6 = r6 + 1
            goto L2
        Le:
            if (r6 < r1) goto L11
            return r0
        L11:
            r2 = r5[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L35
            r3 = 43
            if (r2 == r3) goto L20
            r3 = 45
            if (r2 == r3) goto L1c
            goto L22
        L1c:
            r2 = -1
        L1d:
            int r6 = r6 + 1
            goto L23
        L20:
            int r6 = r6 + 1
        L22:
            r2 = 0
        L23:
            if (r6 < r1) goto L26
            goto L36
        L26:
            byte[] r3 = abcd.kg0.j6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r4 = r5[r6]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            r3 = r3[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
            if (r3 >= 0) goto L2f
            goto L36
        L2f:
            int r0 = r0 * 10
            int r0 = r0 + r3
            goto L1d
        L33:
            goto L36
        L35:
            r2 = 0
        L36:
            if (r7 == 0) goto L3a
            r7.j6 = r6
        L3a:
            if (r2 >= 0) goto L3d
            int r0 = -r0
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.kg0.Mr(byte[], int, abcd.hg0):int");
    }

    public static final int P8(byte[] bArr, int i) {
        return vy(bArr, i, '\n');
    }

    public static final int QX(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2.length + i > bArr.length) {
            return -1;
        }
        int i2 = 0;
        while (i2 < bArr2.length) {
            if (bArr[i] != bArr2[i2]) {
                return -1;
            }
            i2++;
            i++;
        }
        return i;
    }

    public static Charset U2(byte[] bArr) {
        int iTp = tp(bArr, 0);
        if (iTp < 0) {
            return r60.Zo;
        }
        String strZo = Zo(r60.Zo, bArr, iTp, aM(bArr, iTp) - 1);
        try {
            return Charset.forName(strZo);
        } catch (IllegalCharsetNameException e) {
            Charset charsetDW = DW(strZo);
            if (charsetDW != null) {
                return charsetDW;
            }
            throw e;
        } catch (UnsupportedCharsetException e2) {
            Charset charsetDW2 = DW(strZo);
            if (charsetDW2 != null) {
                return charsetDW2;
            }
            throw e2;
        }
    }

    public static String VH(byte[] bArr) {
        return gn(bArr, 0, bArr.length);
    }

    public static final fg0 Ws(byte[] bArr, int i, int i2) {
        fg0 fg0Var = new fg0((i2 - i) / 36);
        fg0Var.FH(1, Integer.MIN_VALUE);
        while (i < i2) {
            fg0Var.j6(i);
            i = aM(bArr, i);
        }
        fg0Var.j6(i2);
        return fg0Var;
    }

    public static final int XL(byte[] bArr, int i, char c) {
        int length = bArr.length;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] == c) {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    public static String Zo(Charset charset, byte[] bArr, int i, int i2) {
        try {
            return u7(charset, bArr, i, i2);
        } catch (CharacterCodingException unused) {
            return we(bArr, i, i2);
        }
    }

    public static final int a8(byte[] bArr, int i) {
        byte[] bArr2 = DW;
        int i2 = bArr2[bArr[i + 3]] | (((((bArr2[bArr[i]] << 4) | bArr2[bArr[i + 1]]) << 4) | bArr2[bArr[i + 2]]) << 4);
        if (i2 >= 0) {
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final int aM(byte[] bArr, int i) {
        return XL(bArr, i, '\n');
    }

    public static final int ei(byte[] bArr, int i) {
        int length = bArr.length;
        if (i == 0) {
            i += 48;
        }
        while (i < length && bArr[i] != 10) {
            i = aM(bArr, i);
        }
        if (i >= length || bArr[i] != 10) {
            return -1;
        }
        return i + 1;
    }

    /* JADX WARN: Path cross not found for [B:17:0x001f, B:13:0x0019], limit reached: 34 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0024 A[Catch: ArrayIndexOutOfBoundsException -> 0x0034, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0034, blocks: (B:3:0x0003, B:5:0x0006, B:8:0x000d, B:11:0x0013, B:20:0x0024, B:17:0x001f), top: B:30:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x001f -> B:18:0x0021). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long er(byte[] r7, int r8, abcd.hg0 r9) {
        /*
            r0 = 0
            r2 = 0
            int r3 = r7.length     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L34
        L4:
            if (r8 >= r3) goto L10
            r4 = r7[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L34
            r5 = 32
            if (r4 == r5) goto Ld
            goto L10
        Ld:
            int r8 = r8 + 1
            goto L4
        L10:
            if (r8 < r3) goto L13
            return r0
        L13:
            r4 = r7[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L34
            r5 = 43
            if (r4 == r5) goto L1f
            r5 = 45
            if (r4 == r5) goto L1e
            goto L21
        L1e:
            r2 = -1
        L1f:
            int r8 = r8 + 1
        L21:
            if (r8 < r3) goto L24
            goto L35
        L24:
            byte[] r4 = abcd.kg0.j6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L34
            r5 = r7[r8]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L34
            r4 = r4[r5]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L34
            if (r4 >= 0) goto L2d
            goto L35
        L2d:
            r5 = 10
            long r0 = r0 * r5
            long r4 = (long) r4
            long r0 = r0 + r4
            goto L1f
        L34:
        L35:
            if (r9 == 0) goto L39
            r9.j6 = r8
        L39:
            if (r2 >= 0) goto L3c
            long r0 = -r0
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: abcd.kg0.er(byte[], int, abcd.hg0):long");
    }

    public static i70 gW(byte[] bArr, int i) {
        long jEr;
        int iBT;
        int iAM = aM(bArr, i);
        int iJ3 = j3(bArr, i, '<');
        int iJ32 = j3(bArr, iJ3, '>');
        String strGn = iJ32 < iAM ? gn(bArr, iJ3, iJ32 - 1) : "invalid";
        String strGn2 = iJ3 < iAM ? gn(bArr, i, iJ3 - 2) : gn(bArr, i, iAM);
        hg0 hg0Var = new hg0();
        if (iJ32 < iAM) {
            jEr = er(bArr, iJ32 + 1, hg0Var);
            iBT = BT(bArr, hg0Var.j6);
        } else {
            jEr = 0;
            iBT = 0;
        }
        return new i70(strGn2, strGn, jEr * 1000, iBT);
    }

    public static String gn(byte[] bArr, int i, int i2) {
        return Zo(r60.Zo, bArr, i, i2);
    }

    public static final int j3(byte[] bArr, int i, char c) {
        int length = bArr.length;
        while (i < length) {
            int i2 = i + 1;
            char c2 = bArr[i];
            if (c2 == c || c2 == '\n') {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    public static final int j6(byte[] bArr, int i) {
        int length = bArr.length;
        if (i == 0) {
            i += 46;
        }
        while (i < length && bArr[i] == 112) {
            i += 48;
        }
        return QX(bArr, i, y60.v5);
    }

    public static final int lg(byte[] bArr, int i) {
        byte[] bArr2 = DW;
        int i2 = (((((((((((bArr2[bArr[i]] << 4) | bArr2[bArr[i + 1]]) << 4) | bArr2[bArr[i + 2]]) << 4) | bArr2[bArr[i + 3]]) << 4) | bArr2[bArr[i + 4]]) << 4) | bArr2[bArr[i + 5]]) << 4) | bArr2[bArr[i + 6]];
        byte b = bArr2[bArr[i + 7]];
        if (i2 < 0 || b < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return b | (i2 << 4);
    }

    public static final int rN(byte b) {
        byte b2 = DW[b];
        if (b2 >= 0) {
            return b2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final int tp(byte[] bArr, int i) {
        int length = bArr.length;
        while (i < length) {
            if (bArr[i] == 10) {
                return -1;
            }
            if (bArr[i] == 101) {
                break;
            }
            i = aM(bArr, i);
        }
        return QX(bArr, i, y60.VH);
    }

    public static String u7(Charset charset, byte[] bArr, int i, int i2) throws CharacterCodingException {
        Charset charsetDefaultCharset;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2 - i);
        byteBufferWrap.mark();
        try {
            return v5(byteBufferWrap, r60.Zo);
        } catch (CharacterCodingException unused) {
            byteBufferWrap.reset();
            if (!charset.equals(r60.Zo)) {
                try {
                    return v5(byteBufferWrap, charset);
                } catch (CharacterCodingException unused2) {
                    byteBufferWrap.reset();
                    charsetDefaultCharset = Charset.defaultCharset();
                    if (!charsetDefaultCharset.equals(charset)) {
                        try {
                            return v5(byteBufferWrap, charsetDefaultCharset);
                        } catch (CharacterCodingException unused3) {
                            byteBufferWrap.reset();
                            throw new CharacterCodingException();
                        }
                    }
                    throw new CharacterCodingException();
                }
            }
            charsetDefaultCharset = Charset.defaultCharset();
            if (!charsetDefaultCharset.equals(charset) && !charsetDefaultCharset.equals(r60.Zo)) {
                return v5(byteBufferWrap, charsetDefaultCharset);
            }
            throw new CharacterCodingException();
        }
    }

    private static String v5(ByteBuffer byteBuffer, Charset charset) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        charsetDecoderNewDecoder.onMalformedInput(CodingErrorAction.REPORT);
        charsetDecoderNewDecoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return charsetDecoderNewDecoder.decode(byteBuffer).toString();
    }

    public static final int vy(byte[] bArr, int i, char c) {
        if (i == bArr.length) {
            i--;
        }
        while (i >= 0) {
            int i2 = i - 1;
            if (bArr[i] == c) {
                return i2;
            }
            i = i2;
        }
        return i;
    }

    public static String we(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder(i2 - i);
        while (i < i2) {
            sb.append((char) (bArr[i] & 255));
            i++;
        }
        return sb.toString();
    }

    public static i70 yS(byte[] bArr, int i) {
        Charset charsetU2 = U2(bArr);
        int iJ3 = j3(bArr, i, '<');
        int iJ32 = j3(bArr, iJ3, '>');
        if (iJ3 >= bArr.length || bArr[iJ3] == 10 || (iJ32 >= bArr.length - 1 && bArr[iJ32 - 1] != 62)) {
            return null;
        }
        int i2 = iJ3 - 2;
        if (i2 < i || bArr[i2] != 32) {
            i2 = iJ3 - 1;
        }
        String strZo = Zo(charsetU2, bArr, i, i2);
        String strZo2 = Zo(charsetU2, bArr, iJ3, iJ32 - 1);
        int iJ8 = J8(bArr, ' ', aM(bArr, r13) - 2) + 1;
        if (iJ8 <= iJ32) {
            return new i70(strZo, strZo2, 0L, 0);
        }
        int i3 = iJ8 - 1;
        int iMax = Math.max(iJ32, J8(bArr, ' ', i3) + 1);
        if (iMax >= i3) {
            return new i70(strZo, strZo2, 0L, 0);
        }
        return new i70(strZo, strZo2, er(bArr, iMax, null) * 1000, BT(bArr, iJ8));
    }
}
