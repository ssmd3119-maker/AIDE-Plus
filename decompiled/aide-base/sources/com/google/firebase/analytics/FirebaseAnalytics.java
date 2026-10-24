package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.internal.zzan;
import com.google.android.gms.measurement.internal.zzbw;
import com.google.android.gms.measurement.internal.zzn;
import com.google.firebase.iid.FirebaseInstanceId;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics DW;
    private final zzbw j6;

    private FirebaseAnalytics(zzbw zzbwVar) {
        p.u7(zzbwVar);
        this.j6 = zzbwVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (DW == null) {
            synchronized (FirebaseAnalytics.class) {
                if (DW == null) {
                    DW = new FirebaseAnalytics(zzbw.zza(context, (zzan) null));
                }
            }
        }
        return DW;
    }

    public final void DW(boolean z) {
        this.j6.zzkm().setMeasurementEnabled(z);
    }

    public final void FH(String str, String str2) {
        this.j6.zzkm().setUserProperty(str, str2);
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.DW().j6();
    }

    public final void j6(String str, Bundle bundle) {
        this.j6.zzkm().logEvent(str, bundle);
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (zzn.isMainThread()) {
            this.j6.zzgm().setCurrentScreen(activity, str, str2);
        } else {
            this.j6.zzgt().zzjj().zzby("setCurrentScreen must be called from the main thread");
        }
    }
}
