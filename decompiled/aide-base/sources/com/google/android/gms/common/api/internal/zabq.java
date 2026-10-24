package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class zabq extends BroadcastReceiver {
    private final s DW;
    private Context j6;

    public final synchronized void j6() {
        if (this.j6 != null) {
            this.j6.unregisterReceiver(this);
        }
        this.j6 = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.DW.j6();
            j6();
        }
    }
}
