package abcd;

/* loaded from: classes.dex */
public final class jj {
    public static int DW(byte[] bArr) {
        if (bArr.length == 8 && bArr[0] == 100 && bArr[1] == 101 && bArr[2] == 120 && bArr[3] == 10 && bArr[7] == 0) {
            String str = "" + ((char) bArr[4]) + ((char) bArr[5]) + ((char) bArr[6]);
            if (str.equals("036")) {
                return 14;
            }
            if (str.equals("035")) {
                return 13;
            }
        }
        return -1;
    }

    public static String j6(int i) {
        return "dex\n" + (i >= 14 ? "036" : "035") + "\u0000";
    }
}
