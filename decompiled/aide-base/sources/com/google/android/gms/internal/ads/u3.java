package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u3 extends zd0 implements s3 {
    u3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.s3
    public final void ME(uw0 uw0Var, abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, uw0Var);
        be0.FH(parcelSh, wuVar);
        g3(1, parcelSh);
    }
}
