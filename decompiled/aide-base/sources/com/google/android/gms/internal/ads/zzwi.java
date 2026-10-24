package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;

@jg
/* loaded from: classes.dex */
public final class zzwi {
    private final String DW;
    private final com.google.android.gms.ads.d[] j6;

    public zzwi(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, com.google.android.gms.ads.f.AdsAttrs);
        String string = typedArrayObtainAttributes.getString(com.google.android.gms.ads.f.AdsAttrs_adSize);
        String string2 = typedArrayObtainAttributes.getString(com.google.android.gms.ads.f.AdsAttrs_adSizes);
        boolean z = !TextUtils.isEmpty(string);
        boolean z2 = !TextUtils.isEmpty(string2);
        if (z && !z2) {
            this.j6 = DW(string);
        } else {
            if (z || !z2) {
                if (!z) {
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.j6 = DW(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(com.google.android.gms.ads.f.AdsAttrs_adUnitId);
        this.DW = string3;
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    private static com.google.android.gms.ads.d[] DW(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        com.google.android.gms.ads.d[] dVarArr = new com.google.android.gms.ads.d[length];
        for (int i = 0; i < strArrSplit.length; i++) {
            String strTrim = strArrSplit[i].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    dVarArr[i] = new com.google.android.gms.ads.d("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(strTrim);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf) : new String("Could not parse XML attribute \"adSize\": "));
                }
            } else if ("BANNER".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.Hw;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.Zo;
            } else if ("FULL_BANNER".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.v5;
            } else if ("LEADERBOARD".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.VH;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.gn;
            } else if ("SMART_BANNER".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.tp;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.u7;
            } else if ("FLUID".equals(strTrim)) {
                dVarArr[i] = com.google.android.gms.ads.d.EQ;
            } else {
                if (!"ICON".equals(strTrim)) {
                    String strValueOf2 = String.valueOf(strTrim);
                    throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf2) : new String("Could not parse XML attribute \"adSize\": "));
                }
                dVarArr[i] = com.google.android.gms.ads.d.we;
            }
        }
        if (length != 0) {
            return dVarArr;
        }
        String strValueOf3 = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf3.length() != 0 ? "Could not parse XML attribute \"adSize\": ".concat(strValueOf3) : new String("Could not parse XML attribute \"adSize\": "));
    }

    public final com.google.android.gms.ads.d[] FH(boolean z) {
        if (z || this.j6.length == 1) {
            return this.j6;
        }
        throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
    }

    public final String j6() {
        return this.DW;
    }
}
