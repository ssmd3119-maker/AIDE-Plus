package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.e;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzam extends zzf {
    private String zzafi;
    private String zzafp;
    private long zzafs;
    private String zzafv;
    private int zzagp;
    private int zzalk;
    private long zzall;
    private String zztr;
    private String zzts;
    private String zztt;

    zzam(zzbw zzbwVar) {
        super(zzbwVar);
    }

    private final String zzjc() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        try {
            Class<?> clsLoadClass = getContext().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (clsLoadClass == null) {
                return null;
            }
            try {
                Object objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, getContext());
                if (objInvoke == null) {
                    return null;
                }
                try {
                    return (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(objInvoke, new Object[0]);
                } catch (Exception unused) {
                    zzgt().zzjl().zzby("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzgt().zzjk().zzby("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final String getGmpAppId() {
        zzcl();
        return this.zzafi;
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    final String zzal() {
        zzcl();
        return this.zztt;
    }

    final zzk zzbs(String str) {
        zzaf();
        zzgg();
        String strZzal = zzal();
        String gmpAppId = getGmpAppId();
        zzcl();
        String str2 = this.zzts;
        long jZzjd = zzjd();
        zzcl();
        String str3 = this.zzafp;
        long jZzhh = zzgv().zzhh();
        zzcl();
        zzaf();
        if (this.zzall == 0) {
            this.zzall = this.zzada.zzgr().zzd(getContext(), getContext().getPackageName());
        }
        long j = this.zzall;
        boolean zIsEnabled = this.zzada.isEnabled();
        boolean z = !zzgu().zzanq;
        zzaf();
        zzgg();
        String strZzjc = (!zzgv().zzaz(this.zztt) || this.zzada.isEnabled()) ? zzjc() : null;
        zzcl();
        long j2 = this.zzafs;
        long jZzkt = this.zzada.zzkt();
        int iZzje = zzje();
        zzq zzqVarZzgv = zzgv();
        zzqVarZzgv.zzgg();
        Boolean boolZzar = zzqVarZzgv.zzar("google_analytics_adid_collection_enabled");
        boolean zBooleanValue = Boolean.valueOf(boolZzar == null || boolZzar.booleanValue()).booleanValue();
        zzq zzqVarZzgv2 = zzgv();
        zzqVarZzgv2.zzgg();
        Boolean boolZzar2 = zzqVarZzgv2.zzar("google_analytics_ssaid_collection_enabled");
        return new zzk(strZzal, gmpAppId, str2, jZzjd, str3, jZzhh, j, str, zIsEnabled, z, strZzjc, j2, jZzkt, iZzje, zBooleanValue, Boolean.valueOf(boolZzar2 == null || boolZzar2.booleanValue()).booleanValue(), zzgu().zzkb(), zzhb());
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
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(1:4)(23:88|6|(1:10)(2:11|(1:13))|90|14|(4:16|(1:18)(1:20)|86|21)|26|(1:31)(1:30)|32|(1:37)(1:36)|38|(1:(1:41)(1:42))|(3:44|(2:46|(1:48))(1:(1:(1:59)(1:58))(2:52|(1:54)))|60)(1:60)|61|(1:65)|84|66|(1:68)(1:69)|70|(1:72)|(1:74)|78|(2:80|81)(2:82|83))|5|26|(2:28|31)(0)|32|(2:34|37)(0)|38|(0)|(0)(0)|61|(2:63|65)|84|66|(0)(0)|70|(0)|(0)|78|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ce, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cf, code lost:
    
        zzgt().zzjg().zze("getGoogleAppId or isMeasurementEnabled failed with exception. appId", com.google.android.gms.measurement.internal.zzas.zzbw(r0), r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a9 A[Catch: IllegalStateException -> 0x01ce, TryCatch #0 {IllegalStateException -> 0x01ce, blocks: (B:66:0x0195, B:70:0x01a1, B:72:0x01a9, B:74:0x01bc), top: B:84:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[Catch: IllegalStateException -> 0x01ce, TRY_LEAVE, TryCatch #0 {IllegalStateException -> 0x01ce, blocks: (B:66:0x0195, B:70:0x01a1, B:72:0x01a9, B:74:0x01bc), top: B:84:0x0195 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f1  */
    @Override // com.google.android.gms.measurement.internal.zzf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzgz() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzam.zzgz():void");
    }

    final String zzhb() {
        zzcl();
        return this.zzafv;
    }

    final int zzjd() {
        zzcl();
        return this.zzalk;
    }

    final int zzje() {
        zzcl();
        return this.zzagp;
    }
}
