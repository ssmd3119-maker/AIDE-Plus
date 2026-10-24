package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class iu implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ fu fY;
    private final /* synthetic */ int jw;
    private final /* synthetic */ String mb;

    iu(fu fuVar, String str, String str2, int i) {
        this.fY = fuVar;
        this.WB = str;
        this.mb = str2;
        this.jw = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheComplete");
        map.put("src", this.WB);
        map.put("cachedSrc", this.mb);
        map.put("totalBytes", Integer.toString(this.jw));
        this.fY.J8("onPrecacheEvent", map);
    }
}
