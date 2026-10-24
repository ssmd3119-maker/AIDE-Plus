package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzat implements Runnable {
    private final /* synthetic */ int zzamd;
    private final /* synthetic */ String zzame;
    private final /* synthetic */ Object zzamf;
    private final /* synthetic */ Object zzamg;
    private final /* synthetic */ Object zzamh;
    private final /* synthetic */ zzas zzami;

    zzat(zzas zzasVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzami = zzasVar;
        this.zzamd = i;
        this.zzame = str;
        this.zzamf = obj;
        this.zzamg = obj2;
        this.zzamh = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbd zzbdVarZzgu = this.zzami.zzada.zzgu();
        if (!zzbdVarZzgu.isInitialized()) {
            this.zzami.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.zzami.zzals == 0) {
            if (this.zzami.zzgv().zzdw()) {
                zzas zzasVar = this.zzami;
                zzasVar.zzgw();
                zzasVar.zzals = 'C';
            } else {
                zzas zzasVar2 = this.zzami;
                zzasVar2.zzgw();
                zzasVar2.zzals = 'c';
            }
        }
        if (this.zzami.zzade < 0) {
            zzas zzasVar3 = this.zzami;
            zzasVar3.zzade = zzasVar3.zzgv().zzhh();
        }
        char cCharAt = "01VDIWEA?".charAt(this.zzamd);
        char c = this.zzami.zzals;
        long j = this.zzami.zzade;
        String strZza = zzas.zza(true, this.zzame, this.zzamf, this.zzamg, this.zzamh);
        StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 24);
        sb.append("2");
        sb.append(cCharAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(strZza);
        String string = sb.toString();
        if (string.length() > 1024) {
            string = this.zzame.substring(0, 1024);
        }
        zzbdVarZzgu.zzamz.zzc(string, 1L);
    }
}
