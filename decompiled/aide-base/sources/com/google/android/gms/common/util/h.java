package com.google.android.gms.common.util;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class h implements e {
    private static final h j6 = new h();

    private h() {
    }

    public static e Hw() {
        return j6;
    }

    @Override // com.google.android.gms.common.util.e
    public long DW() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.e
    public long FH() {
        return System.nanoTime();
    }

    @Override // com.google.android.gms.common.util.e
    public long j6() {
        return System.currentTimeMillis();
    }
}
