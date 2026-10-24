package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

@jg
/* loaded from: classes.dex */
public final class um extends Handler {
    public um(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.w0.v5();
            bn.XL(com.google.android.gms.ads.internal.w0.u7().j6(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.w0.u7().v5(e, "AdMobHandler.handleMessage");
        }
    }
}
