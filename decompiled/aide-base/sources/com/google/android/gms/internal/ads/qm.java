package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class qm {
    public static void j6(Context context) {
        if (qp.XL(context) && !qp.J0()) {
            vq vqVar = (vq) new rm(context).VH();
            xp.gn("Updating ad debug logging enablement.");
            hq.j6(vqVar, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
