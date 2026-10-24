package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.xp;
import java.util.Map;

/* loaded from: classes.dex */
public final class u implements b0<Object> {
    u() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        String strValueOf = String.valueOf(map.get("string"));
        xp.gn(strValueOf.length() != 0 ? "Received log message: ".concat(strValueOf) : new String("Received log message: "));
    }
}
