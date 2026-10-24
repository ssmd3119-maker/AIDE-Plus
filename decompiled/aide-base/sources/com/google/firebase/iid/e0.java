package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* loaded from: classes.dex */
public final class e0 extends Binder {
    private final zzb WB;

    e0(zzb zzbVar) {
        this.WB = zzbVar;
    }

    public final void DW(c0 c0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
        }
        if (this.WB.Hw(c0Var.j6)) {
            c0Var.j6();
            return;
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "intent being queued for bg execution");
        }
        this.WB.WB.execute(new f0(this, c0Var));
    }
}
