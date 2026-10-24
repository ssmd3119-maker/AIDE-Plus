package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class s0 implements View.OnTouchListener {
    private final /* synthetic */ q0 WB;

    s0(q0 q0Var) {
        this.WB = q0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.WB.AL == null) {
            return false;
        }
        this.WB.AL.Hw(motionEvent);
        return false;
    }
}
