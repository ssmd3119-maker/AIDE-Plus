package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.g;

/* loaded from: classes.dex */
public final class zzb {
    private SharedPreferences j6;

    public zzb(Context context) {
        try {
            Context contextFH = g.FH(context);
            this.j6 = contextFH == null ? null : contextFH.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.j6 = null;
        }
    }

    final float DW(String str, float f) {
        try {
            if (this.j6 == null) {
                return 0.0f;
            }
            return this.j6.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    final String FH(String str, String str2) {
        try {
            return this.j6 == null ? str2 : this.j6.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean j6(String str, boolean z) {
        try {
            if (this.j6 == null) {
                return false;
            }
            return this.j6.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
