package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class x4 implements c.b {
    private final /* synthetic */ fr WB;

    x4(zzaft zzaftVar, fr frVar) {
        this.WB = frVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.WB.Hw(new RuntimeException("Connection failed."));
    }
}
