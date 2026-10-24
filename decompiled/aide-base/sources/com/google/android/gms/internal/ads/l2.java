package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class l2 extends zd0 implements j2 {
    l2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void St(String str, abcd.wu wuVar) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        be0.FH(parcelSh, wuVar);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void TG(abcd.wu wuVar, int i) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        parcelSh.writeInt(i);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void Za(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(6, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void aX(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final void destroy() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.j2
    public final abcd.wu ik(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        Parcel parcelDx = dx(2, parcelSh);
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }
}
