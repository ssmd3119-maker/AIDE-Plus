package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public final class lq0 extends ContentObserver {
    private final /* synthetic */ iq0 j6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(iq0 iq0Var, Handler handler) {
        super(handler);
        this.j6 = iq0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        this.j6.XL();
    }
}
