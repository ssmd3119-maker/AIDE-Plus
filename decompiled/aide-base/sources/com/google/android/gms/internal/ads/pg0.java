package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class pg0 {
    private byte[] DW;
    private int FH;
    public int[] Hw;
    private final MediaCodec.CryptoInfo VH;
    private int Zo;
    private final rg0 gn;
    public byte[] j6;
    public int[] v5;

    public pg0() {
        MediaCodec.CryptoInfo cryptoInfo = ip0.j6 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.VH = cryptoInfo;
        this.gn = ip0.j6 >= 24 ? new rg0(cryptoInfo) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo DW() {
        return this.VH;
    }

    public final void j6(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.Zo = i;
        this.Hw = iArr;
        this.v5 = iArr2;
        this.DW = bArr;
        this.j6 = bArr2;
        this.FH = i2;
        int i3 = ip0.j6;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.VH;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i2;
            if (i3 >= 24) {
                this.gn.j6(0, 0);
            }
        }
    }
}
