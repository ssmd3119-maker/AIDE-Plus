package com.google.android.gms.common.internal;

import abcd.kv;
import abcd.mv;
import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzk;

/* loaded from: classes.dex */
public final class n0 extends kv implements l0 {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.l0
    public final boolean mu(zzk zzkVar, wu wuVar) {
        Parcel parcelSh = sh();
        mv.Hw(parcelSh, zzkVar);
        mv.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(5, parcelSh);
        boolean zV5 = mv.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }
}
