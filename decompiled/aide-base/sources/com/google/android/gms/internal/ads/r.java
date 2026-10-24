package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@jg
/* loaded from: classes.dex */
public final class r {
    private Map<String, String> DW;
    private Context FH;
    private String Hw;
    private String j6 = (String) cw0.v5().FH(p.cb);

    public r(Context context, String str) throws ExecutionException, InterruptedException {
        this.FH = null;
        this.Hw = null;
        this.FH = context;
        this.Hw = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.DW = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.DW.put("v", "3");
        this.DW.put("os", Build.VERSION.RELEASE);
        this.DW.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.DW;
        com.google.android.gms.ads.internal.w0.v5();
        map.put("device", bn.mb());
        this.DW.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.DW;
        com.google.android.gms.ads.internal.w0.v5();
        map2.put("is_lite_sdk", bn.dx(context) ? "1" : "0");
        Future<ui> futureDW = com.google.android.gms.ads.internal.w0.QX().DW(this.FH);
        try {
            futureDW.get();
            this.DW.put("network_coarse", Integer.toString(futureDW.get().Ws));
            this.DW.put("network_fine", Integer.toString(futureDW.get().QX));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    final String DW() {
        return this.Hw;
    }

    final String FH() {
        return this.j6;
    }

    final Map<String, String> Hw() {
        return this.DW;
    }

    final Context j6() {
        return this.FH;
    }
}
