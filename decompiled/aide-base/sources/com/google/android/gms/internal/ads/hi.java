package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class hi implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("request_id");
        String strValueOf = String.valueOf(map.get("errors"));
        xp.u7(strValueOf.length() != 0 ? "Invalid request: ".concat(strValueOf) : new String("Invalid request: "));
        zh.Q6.DW(str);
    }
}
