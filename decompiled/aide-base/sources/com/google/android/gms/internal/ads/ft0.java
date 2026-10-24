package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ft0 extends zd0 implements et0 {
    ft0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.et0
    public final zztv Wy(zzty zztyVar) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, zztyVar);
        Parcel parcelDx = dx(1, parcelSh);
        zztv zztvVar = (zztv) be0.DW(parcelDx, zztv.CREATOR);
        parcelDx.recycle();
        return zztvVar;
    }
}
