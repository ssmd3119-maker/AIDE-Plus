package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@jg
@TargetApi(11)
/* loaded from: classes.dex */
public class cw extends dv {
    public cw(cv cvVar, pt0 pt0Var, boolean z) {
        super(cvVar, pt0Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse Sf(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof cv)) {
            xp.u7("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        cv cvVar = (cv) webView;
        jl jlVar = this.lg;
        if (jlVar != null) {
            jlVar.VH(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.cb(str, map);
        }
        if (cvVar.AF() != null) {
            cvVar.AF().gn();
        }
        if (cvVar.aq().v5()) {
            str2 = (String) cw0.v5().FH(p.KD);
        } else if (cvVar.BR()) {
            str2 = (String) cw0.v5().FH(p.SI);
        } else {
            str2 = (String) cw0.v5().FH(p.nw);
        }
        com.google.android.gms.ads.internal.w0.v5();
        return bn.lp(cvVar.getContext(), cvVar.sy().WB, str2);
    }
}
