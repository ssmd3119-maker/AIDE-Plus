package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ad implements DialogInterface.OnClickListener {
    private final /* synthetic */ String WB;
    private final /* synthetic */ zc jw;
    private final /* synthetic */ String mb;

    ad(zc zcVar, String str, String str2) {
        this.jw = zcVar;
        this.WB = str;
        this.mb = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.jw.Hw.getSystemService("download");
        try {
            String str = this.WB;
            String str2 = this.mb;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.w0.VH().u7(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.jw.Hw("Could not store picture.");
        }
    }
}
