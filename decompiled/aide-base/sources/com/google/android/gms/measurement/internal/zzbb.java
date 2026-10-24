package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.p;

/* loaded from: classes.dex */
public class zzbb extends BroadcastReceiver {
    private static final String zzabi = zzbb.class.getName();
    private boolean zzabj;
    private boolean zzabk;
    private final zzfo zzamv;

    zzbb(zzfo zzfoVar) {
        p.u7(zzfoVar);
        this.zzamv = zzfoVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.zzamv.zzlx();
        String action = intent.getAction();
        this.zzamv.zzgt().zzjo().zzg("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.zzamv.zzgt().zzjj().zzg("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzfb = this.zzamv.zzlt().zzfb();
        if (this.zzabk != zZzfb) {
            this.zzabk = zZzfb;
            this.zzamv.zzgs().zzc(new zzbc(this, zZzfb));
        }
    }

    public final void unregister() {
        this.zzamv.zzlx();
        this.zzamv.zzgs().zzaf();
        this.zzamv.zzgs().zzaf();
        if (this.zzabj) {
            this.zzamv.zzgt().zzjo().zzby("Unregistering connectivity change receiver");
            this.zzabj = false;
            this.zzabk = false;
            try {
                this.zzamv.getContext().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzamv.zzgt().zzjg().zzg("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public final void zzey() {
        this.zzamv.zzlx();
        this.zzamv.zzgs().zzaf();
        if (this.zzabj) {
            return;
        }
        this.zzamv.getContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzabk = this.zzamv.zzlt().zzfb();
        this.zzamv.zzgt().zzjo().zzg("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzabk));
        this.zzabj = true;
    }
}
