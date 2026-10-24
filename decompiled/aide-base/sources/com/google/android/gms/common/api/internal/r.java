package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import java.util.Collections;

/* loaded from: classes.dex */
public final class r implements Runnable {
    private final /* synthetic */ ConnectionResult WB;
    private final /* synthetic */ b.c mb;

    r(b.c cVar, ConnectionResult connectionResult) {
        this.mb = cVar;
        this.WB = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.WB.QX()) {
            ((b.a) b.this.AL.get(this.mb.DW)).onConnectionFailed(this.WB);
            return;
        }
        b.c.v5(this.mb, true);
        if (this.mb.j6.requiresSignIn()) {
            this.mb.VH();
            return;
        }
        try {
            this.mb.j6.getRemoteService(null, Collections.emptySet());
        } catch (SecurityException unused) {
            ((b.a) b.this.AL.get(this.mb.DW)).onConnectionFailed(new ConnectionResult(10));
        }
    }
}
