package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* loaded from: classes.dex */
public final class zf0 extends yf0 {
    private long EQ;
    private long J0;
    private final AudioTimestamp tp;
    private long we;

    public zf0() {
        super(null);
        this.tp = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.yf0
    public final void DW(AudioTrack audioTrack, boolean z) {
        super.DW(audioTrack, z);
        this.EQ = 0L;
        this.we = 0L;
        this.J0 = 0L;
    }

    @Override // com.google.android.gms.internal.ads.yf0
    public final long VH() {
        return this.J0;
    }

    @Override // com.google.android.gms.internal.ads.yf0
    public final long Zo() {
        return this.tp.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.yf0
    public final boolean v5() {
        boolean timestamp = this.j6.getTimestamp(this.tp);
        if (timestamp) {
            long j = this.tp.framePosition;
            if (this.we > j) {
                this.EQ++;
            }
            this.we = j;
            this.J0 = j + (this.EQ << 32);
        }
        return timestamp;
    }
}
