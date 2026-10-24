package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.q;
import com.google.android.gms.common.wrappers.b;
import com.google.android.gms.measurement.internal.zzai;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzq extends zzcr {
    private Boolean zzagw;
    private zzs zzagx;
    private Boolean zzyk;

    zzq(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzagx = zzr.zzagy;
        zzai.zza(zzbwVar);
    }

    static String zzhy() {
        return zzai.zzaiu.get();
    }

    public static long zzib() {
        return zzai.zzajx.get().longValue();
    }

    public static long zzic() {
        return zzai.zzaix.get().longValue();
    }

    public static boolean zzie() {
        return zzai.zzait.get().booleanValue();
    }

    static boolean zzig() {
        return zzai.zzakt.get().booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final void zza(zzs zzsVar) {
        this.zzagx = zzsVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    public final int zzaq(String str) {
        return zzb(str, zzai.zzaji);
    }

    final Boolean zzar(String str) {
        p.v5(str);
        try {
            if (getContext().getPackageManager() == null) {
                zzgt().zzjg().zzby("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoFH = b.j6(getContext()).FH(getContext().getPackageName(), 128);
            if (applicationInfoFH == null) {
                zzgt().zzjg().zzby("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            if (applicationInfoFH.metaData == null) {
                zzgt().zzjg().zzby("Failed to load metadata: Metadata bundle is null");
                return null;
            }
            if (applicationInfoFH.metaData.containsKey(str)) {
                return Boolean.valueOf(applicationInfoFH.metaData.getBoolean(str));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzgt().zzjg().zzg("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean zzas(String str) {
        return "1".equals(this.zzagx.zzf(str, "gaia_collection_enabled"));
    }

    public final boolean zzat(String str) {
        return "1".equals(this.zzagx.zzf(str, "measurement.event_sampling_enabled"));
    }

    final boolean zzau(String str) {
        return zzd(str, zzai.zzakh);
    }

    final boolean zzav(String str) {
        return zzd(str, zzai.zzakj);
    }

    final boolean zzaw(String str) {
        return zzd(str, zzai.zzakk);
    }

    final boolean zzax(String str) {
        return zzd(str, zzai.zzakb);
    }

    final String zzay(String str) {
        zzai.zza<String> zzaVar = zzai.zzakc;
        return str == null ? zzaVar.get() : zzaVar.get(this.zzagx.zzf(str, zzaVar.getKey()));
    }

    final boolean zzaz(String str) {
        return zzd(str, zzai.zzakl);
    }

    public final int zzb(String str, zzai.zza<Integer> zzaVar) {
        if (str == null) {
            return zzaVar.get().intValue();
        }
        String strZzf = this.zzagx.zzf(str, zzaVar.getKey());
        if (TextUtils.isEmpty(strZzf)) {
            return zzaVar.get().intValue();
        }
        try {
            return zzaVar.get(Integer.valueOf(Integer.parseInt(strZzf))).intValue();
        } catch (NumberFormatException unused) {
            return zzaVar.get().intValue();
        }
    }

    final boolean zzba(String str) {
        return zzd(str, zzai.zzakm);
    }

    final boolean zzbb(String str) {
        return zzd(str, zzai.zzako);
    }

    final boolean zzbc(String str) {
        return zzd(str, zzai.zzakp);
    }

    final boolean zzbd(String str) {
        return zzd(str, zzai.zzakq);
    }

    final boolean zzbe(String str) {
        return zzd(str, zzai.zzaks);
    }

    final boolean zzbf(String str) {
        return zzd(str, zzai.zzakr);
    }

    final boolean zzbg(String str) {
        return zzd(str, zzai.zzaku);
    }

    final boolean zzbh(String str) {
        return zzd(str, zzai.zzakv);
    }

    final boolean zzbi(String str) {
        return zzd(str, zzai.zzakw);
    }

    final boolean zzbj(String str) {
        return zzd(str, zzai.zzakx);
    }

    final boolean zzbk(String str) {
        return zzd(str, zzai.zzakz);
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    public final double zzc(String str, zzai.zza<Double> zzaVar) {
        if (str == null) {
            return zzaVar.get().doubleValue();
        }
        String strZzf = this.zzagx.zzf(str, zzaVar.getKey());
        if (TextUtils.isEmpty(strZzf)) {
            return zzaVar.get().doubleValue();
        }
        try {
            return zzaVar.get(Double.valueOf(Double.parseDouble(strZzf))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzaVar.get().doubleValue();
        }
    }

    public final boolean zzd(String str, zzai.zza<Boolean> zzaVar) {
        if (str == null) {
            return zzaVar.get().booleanValue();
        }
        String strZzf = this.zzagx.zzf(str, zzaVar.getKey());
        return TextUtils.isEmpty(strZzf) ? zzaVar.get().booleanValue() : zzaVar.get(Boolean.valueOf(Boolean.parseBoolean(strZzf))).booleanValue();
    }

    public final boolean zzdw() {
        if (this.zzyk == null) {
            synchronized (this) {
                if (this.zzyk == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String strJ6 = q.j6();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzyk = Boolean.valueOf(str != null && str.equals(strJ6));
                    }
                    if (this.zzyk == null) {
                        this.zzyk = Boolean.TRUE;
                        zzgt().zzjg().zzby("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzyk.booleanValue();
    }

    public final boolean zze(String str, zzai.zza<Boolean> zzaVar) {
        return zzd(str, zzaVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgf() {
        super.zzgf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgg() {
        super.zzgg();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzgh() {
        super.zzgh();
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

    public final long zzhh() {
        zzgw();
        return 14710L;
    }

    public final boolean zzhz() {
        zzgw();
        Boolean boolZzar = zzar("firebase_analytics_collection_deactivated");
        return boolZzar != null && boolZzar.booleanValue();
    }

    public final Boolean zzia() {
        zzgw();
        return zzar("firebase_analytics_collection_enabled");
    }

    public final String zzid() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e) {
            zzgt().zzjg().zzg("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            zzgt().zzjg().zzg("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            zzgt().zzjg().zzg("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            zzgt().zzjg().zzg("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    final boolean zzif() {
        if (this.zzagw == null) {
            Boolean boolZzar = zzar("app_measurement_lite");
            this.zzagw = boolZzar;
            if (boolZzar == null) {
                this.zzagw = Boolean.FALSE;
            }
        }
        return this.zzagw.booleanValue() || !this.zzada.zzkr();
    }

    public final long zza(String str, zzai.zza<Long> zzaVar) {
        if (str == null) {
            return zzaVar.get().longValue();
        }
        String strZzf = this.zzagx.zzf(str, zzaVar.getKey());
        if (TextUtils.isEmpty(strZzf)) {
            return zzaVar.get().longValue();
        }
        try {
            return zzaVar.get(Long.valueOf(Long.parseLong(strZzf))).longValue();
        } catch (NumberFormatException unused) {
            return zzaVar.get().longValue();
        }
    }

    public final boolean zza(zzai.zza<Boolean> zzaVar) {
        return zzd(null, zzaVar);
    }
}
