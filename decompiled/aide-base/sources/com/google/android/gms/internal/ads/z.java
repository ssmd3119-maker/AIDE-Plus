package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class z extends w {
    z() {
    }

    private static String DW(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        return (i == 0 && length == str.length()) ? str : str.substring(i, length);
    }

    @Override // com.google.android.gms.internal.ads.w
    public final String j6(String str, String str2) {
        String strDW = DW(str);
        String strDW2 = DW(str2);
        if (TextUtils.isEmpty(strDW)) {
            return strDW2;
        }
        if (TextUtils.isEmpty(strDW2)) {
            return strDW;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(strDW).length() + 1 + String.valueOf(strDW2).length());
        sb.append(strDW);
        sb.append(",");
        sb.append(strDW2);
        return sb.toString();
    }
}
