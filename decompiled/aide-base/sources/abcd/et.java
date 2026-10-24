package abcd;

/* loaded from: classes.dex */
public final class et {
    public static int DW(rs rsVar) {
        int i;
        int i2 = 0;
        int i3 = 0;
        do {
            int i4 = rsVar.readByte() & 255;
            i2 |= (i4 & 127) << (i3 * 7);
            i3++;
            i = i4 & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return i2;
        }
        throw new ts("invalid LEB128 sequence");
    }

    public static int FH(int i) {
        int i2 = i >> 7;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 7;
            i3++;
        }
        return i3 + 1;
    }

    public static void Hw(ss ssVar, int i) {
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        boolean z = true;
        while (true) {
            int i4 = i2;
            int i5 = i;
            i = i4;
            if (!z) {
                return;
            }
            z = (i == i3 && (i & 1) == ((i5 >> 6) & 1)) ? false : true;
            ssVar.writeByte((byte) ((i5 & 127) | (z ? 128 : 0)));
            i2 = i >> 7;
        }
    }

    public static int j6(rs rsVar) {
        int i;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        do {
            int i5 = rsVar.readByte() & 255;
            i2 |= (i5 & 127) << (i3 * 7);
            i4 <<= 7;
            i3++;
            i = i5 & 128;
            if (i != 128) {
                break;
            }
        } while (i3 < 5);
        if (i != 128) {
            return ((i4 >> 1) & i2) != 0 ? i2 | i4 : i2;
        }
        throw new ts("invalid LEB128 sequence");
    }

    public static void v5(ss ssVar, int i) {
        while (true) {
            int i2 = i;
            i >>>= 7;
            if (i == 0) {
                ssVar.writeByte((byte) (i2 & 127));
                return;
            }
            ssVar.writeByte((byte) ((i2 & 127) | 128));
        }
    }
}
