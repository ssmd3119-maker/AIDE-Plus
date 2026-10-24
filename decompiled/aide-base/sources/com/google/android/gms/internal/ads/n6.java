package com.google.android.gms.internal.ads;

import java.util.Arrays;

@jg
/* loaded from: classes.dex */
public final class n6 {
    private final Object[] j6;

    n6(zzwb zzwbVar, String str, int i) {
        this.j6 = com.google.android.gms.ads.internal.l1.DW((String) cw0.v5().FH(p.w9), zzwbVar, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n6) {
            return Arrays.equals(this.j6, ((n6) obj).j6);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.j6);
    }

    public final String toString() {
        String string = Arrays.toString(this.j6);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
