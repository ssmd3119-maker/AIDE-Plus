package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes.dex */
public final /* synthetic */ class x1 {
    public static <V> V j6(y1<V> y1Var) {
        try {
            return y1Var.j6();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return y1Var.j6();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
