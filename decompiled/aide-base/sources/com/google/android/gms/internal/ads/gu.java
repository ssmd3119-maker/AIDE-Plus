package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class gu implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ int fY;
    private final /* synthetic */ int jw;
    private final /* synthetic */ fu k2;
    private final /* synthetic */ String mb;
    private final /* synthetic */ boolean qp = false;

    gu(fu fuVar, String str, String str2, int i, int i2, boolean z) {
        this.k2 = fuVar;
        this.WB = str;
        this.mb = str2;
        this.jw = i;
        this.fY = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.WB);
        map.put("cachedSrc", this.mb);
        map.put("bytesLoaded", Integer.toString(this.jw));
        map.put("totalBytes", Integer.toString(this.fY));
        map.put("cacheReady", this.qp ? "1" : "0");
        this.k2.J8("onPrecacheEvent", map);
    }
}
