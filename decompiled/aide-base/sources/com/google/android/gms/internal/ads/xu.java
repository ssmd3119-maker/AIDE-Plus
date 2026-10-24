package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class xu implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult WB;

    xu(JsResult jsResult) {
        this.WB = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.WB.confirm();
    }
}
