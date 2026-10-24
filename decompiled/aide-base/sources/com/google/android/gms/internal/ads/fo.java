package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
public final class fo implements DialogInterface.OnClickListener {
    private final /* synthetic */ eo WB;

    fo(eo eoVar) {
        this.WB = eoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.w0.v5();
        bn.we(this.WB.WB, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
