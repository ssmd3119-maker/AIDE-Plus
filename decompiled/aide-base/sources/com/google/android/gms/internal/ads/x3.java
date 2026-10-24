package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class x3 extends zd0 implements v3 {
    x3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.v3
    public final void k5(a4 a4Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, a4Var);
        g3(1, parcelSh);
    }
}
