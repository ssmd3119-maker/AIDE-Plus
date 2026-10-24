package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzby extends zzak {
    private final zzfo zzamv;
    private Boolean zzaqi;
    private String zzaqj;

    public zzby(zzfo zzfoVar) {
        this(zzfoVar, null);
    }

    private final void zzc(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.zzamv.zzgt().zzjg().zzby("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzaqi == null) {
                    this.zzaqi = Boolean.valueOf("com.google.android.gms".equals(this.zzaqj) || t.j6(this.zzamv.getContext(), Binder.getCallingUid()) || h.j6(this.zzamv.getContext()).FH(Binder.getCallingUid()));
                }
                if (this.zzaqi.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.zzamv.zzgt().zzjg().zzg("Measurement Service called with invalid calling package. appId", zzas.zzbw(str));
                throw e;
            }
        }
        if (this.zzaqj == null && g.EQ(this.zzamv.getContext(), Binder.getCallingUid(), str)) {
            this.zzaqj = str;
        }
        if (str.equals(this.zzaqj)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzag zzagVar, zzk zzkVar) {
        p.u7(zzagVar);
        zzb(zzkVar, false);
        zze(new zzcj(this, zzagVar, zzkVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zzb(zzk zzkVar) {
        zzb(zzkVar, false);
        zze(new zzbz(this, zzkVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zzd(zzk zzkVar) {
        zzc(zzkVar.packageName, false);
        zze(new zzci(this, zzkVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzo> zze(String str, String str2, String str3) {
        zzc(str, true);
        try {
            return (List) this.zzamv.zzgs().zzb(new zzch(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zzamv.zzgt().zzjg().zzg("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    private zzby(zzfo zzfoVar, String str) {
        p.u7(zzfoVar);
        this.zzamv = zzfoVar;
        this.zzaqj = null;
    }

    final zzag zzb(zzag zzagVar, zzk zzkVar) {
        zzad zzadVar;
        boolean z = false;
        if ("_cmp".equals(zzagVar.name) && (zzadVar = zzagVar.zzahu) != null && zzadVar.size() != 0) {
            String string = zzagVar.zzahu.getString("_cis");
            if (!TextUtils.isEmpty(string) && (("referrer broadcast".equals(string) || "referrer API".equals(string)) && this.zzamv.zzgv().zzbe(zzkVar.packageName))) {
                z = true;
            }
        }
        if (!z) {
            return zzagVar;
        }
        this.zzamv.zzgt().zzjm().zzg("Event has been filtered ", zzagVar.toString());
        return new zzag("_cmpx", zzagVar.zzahu, zzagVar.origin, zzagVar.zzaig);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzag zzagVar, String str, String str2) {
        p.u7(zzagVar);
        p.v5(str);
        zzc(str, true);
        zze(new zzck(this, zzagVar, str));
    }

    private final void zze(Runnable runnable) {
        p.u7(runnable);
        if (zzai.zzakn.get().booleanValue() && this.zzamv.zzgs().zzkf()) {
            runnable.run();
        } else {
            this.zzamv.zzgs().zzc(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final byte[] zza(zzag zzagVar, String str) {
        p.v5(str);
        p.u7(zzagVar);
        zzc(str, true);
        this.zzamv.zzgt().zzjn().zzg("Log and bundle. event", this.zzamv.zzgq().zzbt(zzagVar.name));
        long jFH = this.zzamv.zzbx().FH() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zzamv.zzgs().zzc(new zzcl(this, zzagVar, str)).get();
            if (bArr == null) {
                this.zzamv.zzgt().zzjg().zzg("Log and bundle returned null. appId", zzas.zzbw(str));
                bArr = new byte[0];
            }
            this.zzamv.zzgt().zzjn().zzd("Log and bundle processed. event, size, time_ms", this.zzamv.zzgq().zzbt(zzagVar.name), Integer.valueOf(bArr.length), Long.valueOf((this.zzamv.zzbx().FH() / 1000000) - jFH));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zzamv.zzgt().zzjg().zzd("Failed to log and bundle. appId, event, error", zzas.zzbw(str), this.zzamv.zzgq().zzbt(zzagVar.name), e);
            return null;
        }
    }

    private final void zzb(zzk zzkVar, boolean z) {
        p.u7(zzkVar);
        zzc(zzkVar.packageName, false);
        this.zzamv.zzgr().zzu(zzkVar.zzafi, zzkVar.zzafv);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zzb(zzo zzoVar) {
        p.u7(zzoVar);
        p.u7(zzoVar.zzags);
        zzc(zzoVar.packageName, true);
        zzo zzoVar2 = new zzo(zzoVar);
        if (zzoVar.zzags.getValue() == null) {
            zze(new zzcc(this, zzoVar2));
        } else {
            zze(new zzcd(this, zzoVar2));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final String zzc(zzk zzkVar) {
        zzb(zzkVar, false);
        return this.zzamv.zzh(zzkVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzfv zzfvVar, zzk zzkVar) {
        p.u7(zzfvVar);
        zzb(zzkVar, false);
        if (zzfvVar.getValue() == null) {
            zze(new zzcm(this, zzfvVar, zzkVar));
        } else {
            zze(new zzcn(this, zzfvVar, zzkVar));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzfv> zza(zzk zzkVar, boolean z) {
        zzb(zzkVar, false);
        try {
            List<zzfx> list = (List) this.zzamv.zzgs().zzb(new zzco(this, zzkVar)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzfx zzfxVar : list) {
                if (z || !zzfy.zzcy(zzfxVar.name)) {
                    arrayList.add(new zzfv(zzfxVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zzamv.zzgt().zzjg().zze("Failed to get user attributes. appId", zzas.zzbw(zzkVar.packageName), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzk zzkVar) {
        zzb(zzkVar, false);
        zze(new zzcp(this, zzkVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(long j, String str, String str2, String str3) {
        zze(new zzcq(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final void zza(zzo zzoVar, zzk zzkVar) {
        p.u7(zzoVar);
        p.u7(zzoVar.zzags);
        zzb(zzkVar, false);
        zzo zzoVar2 = new zzo(zzoVar);
        zzoVar2.packageName = zzkVar.packageName;
        if (zzoVar.zzags.getValue() == null) {
            zze(new zzca(this, zzoVar2, zzkVar));
        } else {
            zze(new zzcb(this, zzoVar2, zzkVar));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzfv> zza(String str, String str2, boolean z, zzk zzkVar) {
        zzb(zzkVar, false);
        try {
            List<zzfx> list = (List) this.zzamv.zzgs().zzb(new zzce(this, zzkVar, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzfx zzfxVar : list) {
                if (z || !zzfy.zzcy(zzfxVar.name)) {
                    arrayList.add(new zzfv(zzfxVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zzamv.zzgt().zzjg().zze("Failed to get user attributes. appId", zzas.zzbw(zzkVar.packageName), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzfv> zza(String str, String str2, String str3, boolean z) {
        zzc(str, true);
        try {
            List<zzfx> list = (List) this.zzamv.zzgs().zzb(new zzcf(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzfx zzfxVar : list) {
                if (z || !zzfy.zzcy(zzfxVar.name)) {
                    arrayList.add(new zzfv(zzfxVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zzamv.zzgt().zzjg().zze("Failed to get user attributes. appId", zzas.zzbw(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzaj
    public final List<zzo> zza(String str, String str2, zzk zzkVar) {
        zzb(zzkVar, false);
        try {
            return (List) this.zzamv.zzgs().zzb(new zzcg(this, zzkVar, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zzamv.zzgt().zzjg().zzg("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }
}
