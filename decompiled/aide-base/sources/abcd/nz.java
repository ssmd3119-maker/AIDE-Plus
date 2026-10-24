package abcd;

/* loaded from: classes.dex */
public class nz {
    public static boolean DW(String str) {
        return j6(str);
    }

    private static boolean j6(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return false;
            }
        }
        return true;
    }
}
