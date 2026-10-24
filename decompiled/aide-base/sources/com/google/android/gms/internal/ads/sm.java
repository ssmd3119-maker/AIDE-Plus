package com.google.android.gms.internal.ads;

import android.util.Log;

@jg
/* loaded from: classes.dex */
public final class sm extends xp {
    public static boolean J0() {
        if (xp.DW(2)) {
            return ((Boolean) cw0.v5().FH(p.Cz)).booleanValue();
        }
        return false;
    }

    public static void we(String str) {
        if (J0()) {
            Log.v("Ads", str);
        }
    }
}
