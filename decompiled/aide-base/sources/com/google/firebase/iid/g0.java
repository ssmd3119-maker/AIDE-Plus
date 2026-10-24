package com.google.firebase.iid;

import abcd.uu;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class g0 implements ServiceConnection {
    private final Context WB;
    private final Queue<c0> fY;
    private final ScheduledExecutorService jw;
    private boolean k2;
    private final Intent mb;
    private e0 qp;

    public g0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new uu("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private final synchronized void DW() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (!this.fY.isEmpty()) {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "found intent to be delivered");
            }
            if (this.qp == null || !this.qp.isBinderAlive()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    boolean z = !this.k2;
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("binder is dead. start connection? ");
                    sb.append(z);
                    Log.d("EnhancedIntentService", sb.toString());
                }
                if (!this.k2) {
                    this.k2 = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("EnhancedIntentService", "Exception while binding the service", e);
                    }
                    if (com.google.android.gms.common.stats.a.DW().j6(this.WB, this.mb, this, 65)) {
                        return;
                    }
                    Log.e("EnhancedIntentService", "binding to the service failed");
                    this.k2 = false;
                    FH();
                }
                return;
            }
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
            }
            this.qp.DW(this.fY.poll());
        }
    }

    private final void FH() {
        while (!this.fY.isEmpty()) {
            this.fY.poll().j6();
        }
    }

    public final synchronized void j6(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.fY.add(new c0(intent, pendingResult, this.jw));
        DW();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.k2 = false;
            this.qp = (e0) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String strValueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(strValueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                FH();
            } else {
                DW();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String strValueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(strValueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        DW();
    }

    private g0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.fY = new ArrayDeque();
        this.k2 = false;
        this.WB = context.getApplicationContext();
        this.mb = new Intent(str).setPackage(this.WB.getPackageName());
        this.jw = scheduledExecutorService;
    }
}
