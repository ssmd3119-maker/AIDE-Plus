package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class y1 implements f1 {
    private final /* synthetic */ w1 DW;
    private final /* synthetic */ View j6;

    y1(w1 w1Var, View view) {
        this.DW = w1Var;
        this.j6 = view;
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void DW() {
        if (this.DW.UE(w1.cT)) {
            this.DW.onClick(this.j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.f1
    public final void j6(MotionEvent motionEvent) {
        this.DW.onTouch(null, motionEvent);
    }
}
