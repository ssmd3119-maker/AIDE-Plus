package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bh0 implements fh0 {
    private static final byte[] VH = new byte[4096];
    private final long DW;
    private long FH;
    private byte[] Hw = new byte[65536];
    private int Zo;
    private final xn0 j6;
    private int v5;

    public bh0(xn0 xn0Var, long j, long j2) {
        this.j6 = xn0Var;
        this.FH = j;
        this.DW = j2;
    }

    private final void EQ(int i) {
        if (i != -1) {
            this.FH += i;
        }
    }

    private final boolean J0(int i, boolean z) throws InterruptedException, EOFException {
        int i2 = this.v5 + i;
        byte[] bArr = this.Hw;
        if (i2 > bArr.length) {
            this.Hw = Arrays.copyOf(this.Hw, ip0.Mr(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int iMin = Math.min(this.Zo - this.v5, i);
        while (iMin < i) {
            iMin = tp(this.Hw, this.v5, i, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i3 = this.v5 + i;
        this.v5 = i3;
        this.Zo = Math.max(this.Zo, i3);
        return true;
    }

    private final int J8(int i) {
        int iMin = Math.min(this.Zo, i);
        Ws(iMin);
        return iMin;
    }

    private final void Ws(int i) {
        int i2 = this.Zo - i;
        this.Zo = i2;
        this.v5 = 0;
        byte[] bArr = this.Hw;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        System.arraycopy(this.Hw, i, bArr, 0, this.Zo);
        this.Hw = bArr;
    }

    private final int tp(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, EOFException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iJ6 = this.j6.j6(bArr, i + i3, i2 - i3);
        if (iJ6 != -1) {
            return i3 + iJ6;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private final int we(byte[] bArr, int i, int i2) {
        int i3 = this.Zo;
        if (i3 == 0) {
            return 0;
        }
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.Hw, 0, bArr, i, iMin);
        Ws(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final int DW(int i) throws InterruptedException, EOFException {
        int iJ8 = J8(i);
        if (iJ8 == 0) {
            byte[] bArr = VH;
            iJ8 = tp(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        EQ(iJ8);
        return iJ8;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void FH(int i) throws InterruptedException, EOFException {
        int iJ8 = J8(i);
        while (iJ8 < i && iJ8 != -1) {
            byte[] bArr = VH;
            iJ8 = tp(bArr, -iJ8, Math.min(i, bArr.length + iJ8), iJ8, false);
        }
        EQ(iJ8);
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void Hw() {
        this.v5 = 0;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final boolean VH(byte[] bArr, int i, int i2, boolean z) throws InterruptedException, EOFException {
        int iWe = we(bArr, i, i2);
        while (iWe < i2 && iWe != -1) {
            iWe = tp(bArr, i, i2, iWe, z);
        }
        EQ(iWe);
        return iWe != -1;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final long Zo() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void gn(int i) throws InterruptedException, EOFException {
        J0(i, false);
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final int j6(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        int iWe = we(bArr, i, i2);
        if (iWe == 0) {
            iWe = tp(bArr, i, i2, 0, true);
        }
        EQ(iWe);
        return iWe;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void readFully(byte[] bArr, int i, int i2) throws InterruptedException, EOFException {
        VH(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final long u7() {
        return this.FH;
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void v5(byte[] bArr, int i, int i2) {
        if (J0(i2, false)) {
            System.arraycopy(this.Hw, this.v5 - i2, bArr, i, i2);
        }
    }
}
