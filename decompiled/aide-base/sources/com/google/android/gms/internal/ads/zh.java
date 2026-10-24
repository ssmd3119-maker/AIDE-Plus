package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

@jg
/* loaded from: classes.dex */
public final class zh extends om {
    private k8 AL;
    private final lg fY;
    private final Object k2;
    private final ih qp;
    private zzur w9;
    private final Context zh;
    private static final long hK = TimeUnit.SECONDS.toMillis(10);
    private static final Object cT = new Object();

    @GuardedBy("sLock")
    private static boolean q7 = false;
    private static u7 Z1 = null;
    private static HttpClient n5 = null;
    private static com.google.android.gms.ads.internal.gmsg.g0 Q6 = null;
    private static com.google.android.gms.ads.internal.gmsg.b0<Object> kf = null;

    public zh(Context context, ih ihVar, lg lgVar, zzur zzurVar) {
        super(true);
        this.k2 = new Object();
        this.fY = lgVar;
        this.zh = context;
        this.qp = ihVar;
        this.w9 = zzurVar;
        synchronized (cT) {
            if (!q7) {
                Q6 = new com.google.android.gms.ads.internal.gmsg.g0();
                n5 = new HttpClient(context.getApplicationContext(), ihVar.tp);
                kf = new hi();
                Z1 = new u7(this.zh.getApplicationContext(), this.qp.tp, (String) cw0.v5().FH(p.j6), new gi(), new fi());
                q7 = true;
            }
        }
    }

    private final zzasm J8(zzasi zzasiVar) throws ExecutionException, InterruptedException, TimeoutException {
        com.google.android.gms.ads.internal.w0.v5();
        String strWB = bn.WB();
        JSONObject jSONObjectWe = we(zzasiVar, strWB);
        if (jSONObjectWe == null) {
            return new zzasm(0);
        }
        long jDW = com.google.android.gms.ads.internal.w0.we().DW();
        Future<JSONObject> futureJ6 = Q6.j6(strWB);
        mp.j6.post(new bi(this, jSONObjectWe, strWB));
        try {
            JSONObject jSONObject = futureJ6.get(hK - (com.google.android.gms.ads.internal.w0.we().DW() - jDW), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzasm(-1);
            }
            zzasm zzasmVarJ6 = qi.j6(this.zh, zzasiVar, jSONObject.toString());
            return (zzasmVarJ6.k2 == -3 || !TextUtils.isEmpty(zzasmVarJ6.fY)) ? zzasmVarJ6 : new zzasm(3);
        } catch (InterruptedException | CancellationException unused) {
            return new zzasm(-1);
        } catch (ExecutionException unused2) {
            return new zzasm(0);
        } catch (TimeoutException unused3) {
            return new zzasm(2);
        }
    }

    protected static void QX(j7 j7Var) {
        j7Var.g3("/loadAd", Q6);
        j7Var.g3("/fetchHttpRequest", n5);
        j7Var.g3("/invalidRequest", kf);
    }

    protected static void Ws(j7 j7Var) {
        j7Var.sh("/loadAd", Q6);
        j7Var.sh("/fetchHttpRequest", n5);
        j7Var.sh("/invalidRequest", kf);
    }

    private final JSONObject we(zzasi zzasiVar, String str) throws ExecutionException, InterruptedException {
        ui uiVar;
        AdvertisingIdClient.a aVarDW;
        Bundle bundle = zzasiVar.jw.jw.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            uiVar = com.google.android.gms.ads.internal.w0.QX().DW(this.zh).get();
        } catch (Exception e) {
            xp.v5("Error grabbing device info: ", e);
            uiVar = null;
        }
        Context context = this.zh;
        ji jiVar = new ji();
        jiVar.u7 = zzasiVar;
        jiVar.tp = uiVar;
        JSONObject jSONObjectFH = qi.FH(context, jiVar);
        if (jSONObjectFH == null) {
            return null;
        }
        try {
            aVarDW = AdvertisingIdClient.DW(this.zh);
        } catch (com.google.android.gms.common.d | com.google.android.gms.common.e | IOException | IllegalStateException e2) {
            xp.v5("Cannot get advertising id info", e2);
            aVarDW = null;
        }
        HashMap map = new HashMap();
        map.put("request_id", str);
        map.put("request_param", jSONObjectFH);
        map.put("data", bundle);
        if (aVarDW != null) {
            map.put("adid", aVarDW.j6());
            map.put("lat", Integer.valueOf(aVarDW.DW() ? 1 : 0));
        }
        try {
            return com.google.android.gms.ads.internal.w0.v5().CU(map);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() throws ExecutionException, IllegalAccessException, InterruptedException, NoSuchMethodException, TimeoutException, SecurityException, IllegalArgumentException, InvocationTargetException {
        xp.VH("SdkLessAdLoaderBackgroundTask started.");
        String strEr = com.google.android.gms.ads.internal.w0.ei().er(this.zh);
        zzasi zzasiVar = new zzasi(this.qp, -1L, com.google.android.gms.ads.internal.w0.ei().lg(this.zh), com.google.android.gms.ads.internal.w0.ei().rN(this.zh), strEr, com.google.android.gms.ads.internal.w0.ei().Zo(this.zh));
        zzasm zzasmVarJ8 = J8(zzasiVar);
        int i = zzasmVarJ8.k2;
        if ((i == -2 || i == 3) && !TextUtils.isEmpty(strEr)) {
            com.google.android.gms.ads.internal.w0.ei().XL(this.zh, strEr);
        }
        mp.j6.post(new ai(this, new zl(zzasiVar, zzasmVarJ8, null, null, zzasmVarJ8.k2, com.google.android.gms.ads.internal.w0.we().DW(), zzasmVarJ8.Q6, null, this.w9)));
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
        synchronized (this.k2) {
            mp.j6.post(new ei(this));
        }
    }
}
