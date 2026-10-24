package com.google.android.gms.common.wrappers;

import android.content.Context;

/* loaded from: classes.dex */
public class b {
    private static b DW = new b();
    private PackageManagerWrapper j6 = null;

    private final synchronized PackageManagerWrapper DW(Context context) {
        if (this.j6 == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.j6 = new PackageManagerWrapper(context);
        }
        return this.j6;
    }

    public static PackageManagerWrapper j6(Context context) {
        return DW.DW(context);
    }
}
