package com.google.android.gms.dynamite;

import abcd.kv;
import abcd.mv;
import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i extends kv implements h {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.h
    public final wu S4(wu wuVar, String str, int i, wu wuVar2) {
        Parcel parcelSh = sh();
        mv.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        parcelSh.writeInt(i);
        mv.FH(parcelSh, wuVar2);
        Parcel parcelDx = dx(2, parcelSh);
        wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.dynamite.h
    public final wu tR(wu wuVar, String str, int i, wu wuVar2) {
        Parcel parcelSh = sh();
        mv.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        parcelSh.writeInt(i);
        mv.FH(parcelSh, wuVar2);
        Parcel parcelDx = dx(3, parcelSh);
        wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }
}
