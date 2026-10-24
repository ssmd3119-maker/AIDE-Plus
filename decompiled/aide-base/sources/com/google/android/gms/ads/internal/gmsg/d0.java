package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.xp;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d0 implements Runnable {
    private final /* synthetic */ JSONObject WB;
    private final /* synthetic */ c0 mb;

    d0(c0 c0Var, JSONObject jSONObject) {
        this.mb = c0Var;
        this.WB = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.mb.mb.j6("fetchHttpRequestCompleted", this.WB);
        xp.VH("Dispatched http response.");
    }
}
