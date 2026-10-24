package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class yc0 extends BroadcastReceiver {
    private final /* synthetic */ wc0 j6;

    yc0(wc0 wc0Var) {
        this.j6 = wc0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.j6.v5();
    }
}
