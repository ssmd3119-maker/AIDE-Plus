package com.google.android.gms.internal.ads;

@jg
/* loaded from: classes.dex */
public final class t6 {
    private static final q6 j6 = q6.DW();
    private static final float DW = ((Float) cw0.v5().FH(p.eU)).floatValue();
    private static final long FH = ((Long) cw0.v5().FH(p.Jl)).longValue();
    private static final float Hw = ((Float) cw0.v5().FH(p.e3)).floatValue();
    private static final long v5 = ((Long) cw0.v5().FH(p.iW)).longValue();

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean DW() {
        /*
            com.google.android.gms.internal.ads.q6 r0 = com.google.android.gms.internal.ads.t6.j6
            int r0 = r0.u7()
            com.google.android.gms.internal.ads.q6 r1 = com.google.android.gms.internal.ads.t6.j6
            int r1 = r1.tp()
            com.google.android.gms.internal.ads.q6 r2 = com.google.android.gms.internal.ads.t6.j6
            int r2 = r2.gn()
            com.google.android.gms.internal.ads.q6 r3 = com.google.android.gms.internal.ads.t6.j6
            int r3 = r3.VH()
            int r2 = r2 + r3
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            r7 = 0
            r8 = 16
            if (r0 >= r8) goto L2f
            long r9 = com.google.android.gms.internal.ads.t6.v5
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 == 0) goto L2f
            int r9 = j6(r9, r0)
            goto L3e
        L2f:
            float r9 = com.google.android.gms.internal.ads.t6.Hw
            int r10 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r10 == 0) goto L3b
            float r10 = (float) r0
            float r9 = r9 * r10
            int r9 = (int) r9
            int r9 = r9 + r3
            goto L3e
        L3b:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L3e:
            if (r1 > r9) goto L5a
            if (r0 >= r8) goto L4d
            long r8 = com.google.android.gms.internal.ads.t6.FH
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L4d
            int r4 = j6(r8, r0)
            goto L57
        L4d:
            float r1 = com.google.android.gms.internal.ads.t6.DW
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L57
            float r0 = (float) r0
            float r1 = r1 * r0
            int r4 = (int) r1
        L57:
            if (r2 > r4) goto L5a
            return r3
        L5a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t6.DW():boolean");
    }

    private static int j6(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }
}
