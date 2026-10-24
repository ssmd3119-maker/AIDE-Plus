package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzek extends zzy {
    private final /* synthetic */ zzeb zzasi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzek(zzeb zzebVar, zzct zzctVar) {
        super(zzctVar);
        this.zzasi = zzebVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final void run() {
        this.zzasi.zzgt().zzjj().zzby("Tasks have been queued for a long time");
    }
}
