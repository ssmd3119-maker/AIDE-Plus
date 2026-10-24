package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzcq implements Runnable {
    private final /* synthetic */ String zzaeb;
    private final /* synthetic */ String zzagj;
    private final /* synthetic */ zzby zzaql;
    private final /* synthetic */ String zzaqo;
    private final /* synthetic */ long zzaqp;

    zzcq(zzby zzbyVar, String str, String str2, String str3, long j) {
        this.zzaql = zzbyVar;
        this.zzaqo = str;
        this.zzagj = str2;
        this.zzaeb = str3;
        this.zzaqp = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.zzaqo;
        if (str == null) {
            this.zzaql.zzamv.zzmh().zzgm().zza(this.zzagj, (zzdx) null);
        } else {
            this.zzaql.zzamv.zzmh().zzgm().zza(this.zzagj, new zzdx(this.zzaeb, str, this.zzaqp));
        }
    }
}
