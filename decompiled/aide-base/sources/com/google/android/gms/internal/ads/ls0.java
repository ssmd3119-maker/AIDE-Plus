package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ls0 {
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] DW(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ls0.DW(java.lang.String, boolean):java.lang.String[]");
    }

    public static int j6(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return com.google.android.gms.common.util.n.j6(bytes, 0, bytes.length, 0);
    }
}
