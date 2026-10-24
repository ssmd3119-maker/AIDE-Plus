package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class y extends w {
    private final Callable<String> v5;

    private y(Callable<String> callable) {
        super(false, null, null);
        this.v5 = callable;
    }

    @Override // com.google.android.gms.common.w
    final String j6() {
        try {
            return this.v5.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
