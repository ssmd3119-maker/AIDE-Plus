package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.cv;
import java.util.Map;

/* loaded from: classes.dex */
public final class y implements b0<cv> {
    y() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        cv cvVar2 = cvVar;
        if (map.keySet().contains("start")) {
            cvVar2.AF().tp();
        } else if (map.keySet().contains("stop")) {
            cvVar2.AF().J0();
        } else if (map.keySet().contains("cancel")) {
            cvVar2.AF().QX();
        }
    }
}
