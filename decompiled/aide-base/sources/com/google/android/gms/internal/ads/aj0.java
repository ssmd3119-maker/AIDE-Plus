package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

@TargetApi(16)
/* loaded from: classes.dex */
public final class aj0 {
    public final boolean DW;
    public final boolean FH;
    public final boolean Hw;
    private final MediaCodecInfo.CodecCapabilities Zo;
    public final String j6;
    private final String v5;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private aj0(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.ro0.FH(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.j6 = r2
            r1.v5 = r3
            r1.Zo = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L29
            if (r4 == 0) goto L29
            int r5 = com.google.android.gms.internal.ads.ip0.j6
            r0 = 19
            if (r5 < r0) goto L24
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L24
            r5 = 1
            goto L25
        L24:
            r5 = 0
        L25:
            if (r5 == 0) goto L29
            r5 = 1
            goto L2a
        L29:
            r5 = 0
        L2a:
            r1.DW = r5
            r5 = 21
            if (r4 == 0) goto L43
            int r0 = com.google.android.gms.internal.ads.ip0.j6
            if (r0 < r5) goto L3e
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = 0
        L3f:
            if (r0 == 0) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            r1.FH = r0
            if (r6 != 0) goto L5d
            if (r4 == 0) goto L5c
            int r6 = com.google.android.gms.internal.ads.ip0.j6
            if (r6 < r5) goto L58
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L58
            r4 = 1
            goto L59
        L58:
            r4 = 0
        L59:
            if (r4 == 0) goto L5c
            goto L5d
        L5c:
            r2 = 0
        L5d:
            r1.Hw = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj0.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    @TargetApi(21)
    private static boolean FH(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    public static aj0 gn(String str) {
        return new aj0(str, null, null, false, false);
    }

    public static aj0 j6(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new aj0(str, str2, codecCapabilities, z, z2);
    }

    private final void tp(String str) {
        String str2 = this.j6;
        String str3 = this.v5;
        String str4 = ip0.v5;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    public final boolean DW(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.Zo;
        if (codecCapabilities == null) {
            tp("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            tp("sizeAndRate.vCaps");
            return false;
        }
        if (FH(videoCapabilities, i, i2, d)) {
            return true;
        }
        if (i >= i2 || !FH(videoCapabilities, i2, i, d)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.support, ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("x");
            sb.append(d);
            tp(sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.rotated, ");
        sb2.append(i);
        sb2.append("x");
        sb2.append(i2);
        sb2.append("x");
        sb2.append(d);
        String string = sb2.toString();
        String str = this.j6;
        String str2 = this.v5;
        String str3 = ip0.v5;
        StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb3.append("AssumedSupport [");
        sb3.append(string);
        sb3.append("] [");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append("] [");
        sb3.append(str3);
        sb3.append("]");
        Log.d("MediaCodecInfo", sb3.toString());
        return true;
    }

    @TargetApi(21)
    public final boolean Hw(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.Zo;
        if (codecCapabilities == null) {
            tp("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            tp("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i);
        tp(sb.toString());
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] VH() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.Zo;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public final Point Zo(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.Zo;
        if (codecCapabilities == null) {
            tp("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            tp("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(ip0.U2(i, widthAlignment) * widthAlignment, ip0.U2(i2, heightAlignment) * heightAlignment);
    }

    public final boolean u7(String str) {
        String strHw;
        if (str == null || this.v5 == null || (strHw = wo0.Hw(str)) == null) {
            return true;
        }
        if (!this.v5.equals(strHw)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(strHw).length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(strHw);
            tp(sb.toString());
            return false;
        }
        Pair<Integer, Integer> pairVH = gj0.VH(str);
        if (pairVH == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : VH()) {
            if (codecProfileLevel.profile == ((Integer) pairVH.first).intValue() && codecProfileLevel.level >= ((Integer) pairVH.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(strHw).length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(strHw);
        tp(sb2.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean v5(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.Zo;
        if (codecCapabilities == null) {
            tp("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            tp("channelCount.aCaps");
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i);
        tp(sb.toString());
        return false;
    }
}
