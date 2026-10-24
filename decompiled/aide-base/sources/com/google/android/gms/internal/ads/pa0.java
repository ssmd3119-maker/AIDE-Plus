package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class pa0 extends sa0 {
    private Logger j6;

    public pa0(String str) {
        this.j6 = Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.sa0
    public final void j6(String str) {
        this.j6.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
