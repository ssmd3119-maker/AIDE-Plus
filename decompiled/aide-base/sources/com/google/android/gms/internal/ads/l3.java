package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l3 extends zd0 implements j3 {
    l3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.j3
    public final void TJ(x2 x2Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, x2Var);
        g3(1, parcelSh);
    }
}
