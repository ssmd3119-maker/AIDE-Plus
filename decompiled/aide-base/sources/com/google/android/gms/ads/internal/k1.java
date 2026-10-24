package com.google.android.gms.ads.internal;

import android.view.View;
import com.google.android.gms.internal.ads.jl;

/* loaded from: classes.dex */
public final class k1 implements View.OnClickListener {
    private final /* synthetic */ t1 WB;
    private final /* synthetic */ h1 mb;

    k1(h1 h1Var, t1 t1Var) {
        this.mb = h1Var;
        this.WB = t1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.WB.j6();
        jl jlVar = this.mb.mb;
        if (jlVar != null) {
            jlVar.gn();
        }
    }
}
