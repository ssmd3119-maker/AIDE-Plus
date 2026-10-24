package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class v1 implements f1 {
    private final /* synthetic */ u1 DW;
    private final /* synthetic */ View j6;

    v1(u1 u1Var, View view) {
        this.DW = u1Var;
        this.j6 = view;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void DW() {
        this.DW.onClick(this.j6);
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void j6(MotionEvent motionEvent) {
        this.DW.onTouch(null, motionEvent);
    }
}
