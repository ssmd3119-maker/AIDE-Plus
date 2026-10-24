package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.jg;
import com.google.android.gms.internal.ads.sm;

@jg
/* loaded from: classes.dex */
public final class q extends c {
    public q(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.c, com.google.android.gms.internal.ads.ld
    public final void hw(Bundle bundle) {
        sm.we("AdOverlayParcel is null or does not contain valid overlay type.");
        this.Z1 = 3;
        this.WB.finish();
    }
}
