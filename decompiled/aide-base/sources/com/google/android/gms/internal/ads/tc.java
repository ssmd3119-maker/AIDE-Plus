package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* loaded from: classes.dex */
public final class tc implements DialogInterface.OnClickListener {
    private final /* synthetic */ sc WB;

    tc(sc scVar) {
        this.WB = scVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intentVH = this.WB.VH();
        com.google.android.gms.ads.internal.w0.v5();
        bn.EQ(this.WB.Hw, intentVH);
    }
}
