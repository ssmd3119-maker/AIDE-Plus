package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
public final class yu implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult WB;

    yu(JsPromptResult jsPromptResult) {
        this.WB = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.WB.cancel();
    }
}
