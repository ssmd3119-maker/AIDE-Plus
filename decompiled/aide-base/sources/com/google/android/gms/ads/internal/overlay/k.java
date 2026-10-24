package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.w0;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.jg;

@jg
/* loaded from: classes.dex */
public final class k {
    public static void j6(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.cT == 4 && adOverlayInfoParcel.jw == null) {
            hv0 hv0Var = adOverlayInfoParcel.mb;
            if (hv0Var != null) {
                hv0Var.EQ();
            }
            w0.DW();
            a.DW(context, adOverlayInfoParcel.WB, adOverlayInfoParcel.w9);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.Z1.fY);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.gn(intent, adOverlayInfoParcel);
        if (!com.google.android.gms.common.util.o.gn()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        w0.v5();
        bn.EQ(context, intent);
    }
}
