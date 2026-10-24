package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class wr0 {
    private final Object j6 = new Object();

    @GuardedBy("mActivityTrackerLock")
    private xr0 DW = null;

    @GuardedBy("mActivityTrackerLock")
    private boolean FH = false;

    public final Context DW() {
        synchronized (this.j6) {
            if (!com.google.android.gms.common.util.o.j6()) {
                return null;
            }
            if (this.DW == null) {
                return null;
            }
            return this.DW.DW();
        }
    }

    public final void FH(Context context) {
        synchronized (this.j6) {
            if (!this.FH) {
                if (!com.google.android.gms.common.util.o.j6()) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    xp.u7("Can not cast Context to Application");
                    return;
                }
                if (this.DW == null) {
                    this.DW = new xr0();
                }
                this.DW.v5(application, context);
                this.FH = true;
            }
        }
    }

    public final void Hw(zr0 zr0Var) {
        synchronized (this.j6) {
            if (com.google.android.gms.common.util.o.j6()) {
                if (this.DW == null) {
                    this.DW = new xr0();
                }
                this.DW.Zo(zr0Var);
            }
        }
    }

    public final Activity j6() {
        synchronized (this.j6) {
            if (!com.google.android.gms.common.util.o.j6()) {
                return null;
            }
            if (this.DW == null) {
                return null;
            }
            return this.DW.j6();
        }
    }
}
