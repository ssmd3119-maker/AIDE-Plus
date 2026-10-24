package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;

@jg
/* loaded from: classes.dex */
public final class u0 extends g2 {
    private final Drawable WB;
    private final double jw;
    private final Uri mb;

    public u0(Drawable drawable, Uri uri, double d) {
        this.WB = drawable;
        this.mb = uri;
        this.jw = d;
    }

    @Override // com.google.android.gms.internal.ads.f2
    public final Uri Jm() {
        return this.mb;
    }

    @Override // com.google.android.gms.internal.ads.f2
    public final abcd.wu K0() {
        return abcd.xu.sy(this.WB);
    }

    @Override // com.google.android.gms.internal.ads.f2
    public final double PA() {
        return this.jw;
    }
}
