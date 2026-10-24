package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: classes.dex */
public final class zu implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult WB;

    zu(JsPromptResult jsPromptResult) {
        this.WB = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.WB.cancel();
    }
}
