package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: classes.dex */
public final class uu implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult WB;

    uu(JsResult jsResult) {
        this.WB = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.WB.cancel();
    }
}
