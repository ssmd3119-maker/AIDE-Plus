package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ac extends zd0 implements zb {
    ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void gW(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(2, parcelSh);
    }
}
