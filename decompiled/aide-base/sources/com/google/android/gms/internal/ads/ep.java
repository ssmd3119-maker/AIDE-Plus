package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class ep {
    public static boolean j6(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
        return bundle2 != null && bundle2.getBoolean("render_test_ad_label", false);
    }
}
