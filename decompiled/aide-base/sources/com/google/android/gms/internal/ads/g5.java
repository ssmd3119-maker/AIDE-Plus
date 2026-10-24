package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g5 extends zd0 implements e5 {
    g5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.e5
    public final void jU(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.e5
    public final void ra(a5 a5Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, a5Var);
        g3(1, parcelSh);
    }
}
