package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzfg extends zzy {
    private final /* synthetic */ zzfd zzatd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfg(zzfd zzfdVar, zzct zzctVar) {
        super(zzctVar);
        this.zzatd = zzfdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzy
    public final void run() {
        zzfd zzfdVar = this.zzatd;
        zzfdVar.zzaf();
        zzfdVar.zzgt().zzjo().zzby("Current session is expired, remove the session number and Id");
        if (zzfdVar.zzgv().zzbg(zzfdVar.zzgk().zzal())) {
            zzfdVar.zzgj().zza("auto", "_sid", (Object) null, zzfdVar.zzbx().j6());
        }
        if (zzfdVar.zzgv().zzbh(zzfdVar.zzgk().zzal())) {
            zzfdVar.zzgj().zza("auto", "_sno", (Object) null, zzfdVar.zzbx().j6());
        }
    }
}
