package com.google.android.gms.internal.ads;

import abcd.wu;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d3 extends zd0 implements b3 {
    d3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final abcd.wu IP() {
        Parcel parcelDx = dx(9, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final String NH(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        Parcel parcelDx = dx(1, parcelSh);
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final f2 NY(String str) {
        f2 h2Var;
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        Parcel parcelDx = dx(2, parcelSh);
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            h2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            h2Var = iInterfaceQueryLocalInterface instanceof f2 ? (f2) iInterfaceQueryLocalInterface : new h2(strongBinder);
        }
        parcelDx.recycle();
        return h2Var;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final abcd.wu QX() {
        Parcel parcelDx = dx(11, sh());
        abcd.wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void VH() {
        g3(6, sh());
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void destroy() {
        g3(8, sh());
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final yx0 getVideoController() {
        Parcel parcelDx = dx(7, sh());
        yx0 yx0VarMt = zx0.Mt(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return yx0VarMt;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final void hr(String str) {
        Parcel parcelSh = sh();
        parcelSh.writeString(str);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final boolean mT(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        Parcel parcelDx = dx(10, parcelSh);
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final List<String> n3() {
        Parcel parcelDx = dx(3, sh());
        ArrayList<String> arrayListCreateStringArrayList = parcelDx.createStringArrayList();
        parcelDx.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final String vy() {
        Parcel parcelDx = dx(4, sh());
        String string = parcelDx.readString();
        parcelDx.recycle();
        return string;
    }
}
