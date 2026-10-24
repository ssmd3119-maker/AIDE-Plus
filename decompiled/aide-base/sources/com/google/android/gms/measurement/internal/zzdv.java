package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.r7;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdv extends zzfn {
    public zzdv(zzfo zzfoVar) {
        super(zzfoVar);
    }

    private static String zzr(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    public final byte[] zzb(zzag zzagVar, String str) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        Bundle bundle;
        i1 i1Var;
        h1 h1Var;
        zzg zzgVar;
        long j;
        zzac zzacVarZzae;
        zzfx next;
        zzaf();
        this.zzada.zzgf();
        p.u7(zzagVar);
        p.v5(str);
        if (!zzgv().zze(str, zzai.zzalf)) {
            zzgt().zzjn().zzg("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzagVar.name) && !"_iapx".equals(zzagVar.name)) {
            zzgt().zzjn().zze("Generating a payload for this event is not available. package_name, event_name", str, zzagVar.name);
            return null;
        }
        h1 h1Var2 = new h1();
        zzjt().beginTransaction();
        try {
            zzg zzgVarZzbm = zzjt().zzbm(str);
            if (zzgVarZzbm == null) {
                zzgt().zzjn().zzg("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zzgVarZzbm.isMeasurementEnabled()) {
                zzgt().zzjn().zzg("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            i1 i1Var2 = new i1();
            h1Var2.FH = new i1[]{i1Var2};
            i1Var2.FH = 1;
            i1Var2.EQ = "android";
            i1Var2.XL = zzgVarZzbm.zzal();
            i1Var2.QX = zzgVarZzbm.zzhg();
            i1Var2.aM = zzgVarZzbm.zzak();
            long jZzhf = zzgVarZzbm.zzhf();
            i1Var2.ei = jZzhf == -2147483648L ? null : Integer.valueOf((int) jZzhf);
            i1Var2.j3 = Long.valueOf(zzgVarZzbm.zzhh());
            String gmpAppId = zzgVarZzbm.getGmpAppId();
            i1Var2.gW = gmpAppId;
            if (TextUtils.isEmpty(gmpAppId)) {
                i1Var2.sG = zzgVarZzbm.zzhb();
            }
            i1Var2.rN = Long.valueOf(zzgVarZzbm.zzhi());
            if (this.zzada.isEnabled() && zzq.zzie() && zzgv().zzas(i1Var2.XL)) {
                i1Var2.sh = null;
            }
            Pair<String, Boolean> pairZzbz = zzgu().zzbz(zzgVarZzbm.zzal());
            if (zzgVarZzbm.zzhw() && pairZzbz != null && !TextUtils.isEmpty((CharSequence) pairZzbz.first)) {
                i1Var2.U2 = zzr((String) pairZzbz.first, Long.toString(zzagVar.zzaig));
                i1Var2.a8 = (Boolean) pairZzbz.second;
            }
            zzgp().zzcl();
            i1Var2.J0 = Build.MODEL;
            zzgp().zzcl();
            i1Var2.we = Build.VERSION.RELEASE;
            i1Var2.Ws = Integer.valueOf((int) zzgp().zziw());
            i1Var2.J8 = zzgp().zzix();
            i1Var2.lg = zzr(zzgVarZzbm.getAppInstanceId(), Long.toString(zzagVar.zzaig));
            i1Var2.P8 = zzgVarZzbm.getFirebaseInstanceId();
            String str2 = i1Var2.XL;
            List<zzfx> listZzbl = zzjt().zzbl(str2);
            if (zzgv().zzau(str)) {
                Iterator<zzfx> it = listZzbl.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if ("_lte".equals(next.name)) {
                        break;
                    }
                }
                if (next == null || next.value == null) {
                    zzfx zzfxVar = new zzfx(str2, "auto", "_lte", zzbx().j6(), 0L);
                    listZzbl.add(zzfxVar);
                    zzjt().zza(zzfxVar);
                }
            }
            l1[] l1VarArr = new l1[listZzbl.size()];
            for (int i = 0; i < listZzbl.size(); i++) {
                l1 l1Var = new l1();
                l1VarArr[i] = l1Var;
                l1Var.Hw = listZzbl.get(i).name;
                l1Var.FH = Long.valueOf(listZzbl.get(i).zzauk);
                zzjr().zza(l1Var, listZzbl.get(i).value);
            }
            i1Var2.v5 = l1VarArr;
            Bundle bundleZziy = zzagVar.zzahu.zziy();
            bundleZziy.putLong("_c", 1L);
            zzgt().zzjn().zzby("Marking in-app purchase as real-time");
            bundleZziy.putLong("_r", 1L);
            bundleZziy.putString("_o", zzagVar.origin);
            if (zzgr().zzcz(i1Var2.XL)) {
                zzgr().zza(bundleZziy, "_dbg", (Object) 1L);
                zzgr().zza(bundleZziy, "_r", (Object) 1L);
            }
            zzac zzacVarZzg = zzjt().zzg(str, zzagVar.name);
            if (zzacVarZzg == null) {
                bundle = bundleZziy;
                i1Var = i1Var2;
                h1Var = h1Var2;
                zzgVar = zzgVarZzbm;
                zzacVarZzae = new zzac(str, zzagVar.name, 0L, 0L, zzagVar.zzaig, 0L, null, null, null, null);
                j = 0;
            } else {
                bundle = bundleZziy;
                i1Var = i1Var2;
                h1Var = h1Var2;
                zzgVar = zzgVarZzbm;
                j = zzacVarZzg.zzahx;
                zzacVarZzae = zzacVarZzg.zzae(zzagVar.zzaig);
            }
            zzjt().zza(zzacVarZzae);
            zzab zzabVar = new zzab(this.zzada, zzagVar.origin, str, zzagVar.name, zzagVar.zzaig, j, bundle);
            f1 f1Var = new f1();
            i1 i1Var3 = i1Var;
            i1Var3.Hw = new f1[]{f1Var};
            f1Var.v5 = Long.valueOf(zzabVar.timestamp);
            f1Var.Hw = zzabVar.name;
            f1Var.Zo = Long.valueOf(zzabVar.zzaht);
            f1Var.FH = new g1[zzabVar.zzahu.size()];
            Iterator<String> it2 = zzabVar.zzahu.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                String next2 = it2.next();
                g1 g1Var = new g1();
                f1Var.FH[i2] = g1Var;
                g1Var.FH = next2;
                zzjr().zza(g1Var, zzabVar.zzahu.get(next2));
                i2++;
            }
            r0.a aVarEr = r0.er();
            q0.a aVarYS = q0.yS();
            aVarYS.Ws(zzacVarZzae.zzahv);
            aVarYS.XL(zzagVar.name);
            aVarEr.Ws((q0) ((e4) aVarYS.DW()));
            i1Var3.ef = (r0) ((e4) aVarEr.DW());
            i1Var3.vy = zzjs().zza(zzgVar.zzal(), (f1[]) null, i1Var3.v5);
            i1Var3.VH = f1Var.v5;
            i1Var3.gn = f1Var.v5;
            long jZzhe = zzgVar.zzhe();
            i1Var3.tp = jZzhe != 0 ? Long.valueOf(jZzhe) : null;
            long jZzhd = zzgVar.zzhd();
            if (jZzhd != 0) {
                jZzhe = jZzhd;
            }
            i1Var3.u7 = jZzhe != 0 ? Long.valueOf(jZzhe) : null;
            zzgVar.zzhm();
            i1Var3.er = Integer.valueOf((int) zzgVar.zzhj());
            i1Var3.Mr = Long.valueOf(zzgv().zzhh());
            i1Var3.Zo = Long.valueOf(zzbx().j6());
            i1Var3.BT = Boolean.TRUE;
            zzg zzgVar2 = zzgVar;
            zzgVar2.zzo(i1Var3.VH.longValue());
            zzgVar2.zzp(i1Var3.gn.longValue());
            zzjt().zza(zzgVar2);
            zzjt().setTransactionSuccessful();
            try {
                int iHw = h1Var.Hw();
                byte[] bArr = new byte[iHw];
                r7 r7VarYS = r7.yS(bArr, 0, iHw);
                h1Var.DW(r7VarYS);
                r7VarYS.P8();
                return zzjr().zzb(bArr);
            } catch (IOException e) {
                zzgt().zzjg().zze("Data loss. Failed to bundle and serialize. appId", zzas.zzbw(str), e);
                return null;
            }
        } catch (SecurityException e2) {
            zzgt().zzjn().zzg("Resettable device id encryption failed", e2.getMessage());
            return new byte[0];
        } catch (SecurityException e3) {
            zzgt().zzjn().zzg("app instance id encryption failed", e3.getMessage());
            return new byte[0];
        } finally {
            zzjt().endTransaction();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfn
    protected final boolean zzgy() {
        return false;
    }
}
