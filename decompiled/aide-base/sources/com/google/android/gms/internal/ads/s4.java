package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class s4 extends zd0 implements r4 {
    s4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.r4
    public final void Y1(zzafl zzaflVar, p4 p4Var) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zzaflVar);
        be0.FH(parcelSh, p4Var);
        sy(2, parcelSh);
    }
}
