package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ku implements Runnable {
    private final /* synthetic */ String WB;
    private final /* synthetic */ String fY;
    private final /* synthetic */ String jw;
    private final /* synthetic */ String mb;
    private final /* synthetic */ fu qp;

    ku(fu fuVar, String str, String str2, String str3, String str4) {
        this.qp = fuVar;
        this.WB = str;
        this.mb = str2;
        this.jw = str3;
        this.fY = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheCanceled");
        map.put("src", this.WB);
        if (!TextUtils.isEmpty(this.mb)) {
            map.put("cachedSrc", this.mb);
        }
        fu fuVar = this.qp;
        map.put(AppMeasurement.Param.TYPE, fu.lg(this.jw));
        map.put("reason", this.jw);
        if (!TextUtils.isEmpty(this.fY)) {
            map.put("message", this.fY);
        }
        this.qp.J8("onPrecacheEvent", map);
    }
}
