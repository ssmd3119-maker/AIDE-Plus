package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lg0 implements mf0 {
    private int DW = -1;
    private int FH = -1;
    private int Hw = 0;
    private boolean VH;
    private ByteBuffer Zo;
    private ByteBuffer v5;

    public lg0() {
        ByteBuffer byteBuffer = mf0.j6;
        this.v5 = byteBuffer;
        this.Zo = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void DW() {
        flush();
        this.v5 = mf0.j6;
        this.DW = -1;
        this.FH = -1;
        this.Hw = 0;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final int FH() {
        return this.FH;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final ByteBuffer Hw() {
        ByteBuffer byteBuffer = this.Zo;
        this.Zo = mf0.j6;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final int VH() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean Zo() {
        int i = this.Hw;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void flush() {
        this.Zo = mf0.j6;
        this.VH = false;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final void gn() {
        this.VH = true;
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean ro() {
        return this.VH && this.Zo == mf0.j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[ADDED_TO_REGION, LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0
      0x0081: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.mf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.Hw
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 << 1
        L23:
            java.nio.ByteBuffer r3 = r7.v5
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.v5 = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.v5
            r2.clear()
        L3f:
            int r2 = r7.Hw
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.v5
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.v5
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.v5
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.v5
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.v5
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.v5
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.v5
            r8.flip()
            java.nio.ByteBuffer r8 = r7.v5
            r7.Zo = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lg0.u7(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.mf0
    public final boolean v5(int i, int i2, int i3) throws nf0 {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new nf0(i, i2, i3);
        }
        if (this.DW == i && this.FH == i2 && this.Hw == i3) {
            return false;
        }
        this.DW = i;
        this.FH = i2;
        this.Hw = i3;
        if (i3 != 2) {
            return true;
        }
        this.v5 = mf0.j6;
        return true;
    }
}
