package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c0 {
    private final BroadcastReceiver.PendingResult DW;
    private boolean FH = false;
    private final ScheduledFuture<?> Hw;
    final Intent j6;

    c0(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.j6 = intent;
        this.DW = pendingResult;
        this.Hw = scheduledExecutorService.schedule(new Runnable(this, intent) { // from class: com.google.firebase.iid.d0
            private final c0 WB;
            private final Intent mb;

            {
                this.WB = this;
                this.mb = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c0 c0Var = this.WB;
                String action = this.mb.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("EnhancedIntentService", sb.toString());
                c0Var.j6();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    final synchronized void j6() {
        if (!this.FH) {
            this.DW.finish();
            this.Hw.cancel(false);
            this.FH = true;
        }
    }
}
