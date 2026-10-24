package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@jg
@TargetApi(14)
/* loaded from: classes.dex */
public final class ms {
    private long DW;
    private final long j6 = TimeUnit.MILLISECONDS.toNanos(((Long) cw0.v5().FH(p.rN)).longValue());
    private boolean FH = true;

    ms() {
    }

    public final void DW() {
        this.FH = true;
    }

    public final void j6(SurfaceTexture surfaceTexture, cs csVar) {
        if (csVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.FH || Math.abs(timestamp - this.DW) >= this.j6) {
            this.FH = false;
            this.DW = timestamp;
            bn.gn.post(new ns(this, csVar));
        }
    }
}
