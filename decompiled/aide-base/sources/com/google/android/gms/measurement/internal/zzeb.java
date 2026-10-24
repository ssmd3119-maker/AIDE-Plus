package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.a;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzeb extends zzf {
    private final zzes zzasb;
    private zzaj zzasc;
    private volatile Boolean zzasd;
    private final zzy zzase;
    private final zzfj zzasf;
    private final List<Runnable> zzasg;
    private final zzy zzash;

    protected zzeb(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzasg = new ArrayList();
        this.zzasf = new zzfj(zzbwVar.zzbx());
        this.zzasb = new zzes(this);
        this.zzase = new zzec(this, zzbwVar);
        this.zzash = new zzek(this, zzbwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnected(ComponentName componentName) {
        zzaf();
        if (this.zzasc != null) {
            this.zzasc = null;
            zzgt().zzjo().zzg("Disconnected from device MeasurementService", componentName);
            zzaf();
            zzdj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcy() {
        zzaf();
        this.zzasf.start();
        this.zzase.zzh(zzai.zzaka.get().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcz() {
        zzaf();
        if (isConnected()) {
            zzgt().zzjo().zzby("Inactivity, disconnecting from the service");
            disconnect();
        }
    }

    private final void zzf(Runnable runnable) {
        zzaf();
        if (isConnected()) {
            runnable.run();
        } else {
            if (this.zzasg.size() >= 1000) {
                zzgt().zzjg().zzby("Discarding data. Max runnable queue size reached");
                return;
            }
            this.zzasg.add(runnable);
            this.zzash.zzh(60000L);
            zzdj();
        }
    }

    private final zzk zzl(boolean z) {
        zzgw();
        return zzgk().zzbs(z ? zzgt().zzjq() : null);
    }

    private final boolean zzlh() {
        zzgw();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzlj() {
        zzaf();
        zzgt().zzjo().zzg("Processing queued up service tasks", Integer.valueOf(this.zzasg.size()));
        Iterator<Runnable> it = this.zzasg.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
            } catch (Exception e) {
                zzgt().zzjg().zzg("Task exception while flushing queue", e);
            }
        }
        this.zzasg.clear();
        this.zzash.cancel();
    }

    public final void disconnect() {
        zzaf();
        zzcl();
        this.zzasb.zzlk();
        try {
            a.DW().FH(getContext(), this.zzasb);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzasc = null;
    }

    public final void getAppInstanceId(h hVar) {
        zzaf();
        zzcl();
        zzf(new zzeg(this, zzl(false), hVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final boolean isConnected() {
        zzaf();
        zzcl();
        return this.zzasc != null;
    }

    protected final void resetAnalyticsData() {
        zzaf();
        zzgg();
        zzcl();
        zzk zzkVarZzl = zzl(false);
        if (zzlh()) {
            zzgn().resetAnalyticsData();
        }
        zzf(new zzee(this, zzkVarZzl));
    }

    final void zza(zzaj zzajVar, AbstractSafeParcelable abstractSafeParcelable, zzk zzkVar) {
        int size;
        List<AbstractSafeParcelable> listZzr;
        zzaf();
        zzgg();
        zzcl();
        boolean zZzlh = zzlh();
        int i = 0;
        int i2 = 100;
        while (i < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zZzlh || (listZzr = zzgn().zzr(100)) == null) {
                size = 0;
            } else {
                arrayList.addAll(listZzr);
                size = listZzr.size();
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzag) {
                    try {
                        zzajVar.zza((zzag) abstractSafeParcelable2, zzkVar);
                    } catch (RemoteException e) {
                        zzgt().zzjg().zzg("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzfv) {
                    try {
                        zzajVar.zza((zzfv) abstractSafeParcelable2, zzkVar);
                    } catch (RemoteException e2) {
                        zzgt().zzjg().zzg("Failed to send attribute to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzo) {
                    try {
                        zzajVar.zza((zzo) abstractSafeParcelable2, zzkVar);
                    } catch (RemoteException e3) {
                        zzgt().zzjg().zzg("Failed to send conditional property to the service", e3);
                    }
                } else {
                    zzgt().zzjg().zzby("Discarding data. Unrecognized parcel type.");
                }
            }
            i++;
            i2 = size;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    protected final void zzb(zzfv zzfvVar) {
        zzaf();
        zzcl();
        zzf(new zzer(this, zzlh() && zzgn().zza(zzfvVar), zzfvVar, zzl(true)));
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    protected final void zzc(zzag zzagVar, String str) {
        p.u7(zzagVar);
        zzaf();
        zzcl();
        boolean zZzlh = zzlh();
        zzf(new zzem(this, zZzlh, zZzlh && zzgn().zza(zzagVar), zzagVar, zzl(true), str));
    }

    protected final void zzd(zzo zzoVar) {
        p.u7(zzoVar);
        zzaf();
        zzcl();
        zzgw();
        zzf(new zzen(this, true, zzgn().zzc(zzoVar), new zzo(zzoVar), zzl(true), zzoVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zzdj() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeb.zzdj():void");
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgf() {
        super.zzgf();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgg() {
        super.zzgg();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgh() {
        super.zzgh();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zza zzgi() {
        return super.zzgi();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzda zzgj() {
        return super.zzgj();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzam zzgk() {
        return super.zzgk();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzeb zzgl() {
        return super.zzgl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzdy zzgm() {
        return super.zzgm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzao zzgn() {
        return super.zzgn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzfd zzgo() {
        return super.zzgo();
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

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzgy() {
        return false;
    }

    protected final void zzld() {
        zzaf();
        zzcl();
        zzf(new zzeh(this, zzl(true)));
    }

    protected final void zzlg() {
        zzaf();
        zzcl();
        zzf(new zzel(this, zzl(true)));
    }

    final Boolean zzli() {
        return this.zzasd;
    }

    protected final void zza(AtomicReference<List<zzo>> atomicReference, String str, String str2, String str3) {
        zzaf();
        zzcl();
        zzf(new zzeo(this, atomicReference, str, str2, str3, zzl(false)));
    }

    protected final void zza(AtomicReference<List<zzfv>> atomicReference, String str, String str2, String str3, boolean z) {
        zzaf();
        zzcl();
        zzf(new zzep(this, atomicReference, str, str2, str3, z, zzl(false)));
    }

    protected final void zza(h hVar, String str, String str2, boolean z) {
        zzaf();
        zzcl();
        zzf(new zzeq(this, str, str2, z, zzl(false), hVar));
    }

    protected final void zza(AtomicReference<List<zzfv>> atomicReference, boolean z) {
        zzaf();
        zzcl();
        zzf(new zzed(this, atomicReference, zzl(false), z));
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzaf();
        zzcl();
        zzf(new zzef(this, atomicReference, zzl(false)));
    }

    protected final void zza(zzdx zzdxVar) {
        zzaf();
        zzcl();
        zzf(new zzei(this, zzdxVar));
    }

    protected final void zza(zzaj zzajVar) {
        zzaf();
        p.u7(zzajVar);
        this.zzasc = zzajVar;
        zzcy();
        zzlj();
    }

    public final void zza(h hVar, zzag zzagVar, String str) {
        zzaf();
        zzcl();
        if (zzgr().zzs(12451000) != 0) {
            zzgt().zzjj().zzby("Not bundling data. Service unavailable or out of date");
            zzgr().zza(hVar, new byte[0]);
        } else {
            zzf(new zzej(this, zzagVar, str, hVar));
        }
    }

    static /* synthetic */ zzaj zza(zzeb zzebVar, zzaj zzajVar) {
        zzebVar.zzasc = null;
        return null;
    }
}
