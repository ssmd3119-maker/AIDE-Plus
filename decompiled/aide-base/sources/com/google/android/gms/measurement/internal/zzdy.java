package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdy extends zzf {
    protected zzdx zzarq;
    private volatile zzdx zzarr;
    private zzdx zzars;
    private final Map<Activity, zzdx> zzart;
    private zzdx zzaru;
    private String zzarv;

    public zzdy(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzart = new ArrayMap();
    }

    private final void zza(Activity activity, zzdx zzdxVar, boolean z) {
        zzdx zzdxVar2 = this.zzarr == null ? this.zzars : this.zzarr;
        if (zzdxVar.zzarn == null) {
            zzdxVar = new zzdx(zzdxVar.zzuw, zzcq(activity.getClass().getCanonicalName()), zzdxVar.zzaro);
        }
        this.zzars = this.zzarr;
        this.zzarr = zzdxVar;
        zzgs().zzc(new zzdz(this, z, zzdxVar2, zzdxVar));
    }

    private static String zzcq(String str) {
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final zzdx zze(Activity activity) {
        p.u7(activity);
        zzdx zzdxVar = this.zzart.get(activity);
        if (zzdxVar != null) {
            return zzdxVar;
        }
        zzdx zzdxVar2 = new zzdx(null, zzcq(activity.getClass().getCanonicalName()), zzgr().zzmj());
        this.zzart.put(activity, zzdxVar2);
        return zzdxVar2;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzart.put(activity, new zzdx(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zzart.remove(activity);
    }

    public final void onActivityPaused(Activity activity) {
        zzdx zzdxVarZze = zze(activity);
        this.zzars = this.zzarr;
        this.zzarr = null;
        zzgs().zzc(new zzea(this, zzdxVarZze));
    }

    public final void onActivityResumed(Activity activity) {
        zza(activity, zze(activity), false);
        zza zzaVarZzgi = zzgi();
        zzaVarZzgi.zzgs().zzc(new zzd(zzaVarZzgi, zzaVarZzgi.zzbx().DW()));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzdx zzdxVar;
        if (bundle == null || (zzdxVar = this.zzart.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzdxVar.zzaro);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzdxVar.zzuw);
        bundle2.putString("referrer_name", zzdxVar.zzarn);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.zzarr == null) {
            zzgt().zzjj().zzby("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzart.get(activity) == null) {
            zzgt().zzjj().zzby("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzcq(activity.getClass().getCanonicalName());
        }
        boolean zEquals = this.zzarr.zzarn.equals(str2);
        boolean zZzv = zzfy.zzv(this.zzarr.zzuw, str);
        if (zEquals && zZzv) {
            zzgt().zzjl().zzby("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > 100)) {
            zzgt().zzjj().zzg("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
            zzgt().zzjj().zzg("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzgt().zzjo().zze("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzdx zzdxVar = new zzdx(str, str2, zzgr().zzmj());
        this.zzart.put(activity, zzdxVar);
        zza(activity, zzdxVar, true);
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

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzgy() {
        return false;
    }

    public final zzdx zzle() {
        zzcl();
        zzaf();
        return this.zzarq;
    }

    public final zzdx zzlf() {
        zzgg();
        return this.zzarr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdx zzdxVar, boolean z) {
        zzgi().zzm(zzbx().DW());
        if (zzgo().zza(zzdxVar.zzarp, z)) {
            zzdxVar.zzarp = false;
        }
    }

    public static void zza(zzdx zzdxVar, Bundle bundle, boolean z) {
        if (bundle != null && zzdxVar != null && (!bundle.containsKey("_sc") || z)) {
            String str = zzdxVar.zzuw;
            if (str != null) {
                bundle.putString("_sn", str);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzdxVar.zzarn);
            bundle.putLong("_si", zzdxVar.zzaro);
            return;
        }
        if (bundle != null && zzdxVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(String str, zzdx zzdxVar) {
        zzaf();
        synchronized (this) {
            if (this.zzarv == null || this.zzarv.equals(str) || zzdxVar != null) {
                this.zzarv = str;
                this.zzaru = zzdxVar;
            }
        }
    }
}
