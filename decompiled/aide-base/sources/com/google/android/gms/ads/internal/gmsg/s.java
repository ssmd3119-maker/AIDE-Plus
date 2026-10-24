package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.xp;
import java.util.Map;

/* loaded from: classes.dex */
public final class s implements b0<cv> {
    s() {
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final /* synthetic */ void zza(cv cvVar, Map map) {
        cv cvVar2 = cvVar;
        com.google.android.gms.ads.internal.overlay.c cVarJu = cvVar2.ju();
        if (cVarJu != null) {
            cVarJu.k6();
            return;
        }
        com.google.android.gms.ads.internal.overlay.c cVarFh = cvVar2.fh();
        if (cVarFh != null) {
            cVarFh.k6();
        } else {
            xp.u7("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
