package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class gf0 {
    public static final gf0 j6 = new hf0();

    private final jf0 Hw(int i, jf0 jf0Var) {
        return v5(i, jf0Var, false, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int DW(int r3, com.google.android.gms.internal.ads.if0 r4, com.google.android.gms.internal.ads.jf0 r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.FH(r3, r4, r0)
            com.google.android.gms.internal.ads.jf0 r4 = r2.Hw(r0, r5)
            int r4 = r4.FH
            r1 = 1
            if (r4 != r3) goto L34
            r3 = -1
            if (r6 == 0) goto L25
            if (r6 == r1) goto L23
            r4 = 2
            if (r6 != r4) goto L1d
            int r4 = r2.VH()
            int r4 = r4 - r1
            if (r4 != 0) goto L2d
            goto L23
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L23:
            r1 = 0
            goto L2d
        L25:
            int r4 = r2.VH()
            int r4 = r4 - r1
            if (r4 != 0) goto L2d
            r1 = -1
        L2d:
            if (r1 != r3) goto L30
            return r3
        L30:
            r2.Hw(r1, r5)
            return r0
        L34:
            int r3 = r3 + r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gf0.DW(int, com.google.android.gms.internal.ads.if0, com.google.android.gms.internal.ads.jf0, int):int");
    }

    public abstract if0 FH(int i, if0 if0Var, boolean z);

    public abstract int VH();

    public abstract int Zo(Object obj);

    public abstract int gn();

    public final boolean j6() {
        return VH() == 0;
    }

    public abstract jf0 v5(int i, jf0 jf0Var, boolean z, long j);
}
