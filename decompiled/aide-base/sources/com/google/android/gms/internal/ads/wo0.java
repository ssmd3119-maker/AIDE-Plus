package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wo0 {
    public static boolean DW(String str) {
        return "video".equals(v5(str));
    }

    public static boolean FH(String str) {
        return "text".equals(v5(str));
    }

    public static String Hw(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("avc1") || strTrim.startsWith("avc3")) {
            return "video/avc";
        }
        if (strTrim.startsWith("hev1") || strTrim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strTrim.startsWith("vp9")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strTrim.startsWith("vp8")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strTrim.startsWith("mp4a")) {
            return "audio/mp4a-latm";
        }
        if (strTrim.startsWith("ac-3") || strTrim.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strTrim.startsWith("ec-3") || strTrim.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strTrim.startsWith("dtsc") || strTrim.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strTrim.startsWith("dtsh") || strTrim.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strTrim.startsWith("opus")) {
            return "audio/opus";
        }
        if (strTrim.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        return null;
    }

    public static boolean j6(String str) {
        return "audio".equals(v5(str));
    }

    private static String v5(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        String strValueOf = String.valueOf(str);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Invalid mime type: ".concat(strValueOf) : new String("Invalid mime type: "));
    }
}
