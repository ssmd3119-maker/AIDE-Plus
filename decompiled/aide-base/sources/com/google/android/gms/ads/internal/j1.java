package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.jl;

/* loaded from: classes.dex */
public final class j1 implements View.OnTouchListener {
    private final /* synthetic */ t1 WB;
    private final /* synthetic */ h1 mb;

    j1(h1 h1Var, t1 t1Var) {
        this.mb = h1Var;
        this.WB = t1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.WB.j6();
        jl jlVar = this.mb.mb;
        if (jlVar == null) {
            return false;
        }
        jlVar.gn();
        return false;
    }
}
