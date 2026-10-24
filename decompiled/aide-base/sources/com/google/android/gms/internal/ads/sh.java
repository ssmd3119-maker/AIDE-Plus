package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class sh extends zd0 implements qh {
    sh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final void e9(zzasm zzasmVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzasmVar);
        g3(1, parcelSh);
    }
}
