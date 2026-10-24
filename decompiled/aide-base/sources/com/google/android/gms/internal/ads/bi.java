package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bi implements Runnable {
    final /* synthetic */ JSONObject WB;
    private final /* synthetic */ zh jw;
    final /* synthetic */ String mb;

    bi(zh zhVar, JSONObject jSONObject, String str) {
        this.jw = zhVar;
        this.WB = jSONObject;
        this.mb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.jw.AL = zh.Z1.gn(null);
        this.jw.AL.j6(new ci(this), new di(this));
    }
}
