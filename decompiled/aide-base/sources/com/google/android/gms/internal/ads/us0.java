package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class us0 {

    @GuardedBy("mLock")
    private at0 FH;

    @GuardedBy("mLock")
    private Context Hw;

    @GuardedBy("mLock")
    private et0 v5;
    private final Runnable j6 = new vs0(this);
    private final Object DW = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public final void DW() {
        synchronized (this.DW) {
            if (this.FH == null) {
                return;
            }
            if (this.FH.isConnected() || this.FH.isConnecting()) {
                this.FH.disconnect();
            }
            this.FH = null;
            this.v5 = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j6() {
        synchronized (this.DW) {
            if (this.Hw != null && this.FH == null) {
                at0 at0Var = new at0(this.Hw, com.google.android.gms.ads.internal.w0.U2().DW(), new xs0(this), new ys0(this));
                this.FH = at0Var;
                at0Var.checkAvailabilityAndConnect();
            }
        }
    }

    static /* synthetic */ at0 v5(us0 us0Var, at0 at0Var) {
        us0Var.FH = null;
        return null;
    }

    public final void EQ() {
        if (((Boolean) cw0.v5().FH(p.b)).booleanValue()) {
            synchronized (this.DW) {
                j6();
                com.google.android.gms.ads.internal.w0.v5();
                bn.gn.removeCallbacks(this.j6);
                com.google.android.gms.ads.internal.w0.v5();
                bn.gn.postDelayed(this.j6, ((Long) cw0.v5().FH(p.ba)).longValue());
            }
        }
    }

    public final void FH(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.DW) {
            if (this.Hw != null) {
                return;
            }
            this.Hw = context.getApplicationContext();
            if (((Boolean) cw0.v5().FH(p.fP)).booleanValue()) {
                j6();
            } else {
                if (((Boolean) cw0.v5().FH(p.zf)).booleanValue()) {
                    com.google.android.gms.ads.internal.w0.gn().Hw(new ws0(this));
                }
            }
        }
    }

    public final zztv Hw(zzty zztyVar) {
        synchronized (this.DW) {
            if (this.v5 == null) {
                return new zztv();
            }
            try {
                return this.v5.Wy(zztyVar);
            } catch (RemoteException e) {
                xp.Hw("Unable to call into cache service.", e);
                return new zztv();
            }
        }
    }
}
