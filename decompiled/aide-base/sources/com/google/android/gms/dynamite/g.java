package com.google.android.gms.dynamite;

import abcd.kv;
import abcd.mv;
import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends kv implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.f
    public final wu Ed(wu wuVar, String str, int i) {
        Parcel parcelSh = sh();
        mv.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(2, parcelSh);
        wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.dynamite.f
    public final int Sp(wu wuVar, String str, boolean z) {
        Parcel parcelSh = sh();
        mv.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        mv.j6(parcelSh, z);
        Parcel parcelDx = dx(5, parcelSh);
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.f
    public final int UQ(wu wuVar, String str, boolean z) {
        Parcel parcelSh = sh();
        mv.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        mv.j6(parcelSh, z);
        Parcel parcelDx = dx(3, parcelSh);
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.f
    public final int cv() {
        Parcel parcelDx = dx(6, sh());
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }

    @Override // com.google.android.gms.dynamite.f
    public final wu pB(wu wuVar, String str, int i) {
        Parcel parcelSh = sh();
        mv.FH(parcelSh, wuVar);
        parcelSh.writeString(str);
        parcelSh.writeInt(i);
        Parcel parcelDx = dx(4, parcelSh);
        wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }
}
