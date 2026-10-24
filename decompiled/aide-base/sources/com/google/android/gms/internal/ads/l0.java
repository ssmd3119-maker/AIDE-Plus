package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l0 extends zd0 implements j0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.j0
    public final void rI(g0 g0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, g0Var);
        g3(1, parcelSh);
    }
}
