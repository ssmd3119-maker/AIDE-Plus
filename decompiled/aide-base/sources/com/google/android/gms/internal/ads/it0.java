package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class it0 extends fr<InputStream> {
    private final /* synthetic */ ht0 zh;

    it0(ht0 ht0Var) {
        this.zh = ht0Var;
    }

    @Override // com.google.android.gms.internal.ads.fr, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zh.j6();
        return super.cancel(z);
    }
}
