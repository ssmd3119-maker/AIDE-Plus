package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@jg
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class y8 {

    @GuardedBy("mLock")
    private g9 DW;
    private final Object j6 = new Object();

    public final g9 j6(Context context, zzbbi zzbbiVar) {
        g9 g9Var;
        synchronized (this.j6) {
            if (this.DW == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.DW = new g9(context, zzbbiVar, (String) cw0.v5().FH(p.j6));
            }
            g9Var = this.DW;
        }
        return g9Var;
    }
}
