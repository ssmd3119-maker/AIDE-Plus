package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class li extends oh {
    private static final Object fY = new Object();

    @GuardedBy("sLock")
    private static li qp;
    private final Context WB;
    private final ScheduledExecutorService jw = Executors.newSingleThreadScheduledExecutor();
    private final ki mb;

    private li(Context context, ki kiVar) {
        this.WB = context;
        this.mb = kiVar;
    }

    public static li CO(Context context, ki kiVar) {
        li liVar;
        synchronized (fY) {
            if (qp == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                p.j6(context);
                qp = new li(context, kiVar);
                if (context.getApplicationContext() != null) {
                    com.google.android.gms.ads.internal.w0.v5().gW(context);
                }
                qm.j6(context);
            }
            liVar = qp;
        }
        return liVar;
    }

    private static void MU(String str, Map<String, List<String>> map, String str2, int i) {
        if (xp.DW(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            sm.we(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    sm.we(sb2.toString());
                    Iterator<String> it = map.get(str3).iterator();
                    while (it.hasNext()) {
                        String strValueOf = String.valueOf(it.next());
                        sm.we(strValueOf.length() != 0 ? "      ".concat(strValueOf) : new String("      "));
                    }
                }
            }
            sm.we("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    sm.we(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                sm.we("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            sm.we(sb3.toString());
        }
    }

    private static zzasm Mt(Context context, ki kiVar, zzasi zzasiVar, ScheduledExecutorService scheduledExecutorService) throws JSONException {
        char c;
        String string;
        Bundle bundle;
        xp.VH("Starting ad request from service using: google.afma.request.getAdDictionary");
        d0 d0Var = new d0(((Boolean) cw0.v5().FH(p.sh)).booleanValue(), "load_ad", zzasiVar.fY.WB);
        if (zzasiVar.WB > 10) {
            long j = zzasiVar.pN;
            if (j != -1) {
                d0Var.DW(d0Var.FH(j), "cts");
            }
        }
        a0 a0VarVH = d0Var.VH();
        vq vqVarJ6 = jq.j6(kiVar.VH.j6(context), ((Long) cw0.v5().FH(p.N0)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        vq<String> vqVarJ0 = jq.J0(null);
        if (((Boolean) cw0.v5().FH(p.tR)).booleanValue()) {
            vqVarJ0 = kiVar.DW.j6(zzasiVar.zh.packageName);
        }
        vq<String> vqVarDW = kiVar.DW.DW(zzasiVar.zh.packageName);
        vq<String> vqVarJ62 = kiVar.gn.j6(zzasiVar.AL, zzasiVar.zh);
        Future<ui> futureDW = com.google.android.gms.ads.internal.w0.QX().DW(context);
        vq<Location> vqVarJ02 = jq.J0(null);
        Bundle bundle2 = zzasiVar.jw.jw;
        boolean z = (bundle2 == null || bundle2.getString("_ad") == null) ? false : true;
        if (zzasiVar.a5 && !z) {
            vqVarJ02 = kiVar.v5.j6(zzasiVar.k2);
        }
        vq<String> vqVar = vqVarJ0;
        vq vqVarJ63 = jq.j6(vqVarJ02, ((Long) cw0.v5().FH(p.pl)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        Future futureJ0 = jq.J0(null);
        if (((Boolean) cw0.v5().FH(p.WB)).booleanValue()) {
            futureJ0 = jq.j6(kiVar.gn.DW(context), ((Long) cw0.v5().FH(p.mb)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService);
        }
        Bundle bundle3 = (zzasiVar.WB < 4 || (bundle = zzasiVar.Q6) == null) ? null : bundle;
        com.google.android.gms.ads.internal.w0.v5();
        if (bn.Xa(context, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            xp.VH("Device is offline.");
        }
        String string2 = zzasiVar.WB >= 7 ? zzasiVar.sg : UUID.randomUUID().toString();
        Bundle bundle4 = zzasiVar.jw.jw;
        if (bundle4 != null && (string = bundle4.getString("_ad")) != null) {
            return qi.j6(context, zzasiVar, string);
        }
        List<String> listJ6 = kiVar.FH.j6(zzasiVar.pO);
        String str = string2;
        Bundle bundle5 = (Bundle) jq.Zo(vqVarJ6, null, ((Long) cw0.v5().FH(p.N0)).longValue(), TimeUnit.MILLISECONDS);
        Location location = (Location) jq.v5(vqVarJ63, null);
        AdvertisingIdClient.a aVar = (AdvertisingIdClient.a) jq.v5(futureJ0, null);
        String str2 = (String) jq.v5(vqVarJ62, null);
        String str3 = (String) jq.v5(vqVar, null);
        String str4 = (String) jq.v5(vqVarDW, null);
        ui uiVar = (ui) jq.v5(futureDW, null);
        if (uiVar == null) {
            xp.u7("Error fetching device info. This is not recoverable.");
            return new zzasm(0);
        }
        ji jiVar = new ji();
        jiVar.u7 = zzasiVar;
        jiVar.tp = uiVar;
        jiVar.Hw = location;
        jiVar.DW = bundle5;
        jiVar.VH = str2;
        jiVar.gn = aVar;
        if (listJ6 == null) {
            jiVar.FH.clear();
        }
        jiVar.FH = listJ6;
        jiVar.j6 = bundle3;
        jiVar.v5 = str3;
        jiVar.Zo = str4;
        jiVar.EQ = kiVar.j6.j6(context);
        jiVar.we = kiVar.u7;
        JSONObject jSONObjectFH = qi.FH(context, jiVar);
        if (jSONObjectFH == null) {
            return new zzasm(0);
        }
        if (zzasiVar.WB < 7) {
            try {
                jSONObjectFH.put("request_id", str);
            } catch (JSONException unused) {
            }
        }
        d0Var.DW(a0VarVH, "arc");
        vq vqVarJ64 = jq.j6(jq.DW(kiVar.tp.DW().DW(jSONObjectFH), mi.j6, scheduledExecutorService), 10L, TimeUnit.SECONDS, scheduledExecutorService);
        vq<Void> vqVarJ65 = kiVar.Hw.j6();
        if (vqVarJ65 != null) {
            hq.j6(vqVarJ65, "AdRequestServiceImpl.loadAd.flags");
        }
        ti tiVar = (ti) jq.v5(vqVarJ64, null);
        if (tiVar == null) {
            return new zzasm(0);
        }
        if (tiVar.j6() != -2) {
            return new zzasm(tiVar.j6());
        }
        d0Var.tp();
        zzasm zzasmVarJ6 = !TextUtils.isEmpty(tiVar.Zo()) ? qi.j6(context, zzasiVar, tiVar.Zo()) : null;
        if (zzasmVarJ6 == null && !TextUtils.isEmpty(tiVar.DW())) {
            zzasmVarJ6 = k6(zzasiVar, context, zzasiVar.cT.WB, tiVar.DW(), str3, str4, tiVar, d0Var, kiVar);
        }
        if (zzasmVarJ6 == null) {
            c = 0;
            zzasmVarJ6 = new zzasm(0);
        } else {
            c = 0;
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        d0Var.DW(a0VarVH, strArr);
        zzasmVarJ6.Cz = d0Var.gn();
        zzasmVarJ6.b1 = tiVar.gn();
        return zzasmVarJ6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a0, code lost:
    
        r1 = new java.lang.StringBuilder(46);
        r1.append("Received error HTTP response code: ");
        r1.append(r10);
        com.google.android.gms.internal.ads.xp.u7(r1.toString());
        r0 = new com.google.android.gms.internal.ads.zzasm(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ba, code lost:
    
        r12.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bd, code lost:
    
        if (r25 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        r25.Zo.j6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c4, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x01c5, TryCatch #3 {all -> 0x01c5, blocks: (B:14:0x0051, B:16:0x0062, B:18:0x0068, B:20:0x0072, B:22:0x0078, B:25:0x0084, B:27:0x008c, B:30:0x0099, B:32:0x00a3, B:35:0x00be, B:43:0x00cb, B:46:0x00e8, B:49:0x00fc, B:51:0x010a, B:52:0x0115, B:61:0x0129, B:62:0x012c, B:63:0x012d, B:67:0x013b, B:69:0x0147, B:74:0x015d, B:76:0x0176, B:81:0x018c, B:87:0x01a0, B:40:0x00c6, B:41:0x00c9), top: B:110:0x0051, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzasm k6(com.google.android.gms.internal.ads.zzasi r17, android.content.Context r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.ads.ti r23, com.google.android.gms.internal.ads.d0 r24, com.google.android.gms.internal.ads.ki r25) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.li.k6(com.google.android.gms.internal.ads.zzasi, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.ti, com.google.android.gms.internal.ads.d0, com.google.android.gms.internal.ads.ki):com.google.android.gms.internal.ads.zzasm");
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void dd(zzatb zzatbVar, th thVar) {
        sm.we("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void pT(zzatb zzatbVar, th thVar) {
        sm.we("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final void x(zzasi zzasiVar, qh qhVar) {
        com.google.android.gms.ads.internal.w0.u7().we(this.WB, zzasiVar.cT);
        vq<?> vqVarDW = zm.DW(new ni(this, zzasiVar, qhVar));
        com.google.android.gms.ads.internal.w0.U2().DW();
        com.google.android.gms.ads.internal.w0.U2().j6().postDelayed(new oi(this, vqVarDW), 60000L);
    }

    @Override // com.google.android.gms.internal.ads.nh
    public final zzasm xm(zzasi zzasiVar) {
        return Mt(this.WB, this.mb, zzasiVar, this.jw);
    }
}
