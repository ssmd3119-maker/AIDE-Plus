package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class kj0 implements jj0 {
    private kj0() {
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final boolean DW() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final int FH() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final boolean Hw(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.jj0
    public final MediaCodecInfo j6(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }
}
