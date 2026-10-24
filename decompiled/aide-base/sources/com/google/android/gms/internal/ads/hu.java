package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class hu implements Runnable {
    private final /* synthetic */ fu AL;
    private final /* synthetic */ String WB;
    private final /* synthetic */ long fY;
    private final /* synthetic */ long jw;
    private final /* synthetic */ int k2;
    private final /* synthetic */ String mb;
    private final /* synthetic */ boolean qp;
    private final /* synthetic */ int zh;

    hu(fu fuVar, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.AL = fuVar;
        this.WB = str;
        this.mb = str2;
        this.jw = j;
        this.fY = j2;
        this.qp = z;
        this.k2 = i;
        this.zh = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.WB);
        map.put("cachedSrc", this.mb);
        map.put("bufferedDuration", Long.toString(this.jw));
        map.put("totalDuration", Long.toString(this.fY));
        map.put("cacheReady", this.qp ? "1" : "0");
        map.put("playerCount", Integer.toString(this.k2));
        map.put("playerPreparedCount", Integer.toString(this.zh));
        this.AL.J8("onPrecacheEvent", map);
    }
}
