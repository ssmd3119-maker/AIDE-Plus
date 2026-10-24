package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes.dex */
public final class lj0 implements jj0 {
    private MediaCodecInfo[] DW;
    private final int j6;

    public lj0(boolean z) {
        this.j6 = z ? 1 : 0;
    }

    private final void v5() {
        if (this.DW == null) {
            this.DW = new MediaCodecList(this.j6).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final boolean DW() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final int FH() {
        v5();
        return this.DW.length;
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final boolean Hw(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final MediaCodecInfo j6(int i) {
        v5();
        return this.DW[i];
    }
}
