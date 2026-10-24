package com.google.android.gms.internal.ads;

import android.content.Context;

@jg
/* loaded from: classes.dex */
public final class f7 {
    private Context j6;

    public final void j6(Context context) {
        if (this.j6 != null) {
            return;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.j6 = context;
    }
}
