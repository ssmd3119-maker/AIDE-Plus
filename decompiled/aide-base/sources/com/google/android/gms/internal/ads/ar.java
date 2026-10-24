package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

@jg
/* loaded from: classes.dex */
public final class ar {
    public static final Executor j6 = new br();
    public static final Executor DW = new cr();

    static {
        j6(j6);
        j6(DW);
    }

    public static zq j6(Executor executor) {
        return new dr(executor, null);
    }
}
