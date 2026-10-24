package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class r3 extends zd0 implements p3 {
    r3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.p3
    public final void Fz(b3 b3Var) {
        Parcel parcelSh = sh();
        be0.FH(parcelSh, b3Var);
        g3(1, parcelSh);
    }
}
