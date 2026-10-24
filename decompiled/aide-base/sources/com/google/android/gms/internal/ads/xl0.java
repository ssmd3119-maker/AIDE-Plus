package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xl0 extends gf0 {
    private final long DW;
    private final long FH;
    private final int Hw;
    private final long VH;
    private final long Zo;
    private final km0 gn;
    private final long v5;

    public xl0(long j, long j2, int i, long j3, long j4, long j5, km0 km0Var) {
        this.DW = j;
        this.FH = j2;
        this.Hw = i;
        this.v5 = j3;
        this.Zo = j4;
        this.VH = j5;
        this.gn = km0Var;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final if0 FH(int i, if0 if0Var, boolean z) {
        ro0.Zo(i, 0, this.gn.FH());
        Integer numValueOf = null;
        String str = z ? this.gn.j6(i).j6 : null;
        if (z) {
            int i2 = this.Hw;
            ro0.Zo(i, 0, this.gn.FH());
            numValueOf = Integer.valueOf(i2 + i);
        }
        if0Var.j6(str, numValueOf, 0, this.gn.DW(i), ie0.DW(this.gn.j6(i).DW - this.gn.j6(0).DW) - this.v5, false);
        return if0Var;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final int VH() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final int Zo(Object obj) {
        int iIntValue;
        int i;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= (i = this.Hw) && iIntValue < i + gn()) {
            return iIntValue - this.Hw;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.gf0
    public final int gn() {
        return this.gn.FH();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r3
      0x0028: PHI (r3v2 long) = (r3v1 long), (r3v5 long) binds: [B:6:0x0018, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.gf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.jf0 v5(int r22, com.google.android.gms.internal.ads.jf0 r23, boolean r24, long r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = 0
            r2 = 1
            r3 = r22
            com.google.android.gms.internal.ads.ro0.Zo(r3, r1, r2)
            long r3 = r0.VH
            com.google.android.gms.internal.ads.km0 r5 = r0.gn
            boolean r5 = r5.FH
            if (r5 != 0) goto L14
        L11:
            r13 = r3
            goto L97
        L14:
            r5 = 0
            int r7 = (r25 > r5 ? 1 : (r25 == r5 ? 0 : -1))
            if (r7 <= 0) goto L28
            long r3 = r3 + r25
            long r5 = r0.Zo
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L28
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L11
        L28:
            long r5 = r0.v5
            long r5 = r5 + r3
            com.google.android.gms.internal.ads.km0 r7 = r0.gn
            long r7 = r7.DW(r1)
            r9 = 0
        L32:
            com.google.android.gms.internal.ads.km0 r10 = r0.gn
            int r10 = r10.FH()
            int r10 = r10 - r2
            if (r9 >= r10) goto L49
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L49
            long r5 = r5 - r7
            int r9 = r9 + 1
            com.google.android.gms.internal.ads.km0 r7 = r0.gn
            long r7 = r7.DW(r9)
            goto L32
        L49:
            com.google.android.gms.internal.ads.km0 r10 = r0.gn
            com.google.android.gms.internal.ads.om0 r9 = r10.j6(r9)
            java.util.List<com.google.android.gms.internal.ads.jm0> r10 = r9.FH
            int r10 = r10.size()
            r11 = 0
        L56:
            r12 = -1
            if (r11 >= r10) goto L6a
            java.util.List<com.google.android.gms.internal.ads.jm0> r13 = r9.FH
            java.lang.Object r13 = r13.get(r11)
            com.google.android.gms.internal.ads.jm0 r13 = (com.google.android.gms.internal.ads.jm0) r13
            int r13 = r13.DW
            r14 = 2
            if (r13 != r14) goto L67
            goto L6b
        L67:
            int r11 = r11 + 1
            goto L56
        L6a:
            r11 = -1
        L6b:
            if (r11 != r12) goto L6e
            goto L11
        L6e:
            java.util.List<com.google.android.gms.internal.ads.jm0> r9 = r9.FH
            java.lang.Object r9 = r9.get(r11)
            com.google.android.gms.internal.ads.jm0 r9 = (com.google.android.gms.internal.ads.jm0) r9
            java.util.List<com.google.android.gms.internal.ads.qm0> r9 = r9.FH
            java.lang.Object r1 = r9.get(r1)
            com.google.android.gms.internal.ads.qm0 r1 = (com.google.android.gms.internal.ads.qm0) r1
            com.google.android.gms.internal.ads.em0 r1 = r1.EQ()
            if (r1 == 0) goto L11
            int r9 = r1.FH(r7)
            if (r9 != 0) goto L8b
            goto L11
        L8b:
            int r7 = r1.DW(r5, r7)
            long r7 = r1.Hw(r7)
            long r3 = r3 + r7
            long r3 = r3 - r5
            goto L11
        L97:
            r6 = 0
            long r7 = r0.DW
            long r9 = r0.FH
            r11 = 1
            com.google.android.gms.internal.ads.km0 r1 = r0.gn
            boolean r12 = r1.FH
            long r3 = r0.Zo
            r17 = 0
            int r1 = r1.FH()
            int r18 = r1 + (-1)
            long r1 = r0.v5
            r5 = r23
            r15 = r3
            r19 = r1
            r5.j6(r6, r7, r9, r11, r12, r13, r15, r17, r18, r19)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xl0.v5(int, com.google.android.gms.internal.ads.jf0, boolean, long):com.google.android.gms.internal.ads.jf0");
    }
}
