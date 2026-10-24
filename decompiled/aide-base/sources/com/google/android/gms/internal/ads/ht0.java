package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class ht0 {

    @GuardedBy("mLock")
    private boolean DW;
    private final Context FH;
    private final Object Hw = new Object();

    @GuardedBy("mLock")
    private at0 j6;

    ht0(Context context) {
        this.FH = context;
    }

    static /* synthetic */ boolean FH(ht0 ht0Var, boolean z) {
        ht0Var.DW = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j6() {
        synchronized (this.Hw) {
            if (this.j6 == null) {
                return;
            }
            this.j6.disconnect();
            this.j6 = null;
            Binder.flushPendingCommands();
        }
    }

    final Future<InputStream> v5(zzty zztyVar) {
        it0 it0Var = new it0(this);
        jt0 jt0Var = new jt0(this, zztyVar, it0Var);
        nt0 nt0Var = new nt0(this, it0Var);
        synchronized (this.Hw) {
            at0 at0Var = new at0(this.FH, com.google.android.gms.ads.internal.w0.U2().DW(), jt0Var, nt0Var);
            this.j6 = at0Var;
            at0Var.checkAvailabilityAndConnect();
        }
        return it0Var;
    }
}
