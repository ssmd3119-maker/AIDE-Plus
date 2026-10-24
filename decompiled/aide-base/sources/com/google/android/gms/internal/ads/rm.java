package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* loaded from: classes.dex */
public final class rm extends om {
    private Context fY;

    rm(Context context) {
        this.fY = context;
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        boolean zHw;
        try {
            zHw = AdvertisingIdClient.Hw(this.fY);
        } catch (com.google.android.gms.common.d | com.google.android.gms.common.e | IOException | IllegalStateException e) {
            xp.Hw("Fail to get isAdIdFakeForDebugLogging", e);
            zHw = false;
        }
        qp.J8(zHw);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(zHw);
        xp.u7(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }
}
