package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static volatile a DW;
    private static final Object j6 = new Object();

    private a() {
        List list = Collections.EMPTY_LIST;
    }

    public static a DW() {
        if (DW == null) {
            synchronized (j6) {
                if (DW == null) {
                    DW = new a();
                }
            }
        }
        return DW;
    }

    @SuppressLint({"UntrackedBindService"})
    public void FH(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public final boolean Hw(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : d.DW(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    public boolean j6(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return Hw(context, context.getClass().getName(), intent, serviceConnection, i);
    }
}
