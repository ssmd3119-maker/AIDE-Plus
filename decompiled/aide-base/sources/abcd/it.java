package abcd;

import java.io.UTFDataFormatException;

/* loaded from: classes.dex */
public final class it {
    public static String j6(rs rsVar, char[] cArr) throws UTFDataFormatException {
        int i;
        int i2 = 0;
        while (true) {
            char c = (char) (rsVar.readByte() & 255);
            if (c == 0) {
                return new String(cArr, 0, i2);
            }
            cArr[i2] = c;
            if (c < 128) {
                i2++;
            } else {
                if ((c & 224) == 192) {
                    int i3 = rsVar.readByte() & 255;
                    if ((i3 & 192) != 128) {
                        throw new UTFDataFormatException("bad second byte");
                    }
                    i = i2 + 1;
                    cArr[i2] = (char) (((c & 31) << 6) | (i3 & 63));
                } else {
                    if ((c & 240) != 224) {
                        throw new UTFDataFormatException("bad byte");
                    }
                    int i4 = rsVar.readByte() & 255;
                    int i5 = rsVar.readByte() & 255;
                    if ((i4 & 192) != 128 || (i5 & 192) != 128) {
                        break;
                    }
                    i = i2 + 1;
                    cArr[i2] = (char) (((c & 15) << 12) | ((i4 & 63) << 6) | (i5 & 63));
                }
                i2 = i;
            }
        }
        throw new UTFDataFormatException("bad second or third byte");
    }
}
