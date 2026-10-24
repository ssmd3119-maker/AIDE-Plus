package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class bs0 implements Runnable {
    private final /* synthetic */ View WB;
    private final /* synthetic */ as0 mb;

    bs0(as0 as0Var, View view) {
        this.mb = as0Var;
        this.WB = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.Hw(this.WB);
    }
}
