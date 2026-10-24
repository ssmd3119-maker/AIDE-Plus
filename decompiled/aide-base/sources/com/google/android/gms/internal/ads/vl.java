package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@jg
/* loaded from: classes.dex */
public final class vl implements xl {
    @Override // com.google.android.gms.internal.ads.xl
    public final vq<AdvertisingIdClient.a> DW(Context context) {
        fr frVar = new fr();
        cw0.j6();
        if (mp.XL(context)) {
            zm.DW(new wl(this, context, frVar));
        }
        return frVar;
    }

    @Override // com.google.android.gms.internal.ads.xl
    public final vq<String> j6(String str, PackageInfo packageInfo) {
        return jq.J0(str);
    }
}
