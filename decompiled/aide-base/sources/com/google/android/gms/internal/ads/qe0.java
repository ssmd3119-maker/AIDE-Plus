package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class qe0 extends Handler {
    private final /* synthetic */ pe0 j6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    qe0(pe0 pe0Var, Looper looper) {
        super(looper);
        this.j6 = pe0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.j6.DW(message);
    }
}
