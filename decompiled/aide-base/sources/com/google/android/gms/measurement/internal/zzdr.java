package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdr implements Runnable {
    private final /* synthetic */ boolean zzaed;
    private final /* synthetic */ zzda zzare;

    zzdr(zzda zzdaVar, boolean z) {
        this.zzare = zzdaVar;
        this.zzaed = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEnabled = this.zzare.zzada.isEnabled();
        boolean zZzks = this.zzare.zzada.zzks();
        this.zzare.zzada.zzd(this.zzaed);
        if (zZzks == this.zzaed) {
            this.zzare.zzada.zzgt().zzjo().zzg("Default data collection state already set to", Boolean.valueOf(this.zzaed));
        }
        if (this.zzare.zzada.isEnabled() == zIsEnabled || this.zzare.zzada.isEnabled() != this.zzare.zzada.zzks()) {
            this.zzare.zzada.zzgt().zzjl().zze("Default data collection is different than actual status", Boolean.valueOf(this.zzaed), Boolean.valueOf(zIsEnabled));
        }
        this.zzare.zzlc();
    }
}
