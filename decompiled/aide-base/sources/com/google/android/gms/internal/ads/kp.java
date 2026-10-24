package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jg
/* loaded from: classes.dex */
public final class kp {
    private static List<MediaCodecInfo> DW;
    private static Map<String, List<Map<String, Object>>> j6 = new HashMap();
    private static final Object FH = new Object();

    @TargetApi(16)
    public static List<Map<String, Object>> DW(String str) {
        synchronized (FH) {
            if (j6.containsKey(str)) {
                return j6.get(str);
            }
            try {
                synchronized (FH) {
                    if (DW == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            DW = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (Build.VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            DW = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                DW.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            DW = Collections.emptyList();
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : DW) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap map = new HashMap();
                        map.put("codecName", mediaCodecInfo.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        map.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            map.put("bitRatesBps", j6(videoCapabilities.getBitrateRange()));
                            map.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            map.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            map.put("frameRates", j6(videoCapabilities.getSupportedFrameRates()));
                            map.put("widths", j6(videoCapabilities.getSupportedWidths()));
                            map.put("heights", j6(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            map.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(map);
                    }
                }
                j6.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap map2 = new HashMap();
                map2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(map2);
                j6.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    @TargetApi(21)
    private static Integer[] j6(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
