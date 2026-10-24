package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class nj extends zd0 implements lj {
    nj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final String j6() {
        Parcel parcelDx = dx(1, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final int zh() {
        Parcel parcelDx = dx(2, sh());
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }
}
