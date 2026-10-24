package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d5 extends zd0 implements c5 {
    d5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.c5
    public final void np() {
        g3(1, sh());
    }

    @Override // com.google.android.gms.internal.ads.c5
    public final void pK(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(2, parcelSh);
    }
}
