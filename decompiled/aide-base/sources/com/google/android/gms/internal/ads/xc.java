package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class xc implements View.OnClickListener {
    private final /* synthetic */ wc WB;

    xc(wc wcVar) {
        this.WB = wcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.WB.J0(true);
    }
}
