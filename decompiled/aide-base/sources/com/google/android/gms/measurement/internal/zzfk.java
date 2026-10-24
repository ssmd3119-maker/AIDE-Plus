package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.a;

/* loaded from: classes.dex */
public final class zzfk extends zzfn {
    private final zzy zzate;
    private final AlarmManager zzyt;
    private Integer zzyu;

    protected zzfk(zzfo zzfoVar) {
        super(zzfoVar);
        this.zzyt = (AlarmManager) getContext().getSystemService("alarm");
        this.zzate = new zzfl(this, zzfoVar.zzmh(), zzfoVar);
    }

    private final int getJobId() {
        if (this.zzyu == null) {
            String strValueOf = String.valueOf(getContext().getPackageName());
            this.zzyu = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.zzyu.intValue();
    }

    private final PendingIntent zzeo() {
        Context context = getContext();
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @TargetApi(24)
    private final void zzlr() {
        JobScheduler jobScheduler = (JobScheduler) getContext().getSystemService("jobscheduler");
        int jobId = getJobId();
        zzgt().zzjo().zzg("Cancelling job. JobID", Integer.valueOf(jobId));
        jobScheduler.cancel(jobId);
    }

    public final void cancel() {
        zzcl();
        this.zzyt.cancel(zzeo());
        this.zzate.cancel();
        if (Build.VERSION.SDK_INT >= 24) {
            zzlr();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgf() {
        super.zzgf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgg() {
        super.zzgg();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgh() {
        super.zzgh();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzaa zzgp() {
        return super.zzgp();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzaq zzgq() {
        return super.zzgq();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzfy zzgr() {
        return super.zzgr();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzbr zzgs() {
        return super.zzgs();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzas zzgt() {
        return super.zzgt();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzbd zzgu() {
        return super.zzgu();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ zzq zzgv() {
        return super.zzgv();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ zzn zzgw() {
        return super.zzgw();
    }

    @Override // com.google.android.gms.measurement.internal.zzfn
    protected final boolean zzgy() {
        this.zzyt.cancel(zzeo());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        zzlr();
        return false;
    }

    public final void zzh(long j) {
        zzcl();
        zzgw();
        Context context = getContext();
        if (!zzbm.zza(context)) {
            zzgt().zzjn().zzby("Receiver not registered/enabled");
        }
        if (!zzfy.zza(context, false)) {
            zzgt().zzjn().zzby("Service not registered/enabled");
        }
        cancel();
        long jDW = zzbx().DW() + j;
        if (j < Math.max(0L, zzai.zzajr.get().longValue()) && !this.zzate.zzej()) {
            zzgt().zzjo().zzby("Scheduling upload with DelayedRunnable");
            this.zzate.zzh(j);
        }
        zzgw();
        if (Build.VERSION.SDK_INT < 24) {
            zzgt().zzjo().zzby("Scheduling upload with AlarmManager");
            this.zzyt.setInexactRepeating(2, jDW, Math.max(zzai.zzajm.get().longValue(), j), zzeo());
            return;
        }
        zzgt().zzjo().zzby("Scheduling upload with JobScheduler");
        Context context2 = getContext();
        ComponentName componentName = new ComponentName(context2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int jobId = getJobId();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder(jobId, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
        zzgt().zzjo().zzg("Scheduling job. JobID", Integer.valueOf(jobId));
        a.DW(context2, jobInfoBuild, "com.google.android.gms", "UploadAlarm");
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzfu zzjr() {
        return super.zzjr();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzm zzjs() {
        return super.zzjs();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzt zzjt() {
        return super.zzjt();
    }
}
