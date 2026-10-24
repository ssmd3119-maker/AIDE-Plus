package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class z3 extends zd0 implements y3 {
    z3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void I1() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.y3
    public final void bc(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(1, parcelSh);
    }
}
