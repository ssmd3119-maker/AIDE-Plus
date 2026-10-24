package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

@TargetApi(14)
/* loaded from: classes.dex */
public final class zzdu implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzda zzare;

    private zzdu(zzda zzdaVar) {
        this.zzare = zzdaVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        try {
            this.zzare.zzgt().zzjo().zzby("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null && (data = intent.getData()) != null && data.isHierarchical()) {
                if (bundle == null) {
                    Bundle bundleZza = this.zzare.zzgr().zza(data);
                    this.zzare.zzgr();
                    String str = zzfy.zzc(intent) ? "gs" : "auto";
                    if (bundleZza != null) {
                        this.zzare.logEvent(str, "_cmp", bundleZza);
                    }
                }
                String queryParameter = data.getQueryParameter("referrer");
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                if (!(queryParameter.contains("gclid") && (queryParameter.contains("utm_campaign") || queryParameter.contains("utm_source") || queryParameter.contains("utm_medium") || queryParameter.contains("utm_term") || queryParameter.contains("utm_content")))) {
                    this.zzare.zzgt().zzjn().zzby("Activity created with data 'referrer' param without gclid and at least one utm field");
                    return;
                } else {
                    this.zzare.zzgt().zzjn().zzg("Activity created with referrer", queryParameter);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        this.zzare.zzb("auto", "_ldl", (Object) queryParameter, true);
                    }
                }
            }
        } catch (Exception e) {
            this.zzare.zzgt().zzjg().zzg("Throwable caught in onActivityCreated", e);
        }
        this.zzare.zzgm().onActivityCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zzare.zzgm().onActivityDestroyed(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zzare.zzgm().onActivityPaused(activity);
        zzfd zzfdVarZzgo = this.zzare.zzgo();
        zzfdVarZzgo.zzgs().zzc(new zzfi(zzfdVarZzgo, zzfdVarZzgo.zzbx().DW()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.zzare.zzgm().onActivityResumed(activity);
        zzfd zzfdVarZzgo = this.zzare.zzgo();
        zzfdVarZzgo.zzgs().zzc(new zzfh(zzfdVarZzgo, zzfdVarZzgo.zzbx().DW()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zzare.zzgm().onActivitySaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* synthetic */ zzdu(zzda zzdaVar, zzdb zzdbVar) {
        this(zzdaVar);
    }
}
