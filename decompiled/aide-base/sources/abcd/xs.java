package abcd;

/* loaded from: classes.dex */
public final class xs {
    public static String DW(int i) {
        char[] cArr = new char[3];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[2 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String EQ(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String FH(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String Hw(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String VH(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String Zo(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String gn(int i) {
        return i == ((char) i) ? VH(i) : tp(i);
    }

    public static String j6(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        int i6 = i + i2;
        if ((i | i2 | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i + "..!" + i6);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        }
        if (i2 == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer((i2 * 4) + 6);
        int i7 = 0;
        while (i2 > 0) {
            if (i7 == 0) {
                stringBuffer.append(i5 != 2 ? i5 != 4 ? i5 != 6 ? tp(i3) : u7(i3) : VH(i3) : Zo(i3));
                stringBuffer.append(": ");
            } else if ((i7 & 1) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append(Zo(bArr[i]));
            i3++;
            i++;
            i7++;
            if (i7 == i4) {
                stringBuffer.append('\n');
                i7 = 0;
            }
            i2--;
        }
        if (i7 != 0) {
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public static String tp(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String u7(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String v5(long j) {
        char[] cArr = new char[17];
        if (j < 0) {
            cArr[0] = '-';
            j = -j;
        } else {
            cArr[0] = '+';
        }
        for (int i = 0; i < 16; i++) {
            cArr[16 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String we(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }
}
