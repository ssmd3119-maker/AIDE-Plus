package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class nd extends zd0 implements ld {
    nd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Ae() {
        g3(7, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Dv() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void Hn(abcd.wu wuVar) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, wuVar);
        g3(13, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void PU(Bundle bundle) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, bundle);
        Parcel parcelDx = dx(6, parcelSh);
        if (parcelDx.readInt() != 0) {
            bundle.readFromParcel(parcelDx);
        }
        parcelDx.recycle();
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void b1() {
        g3(3, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void cc(int i, int i2, Intent intent) {
        abcd.iy.v5(this, i, i2, intent);
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        parcelSh.writeInt(i2);
        be0.Hw(parcelSh, intent);
        g3(12, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void fp() {
        g3(9, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void hw(Bundle bundle) {
        Parcel parcelSh = sh();
        be0.Hw(parcelSh, bundle);
        g3(1, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onDestroy() {
        g3(8, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onPause() {
        g3(5, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void onResume() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final void op() {
        g3(10, sh());
    }

    @Override // com.google.android.gms.internal.ads.ld
    public final boolean qG() {
        Parcel parcelDx = dx(11, sh());
        boolean zV5 = be0.v5(parcelDx);
        parcelDx.recycle();
        return zV5;
    }
}
