package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class vx extends zd0 implements sx {
    vx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final boolean Qm(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(2, parcelSh);
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void gM(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(4, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void lZ(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(7, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final abcd.wu m8(String str, abcd.wu wuVar, String str2, String str3, String str4, String str5) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        be0.FH(parcelSh, wuVar);
        parcelSh.writeString(str2);
        parcelSh.writeString(str3);
        parcelSh.writeString(str4);
        parcelSh.writeString(str5);
        Parcel parcelDx = dx(9, parcelSh);
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final void nn(abcd.wu wuVar, abcd.wu wuVar2) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        be0.FH(parcelSh, wuVar2);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.sx
    public final String we() {
        Parcel parcelDx = dx(6, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
