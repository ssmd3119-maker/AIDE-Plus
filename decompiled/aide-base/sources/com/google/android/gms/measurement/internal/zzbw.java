package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.wrappers.b;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class zzbw implements zzct {
    private static volatile zzbw zzapg;
    private final boolean zzadg;
    private final String zzadi;
    private final long zzago;
    private final zzn zzaih;
    private final String zzaph;
    private final String zzapi;
    private final zzq zzapj;
    private final zzbd zzapk;
    private final zzas zzapl;
    private final zzbr zzapm;
    private final zzfd zzapn;
    private final AppMeasurement zzapo;
    private final zzfy zzapp;
    private final zzaq zzapq;
    private final zzdy zzapr;
    private final zzda zzaps;
    private final zza zzapt;
    private zzao zzapu;
    private zzeb zzapv;
    private zzaa zzapw;
    private zzam zzapx;
    private zzbj zzapy;
    private Boolean zzapz;
    private long zzaqa;
    private volatile Boolean zzaqb;
    private Boolean zzaqc;
    private Boolean zzaqd;
    private int zzaqe;
    private final Context zzri;
    private final e zzrz;
    private boolean zzvz = false;
    private AtomicInteger zzaqf = new AtomicInteger(0);

    private zzbw(zzcz zzczVar) {
        Bundle bundle;
        p.u7(zzczVar);
        zzn zznVar = new zzn(zzczVar.zzri);
        this.zzaih = zznVar;
        zzai.zza(zznVar);
        this.zzri = zzczVar.zzri;
        this.zzadi = zzczVar.zzadi;
        this.zzaph = zzczVar.zzaph;
        this.zzapi = zzczVar.zzapi;
        this.zzadg = zzczVar.zzadg;
        this.zzaqb = zzczVar.zzaqb;
        zzan zzanVar = zzczVar.zzaqw;
        if (zzanVar != null && (bundle = zzanVar.zzadj) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzaqc = (Boolean) obj;
            }
            Object obj2 = zzanVar.zzadj.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzaqd = (Boolean) obj2;
            }
        }
        d2.gn(this.zzri);
        e eVarHw = h.Hw();
        this.zzrz = eVarHw;
        this.zzago = eVarHw.j6();
        this.zzapj = new zzq(this);
        zzbd zzbdVar = new zzbd(this);
        zzbdVar.zzq();
        this.zzapk = zzbdVar;
        zzas zzasVar = new zzas(this);
        zzasVar.zzq();
        this.zzapl = zzasVar;
        zzfy zzfyVar = new zzfy(this);
        zzfyVar.zzq();
        this.zzapp = zzfyVar;
        zzaq zzaqVar = new zzaq(this);
        zzaqVar.zzq();
        this.zzapq = zzaqVar;
        this.zzapt = new zza(this);
        zzdy zzdyVar = new zzdy(this);
        zzdyVar.zzq();
        this.zzapr = zzdyVar;
        zzda zzdaVar = new zzda(this);
        zzdaVar.zzq();
        this.zzaps = zzdaVar;
        this.zzapo = new AppMeasurement(this);
        zzfd zzfdVar = new zzfd(this);
        zzfdVar.zzq();
        this.zzapn = zzfdVar;
        zzbr zzbrVar = new zzbr(this);
        zzbrVar.zzq();
        this.zzapm = zzbrVar;
        if (this.zzri.getApplicationContext() instanceof Application) {
            zzda zzdaVarZzgj = zzgj();
            if (zzdaVarZzgj.getContext().getApplicationContext() instanceof Application) {
                Application application = (Application) zzdaVarZzgj.getContext().getApplicationContext();
                if (zzdaVarZzgj.zzaqx == null) {
                    zzdaVarZzgj.zzaqx = new zzdu(zzdaVarZzgj, null);
                }
                application.unregisterActivityLifecycleCallbacks(zzdaVarZzgj.zzaqx);
                application.registerActivityLifecycleCallbacks(zzdaVarZzgj.zzaqx);
                zzdaVarZzgj.zzgt().zzjo().zzby("Registered activity lifecycle callback");
            }
        } else {
            zzgt().zzjj().zzby("Application context is not an Application");
        }
        this.zzapm.zzc(new zzbx(this, zzczVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzcz zzczVar) {
        String strConcat;
        zzau zzauVarZzjm;
        zzgs().zzaf();
        zzq.zzhy();
        zzaa zzaaVar = new zzaa(this);
        zzaaVar.zzq();
        this.zzapw = zzaaVar;
        zzam zzamVar = new zzam(this);
        zzamVar.zzq();
        this.zzapx = zzamVar;
        zzao zzaoVar = new zzao(this);
        zzaoVar.zzq();
        this.zzapu = zzaoVar;
        zzeb zzebVar = new zzeb(this);
        zzebVar.zzq();
        this.zzapv = zzebVar;
        this.zzapp.zzgx();
        this.zzapk.zzgx();
        this.zzapy = new zzbj(this);
        this.zzapx.zzgx();
        zzgt().zzjm().zzg("App measurement is starting up, version", Long.valueOf(this.zzapj.zzhh()));
        zzgt().zzjm().zzby("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzal = zzamVar.zzal();
        if (TextUtils.isEmpty(this.zzadi)) {
            if (zzgr().zzcz(strZzal)) {
                zzauVarZzjm = zzgt().zzjm();
                strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzau zzauVarZzjm2 = zzgt().zzjm();
                String strValueOf = String.valueOf(strZzal);
                strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzauVarZzjm = zzauVarZzjm2;
            }
            zzauVarZzjm.zzby(strConcat);
        }
        zzgt().zzjn().zzby("Debug-level message logging enabled");
        if (this.zzaqe != this.zzaqf.get()) {
            zzgt().zzjg().zze("Not all components initialized", Integer.valueOf(this.zzaqe), Integer.valueOf(this.zzaqf.get()));
        }
        this.zzvz = true;
    }

    private final void zzcl() {
        if (!this.zzvz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final Context getContext() {
        return this.zzri;
    }

    public final boolean isEnabled() {
        boolean zBooleanValue;
        zzgs().zzaf();
        zzcl();
        if (!this.zzapj.zza(zzai.zzalc)) {
            if (this.zzapj.zzhz()) {
                return false;
            }
            Boolean boolZzia = this.zzapj.zzia();
            if (boolZzia != null) {
                zBooleanValue = boolZzia.booleanValue();
            } else {
                zBooleanValue = !c.Hw();
                if (zBooleanValue && this.zzaqb != null && zzai.zzaky.get().booleanValue()) {
                    zBooleanValue = this.zzaqb.booleanValue();
                }
            }
            return zzgu().zzh(zBooleanValue);
        }
        if (this.zzapj.zzhz()) {
            return false;
        }
        Boolean bool = this.zzaqd;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        Boolean boolZzjz = zzgu().zzjz();
        if (boolZzjz != null) {
            return boolZzjz.booleanValue();
        }
        Boolean boolZzia2 = this.zzapj.zzia();
        if (boolZzia2 != null) {
            return boolZzia2.booleanValue();
        }
        Boolean bool2 = this.zzaqc;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (c.Hw()) {
            return false;
        }
        if (!this.zzapj.zza(zzai.zzaky) || this.zzaqb == null) {
            return true;
        }
        return this.zzaqb.booleanValue();
    }

    protected final void start() {
        zzgs().zzaf();
        if (zzgu().zzana.get() == 0) {
            zzgu().zzana.set(this.zzrz.j6());
        }
        if (Long.valueOf(zzgu().zzanf.get()).longValue() == 0) {
            zzgt().zzjo().zzg("Persisting first open", Long.valueOf(this.zzago));
            zzgu().zzanf.set(this.zzago);
        }
        if (!zzkv()) {
            if (isEnabled()) {
                if (!zzgr().zzx("android.permission.INTERNET")) {
                    zzgt().zzjg().zzby("App is missing INTERNET permission");
                }
                if (!zzgr().zzx("android.permission.ACCESS_NETWORK_STATE")) {
                    zzgt().zzjg().zzby("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!b.j6(this.zzri).VH() && !this.zzapj.zzif()) {
                    if (!zzbm.zza(this.zzri)) {
                        zzgt().zzjg().zzby("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzfy.zza(this.zzri, false)) {
                        zzgt().zzjg().zzby("AppMeasurementService not registered/enabled");
                    }
                }
                zzgt().zzjg().zzby("Uploading is not possible. App measurement disabled");
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(zzgk().getGmpAppId()) || !TextUtils.isEmpty(zzgk().zzhb())) {
            zzgr();
            if (zzfy.zza(zzgk().getGmpAppId(), zzgu().zzjv(), zzgk().zzhb(), zzgu().zzjw())) {
                zzgt().zzjm().zzby("Rechecking which service to use due to a GMP App Id change");
                zzgu().zzjy();
                zzgn().resetAnalyticsData();
                this.zzapv.disconnect();
                this.zzapv.zzdj();
                zzgu().zzanf.set(this.zzago);
                zzgu().zzanh.zzcd(null);
            }
            zzgu().zzcb(zzgk().getGmpAppId());
            zzgu().zzcc(zzgk().zzhb());
            if (this.zzapj.zzbi(zzgk().zzal())) {
                this.zzapn.zzaj(this.zzago);
            }
        }
        zzgj().zzcp(zzgu().zzanh.zzkd());
        if (TextUtils.isEmpty(zzgk().getGmpAppId()) && TextUtils.isEmpty(zzgk().zzhb())) {
            return;
        }
        boolean zIsEnabled = isEnabled();
        if (!zzgu().zzkc() && !this.zzapj.zzhz()) {
            zzgu().zzi(!zIsEnabled);
        }
        if (!this.zzapj.zzba(zzgk().zzal()) || zIsEnabled) {
            zzgj().zzld();
        }
        zzgl().zza(new AtomicReference<>());
    }

    final void zzb(zzcs zzcsVar) {
        this.zzaqe++;
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final e zzbx() {
        return this.zzrz;
    }

    final void zzd(boolean z) {
        this.zzaqb = Boolean.valueOf(z);
    }

    final void zzgf() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzgg() {
    }

    public final zza zzgi() {
        zza zzaVar = this.zzapt;
        if (zzaVar != null) {
            return zzaVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzda zzgj() {
        zza((zzf) this.zzaps);
        return this.zzaps;
    }

    public final zzam zzgk() {
        zza((zzf) this.zzapx);
        return this.zzapx;
    }

    public final zzeb zzgl() {
        zza((zzf) this.zzapv);
        return this.zzapv;
    }

    public final zzdy zzgm() {
        zza((zzf) this.zzapr);
        return this.zzapr;
    }

    public final zzao zzgn() {
        zza((zzf) this.zzapu);
        return this.zzapu;
    }

    public final zzfd zzgo() {
        zza((zzf) this.zzapn);
        return this.zzapn;
    }

    public final zzaa zzgp() {
        zza((zzcs) this.zzapw);
        return this.zzapw;
    }

    public final zzaq zzgq() {
        zza((zzcr) this.zzapq);
        return this.zzapq;
    }

    public final zzfy zzgr() {
        zza((zzcr) this.zzapp);
        return this.zzapp;
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final zzbr zzgs() {
        zza((zzcs) this.zzapm);
        return this.zzapm;
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final zzas zzgt() {
        zza((zzcs) this.zzapl);
        return this.zzapl;
    }

    public final zzbd zzgu() {
        zza((zzcr) this.zzapk);
        return this.zzapk;
    }

    public final zzq zzgv() {
        return this.zzapj;
    }

    @Override // com.google.android.gms.measurement.internal.zzct
    public final zzn zzgw() {
        return this.zzaih;
    }

    public final zzas zzkj() {
        zzas zzasVar = this.zzapl;
        if (zzasVar == null || !zzasVar.isInitialized()) {
            return null;
        }
        return this.zzapl;
    }

    public final zzbj zzkk() {
        return this.zzapy;
    }

    final zzbr zzkl() {
        return this.zzapm;
    }

    public final AppMeasurement zzkm() {
        return this.zzapo;
    }

    public final boolean zzkn() {
        return TextUtils.isEmpty(this.zzadi);
    }

    public final String zzko() {
        return this.zzadi;
    }

    public final String zzkp() {
        return this.zzaph;
    }

    public final String zzkq() {
        return this.zzapi;
    }

    public final boolean zzkr() {
        return this.zzadg;
    }

    public final boolean zzks() {
        return this.zzaqb != null && this.zzaqb.booleanValue();
    }

    final long zzkt() {
        Long lValueOf = Long.valueOf(zzgu().zzanf.get());
        return lValueOf.longValue() == 0 ? this.zzago : Math.min(this.zzago, lValueOf.longValue());
    }

    final void zzku() {
        this.zzaqf.incrementAndGet();
    }

    protected final boolean zzkv() {
        zzcl();
        zzgs().zzaf();
        Boolean bool = this.zzapz;
        if (bool == null || this.zzaqa == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzrz.DW() - this.zzaqa) > 1000)) {
            this.zzaqa = this.zzrz.DW();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(zzgr().zzx("android.permission.INTERNET") && zzgr().zzx("android.permission.ACCESS_NETWORK_STATE") && (b.j6(this.zzri).VH() || this.zzapj.zzif() || (zzbm.zza(this.zzri) && zzfy.zza(this.zzri, false))));
            this.zzapz = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzgr().zzu(zzgk().getGmpAppId(), zzgk().zzhb()) && TextUtils.isEmpty(zzgk().zzhb())) {
                    z = false;
                }
                this.zzapz = Boolean.valueOf(z);
            }
        }
        return this.zzapz.booleanValue();
    }

    final void zzb(zzf zzfVar) {
        this.zzaqe++;
    }

    public static zzbw zza(Context context, zzan zzanVar) {
        Bundle bundle;
        if (zzanVar != null && (zzanVar.origin == null || zzanVar.zzadi == null)) {
            zzanVar = new zzan(zzanVar.zzade, zzanVar.zzadf, zzanVar.zzadg, zzanVar.zzadh, null, null, zzanVar.zzadj);
        }
        p.u7(context);
        p.u7(context.getApplicationContext());
        if (zzapg == null) {
            synchronized (zzbw.class) {
                if (zzapg == null) {
                    zzapg = new zzbw(new zzcz(context, zzanVar));
                }
            }
        } else if (zzanVar != null && (bundle = zzanVar.zzadj) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            zzapg.zzd(zzanVar.zzadj.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zzapg;
    }

    private static void zza(zzcs zzcsVar) {
        if (zzcsVar != null) {
            if (zzcsVar.isInitialized()) {
                return;
            }
            String strValueOf = String.valueOf(zzcsVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzf zzfVar) {
        if (zzfVar != null) {
            if (zzfVar.isInitialized()) {
                return;
            }
            String strValueOf = String.valueOf(zzfVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(strValueOf);
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzcr zzcrVar) {
        if (zzcrVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }
}
