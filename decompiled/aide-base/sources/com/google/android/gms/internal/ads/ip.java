package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class ip {
    private boolean Hw;
    private Context v5;
    private boolean FH = false;

    @GuardedBy("this")
    private final Map<BroadcastReceiver, IntentFilter> DW = new WeakHashMap();

    @GuardedBy("this")
    private final BroadcastReceiver j6 = new jp(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void v5(Context context, Intent intent) {
        for (Map.Entry<BroadcastReceiver, IntentFilter> entry : this.DW.entrySet()) {
            if (entry.getValue().hasAction(intent.getAction())) {
                entry.getKey().onReceive(context, intent);
            }
        }
    }

    public final synchronized void DW(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.Hw) {
            this.DW.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void FH(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.Hw) {
            this.DW.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public final synchronized void j6(Context context) {
        if (this.FH) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.v5 = applicationContext;
        if (applicationContext == null) {
            this.v5 = context;
        }
        p.j6(this.v5);
        this.Hw = ((Boolean) cw0.v5().FH(p.hp)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.v5.registerReceiver(this.j6, intentFilter);
        this.FH = true;
    }
}
