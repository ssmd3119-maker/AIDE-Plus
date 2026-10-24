package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class nn implements Callable<Boolean> {
    private final /* synthetic */ WebSettings DW;
    private final /* synthetic */ Context j6;

    nn(mn mnVar, Context context, WebSettings webSettings) {
        this.j6 = context;
        this.DW = webSettings;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() {
        if (this.j6.getCacheDir() != null) {
            this.DW.setAppCachePath(this.j6.getCacheDir().getAbsolutePath());
            this.DW.setAppCacheMaxSize(0L);
            this.DW.setAppCacheEnabled(true);
        }
        this.DW.setDatabasePath(this.j6.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.DW.setDatabaseEnabled(true);
        this.DW.setDomStorageEnabled(true);
        this.DW.setDisplayZoomControls(false);
        this.DW.setBuiltInZoomControls(true);
        this.DW.setSupportZoom(true);
        this.DW.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
