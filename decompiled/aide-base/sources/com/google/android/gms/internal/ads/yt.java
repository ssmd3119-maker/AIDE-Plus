package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;

@jg
/* loaded from: classes.dex */
public final class yt implements mu {
    @Override // com.google.android.gms.internal.ads.mu
    public final fu j6(ss ssVar, int i, String str, rs rsVar) {
        if (Build.VERSION.SDK_INT < 16 || i <= 0 || !Arrays.asList(rsVar.v5.split(",")).contains("3")) {
            return new nu(ssVar);
        }
        int iBT = mt.BT();
        return iBT < rsVar.gn ? new ru(ssVar, rsVar) : iBT < rsVar.DW ? new qu(ssVar, rsVar) : new ou(ssVar);
    }
}
