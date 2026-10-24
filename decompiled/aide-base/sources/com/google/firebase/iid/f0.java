package com.google.firebase.iid;

import android.util.Log;

/* loaded from: classes.dex */
public final class f0 implements Runnable {
    private final /* synthetic */ c0 WB;
    private final /* synthetic */ e0 mb;

    f0(e0 e0Var, c0 c0Var) {
        this.mb = e0Var;
        this.WB = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        this.mb.WB.v5(this.WB.j6);
        this.WB.j6();
    }
}
