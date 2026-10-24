package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.u6;
import com.google.android.gms.internal.ads.xp;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 implements Runnable {
    private final /* synthetic */ Map WB;
    private final /* synthetic */ HttpClient jw;
    final /* synthetic */ u6 mb;

    c0(HttpClient httpClient, Map map, u6 u6Var) {
        this.jw = httpClient;
        this.WB = map;
        this.mb = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        xp.VH("Received Http request.");
        try {
            JSONObject jSONObjectSend = this.jw.send(new JSONObject((String) this.WB.get("http_request")));
            if (jSONObjectSend == null) {
                xp.j6("Response should not be null.");
            } else {
                bn.gn.post(new d0(this, jSONObjectSend));
            }
        } catch (Exception e) {
            xp.Hw("Error converting request to json.", e);
        }
    }
}
