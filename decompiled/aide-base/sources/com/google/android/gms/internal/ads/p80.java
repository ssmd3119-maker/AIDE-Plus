package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes.dex */
public final class p80 {
    public static byte[] DW(String str, boolean z) {
        byte[] bArrDecode = Base64.decode(str, z ? 11 : 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Unable to decode ".concat(strValueOf) : new String("Unable to decode "));
    }

    public static String j6(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }
}
