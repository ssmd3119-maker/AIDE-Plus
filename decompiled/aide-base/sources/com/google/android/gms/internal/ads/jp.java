package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class jp extends BroadcastReceiver {
    private final /* synthetic */ ip j6;

    jp(ip ipVar) {
        this.j6 = ipVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.j6.v5(context, intent);
    }
}
