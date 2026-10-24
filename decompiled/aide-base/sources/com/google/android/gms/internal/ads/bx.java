package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bx {
    public final Uri DW;
    public final Map<String, String> FH;
    public final String j6;

    @TargetApi(21)
    public bx(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public bx(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private bx(String str, Uri uri, @Nullable String str2, @Nullable Map<String, String> map) {
        this.j6 = str;
        this.DW = uri;
        this.FH = map == null ? Collections.emptyMap() : map;
    }
}
