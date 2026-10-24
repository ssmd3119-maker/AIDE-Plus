package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class in extends BroadcastReceiver {
    private final /* synthetic */ bn j6;

    private in(bn bnVar) {
        this.j6 = bnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.j6.DW = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.j6.DW = false;
        }
    }

    /* synthetic */ in(bn bnVar, en enVar) {
        this(bnVar);
    }
}
