package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class x30 extends t30 {
    x30() {
    }

    @Override // com.google.android.gms.internal.ads.t30
    public final void DW(Throwable th) {
        th.printStackTrace();
    }

    @Override // com.google.android.gms.internal.ads.t30
    public final void j6(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
    }
}
