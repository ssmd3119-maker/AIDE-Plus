package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class ap extends om {
    private final bq fY;
    private final String qp;

    public ap(Context context, String str, String str2) {
        this(str2, com.google.android.gms.ads.internal.w0.v5().Eq(context, str));
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void gn() {
        this.fY.j6(this.qp);
    }

    @Override // com.google.android.gms.internal.ads.om
    public final void v5() {
    }

    private ap(String str, String str2) {
        this.fY = new bq(str2);
        this.qp = str;
    }
}
