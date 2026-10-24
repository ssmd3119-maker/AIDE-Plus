package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i3 extends zd0 implements g3 {
    i3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.g3
    public final void ms(t2 t2Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, t2Var);
        g3(1, parcelSh);
    }
}
