package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
public final class t1 extends ContentObserver {
    private final /* synthetic */ r1 j6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t1(r1 r1Var, Handler handler) {
        super(null);
        this.j6 = r1Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.j6.Hw();
    }
}
