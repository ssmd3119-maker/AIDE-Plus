package abcd;

import abcd.e70;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class vf0 {
    private static final Pattern j6 = Pattern.compile("^(Bug|Issue)[a-zA-Z0-9-]*:.*$");
    private static final Pattern DW = Pattern.compile("(^[a-zA-Z0-9-]+:(?!//).*$)");
    private static final Pattern FH = Pattern.compile("^[ \\[].*$");

    public static a70 DW(a70 a70Var, a70 a70Var2, i70 i70Var, i70 i70Var2, String str) {
        String strJ6 = j6(str);
        if (strJ6.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tree ");
        sb.append(a70.I(a70Var));
        sb.append("\n");
        if (a70Var2 != null) {
            sb.append("parent ");
            sb.append(a70.I(a70Var2));
            sb.append("\n");
        }
        sb.append("author ");
        sb.append(i70Var.v5());
        sb.append("\n");
        sb.append("committer ");
        sb.append(i70Var2.v5());
        sb.append("\n\n");
        sb.append(strJ6);
        return new e70.a().Hw(1, sb.toString().getBytes("UTF-8"));
    }

    public static String FH(String str, a70 a70Var) {
        return Hw(str, a70Var, false);
    }

    public static String Hw(String str, a70 a70Var, boolean z) {
        if (str.indexOf("Change-Id:") > 0) {
            if (!z) {
                return str;
            }
            int iIndexOf = str.indexOf("Change-Id:") + 10;
            while (str.charAt(iIndexOf) == ' ') {
                iIndexOf++;
            }
            return str.replace(str.length() == iIndexOf + 40 ? str.substring(iIndexOf) : str.substring(iIndexOf, iIndexOf + 41), "I" + a70Var.yS());
        }
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        for (int length2 = strArrSplit.length - 1; length2 > 1; length2--) {
            if (!DW.matcher(strArrSplit[length2]).matches()) {
                if (length != strArrSplit.length && strArrSplit[length2].length() == 0) {
                    break;
                }
                if (length == strArrSplit.length || !FH.matcher(strArrSplit[length2]).matches()) {
                    length = strArrSplit.length;
                    break;
                }
                length = length2 + 1;
            } else {
                length = length2;
            }
        }
        int i = length;
        int i2 = i;
        while (i < strArrSplit.length && j6.matcher(strArrSplit[i]).matches()) {
            i2 = i + 1;
            i = i2;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < i2) {
            sb.append(strArrSplit[i3]);
            sb.append("\n");
            i3++;
        }
        if (i2 == strArrSplit.length && i2 == length) {
            sb.append("\n");
        }
        sb.append("Change-Id:");
        sb.append(" I");
        sb.append(a70.I(a70Var));
        sb.append("\n");
        while (i3 < strArrSplit.length) {
            sb.append(strArrSplit[i3]);
            sb.append("\n");
            i3++;
        }
        return sb.toString();
    }

    public static String j6(String str) {
        return str.replaceAll("(?i)(?m)^Signed-off-by:.*$\n?", "").replaceAll("(?m)^#.*$\n?", "").replaceAll("(?m)\n\n\n+", "\\\n").replaceAll("\\n*$", "").replaceAll("(?s)\ndiff --git.*", "").trim();
    }
}
