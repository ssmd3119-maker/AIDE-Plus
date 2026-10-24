package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0 implements com.google.android.gms.ads.internal.gmsg.b0<Object> {
    private final /* synthetic */ q0 j6;

    r0(q0 q0Var) {
        this.j6 = q0Var;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.b0
    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.j6.qp = Long.valueOf(Long.parseLong(map.get(AppMeasurement.Param.TIMESTAMP)));
        } catch (NumberFormatException unused) {
            xp.j6("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.j6.fY = map.get("id");
        String str = map.get("asset_id");
        if (this.j6.mb == null) {
            xp.VH("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.j6.mb.bc(str);
        } catch (RemoteException e) {
            xp.Zo("#007 Could not call remote method.", e);
        }
    }
}
