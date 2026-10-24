package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class wx0 extends zd0 implements ux0 {
    wx0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.internal.ads.ux0
    public final String l6() {
        Parcel parcelDx = dx(1, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
