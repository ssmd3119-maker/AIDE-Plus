package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class bd implements DialogInterface.OnClickListener {
    private final /* synthetic */ zc WB;

    bd(zc zcVar) {
        this.WB = zcVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.WB.Hw("User canceled the download.");
    }
}
