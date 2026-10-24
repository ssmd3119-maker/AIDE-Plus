package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.d;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzfd extends zzf {
    private Handler handler;
    private long zzasy;
    private long zzasz;
    private final zzy zzata;
    private final zzy zzatb;
    private final zzy zzatc;

    zzfd(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzata = new zzfe(this, this.zzada);
        this.zzatb = new zzff(this, this.zzada);
        this.zzatc = new zzfg(this, this.zzada);
        long jDW = zzbx().DW();
        this.zzasy = jDW;
        this.zzasz = jDW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzai(long j) {
        zzaf();
        zzlm();
        zzgt().zzjo().zzg("Activity resumed, time", Long.valueOf(j));
        this.zzasy = j;
        this.zzasz = j;
        if (zzgv().zzbi(zzgk().zzal())) {
            zzaj(zzbx().j6());
            return;
        }
        this.zzata.cancel();
        this.zzatb.cancel();
        if (zzgv().zzbg(zzgk().zzal()) || zzgv().zzbh(zzgk().zzal())) {
            this.zzatc.cancel();
        }
        if (zzgu().zzaf(zzbx().j6())) {
            zzgu().zzann.set(true);
            zzgu().zzanp.set(0L);
        }
        if (zzgu().zzann.get()) {
            this.zzata.zzh(Math.max(0L, zzgu().zzanl.get() - zzgu().zzanp.get()));
        } else {
            this.zzatb.zzh(Math.max(0L, 3600000 - zzgu().zzanp.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzak(long j) {
        zzaf();
        zzlm();
        this.zzata.cancel();
        this.zzatb.cancel();
        if (zzgv().zzbg(zzgk().zzal()) || zzgv().zzbh(zzgk().zzal())) {
            this.zzatc.cancel();
            this.zzatc.zzh(zzgu().zzanm.get());
        }
        zzgt().zzjo().zzg("Activity paused, time", Long.valueOf(j));
        if (this.zzasy != 0) {
            zzgu().zzanp.set(zzgu().zzanp.get() + (j - this.zzasy));
        }
    }

    private final void zzal(long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzaf();
        zzgt().zzjo().zzg("Session started, time", Long.valueOf(zzbx().DW()));
        Long lValueOf = zzgv().zzbg(zzgk().zzal()) ? Long.valueOf(j / 1000) : null;
        Long l = zzgv().zzbh(zzgk().zzal()) ? -1L : null;
        zzgj().zza("auto", "_sid", lValueOf, j);
        zzgj().zza("auto", "_sno", l, j);
        zzgu().zzann.set(false);
        Bundle bundle = new Bundle();
        if (zzgv().zzbg(zzgk().zzal())) {
            bundle.putLong("_sid", lValueOf.longValue());
        }
        zzgj().zza("auto", "_s", j, bundle);
        zzgu().zzano.set(j);
    }

    private final void zzlm() {
        synchronized (this) {
            if (this.handler == null) {
                this.handler = new d(Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzlq() {
        zzaf();
        zza(false, false);
        zzgi().zzm(zzbx().DW());
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final void zza(long j, boolean z) {
        zzaf();
        zzlm();
        this.zzata.cancel();
        this.zzatb.cancel();
        if (zzgv().zzbg(zzgk().zzal()) || zzgv().zzbh(zzgk().zzal())) {
            this.zzatc.cancel();
        }
        if (zzgu().zzaf(j)) {
            zzgu().zzann.set(true);
            zzgu().zzanp.set(0L);
        }
        if (zzgu().zzann.get()) {
            zzal(j);
            return;
        }
        this.zzatb.zzh(Math.max(0L, 3600000 - zzgu().zzanp.get()));
        if (z && zzgv().zzbj(zzgk().zzal())) {
            zzgu().zzano.set(j);
            if (zzgv().zzbg(zzgk().zzal()) || zzgv().zzbh(zzgk().zzal())) {
                this.zzatc.cancel();
                this.zzatc.zzh(zzgu().zzanm.get());
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    final void zzaj(long j) {
        zzaf();
        zzlm();
        zza(j, false);
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

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzgy() {
        return false;
    }

    final void zzln() {
        zzaf();
        this.zzata.cancel();
        this.zzatb.cancel();
        this.zzasy = 0L;
        this.zzasz = 0L;
    }

    protected final void zzlo() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzaf();
        zzal(zzbx().j6());
    }

    final long zzlp() {
        long jDW = zzbx().DW();
        long j = jDW - this.zzasz;
        this.zzasz = jDW;
        return j;
    }

    public final boolean zza(boolean z, boolean z2) {
        zzaf();
        zzcl();
        long jDW = zzbx().DW();
        zzgu().zzano.set(zzbx().j6());
        long j = jDW - this.zzasy;
        if (!z && j < 1000) {
            zzgt().zzjo().zzg("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
            return false;
        }
        zzgu().zzanp.set(j);
        zzgt().zzjo().zzg("Recording user engagement, ms", Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j);
        zzdy.zza(zzgm().zzle(), bundle, true);
        if (zzgv().zzbk(zzgk().zzal())) {
            if (zzgv().zze(zzgk().zzal(), zzai.zzala)) {
                if (!z2) {
                    zzlp();
                }
            } else if (z2) {
                bundle.putLong("_fr", 1L);
            } else {
                zzlp();
            }
        }
        if (!zzgv().zze(zzgk().zzal(), zzai.zzala) || !z2) {
            zzgj().logEvent("auto", "_e", bundle);
        }
        this.zzasy = jDW;
        this.zzatb.cancel();
        this.zzatb.zzh(Math.max(0L, 3600000 - zzgu().zzanp.get()));
        return true;
    }
}
