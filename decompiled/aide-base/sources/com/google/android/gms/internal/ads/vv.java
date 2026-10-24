package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.aide.uidesigner.ProxyTextView;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.jw;
import com.google.android.gms.internal.ads.zv;

@jg
@TargetApi(ProxyTextView.INPUTTYPE_textUri)
/* loaded from: classes.dex */
public final class vv<WebViewT extends zv & hw & jw> {
    private final WebViewT j6;

    private vv(WebViewT webviewt, yv yvVar) {
        this.j6 = webviewt;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.xv, com.google.android.gms.internal.ads.yv] */
    public static vv<cv> j6(final cv cvVar) {
        return new vv<>(cvVar, new Object(cvVar) { // from class: com.google.android.gms.internal.ads.xv
            private final cv j6;

            {
                this.j6 = cvVar;
            }
        });
    }
}
