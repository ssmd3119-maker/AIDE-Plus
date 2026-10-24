package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzdz implements Runnable {
    private final /* synthetic */ boolean zzarw;
    private final /* synthetic */ zzdx zzarx;
    private final /* synthetic */ zzdx zzary;
    private final /* synthetic */ zzdy zzarz;

    zzdz(zzdy zzdyVar, boolean z, zzdx zzdxVar, zzdx zzdxVar2) {
        this.zzarz = zzdyVar;
        this.zzarw = z;
        this.zzarx = zzdxVar;
        this.zzary = zzdxVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzq r0 = r0.zzgv()
            com.google.android.gms.measurement.internal.zzdy r1 = r10.zzarz
            com.google.android.gms.measurement.internal.zzam r1 = r1.zzgk()
            java.lang.String r1 = r1.zzal()
            boolean r0 = r0.zzbk(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            boolean r0 = r10.zzarw
            if (r0 == 0) goto L24
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzdx r0 = r0.zzarq
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 == 0) goto L3d
            com.google.android.gms.measurement.internal.zzdy r3 = r10.zzarz
            com.google.android.gms.measurement.internal.zzdx r4 = r3.zzarq
            com.google.android.gms.measurement.internal.zzdy.zza(r3, r4, r2)
            goto L3d
        L2f:
            boolean r0 = r10.zzarw
            if (r0 == 0) goto L3c
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzdx r3 = r0.zzarq
            if (r3 == 0) goto L3c
            com.google.android.gms.measurement.internal.zzdy.zza(r0, r3, r2)
        L3c:
            r0 = 0
        L3d:
            com.google.android.gms.measurement.internal.zzdx r3 = r10.zzarx
            if (r3 == 0) goto L63
            long r4 = r3.zzaro
            com.google.android.gms.measurement.internal.zzdx r6 = r10.zzary
            long r7 = r6.zzaro
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L63
            java.lang.String r3 = r3.zzarn
            java.lang.String r4 = r6.zzarn
            boolean r3 = com.google.android.gms.measurement.internal.zzfy.zzv(r3, r4)
            if (r3 == 0) goto L63
            com.google.android.gms.measurement.internal.zzdx r3 = r10.zzarx
            java.lang.String r3 = r3.zzuw
            com.google.android.gms.measurement.internal.zzdx r4 = r10.zzary
            java.lang.String r4 = r4.zzuw
            boolean r3 = com.google.android.gms.measurement.internal.zzfy.zzv(r3, r4)
            if (r3 != 0) goto L64
        L63:
            r1 = 1
        L64:
            if (r1 == 0) goto Lcd
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.measurement.internal.zzdx r3 = r10.zzary
            com.google.android.gms.measurement.internal.zzdy.zza(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzdx r2 = r10.zzarx
            if (r2 == 0) goto L8f
            java.lang.String r2 = r2.zzuw
            if (r2 == 0) goto L7d
            java.lang.String r3 = "_pn"
            r1.putString(r3, r2)
        L7d:
            com.google.android.gms.measurement.internal.zzdx r2 = r10.zzarx
            java.lang.String r2 = r2.zzarn
            java.lang.String r3 = "_pc"
            r1.putString(r3, r2)
            com.google.android.gms.measurement.internal.zzdx r2 = r10.zzarx
            long r2 = r2.zzaro
            java.lang.String r4 = "_pi"
            r1.putLong(r4, r2)
        L8f:
            com.google.android.gms.measurement.internal.zzdy r2 = r10.zzarz
            com.google.android.gms.measurement.internal.zzq r2 = r2.zzgv()
            com.google.android.gms.measurement.internal.zzdy r3 = r10.zzarz
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzgk()
            java.lang.String r3 = r3.zzal()
            boolean r2 = r2.zzbk(r3)
            if (r2 == 0) goto Lc0
            if (r0 == 0) goto Lc0
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzfd r0 = r0.zzgo()
            long r2 = r0.zzlp()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lc0
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzfy r0 = r0.zzgr()
            r0.zza(r1, r2)
        Lc0:
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzda r0 = r0.zzgj()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r0.zza(r2, r3, r1)
        Lcd:
            com.google.android.gms.measurement.internal.zzdy r0 = r10.zzarz
            com.google.android.gms.measurement.internal.zzdx r1 = r10.zzary
            r0.zzarq = r1
            com.google.android.gms.measurement.internal.zzeb r0 = r0.zzgl()
            com.google.android.gms.measurement.internal.zzdx r1 = r10.zzary
            r0.zza(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzdz.run():void");
    }
}
