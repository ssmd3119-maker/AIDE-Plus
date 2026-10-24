package com.google.android.gms.internal.ads;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* loaded from: classes.dex */
public final class tn extends sn {
    @Override // com.google.android.gms.internal.ads.on, com.google.android.gms.internal.ads.jn
    public final int J8() {
        return R.style.Theme.Material.Dialog.Alert;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final CookieManager QX(Context context) {
        if (jn.J0()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            xp.Hw("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.w0.u7().v5(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.mn, com.google.android.gms.internal.ads.jn
    public final dv Zo(cv cvVar, pt0 pt0Var, boolean z) {
        return new dw(cvVar, pt0Var, z);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final WebResourceResponse v5(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
