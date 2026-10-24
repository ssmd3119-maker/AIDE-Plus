package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class uc implements DialogInterface.OnClickListener {
    private final /* synthetic */ sc WB;

    uc(sc scVar) {
        this.WB = scVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.WB.Hw("Operation denied by user.");
    }
}
