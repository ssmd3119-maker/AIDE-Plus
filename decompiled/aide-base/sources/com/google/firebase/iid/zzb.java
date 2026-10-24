package com.google.firebase.iid;

import abcd.uu;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class zzb extends Service {
    final ExecutorService WB;
    private int fY;
    private final Object jw;
    private Binder mb;
    private int qp;

    public zzb() {
        String strValueOf = String.valueOf(getClass().getSimpleName());
        this.WB = Executors.newSingleThreadExecutor(new uu(strValueOf.length() != 0 ? "Firebase-".concat(strValueOf) : new String("Firebase-")));
        this.jw = new Object();
        this.qp = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j6(Intent intent) {
        if (intent != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
        synchronized (this.jw) {
            int i = this.qp - 1;
            this.qp = i;
            if (i == 0) {
                stopSelfResult(this.fY);
            }
        }
    }

    protected Intent FH(Intent intent) {
        return intent;
    }

    public boolean Hw(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.mb == null) {
            this.mb = new e0(this);
        }
        return this.mb;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.jw) {
            this.fY = i2;
            this.qp++;
        }
        Intent intentFH = FH(intent);
        if (intentFH == null) {
            j6(intent);
            return 2;
        }
        if (Hw(intentFH)) {
            j6(intent);
            return 2;
        }
        this.WB.execute(new b0(this, intentFH, intent));
        return 3;
    }

    public abstract void v5(Intent intent);
}
