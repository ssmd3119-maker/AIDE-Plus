package com.google.android.gms.internal.ads;

import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class yc {
    private final boolean DW;
    private final String FH;
    private final cv j6;

    public yc(cv cvVar, Map<String, String> map) {
        this.j6 = cvVar;
        this.FH = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.DW = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.DW = true;
        }
    }

    public final void j6() {
        if (this.j6 == null) {
            xp.u7("AdWebView is null");
        } else {
            this.j6.setRequestedOrientation("portrait".equalsIgnoreCase(this.FH) ? com.google.android.gms.ads.internal.w0.VH().a8() : "landscape".equalsIgnoreCase(this.FH) ? com.google.android.gms.ads.internal.w0.VH().U2() : this.DW ? -1 : com.google.android.gms.ads.internal.w0.VH().lg());
        }
    }
}
