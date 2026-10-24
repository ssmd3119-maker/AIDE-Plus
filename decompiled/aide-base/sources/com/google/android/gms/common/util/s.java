package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class s {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static boolean j6(String str) {
        return str == null || str.trim().isEmpty();
    }
}
