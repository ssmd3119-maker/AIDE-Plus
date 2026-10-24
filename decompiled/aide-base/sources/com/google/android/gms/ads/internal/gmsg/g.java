package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.xp;
import com.google.android.gms.internal.ads.zzawd;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class g implements b0<Object> {
    private final h j6;

    public g(h hVar) {
        this.j6 = hVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) throws NumberFormatException {
        String str = map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.j6.Ve();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.j6.mj();
                    return;
                }
                return;
            }
        }
        zzawd zzawdVar = null;
        try {
            int i = Integer.parseInt(map.get("amount"));
            String str2 = map.get(AppMeasurement.Param.TYPE);
            if (!TextUtils.isEmpty(str2)) {
                zzawdVar = new zzawd(str2, i);
            }
        } catch (NumberFormatException e) {
            xp.v5("Unable to parse reward amount.", e);
        }
        this.j6.tv(zzawdVar);
    }
}
