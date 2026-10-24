package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.cv;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements b0<cv> {
    x() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        cv cvVar2 = cvVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            cvVar2.rk();
        } else if ("resume".equals(str)) {
            cvVar2.O1();
        }
    }
}
