package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;

@TargetApi(14)
/* loaded from: classes.dex */
public class on extends mn {
    @Override // com.google.android.gms.internal.ads.jn
    public int J8() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final String VH(SslError sslError) {
        return sslError.getUrl();
    }
}
