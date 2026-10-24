package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.util.e;

/* loaded from: classes.dex */
public final class zzfj {
    private long startTime;
    private final e zzrz;

    public zzfj(e eVar) {
        p.u7(eVar);
        this.zzrz = eVar;
    }

    public final void clear() {
        this.startTime = 0L;
    }

    public final void start() {
        this.startTime = this.zzrz.DW();
    }

    public final boolean zzj(long j) {
        return this.startTime == 0 || this.zzrz.DW() - this.startTime >= 3600000;
    }
}
