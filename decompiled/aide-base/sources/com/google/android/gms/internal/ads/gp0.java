package com.google.android.gms.internal.ads;

import android.os.Trace;

/* loaded from: classes.dex */
public final class gp0 {
    public static void DW() {
        if (ip0.j6 >= 18) {
            Trace.endSection();
        }
    }

    public static void j6(String str) {
        if (ip0.j6 >= 18) {
            Trace.beginSection(str);
        }
    }
}
