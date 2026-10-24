package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class w implements c.b {
    private final /* synthetic */ com.google.android.gms.common.api.g WB;

    w(com.google.android.gms.common.api.g gVar) {
        this.WB = gVar;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.WB.onConnectionFailed(connectionResult);
    }
}
