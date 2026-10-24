package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lw0 extends zd0 implements jw0 {
    lw0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void EQ() {
        g3(6, sh());
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void Gj(int i) {
        Parcel parcelSh = sh();
        parcelSh.writeInt(i);
        g3(2, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void fN() {
        g3(1, sh());
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void hK() {
        g3(7, sh());
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void k2() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void ko() {
        g3(5, sh());
    }

    @Override // com.google.android.gms.internal.ads.jw0
    public final void mb() {
        g3(3, sh());
    }
}
