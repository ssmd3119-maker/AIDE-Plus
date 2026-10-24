package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class dy0 extends zd0 implements by0 {
    dy0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.by0
    public final void Ej(boolean z) {
        Parcel parcelSh = sh();
        be0.j6(parcelSh, z);
        g3(5, parcelSh);
    }

    @Override // com.google.android.gms.internal.ads.by0
    public final void id() {
        g3(1, sh());
    }

    @Override // com.google.android.gms.internal.ads.by0
    public final void qZ() {
        g3(2, sh());
    }

    @Override // com.google.android.gms.internal.ads.by0
    public final void w9() {
        g3(4, sh());
    }

    @Override // com.google.android.gms.internal.ads.by0
    public final void yO() {
        g3(3, sh());
    }
}
