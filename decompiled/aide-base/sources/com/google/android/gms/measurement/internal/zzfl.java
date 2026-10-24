package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzfl extends zzy {
    private final /* synthetic */ zzfo zzasx;
    private final /* synthetic */ zzfk zzatf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfl(zzfk zzfkVar, zzct zzctVar, zzfo zzfoVar) {
        super(zzctVar);
        this.zzatf = zzfkVar;
        this.zzasx = zzfoVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final void run() {
        this.zzatf.cancel();
        this.zzatf.zzgt().zzjo().zzby("Starting upload from DelayedRunnable");
        this.zzasx.zzlz();
    }
}
