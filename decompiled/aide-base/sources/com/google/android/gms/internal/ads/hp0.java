package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class hp0 {
    private static int[] DW(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static String FH(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrDW = DW(str2);
        if (iArrDW[0] != -1) {
            sb.append(str2);
            j6(sb, iArrDW[1], iArrDW[2]);
            return sb.toString();
        }
        int[] iArrDW2 = DW(str);
        if (iArrDW[3] == 0) {
            sb.append((CharSequence) str, 0, iArrDW2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrDW[2] == 0) {
            sb.append((CharSequence) str, 0, iArrDW2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrDW[1] != 0) {
            int i = iArrDW2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return j6(sb, iArrDW[1] + i, i + iArrDW[2]);
        }
        if (str2.charAt(iArrDW[1]) == '/') {
            sb.append((CharSequence) str, 0, iArrDW2[1]);
            sb.append(str2);
            return j6(sb, iArrDW2[1], iArrDW2[1] + iArrDW[2]);
        }
        if (iArrDW2[0] + 2 < iArrDW2[1] && iArrDW2[1] == iArrDW2[2]) {
            sb.append((CharSequence) str, 0, iArrDW2[1]);
            sb.append('/');
            sb.append(str2);
            return j6(sb, iArrDW2[1], iArrDW2[1] + iArrDW[2] + 1);
        }
        int iLastIndexOf = str.lastIndexOf(47, iArrDW2[2] - 1);
        int i2 = iLastIndexOf == -1 ? iArrDW2[1] : iLastIndexOf + 1;
        sb.append((CharSequence) str, 0, i2);
        sb.append(str2);
        return j6(sb, iArrDW2[1], i2 + iArrDW[2]);
    }

    private static String j6(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int iLastIndexOf = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i6 = iLastIndexOf + 1;
            if (i5 == i6 && sb.charAt(iLastIndexOf) == '.') {
                sb.delete(iLastIndexOf, i3);
                i4 = i3 - iLastIndexOf;
            } else if (i5 == iLastIndexOf + 2 && sb.charAt(iLastIndexOf) == '.' && sb.charAt(i6) == '.') {
                iLastIndexOf = sb.lastIndexOf("/", iLastIndexOf - 2) + 1;
                int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                sb.delete(i7, i3);
                i4 = i3 - i7;
            } else {
                iLastIndexOf = i5 + 1;
                i5 = iLastIndexOf;
            }
            i2 -= i4;
            i5 = iLastIndexOf;
        }
        return sb.toString();
    }
}
