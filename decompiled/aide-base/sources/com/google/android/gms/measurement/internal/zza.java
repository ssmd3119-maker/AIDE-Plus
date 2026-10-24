package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zza extends zze {
    private final Map<String, Long> zzafb;
    private final Map<String, Integer> zzafc;
    private long zzafd;

    public zza(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzafc = new ArrayMap();
        this.zzafb = new ArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, long j) {
        zzgg();
        zzaf();
        p.v5(str);
        if (this.zzafc.isEmpty()) {
            this.zzafd = j;
        }
        Integer num = this.zzafc.get(str);
        if (num != null) {
            this.zzafc.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.zzafc.size() >= 100) {
            zzgt().zzjj().zzby("Too many ads visible");
        } else {
            this.zzafc.put(str, 1);
            this.zzafb.put(str, Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(String str, long j) {
        zzgg();
        zzaf();
        p.v5(str);
        Integer num = this.zzafc.get(str);
        if (num == null) {
            zzgt().zzjg().zzg("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzdx zzdxVarZzle = zzgm().zzle();
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            this.zzafc.put(str, Integer.valueOf(iIntValue));
            return;
        }
        this.zzafc.remove(str);
        Long l = this.zzafb.get(str);
        if (l == null) {
            zzgt().zzjg().zzby("First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            this.zzafb.remove(str);
            zza(str, jLongValue, zzdxVarZzle);
        }
        if (this.zzafc.isEmpty()) {
            long j2 = this.zzafd;
            if (j2 == 0) {
                zzgt().zzjg().zzby("First ad exposure time was never set");
            } else {
                zza(j - j2, zzdxVarZzle);
                this.zzafd = 0L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(long j) {
        Iterator<String> it = this.zzafb.keySet().iterator();
        while (it.hasNext()) {
            this.zzafb.put(it.next(), Long.valueOf(j));
        }
        if (this.zzafb.isEmpty()) {
            return;
        }
        this.zzafd = j;
    }

    public final void beginAdUnitExposure(String str, long j) {
        if (str == null || str.length() == 0) {
            zzgt().zzjg().zzby("Ad unit id must be a non-empty string");
        } else {
            zzgs().zzc(new zzb(this, str, j));
        }
    }

    public final void endAdUnitExposure(String str, long j) {
        if (str == null || str.length() == 0) {
            zzgt().zzjg().zzby("Ad unit id must be a non-empty string");
        } else {
            zzgs().zzc(new zzc(this, str, j));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
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

    public final void zzm(long j) {
        zzdx zzdxVarZzle = zzgm().zzle();
        for (String str : this.zzafb.keySet()) {
            zza(str, j - this.zzafb.get(str).longValue(), zzdxVarZzle);
        }
        if (!this.zzafb.isEmpty()) {
            zza(j - this.zzafd, zzdxVarZzle);
        }
        zzn(j);
    }

    private final void zza(long j, zzdx zzdxVar) {
        if (zzdxVar == null) {
            zzgt().zzjo().zzby("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzgt().zzjo().zzg("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        zzdy.zza(zzdxVar, bundle, true);
        zzgj().logEvent("am", "_xa", bundle);
    }

    private final void zza(String str, long j, zzdx zzdxVar) {
        if (zzdxVar == null) {
            zzgt().zzjo().zzby("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            zzgt().zzjo().zzg("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        zzdy.zza(zzdxVar, bundle, true);
        zzgj().logEvent("am", "_xu", bundle);
    }
}
