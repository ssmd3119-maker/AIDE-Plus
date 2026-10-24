package abcd;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Iterator;
import org.eclipse.jgit.JGitText;

/* loaded from: classes.dex */
public final class ng0 {
    private static final char[] j6 = new char[91];

    static {
        char c = 0;
        while (true) {
            char[] cArr = j6;
            if (c >= cArr.length) {
                break;
            }
            cArr[c] = c;
            c = (char) (c + 1);
        }
        for (char c2 = 'A'; c2 <= 'Z'; c2 = (char) (c2 + 1)) {
            j6[c2] = (char) ((c2 - 'A') + 97);
        }
    }

    public static boolean DW(String str) {
        return str == null || str.length() == 0;
    }

    public static String FH(Collection<String> collection, String str) {
        return Hw(collection, str, str);
    }

    public static String Hw(Collection<String> collection, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int size = collection.size() - 1;
        Iterator<String> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sb.append(it.next());
            if (i == size - 1) {
                sb.append(str2);
            } else if (i != size) {
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }

    public static char VH(char c) {
        return c <= 'Z' ? j6[c] : c;
    }

    public static Boolean Zo(String str) {
        if (str == null) {
            return null;
        }
        if (j6("yes", str) || j6("true", str) || j6("1", str) || j6("on", str)) {
            return Boolean.TRUE;
        }
        if (j6("no", str) || j6("false", str) || j6("0", str) || j6("off", str)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String gn(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(VH(str.charAt(i)));
        }
        return sb.toString();
    }

    public static boolean j6(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (VH(str.charAt(i)) != VH(str2.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean v5(String str) {
        if (str == null) {
            throw new NullPointerException(JGitText.DW().expectedBooleanStringValue);
        }
        Boolean boolZo = Zo(str);
        if (boolZo != null) {
            return boolZo.booleanValue();
        }
        throw new IllegalArgumentException(MessageFormat.format(JGitText.DW().notABoolean, str));
    }
}
