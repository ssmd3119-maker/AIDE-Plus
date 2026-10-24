package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzbd extends zzcs {
    static final Pair<String, Long> zzamy = new Pair<>("", 0L);
    private SharedPreferences zzabr;
    public zzbh zzamz;
    public final zzbg zzana;
    public final zzbg zzanb;
    public final zzbg zzanc;
    public final zzbg zzand;
    public final zzbg zzane;
    public final zzbg zzanf;
    public final zzbg zzang;
    public final zzbi zzanh;
    private String zzani;
    private boolean zzanj;
    private long zzank;
    public final zzbg zzanl;
    public final zzbg zzanm;
    public final zzbf zzann;
    public final zzbg zzano;
    public final zzbg zzanp;
    public boolean zzanq;

    zzbd(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzana = new zzbg(this, "last_upload", 0L);
        this.zzanb = new zzbg(this, "last_upload_attempt", 0L);
        this.zzanc = new zzbg(this, "backoff", 0L);
        this.zzand = new zzbg(this, "last_delete_stale", 0L);
        this.zzanl = new zzbg(this, "time_before_start", 10000L);
        this.zzanm = new zzbg(this, "session_timeout", 1800000L);
        this.zzann = new zzbf(this, "start_new_session", true);
        this.zzano = new zzbg(this, "last_pause_time", 0L);
        this.zzanp = new zzbg(this, "time_active", 0L);
        this.zzane = new zzbg(this, "midnight_offset", 0L);
        this.zzanf = new zzbg(this, "first_open_time", 0L);
        this.zzang = new zzbg(this, "app_install_time", 0L);
        this.zzanh = new zzbi(this, "app_instance_id", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences zzju() {
        zzaf();
        zzcl();
        return this.zzabr;
    }

    final void setMeasurementEnabled(boolean z) {
        zzaf();
        zzgt().zzjo().zzg("Setting measurementEnabled", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = zzju().edit();
        editorEdit.putBoolean("measurement_enabled", z);
        editorEdit.apply();
    }

    final boolean zzaf(long j) {
        return j - this.zzanm.get() > this.zzano.get();
    }

    final Pair<String, Boolean> zzbz(String str) {
        zzaf();
        long jDW = zzbx().DW();
        if (this.zzani != null && jDW < this.zzank) {
            return new Pair<>(this.zzani, Boolean.valueOf(this.zzanj));
        }
        this.zzank = jDW + zzgv().zza(str, zzai.zzaiv);
        AdvertisingIdClient.v5(true);
        try {
            AdvertisingIdClient.a aVarDW = AdvertisingIdClient.DW(getContext());
            if (aVarDW != null) {
                this.zzani = aVarDW.j6();
                this.zzanj = aVarDW.DW();
            }
            if (this.zzani == null) {
                this.zzani = "";
            }
        } catch (Exception e) {
            zzgt().zzjn().zzg("Unable to get advertising id", e);
            this.zzani = "";
        }
        AdvertisingIdClient.v5(false);
        return new Pair<>(this.zzani, Boolean.valueOf(this.zzanj));
    }

    final String zzca(String str) throws NoSuchAlgorithmException {
        zzaf();
        String str2 = (String) zzbz(str).first;
        MessageDigest messageDigest = zzfy.getMessageDigest();
        if (messageDigest == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest(str2.getBytes())));
    }

    final void zzcb(String str) {
        zzaf();
        SharedPreferences.Editor editorEdit = zzju().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }

    final void zzcc(String str) {
        zzaf();
        SharedPreferences.Editor editorEdit = zzju().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    final void zzg(boolean z) {
        zzaf();
        zzgt().zzjo().zzg("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = zzju().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    @Override // com.google.android.gms.measurement.internal.zzcs
    protected final boolean zzgy() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzcs
    protected final void zzgz() {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzabr = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzanq = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.zzabr.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.zzamz = new zzbh(this, "health_monitor", Math.max(0L, zzai.zzaiw.get().longValue()));
    }

    final boolean zzh(boolean z) {
        zzaf();
        return zzju().getBoolean("measurement_enabled", z);
    }

    final void zzi(boolean z) {
        zzaf();
        zzgt().zzjo().zzg("Updating deferred analytics collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = zzju().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    final String zzjv() {
        zzaf();
        return zzju().getString("gmp_app_id", null);
    }

    final String zzjw() {
        zzaf();
        return zzju().getString("admob_app_id", null);
    }

    final Boolean zzjx() {
        zzaf();
        if (zzju().contains("use_service")) {
            return Boolean.valueOf(zzju().getBoolean("use_service", false));
        }
        return null;
    }

    final void zzjy() {
        zzaf();
        zzgt().zzjo().zzby("Clearing collection preferences.");
        if (zzgv().zza(zzai.zzalc)) {
            Boolean boolZzjz = zzjz();
            SharedPreferences.Editor editorEdit = zzju().edit();
            editorEdit.clear();
            editorEdit.apply();
            if (boolZzjz != null) {
                setMeasurementEnabled(boolZzjz.booleanValue());
                return;
            }
            return;
        }
        boolean zContains = zzju().contains("measurement_enabled");
        boolean zZzh = zContains ? zzh(true) : true;
        SharedPreferences.Editor editorEdit2 = zzju().edit();
        editorEdit2.clear();
        editorEdit2.apply();
        if (zContains) {
            setMeasurementEnabled(zZzh);
        }
    }

    final Boolean zzjz() {
        zzaf();
        if (zzju().contains("measurement_enabled")) {
            return Boolean.valueOf(zzju().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    protected final String zzka() {
        zzaf();
        String string = zzju().getString("previous_os_version", null);
        zzgp().zzcl();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = zzju().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    final boolean zzkb() {
        zzaf();
        return zzju().getBoolean("deferred_analytics_collection", false);
    }

    final boolean zzkc() {
        return this.zzabr.contains("deferred_analytics_collection");
    }
}
