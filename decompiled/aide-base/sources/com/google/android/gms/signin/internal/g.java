package com.google.android.gms.signin.internal;

import abcd.fv;
import abcd.hv;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends fv implements f {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.signin.internal.f
    public final void y6(zah zahVar, d dVar) {
        Parcel parcelSh = sh();
        hv.FH(parcelSh, zahVar);
        hv.DW(parcelSh, dVar);
        g3(12, parcelSh);
    }
}
