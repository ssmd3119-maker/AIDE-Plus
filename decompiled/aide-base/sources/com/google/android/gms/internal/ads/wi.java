package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

@jg
/* loaded from: classes.dex */
public final class wi {
    private WeakHashMap<Context, yi> j6 = new WeakHashMap<>();

    public final Future<ui> DW(Context context) {
        return zm.j6(new xi(this, context));
    }
}
