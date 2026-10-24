package abcd;

import java.io.IOException;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class rl0 {
    private static String DW(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String FH(String str) {
        String strV5 = iq0.v5(str.trim());
        if (strV5.length() > 0 && strV5.charAt(0) == '#') {
            mh0 mh0VarHw = Hw(strV5);
            if (mh0VarHw instanceof gi0) {
                strV5 = iq0.v5(((gi0) mh0VarHw).FH().trim());
            }
        }
        return v5(strV5);
    }

    private static ai0 Hw(String str) {
        try {
            return ai0.tp(kq0.j6(str.substring(1)));
        } catch (IOException e) {
            throw new IllegalStateException("unknown encoding in name: " + e);
        }
    }

    public static String Zo(mh0 mh0Var) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(mh0Var instanceof gi0) || (mh0Var instanceof wj0)) {
            try {
                stringBuffer.append("#" + DW(kq0.DW(mh0Var.DW().Zo("DER"))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String strFH = ((gi0) mh0Var).FH();
            if (strFH.length() <= 0 || strFH.charAt(0) != '#') {
                stringBuffer.append(strFH);
            } else {
                stringBuffer.append("\\" + strFH);
            }
        }
        int length = stringBuffer.length();
        if (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') {
            i = 2;
        }
        while (i != length) {
            if (stringBuffer.charAt(i) == ',' || stringBuffer.charAt(i) == '\"' || stringBuffer.charAt(i) == '\\' || stringBuffer.charAt(i) == '+' || stringBuffer.charAt(i) == '=' || stringBuffer.charAt(i) == '<' || stringBuffer.charAt(i) == '>' || stringBuffer.charAt(i) == ';') {
                stringBuffer.insert(i, "\\");
                i++;
                length++;
            }
            i++;
        }
        return stringBuffer.toString();
    }

    public static void j6(StringBuffer stringBuffer, ml0 ml0Var, Hashtable hashtable) {
        String str = (String) hashtable.get(ml0Var.gn());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(ml0Var.gn().XL());
        }
        stringBuffer.append('=');
        stringBuffer.append(Zo(ml0Var.u7()));
    }

    public static String v5(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }
}
