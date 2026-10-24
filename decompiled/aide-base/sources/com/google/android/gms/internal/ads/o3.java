package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class o3 extends zd0 implements m3 {
    o3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.m3
    public final void lp(b3 b3Var, String str) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, b3Var);
        parcelSh.writeString(str);
        g3(1, parcelSh);
    }
}
