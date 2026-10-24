package com.google.android.gms.common.internal;

import abcd.fv;
import abcd.hv;
import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class x extends fv implements n {
    x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    @Override // com.google.android.gms.common.internal.n
    public final wu BP(wu wuVar, SignInButtonConfig signInButtonConfig) {
        Parcel parcelSh = sh();
        hv.DW(parcelSh, wuVar);
        hv.FH(parcelSh, signInButtonConfig);
        Parcel parcelDx = dx(2, parcelSh);
        wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }
}
