package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class gj0 {
    private static final SparseIntArray Hw;
    private static final Map<String, Integer> Zo;
    private static final SparseIntArray v5;
    private static final aj0 j6 = aj0.gn("OMX.google.raw.decoder");
    private static final Pattern DW = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<a, List<aj0>> FH = new HashMap<>();
    private static int VH = -1;

    static final class a {
        public final boolean DW;
        public final String j6;

        public a(String str, boolean z) {
            this.j6 = str;
            this.DW = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.j6, aVar.j6) && this.DW == aVar.DW) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.j6;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.DW ? 1231 : 1237);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Hw = sparseIntArray;
        sparseIntArray.put(66, 1);
        Hw.put(77, 2);
        Hw.put(88, 4);
        Hw.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        v5 = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        v5.put(11, 4);
        v5.put(12, 8);
        v5.put(13, 16);
        v5.put(20, 32);
        v5.put(21, 64);
        v5.put(22, 128);
        v5.put(30, 256);
        v5.put(31, 512);
        v5.put(32, 1024);
        v5.put(40, 2048);
        v5.put(41, 4096);
        v5.put(42, 8192);
        v5.put(50, 16384);
        v5.put(51, 32768);
        v5.put(52, 65536);
        HashMap map = new HashMap();
        Zo = map;
        map.put("L30", 1);
        Zo.put("L60", 4);
        Zo.put("L63", 16);
        Zo.put("L90", 64);
        Zo.put("L93", 256);
        Zo.put("L120", 1024);
        Zo.put("L123", 4096);
        Zo.put("L150", 16384);
        Zo.put("L153", 65536);
        Zo.put("L156", 262144);
        Zo.put("L180", 1048576);
        Zo.put("L183", 4194304);
        Zo.put("L186", 16777216);
        Zo.put("H30", 2);
        Zo.put("H60", 8);
        Zo.put("H63", 32);
        Zo.put("H90", 128);
        Zo.put("H93", 512);
        Zo.put("H120", 2048);
        Zo.put("H123", 8192);
        Zo.put("H150", 32768);
        Zo.put("H153", 131072);
        Zo.put("H156", 524288);
        Zo.put("H180", 2097152);
        Zo.put("H183", 8388608);
        Zo.put("H186", 33554432);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.ij0.<init>(java.lang.Throwable, com.google.android.gms.internal.ads.hj0):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:291)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:194)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<com.google.android.gms.internal.ads.aj0> DW(com.google.android.gms.internal.ads.gj0.a r17, com.google.android.gms.internal.ads.jj0 r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj0.DW(com.google.android.gms.internal.ads.gj0$a, com.google.android.gms.internal.ads.jj0):java.util.List");
    }

    public static aj0 FH(String str, boolean z) {
        List<aj0> listHw = Hw(str, z);
        if (listHw.isEmpty()) {
            return null;
        }
        return listHw.get(0);
    }

    private static synchronized List<aj0> Hw(String str, boolean z) {
        a aVar = new a(str, z);
        List<aj0> list = FH.get(aVar);
        if (list != null) {
            return list;
        }
        List<aj0> listDW = DW(aVar, ip0.j6 >= 21 ? new lj0(z) : new kj0());
        if (z && listDW.isEmpty() && 21 <= ip0.j6 && ip0.j6 <= 23) {
            listDW = DW(aVar, new kj0());
            if (!listDW.isEmpty()) {
                String str2 = listDW.get(0).j6;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                Log.w("MediaCodecUtil", sb.toString());
            }
        }
        List<aj0> listUnmodifiableList = Collections.unmodifiableList(listDW);
        FH.put(aVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> VH(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj0.VH(java.lang.String):android.util.Pair");
    }

    public static int Zo() {
        if (VH == -1) {
            int iMax = 0;
            aj0 aj0VarFH = FH("video/avc", false);
            if (aj0VarFH != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrVH = aj0VarFH.VH();
                int length = codecProfileLevelArrVH.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i = codecProfileLevelArrVH[iMax].level;
                    int i2 = 9437184;
                    if (i != 1 && i != 2) {
                        switch (i) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    iMax2 = Math.max(i2, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, ip0.j6 >= 21 ? 345600 : 172800);
            }
            VH = iMax;
        }
        return VH;
    }

    private static Pair<Integer, Integer> j6(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        if (strArr.length < 2) {
            String strValueOf = String.valueOf(str);
            Log.w("MediaCodecUtil", strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                if (strArr.length < 3) {
                    String strValueOf2 = String.valueOf(str);
                    Log.w("MediaCodecUtil", strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                Integer numValueOf3 = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                numValueOf2 = numValueOf3;
            }
            Integer numValueOf4 = Integer.valueOf(Hw.get(numValueOf2.intValue()));
            if (numValueOf4 == null) {
                String strValueOf3 = String.valueOf(numValueOf2);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf3).length() + 21);
                sb.append("Unknown AVC profile: ");
                sb.append(strValueOf3);
                Log.w("MediaCodecUtil", sb.toString());
                return null;
            }
            Integer numValueOf5 = Integer.valueOf(v5.get(numValueOf.intValue()));
            if (numValueOf5 != null) {
                return new Pair<>(numValueOf4, numValueOf5);
            }
            String strValueOf4 = String.valueOf(numValueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf4).length() + 19);
            sb2.append("Unknown AVC level: ");
            sb2.append(strValueOf4);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf5 = String.valueOf(str);
            Log.w("MediaCodecUtil", strValueOf5.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf5) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    public static aj0 v5() {
        return j6;
    }
}
