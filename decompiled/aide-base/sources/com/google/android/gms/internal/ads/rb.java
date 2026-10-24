package com.google.android.gms.internal.ads;

import java.util.Date;
import java.util.HashSet;

@jg
/* loaded from: classes.dex */
public final class rb {
    public static com.google.ads.mediation.a DW(zzwb zzwbVar, boolean z) {
        HashSet hashSet = zzwbVar.qp != null ? new HashSet(zzwbVar.qp) : null;
        Date date = new Date(zzwbVar.mb);
        int i = zzwbVar.fY;
        return new com.google.ads.mediation.a(date, i != 1 ? i != 2 ? abcd.ju.UNKNOWN : abcd.ju.FEMALE : abcd.ju.MALE, hashSet, z, zzwbVar.cT);
    }

    public static int j6(abcd.iu iuVar) {
        int i = sb.DW[iuVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }
}
