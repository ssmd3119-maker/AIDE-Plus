package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* loaded from: classes.dex */
public final class rg0 {
    private final MediaCodec.CryptoInfo.Pattern DW;
    private final MediaCodec.CryptoInfo j6;

    private rg0(MediaCodec.CryptoInfo cryptoInfo) {
        this.j6 = cryptoInfo;
        this.DW = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j6(int i, int i2) {
        this.DW.set(i, i2);
        this.j6.setPattern(this.DW);
    }
}
