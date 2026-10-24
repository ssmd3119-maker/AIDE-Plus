package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class eo implements Runnable {
    final /* synthetic */ Context WB;
    private final /* synthetic */ boolean fY;
    private final /* synthetic */ boolean jw;
    private final /* synthetic */ String mb;

    eo(Cdo cdo, Context context, String str, boolean z, boolean z2) {
        this.WB = context;
        this.mb = str;
        this.jw = z;
        this.fY = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.WB);
        builder.setMessage(this.mb);
        if (this.jw) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.fY) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new fo(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
