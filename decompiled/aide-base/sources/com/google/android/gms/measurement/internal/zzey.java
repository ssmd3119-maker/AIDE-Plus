package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.measurement.internal.zzfc;

/* loaded from: classes.dex */
public final class zzey<T extends Context & zzfc> {
    private final T zzaby;

    public zzey(T t) {
        p.u7(t);
        this.zzaby = t;
    }

    private final void zzb(Runnable runnable) {
        zzfo zzfoVarZzn = zzfo.zzn(this.zzaby);
        zzfoVarZzn.zzgs().zzc(new zzfb(this, zzfoVarZzn, runnable));
    }

    private final zzas zzgt() {
        return zzbw.zza(this.zzaby, (zzan) null).zzgt();
    }

    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            zzgt().zzjg().zzby("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzby(zzfo.zzn(this.zzaby));
        }
        zzgt().zzjj().zzg("onBind received unknown action", action);
        return null;
    }

    public final void onCreate() {
        zzbw zzbwVarZza = zzbw.zza(this.zzaby, (zzan) null);
        zzas zzasVarZzgt = zzbwVarZza.zzgt();
        zzbwVarZza.zzgw();
        zzasVarZzgt.zzjo().zzby("Local AppMeasurementService is starting up");
    }

    public final void onDestroy() {
        zzbw zzbwVarZza = zzbw.zza(this.zzaby, (zzan) null);
        zzas zzasVarZzgt = zzbwVarZza.zzgt();
        zzbwVarZza.zzgw();
        zzasVarZzgt.zzjo().zzby("Local AppMeasurementService is shutting down");
    }

    public final void onRebind(Intent intent) {
        if (intent == null) {
            zzgt().zzjg().zzby("onRebind called with null intent");
        } else {
            zzgt().zzjo().zzg("onRebind called. action", intent.getAction());
        }
    }

    public final int onStartCommand(final Intent intent, int i, final int i2) {
        zzbw zzbwVarZza = zzbw.zza(this.zzaby, (zzan) null);
        final zzas zzasVarZzgt = zzbwVarZza.zzgt();
        if (intent == null) {
            zzasVarZzgt.zzjj().zzby("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzbwVarZza.zzgw();
        zzasVarZzgt.zzjo().zze("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzb(new Runnable(this, i2, zzasVarZzgt, intent) { // from class: com.google.android.gms.measurement.internal.zzez
                private final int zzacb;
                private final zzey zzast;
                private final zzas zzasu;
                private final Intent zzasv;

                {
                    this.zzast = this;
                    this.zzacb = i2;
                    this.zzasu = zzasVarZzgt;
                    this.zzasv = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzast.zza(this.zzacb, this.zzasu, this.zzasv);
                }
            });
        }
        return 2;
    }

    @TargetApi(24)
    public final boolean onStartJob(final JobParameters jobParameters) {
        zzbw zzbwVarZza = zzbw.zza(this.zzaby, (zzan) null);
        final zzas zzasVarZzgt = zzbwVarZza.zzgt();
        String string = jobParameters.getExtras().getString("action");
        zzbwVarZza.zzgw();
        zzasVarZzgt.zzjo().zzg("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzb(new Runnable(this, zzasVarZzgt, jobParameters) { // from class: com.google.android.gms.measurement.internal.zzfa
            private final JobParameters zzace;
            private final zzey zzast;
            private final zzas zzasw;

            {
                this.zzast = this;
                this.zzasw = zzasVarZzgt;
                this.zzace = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzast.zza(this.zzasw, this.zzace);
            }
        });
        return true;
    }

    public final boolean onUnbind(Intent intent) {
        if (intent == null) {
            zzgt().zzjg().zzby("onUnbind called with null intent");
            return true;
        }
        zzgt().zzjo().zzg("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    final /* synthetic */ void zza(zzas zzasVar, JobParameters jobParameters) {
        zzasVar.zzjo().zzby("AppMeasurementJobService processed last upload request.");
        this.zzaby.zza(jobParameters, false);
    }

    final /* synthetic */ void zza(int i, zzas zzasVar, Intent intent) {
        if (this.zzaby.callServiceStopSelfResult(i)) {
            zzasVar.zzjo().zzg("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzgt().zzjo().zzby("Completed wakeful intent.");
            this.zzaby.zza(intent);
        }
    }
}
