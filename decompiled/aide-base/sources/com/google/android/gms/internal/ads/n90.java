package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class n90 {
    public static final Object DW;
    protected static final Charset j6 = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        DW = new Object();
    }

    public static void j6(j90 j90Var, j90 j90Var2) {
        l90 l90Var = j90Var.DW;
        if (l90Var != null) {
            j90Var2.DW = (l90) l90Var.clone();
        }
    }
}
