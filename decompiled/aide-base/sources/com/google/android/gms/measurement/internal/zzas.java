package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.measurement.AppMeasurement;

/* loaded from: classes.dex */
public final class zzas extends zzcs {
    private long zzade;
    private char zzals;
    private String zzalt;
    private final zzau zzalu;
    private final zzau zzalv;
    private final zzau zzalw;
    private final zzau zzalx;
    private final zzau zzaly;
    private final zzau zzalz;
    private final zzau zzama;
    private final zzau zzamb;
    private final zzau zzamc;

    zzas(zzbw zzbwVar) {
        super(zzbwVar);
        this.zzals = (char) 0;
        this.zzade = -1L;
        this.zzalu = new zzau(this, 6, false, false);
        this.zzalv = new zzau(this, 6, true, false);
        this.zzalw = new zzau(this, 6, false, true);
        this.zzalx = new zzau(this, 5, false, false);
        this.zzaly = new zzau(this, 5, true, false);
        this.zzalz = new zzau(this, 5, false, true);
        this.zzama = new zzau(this, 4, false, false);
        this.zzamb = new zzau(this, 3, false, false);
        this.zzamc = new zzau(this, 2, false, false);
    }

    protected static Object zzbw(String str) {
        if (str == null) {
            return null;
        }
        return new zzav(str);
    }

    private static String zzbx(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    private final String zzjp() {
        String str;
        synchronized (this) {
            if (this.zzalt == null) {
                if (this.zzada.zzkq() != null) {
                    this.zzalt = this.zzada.zzkq();
                } else {
                    this.zzalt = zzq.zzhy();
                }
            }
            str = this.zzalt;
        }
        return str;
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    protected final boolean isLoggable(int i) {
        return Log.isLoggable(zzjp(), i);
    }

    protected final void zza(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && isLoggable(i)) {
            zza(i, zza(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        p.u7(str);
        zzbr zzbrVarZzkl = this.zzada.zzkl();
        if (zzbrVarZzkl == null) {
            zza(6, "Scheduler not set. Not logging error/warn");
        } else {
            if (!zzbrVarZzkl.isInitialized()) {
                zza(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i < 0) {
                i = 0;
            }
            zzbrVarZzkl.zzc(new zzat(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
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

    @Override // com.google.android.gms.measurement.internal.zzcs
    protected final boolean zzgy() {
        return false;
    }

    public final zzau zzjg() {
        return this.zzalu;
    }

    public final zzau zzjh() {
        return this.zzalv;
    }

    public final zzau zzji() {
        return this.zzalw;
    }

    public final zzau zzjj() {
        return this.zzalx;
    }

    public final zzau zzjk() {
        return this.zzaly;
    }

    public final zzau zzjl() {
        return this.zzalz;
    }

    public final zzau zzjm() {
        return this.zzama;
    }

    public final zzau zzjn() {
        return this.zzamb;
    }

    public final zzau zzjo() {
        return this.zzamc;
    }

    public final String zzjq() {
        Pair<String, Long> pairZzfm = zzgu().zzamz.zzfm();
        if (pairZzfm == null || pairZzfm == zzbd.zzamy) {
            return null;
        }
        String strValueOf = String.valueOf(pairZzfm.second);
        String str = (String) pairZzfm.first;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    protected final void zza(int i, String str) {
        Log.println(i, zzjp(), str);
    }

    static String zza(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strZza = zza(z, obj);
        String strZza2 = zza(z, obj2);
        String strZza3 = zza(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZza)) {
            sb.append(str2);
            sb.append(strZza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZza2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strZza2);
        }
        if (!TextUtils.isEmpty(strZza3)) {
            sb.append(str3);
            sb.append(strZza3);
        }
        return sb.toString();
    }

    private static String zza(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String strZzbx = zzbx(AppMeasurement.class.getCanonicalName());
            String strZzbx2 = zzbx(zzbw.class.getCanonicalName());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    String strZzbx3 = zzbx(className);
                    if (strZzbx3.equals(strZzbx) || strZzbx3.equals(strZzbx2)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                }
            }
            return sb2.toString();
        }
        if (obj instanceof zzav) {
            return ((zzav) obj).zzaml;
        }
        return z ? "-" : String.valueOf(obj);
    }
}
