package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
/* loaded from: classes.dex */
public class mn extends ln {
    @Override // com.google.android.gms.internal.ads.jn
    public final boolean EQ(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean Mr(View view) {
        view.setLayerType(0, null);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final Set<String> XL(Uri uri) {
        return uri.getQueryParameterNames();
    }

    @Override // com.google.android.gms.internal.ads.jn
    public dv Zo(cv cvVar, pt0 pt0Var, boolean z) {
        return new bw(cvVar, pt0Var, z);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public boolean tp(Context context, WebSettings webSettings) {
        super.tp(context, webSettings);
        return ((Boolean) dp.j6(context, new nn(this, context, webSettings))).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean u7(DownloadManager.Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final boolean we(View view) {
        view.setLayerType(1, null);
        return true;
    }
}
