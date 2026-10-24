package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

@jg
/* loaded from: classes.dex */
public final class bp {

    @GuardedBy("mLock")
    private long DW = Long.MIN_VALUE;
    private Object FH = new Object();
    private long j6;

    public bp(long j) {
        this.j6 = j;
    }

    public final boolean j6() {
        synchronized (this.FH) {
            long jDW = com.google.android.gms.ads.internal.w0.we().DW();
            if (this.DW + this.j6 > jDW) {
                return false;
            }
            this.DW = jDW;
            return true;
        }
    }
}
