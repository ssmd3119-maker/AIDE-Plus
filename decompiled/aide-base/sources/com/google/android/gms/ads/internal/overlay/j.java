package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class j implements Runnable {
    private final /* synthetic */ Drawable WB;
    private final /* synthetic */ i mb;

    j(i iVar, Drawable drawable) {
        this.mb = iVar;
        this.WB = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.fY.WB.getWindow().setBackgroundDrawable(this.WB);
    }
}
