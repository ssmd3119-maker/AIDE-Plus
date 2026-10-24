package com.google.firebase.iid;

import abcd.ov;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class v extends ov {
    private final /* synthetic */ u j6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(u uVar, Looper looper) {
        super(looper);
        this.j6 = uVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.j6.v5(message);
    }
}
