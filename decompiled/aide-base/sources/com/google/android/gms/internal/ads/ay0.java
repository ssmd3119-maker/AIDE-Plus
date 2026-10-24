package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ay0 extends zd0 implements yx0 {
    ay0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final boolean Ak() {
        Parcel parcelDx = dx(12, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final boolean BO() {
        Parcel parcelDx = dx(10, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void Mr() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void Sg(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(3, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final float Z3() {
        Parcel parcelDx = dx(6, sh());
        float f = parcelDx.readFloat();
        parcelDx.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final boolean fd() {
        Parcel parcelDx = dx(4, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final float hx() {
        Parcel parcelDx = dx(7, sh());
        float f = parcelDx.readFloat();
        parcelDx.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final int kf() {
        Parcel parcelDx = dx(5, sh());
        int i = parcelDx.readInt();
        parcelDx.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final by0 pj() {
        by0 dy0Var;
        Parcel parcelDx = dx(11, sh());
        IBinder strongBinder = parcelDx.readStrongBinder();
        if (strongBinder == null) {
            dy0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            dy0Var = iInterfaceQueryLocalInterface instanceof by0 ? (by0) iInterfaceQueryLocalInterface : new dy0(strongBinder);
        }
        parcelDx.recycle();
        return dy0Var;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void sv(by0 by0Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, by0Var);
        g3(8, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final float ti() {
        Parcel parcelDx = dx(9, sh());
        float f = parcelDx.readFloat();
        parcelDx.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.yx0
    public final void yb() {
        g3(1, sh());
    }
}
