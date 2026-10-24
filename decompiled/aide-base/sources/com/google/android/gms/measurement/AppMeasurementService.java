package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzey;
import com.google.android.gms.measurement.internal.zzfc;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements zzfc {
    private zzey<AppMeasurementService> zzadc;

    private final zzey<AppMeasurementService> zzfz() {
        if (this.zzadc == null) {
            this.zzadc = new zzey<>(this);
        }
        return this.zzadc;
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return zzfz().onBind(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzfz().onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zzfz().onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        zzfz().onRebind(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return zzfz().onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zzfz().onUnbind(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzfc
    public final void zza(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
