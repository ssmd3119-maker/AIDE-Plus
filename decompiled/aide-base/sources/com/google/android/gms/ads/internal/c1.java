package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c1 implements Callable<String> {
    private final /* synthetic */ z0 j6;

    c1(z0 z0Var) {
        this.j6 = z0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        CookieManager cookieManagerQX = w0.VH().QX(this.j6.k2.jw);
        return cookieManagerQX != null ? cookieManagerQX.getCookie("googleads.g.doubleclick.net") : "";
    }
}
