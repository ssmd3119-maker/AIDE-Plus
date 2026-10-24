package com.google.firebase.iid;

import abcd.gw;
import abcd.uu;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class e {

    @GuardedBy("MessengerIpcClient.class")
    private static e v5;
    private final ScheduledExecutorService DW;

    @GuardedBy("this")
    private g FH = new g(this);

    @GuardedBy("this")
    private int Hw = 1;
    private final Context j6;

    private e(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.DW = scheduledExecutorService;
        this.j6 = context.getApplicationContext();
    }

    private final synchronized <T> gw<T> DW(m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.FH.v5(mVar)) {
            g gVar = new g(this);
            this.FH = gVar;
            gVar.v5(mVar);
        }
        return mVar.DW.j6();
    }

    private final synchronized int Zo() {
        int i;
        i = this.Hw;
        this.Hw = i + 1;
        return i;
    }

    public static synchronized e v5(Context context) {
        if (v5 == null) {
            v5 = new e(context, Executors.newSingleThreadScheduledExecutor(new uu("MessengerIpcClient")));
        }
        return v5;
    }

    public final gw<Bundle> FH(int i, Bundle bundle) {
        return DW(new o(Zo(), 1, bundle));
    }
}
