package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

@jg
/* loaded from: classes.dex */
public final class rl {
    public static String DW(Uri uri, Context context) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!com.google.android.gms.ads.internal.w0.ei().U2(context)) {
            return uri.toString();
        }
        String strEr = com.google.android.gms.ads.internal.w0.ei().er(context);
        if (strEr == null) {
            return uri.toString();
        }
        if (((Boolean) cw0.v5().FH(p.kQ)).booleanValue()) {
            String str = (String) cw0.v5().FH(p.yO);
            String string = uri.toString();
            if (string.contains(str)) {
                com.google.android.gms.ads.internal.w0.ei().Ws(context, strEr);
                return string.replace(str, strEr);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = j6(uri.toString(), "fbs_aeid", strEr);
            com.google.android.gms.ads.internal.w0.ei().Ws(context, strEr);
        }
        return uri.toString();
    }

    public static String FH(String str, Context context) {
        String strEr;
        if (!com.google.android.gms.ads.internal.w0.ei().U2(context) || TextUtils.isEmpty(str) || (strEr = com.google.android.gms.ads.internal.w0.ei().er(context)) == null || !com.google.android.gms.ads.internal.w0.v5().kQ(str)) {
            return str;
        }
        if (!((Boolean) cw0.v5().FH(p.kQ)).booleanValue()) {
            return !str.contains("fbs_aeid") ? j6(str, "fbs_aeid", strEr).toString() : str;
        }
        CharSequence charSequence = (String) cw0.v5().FH(p.yO);
        return str.contains(charSequence) ? str.replace(charSequence, strEr) : str;
    }

    public static String Hw(String str, Context context, boolean z) {
        String strEr;
        if ((((Boolean) cw0.v5().FH(p.et)).booleanValue() && !z) || !com.google.android.gms.ads.internal.w0.ei().U2(context) || TextUtils.isEmpty(str) || (strEr = com.google.android.gms.ads.internal.w0.ei().er(context)) == null) {
            return str;
        }
        if (!((Boolean) cw0.v5().FH(p.kQ)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (com.google.android.gms.ads.internal.w0.v5().XX(str)) {
                com.google.android.gms.ads.internal.w0.ei().Ws(context, strEr);
                return j6(str, "fbs_aeid", strEr).toString();
            }
            if (!com.google.android.gms.ads.internal.w0.v5().kQ(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.w0.ei().QX(context, strEr);
            return j6(str, "fbs_aeid", strEr).toString();
        }
        CharSequence charSequence = (String) cw0.v5().FH(p.yO);
        if (!str.contains(charSequence)) {
            return str;
        }
        if (com.google.android.gms.ads.internal.w0.v5().XX(str)) {
            com.google.android.gms.ads.internal.w0.ei().Ws(context, strEr);
            return str.replace(charSequence, strEr);
        }
        if (!com.google.android.gms.ads.internal.w0.v5().kQ(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.w0.ei().QX(context, strEr);
        return str.replace(charSequence, strEr);
    }

    private static Uri j6(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }
}
