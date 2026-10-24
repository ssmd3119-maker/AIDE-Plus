package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class cj0 extends Exception {
    public cj0(zzfs zzfsVar, Throwable th, boolean z, int i) {
        String strValueOf = String.valueOf(zzfsVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        String str = zzfsVar.k2;
        String str2 = i < 0 ? "neg_" : "";
        int iAbs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(str2.length() + 64);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
        sb2.append(str2);
        sb2.append(iAbs);
        sb2.toString();
    }

    public cj0(zzfs zzfsVar, Throwable th, boolean z, String str) {
        String strValueOf = String.valueOf(zzfsVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(strValueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(strValueOf);
        super(sb.toString(), th);
        String str2 = zzfsVar.k2;
        if (ip0.j6 < 21 || !(th instanceof MediaCodec.CodecException)) {
            return;
        }
        ((MediaCodec.CodecException) th).getDiagnosticInfo();
    }
}
