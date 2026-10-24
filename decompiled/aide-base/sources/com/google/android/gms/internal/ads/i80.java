package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class i80 extends RuntimeException {
    public i80(z60 z60Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final y50 j6() {
        return new y50(getMessage());
    }
}
