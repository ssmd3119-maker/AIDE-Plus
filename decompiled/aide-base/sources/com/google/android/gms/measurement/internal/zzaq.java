package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzaq extends zzcs {
    private static final AtomicReference<String[]> zzalp = new AtomicReference<>();
    private static final AtomicReference<String[]> zzalq = new AtomicReference<>();
    private static final AtomicReference<String[]> zzalr = new AtomicReference<>();

    zzaq(zzbw zzbwVar) {
        super(zzbwVar);
    }

    private static String zza(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        p.u7(strArr);
        p.u7(strArr2);
        p.u7(atomicReference);
        p.j6(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzfy.zzv(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final boolean zzjf() {
        zzgw();
        return this.zzada.zzkn() && this.zzada.zzgt().isLoggable(3);
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    protected final String zzb(zzag zzagVar) {
        if (zzagVar == null) {
            return null;
        }
        if (!zzjf()) {
            return zzagVar.toString();
        }
        return "origin=" + zzagVar.origin + ",name=" + zzbt(zzagVar.name) + ",params=" + zzb(zzagVar.zzahu);
    }

    protected final String zzbt(String str) {
        if (str == null) {
            return null;
        }
        return !zzjf() ? str : zza(str, zzcu.zzaqr, zzcu.zzaqq, zzalp);
    }

    protected final String zzbu(String str) {
        if (str == null) {
            return null;
        }
        return !zzjf() ? str : zza(str, zzcv.zzaqt, zzcv.zzaqs, zzalq);
    }

    protected final String zzbv(String str) {
        if (str == null) {
            return null;
        }
        if (!zzjf()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zza(str, zzcw.zzaqv, zzcw.zzaqu, zzalr);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    protected final String zzd(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!zzjf()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(zzbu(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
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

    private final String zzb(zzad zzadVar) {
        if (zzadVar == null) {
            return null;
        }
        if (!zzjf()) {
            return zzadVar.toString();
        }
        return zzd(zzadVar.zziy());
    }

    protected final String zza(zzab zzabVar) {
        if (zzabVar == null) {
            return null;
        }
        if (!zzjf()) {
            return zzabVar.toString();
        }
        return "Event{appId='" + zzabVar.zztt + "', name='" + zzbt(zzabVar.name) + "', params=" + zzb(zzabVar.zzahu) + "}";
    }
}
