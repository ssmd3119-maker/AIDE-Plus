package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class av implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult WB;
    private final /* synthetic */ EditText mb;

    av(JsPromptResult jsPromptResult, EditText editText) {
        this.WB = jsPromptResult;
        this.mb = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.WB.confirm(this.mb.getText().toString());
    }
}
