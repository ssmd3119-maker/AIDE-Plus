package com.google.android.gms.common.internal;

import abcd.kv;
import abcd.wu;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class k0 extends kv implements i0 {
    k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.i0
    public final int J8() {
        Parcel parcelDx = dx(2, sh());
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }

    @Override // com.google.android.gms.common.internal.i0
    public final wu Ob() {
        Parcel parcelDx = dx(1, sh());
        wu wuVarDx = wu.a.dx(parcelDx.readStrongBinder());
        parcelDx.recycle();
        return wuVarDx;
    }
}
