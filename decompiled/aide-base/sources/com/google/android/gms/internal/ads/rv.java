package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rv implements Runnable {
    private final /* synthetic */ pv WB;

    rv(pv pvVar) {
        this.WB = pvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
