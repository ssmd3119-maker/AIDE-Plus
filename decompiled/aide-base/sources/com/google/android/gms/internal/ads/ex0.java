package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ex0 extends zd0 implements cx0 {
    ex0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.cx0
    public final void U2(String str, String str2) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        parcelSh.writeString(str2);
        g3(1, parcelSh);
    }
}
