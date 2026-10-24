package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.c;

/* loaded from: classes.dex */
public final class v implements c.a {
    private final /* synthetic */ com.google.android.gms.common.api.f WB;

    v(com.google.android.gms.common.api.f fVar) {
        this.WB = fVar;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        this.WB.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        this.WB.onConnectionSuspended(i);
    }
}
