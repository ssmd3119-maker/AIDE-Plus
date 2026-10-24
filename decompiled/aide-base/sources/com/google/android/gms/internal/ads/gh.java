package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.c;

@jg
/* loaded from: classes.dex */
public final class gh extends ch implements c.a, c.b {
    private final ah AL;
    private Context fY;
    private hh hK;
    private hr<zzasi> k2;
    private zzbbi qp;
    private final Object w9;
    private wn zh;

    public gh(Context context, zzbbi zzbbiVar, hr<zzasi> hrVar, ah ahVar) {
        super(hrVar, ahVar);
        this.w9 = new Object();
        this.fY = context;
        this.qp = zzbbiVar;
        this.k2 = hrVar;
        this.AL = ahVar;
        hh hhVar = new hh(context, com.google.android.gms.ads.internal.w0.U2().DW(), this, this);
        this.hK = hhVar;
        hhVar.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final void DW() {
        synchronized (this.w9) {
            if (this.hK.isConnected() || this.hK.isConnecting()) {
                this.hK.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.internal.ads.ch
    public final nh FH() {
        nh nhVarHw;
        synchronized (this.w9) {
            try {
                try {
                    nhVarHw = this.hK.Hw();
                } catch (DeadObjectException | IllegalStateException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return nhVarHw;
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnected(Bundle bundle) {
        VH();
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        xp.VH("Cannot connect to remote service, fallback to local instance.");
        fh fhVar = new fh(this.fY, this.k2, this.AL);
        this.zh = fhVar;
        fhVar.VH();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        com.google.android.gms.ads.internal.w0.v5().g3(this.fY, this.qp.WB, "gmob-apps", bundle, true);
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void onConnectionSuspended(int i) {
        xp.VH("Disconnected from remote ad request service.");
    }
}
