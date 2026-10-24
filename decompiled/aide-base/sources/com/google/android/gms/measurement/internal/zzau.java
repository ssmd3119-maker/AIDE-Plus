package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzau {
    private final int priority;
    private final /* synthetic */ zzas zzami;
    private final boolean zzamj;
    private final boolean zzamk;

    zzau(zzas zzasVar, int i, boolean z, boolean z2) {
        this.zzami = zzasVar;
        this.priority = i;
        this.zzamj = z;
        this.zzamk = z2;
    }

    public final void zzby(String str) {
        this.zzami.zza(this.priority, this.zzamj, this.zzamk, str, null, null, null);
    }

    public final void zzd(String str, Object obj, Object obj2, Object obj3) {
        this.zzami.zza(this.priority, this.zzamj, this.zzamk, str, obj, obj2, obj3);
    }

    public final void zze(String str, Object obj, Object obj2) {
        this.zzami.zza(this.priority, this.zzamj, this.zzamk, str, obj, obj2, null);
    }

    public final void zzg(String str, Object obj) {
        this.zzami.zza(this.priority, this.zzamj, this.zzamk, str, obj, null, null);
    }
}
