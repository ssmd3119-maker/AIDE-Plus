package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class j implements b0<Object> {
    private final k j6;

    public j(k kVar) {
        this.j6 = kVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            xp.u7("App event with no name parameter.");
        } else {
            this.j6.U2(str, map.get("info"));
        }
    }
}
