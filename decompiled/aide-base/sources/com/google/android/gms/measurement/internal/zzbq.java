package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.y0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbq extends zzfn implements zzs {
    private static int zzaoi = 65535;
    private static int zzaoj = 2;
    private final Map<String, Map<String, String>> zzaok;
    private final Map<String, Map<String, Boolean>> zzaol;
    private final Map<String, Map<String, Boolean>> zzaom;
    private final Map<String, b1> zzaon;
    private final Map<String, Map<String, Integer>> zzaoo;
    private final Map<String, String> zzaop;

    zzbq(zzfo zzfoVar) {
        super(zzfoVar);
        this.zzaok = new ArrayMap();
        this.zzaol = new ArrayMap();
        this.zzaom = new ArrayMap();
        this.zzaon = new ArrayMap();
        this.zzaop = new ArrayMap();
        this.zzaoo = new ArrayMap();
    }

    private static Map<String, String> zza(b1 b1Var) {
        c1[] c1VarArr;
        ArrayMap arrayMap = new ArrayMap();
        if (b1Var != null && (c1VarArr = b1Var.Zo) != null) {
            for (c1 c1Var : c1VarArr) {
                if (c1Var != null) {
                    arrayMap.put(c1Var.FH, c1Var.Hw);
                }
            }
        }
        return arrayMap;
    }

    private final void zzcf(String str) {
        zzcl();
        zzaf();
        p.v5(str);
        if (this.zzaon.get(str) == null) {
            byte[] bArrZzbo = zzjt().zzbo(str);
            if (bArrZzbo != null) {
                b1 b1VarZza = zza(str, bArrZzbo);
                this.zzaok.put(str, zza(b1VarZza));
                zza(str, b1VarZza);
                this.zzaon.put(str, b1VarZza);
                this.zzaop.put(str, null);
                return;
            }
            this.zzaok.put(str, null);
            this.zzaol.put(str, null);
            this.zzaom.put(str, null);
            this.zzaon.put(str, null);
            this.zzaop.put(str, null);
            this.zzaoo.put(str, null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr
    public final /* bridge */ /* synthetic */ void zzaf() {
        super.zzaf();
    }

    @Override // com.google.android.gms.measurement.internal.zzcr, com.google.android.gms.measurement.internal.zzct
    public final /* bridge */ /* synthetic */ e zzbx() {
        return super.zzbx();
    }

    protected final b1 zzcg(String str) {
        zzcl();
        zzaf();
        p.v5(str);
        zzcf(str);
        return this.zzaon.get(str);
    }

    protected final String zzch(String str) {
        zzaf();
        return this.zzaop.get(str);
    }

    protected final void zzci(String str) {
        zzaf();
        this.zzaop.put(str, null);
    }

    final void zzcj(String str) {
        zzaf();
        this.zzaon.remove(str);
    }

    final long zzck(String str) {
        String strZzf = zzf(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strZzf)) {
            return 0L;
        }
        try {
            return Long.parseLong(strZzf);
        } catch (NumberFormatException e) {
            zzgt().zzjj().zze("Unable to parse timezone offset. appId", zzas.zzbw(str), e);
            return 0L;
        }
    }

    final boolean zzcl(String str) {
        return "1".equals(zzf(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzcm(String str) {
        return "1".equals(zzf(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.zzs
    public final String zzf(String str, String str2) {
        zzaf();
        zzcf(str);
        Map<String, String> map = this.zzaok.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
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

    @Override // com.google.android.gms.measurement.internal.zzfn
    protected final boolean zzgy() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzfu zzjr() {
        return super.zzjr();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzm zzjs() {
        return super.zzjs();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm
    public final /* bridge */ /* synthetic */ zzt zzjt() {
        return super.zzjt();
    }

    final boolean zzo(String str, String str2) {
        Boolean bool;
        zzaf();
        zzcf(str);
        if (zzcl(str) && zzfy.zzcy(str2)) {
            return true;
        }
        if (zzcm(str) && zzfy.zzct(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzaol.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzp(String str, String str2) {
        Boolean bool;
        zzaf();
        zzcf(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzaom.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final int zzq(String str, String str2) {
        Integer num;
        zzaf();
        zzcf(str);
        Map<String, Integer> map = this.zzaoo.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    private final void zza(String str, b1 b1Var) {
        a1[] a1VarArr;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (b1Var != null && (a1VarArr = b1Var.VH) != null) {
            for (a1 a1Var : a1VarArr) {
                if (TextUtils.isEmpty(a1Var.FH)) {
                    zzgt().zzjj().zzby("EventConfig contained null event name");
                } else {
                    String strZzco = zzcu.zzco(a1Var.FH);
                    if (!TextUtils.isEmpty(strZzco)) {
                        a1Var.FH = strZzco;
                    }
                    arrayMap.put(a1Var.FH, a1Var.Hw);
                    arrayMap2.put(a1Var.FH, a1Var.v5);
                    Integer num = a1Var.Zo;
                    if (num != null) {
                        if (num.intValue() >= zzaoj && a1Var.Zo.intValue() <= zzaoi) {
                            arrayMap3.put(a1Var.FH, a1Var.Zo);
                        } else {
                            zzgt().zzjj().zze("Invalid sampling rate. Event name, sample rate", a1Var.FH, a1Var.Zo);
                        }
                    }
                }
            }
        }
        this.zzaol.put(str, arrayMap);
        this.zzaom.put(str, arrayMap2);
        this.zzaoo.put(str, arrayMap3);
    }

    protected final boolean zza(String str, byte[] bArr, String str2) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        byte[] bArr2;
        zzcl();
        zzaf();
        p.v5(str);
        b1 b1VarZza = zza(str, bArr);
        if (b1VarZza == null) {
            return false;
        }
        zza(str, b1VarZza);
        this.zzaon.put(str, b1VarZza);
        this.zzaop.put(str, str2);
        this.zzaok.put(str, zza(b1VarZza));
        zzm zzmVarZzjs = zzjs();
        u0[] u0VarArr = b1VarZza.gn;
        p.u7(u0VarArr);
        for (u0 u0Var : u0VarArr) {
            for (v0 v0Var : u0Var.v5) {
                String strZzco = zzcu.zzco(v0Var.Hw);
                if (strZzco != null) {
                    v0Var.Hw = strZzco;
                }
                for (w0 w0Var : v0Var.v5) {
                    String strZzco2 = zzcv.zzco(w0Var.Zo);
                    if (strZzco2 != null) {
                        w0Var.Zo = strZzco2;
                    }
                }
            }
            for (y0 y0Var : u0Var.Hw) {
                String strZzco3 = zzcw.zzco(y0Var.Hw);
                if (strZzco3 != null) {
                    y0Var.Hw = strZzco3;
                }
            }
        }
        zzmVarZzjs.zzjt().zza(str, u0VarArr);
        try {
            b1VarZza.gn = null;
            int iHw = b1VarZza.Hw();
            bArr2 = new byte[iHw];
            b1VarZza.DW(r7.yS(bArr2, 0, iHw));
        } catch (IOException e) {
            zzgt().zzjj().zze("Unable to serialize reduced-size config. Storing full config instead. appId", zzas.zzbw(str), e);
            bArr2 = bArr;
        }
        zzt zztVarZzjt = zzjt();
        p.v5(str);
        zztVarZzjt.zzaf();
        zztVarZzjt.zzcl();
        new ContentValues().put("remote_config", bArr2);
        try {
            if (zztVarZzjt.getWritableDatabase().update("apps", r0, "app_id = ?", new String[]{str}) == 0) {
                zztVarZzjt.zzgt().zzjg().zzg("Failed to update remote config (got 0). appId", zzas.zzbw(str));
            }
        } catch (SQLiteException e2) {
            zztVarZzjt.zzgt().zzjg().zze("Error storing remote config. appId", zzas.zzbw(str), e2);
        }
        return true;
    }

    private final b1 zza(String str, byte[] bArr) {
        if (bArr == null) {
            return new b1();
        }
        q7 q7VarEQ = q7.EQ(bArr, 0, bArr.length);
        b1 b1Var = new b1();
        try {
            b1Var.j6(q7VarEQ);
            zzgt().zzjo().zze("Parsed config. version, gmp_app_id", b1Var.FH, b1Var.Hw);
            return b1Var;
        } catch (IOException e) {
            zzgt().zzjj().zze("Unable to merge remote config. appId", zzas.zzbw(str), e);
            return new b1();
        }
    }
}
