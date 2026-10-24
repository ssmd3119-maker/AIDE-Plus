package abcd;

/* loaded from: classes.dex */
public final class jo {
    public static boolean DW(int i) {
        int i2;
        if (i < -1) {
            return false;
        }
        return i == -1 || (i2 = i & 255) == 0 || i2 == 255 || (i & 65280) == 0;
    }

    public static boolean j6(int i) {
        return i >= 255;
    }
}
