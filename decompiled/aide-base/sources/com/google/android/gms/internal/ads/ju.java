package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ju implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ fu fY;
    private final /* synthetic */ long jw;
    private final /* synthetic */ String mb;

    ju(fu fuVar, String str, String str2, long j) {
        this.fY = fuVar;
        this.WB = str;
        this.mb = str2;
        this.jw = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.WB);
        map.put("cachedSrc", this.mb);
        map.put("totalDuration", Long.toString(this.jw));
        this.fY.J8("onPrecacheEvent", map);
    }
}
