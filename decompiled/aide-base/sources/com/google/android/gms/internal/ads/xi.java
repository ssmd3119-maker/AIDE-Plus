package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class xi implements Callable<ui> {
    private final /* synthetic */ wi DW;
    private final /* synthetic */ Context j6;

    xi(wi wiVar, Context context) {
        this.DW = wiVar;
        this.j6 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.ui call() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.wi r0 = r6.DW
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.wi.j6(r0)
            android.content.Context r1 = r6.j6
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.yi r0 = (com.google.android.gms.internal.ads.yi) r0
            if (r0 == 0) goto L42
            long r1 = r0.j6
            com.google.android.gms.internal.ads.e<java.lang.Long> r3 = com.google.android.gms.internal.ads.p.aX
            com.google.android.gms.internal.ads.m r4 = com.google.android.gms.internal.ads.cw0.v5()
            java.lang.Object r3 = r4.FH(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r1 = r1 + r3
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.w0.we()
            long r3 = r3.j6()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L31
            r1 = 1
            goto L32
        L31:
            r1 = 0
        L32:
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.zzaua r1 = new com.google.android.gms.internal.ads.zzaua
            android.content.Context r2 = r6.j6
            com.google.android.gms.internal.ads.ui r0 = r0.DW
            r1.<init>(r2, r0)
            com.google.android.gms.internal.ads.ui r0 = r1.VH()
            goto L4d
        L42:
            com.google.android.gms.internal.ads.zzaua r0 = new com.google.android.gms.internal.ads.zzaua
            android.content.Context r1 = r6.j6
            r0.<init>(r1)
            com.google.android.gms.internal.ads.ui r0 = r0.VH()
        L4d:
            com.google.android.gms.internal.ads.wi r1 = r6.DW
            java.util.WeakHashMap r1 = com.google.android.gms.internal.ads.wi.j6(r1)
            android.content.Context r2 = r6.j6
            com.google.android.gms.internal.ads.yi r3 = new com.google.android.gms.internal.ads.yi
            com.google.android.gms.internal.ads.wi r4 = r6.DW
            r3.<init>(r4, r0)
            r1.put(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xi.call():java.lang.Object");
    }
}
