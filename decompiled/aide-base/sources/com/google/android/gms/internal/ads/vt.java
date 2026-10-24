package com.google.android.gms.internal.ads;

import android.net.Uri;

@jg
/* loaded from: classes.dex */
public final class vt implements xn0 {
    private final long DW;
    private final xn0 FH;
    private long Hw;
    private final xn0 j6;
    private Uri v5;

    vt(xn0 xn0Var, int i, xn0 xn0Var2) {
        this.j6 = xn0Var;
        this.DW = i;
        this.FH = xn0Var2;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final long DW(bo0 bo0Var) {
        bo0 bo0Var2;
        this.v5 = bo0Var.j6;
        long j = bo0Var.Hw;
        long j2 = this.DW;
        bo0 bo0Var3 = null;
        if (j >= j2) {
            bo0Var2 = null;
        } else {
            long j3 = bo0Var.v5;
            bo0Var2 = new bo0(bo0Var.j6, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null);
        }
        long j4 = bo0Var.v5;
        if (j4 == -1 || bo0Var.Hw + j4 > this.DW) {
            long jMax = Math.max(this.DW, bo0Var.Hw);
            long j5 = bo0Var.v5;
            bo0Var3 = new bo0(bo0Var.j6, jMax, j5 != -1 ? Math.min(j5, (bo0Var.Hw + j5) - this.DW) : -1L, null);
        }
        long jDW = bo0Var2 != null ? this.j6.DW(bo0Var2) : 0L;
        long jDW2 = bo0Var3 != null ? this.FH.DW(bo0Var3) : 0L;
        this.Hw = bo0Var.Hw;
        if (jDW == -1 || jDW2 == -1) {
            return -1L;
        }
        return jDW + jDW2;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final Uri Jm() {
        return this.v5;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void close() {
        this.j6.close();
        this.FH.close();
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final int j6(byte[] bArr, int i, int i2) {
        int iJ6;
        long j = this.Hw;
        long j2 = this.DW;
        if (j < j2) {
            iJ6 = this.j6.j6(bArr, i, (int) Math.min(i2, j2 - j));
            this.Hw += iJ6;
        } else {
            iJ6 = 0;
        }
        if (this.Hw < this.DW) {
            return iJ6;
        }
        int iJ62 = this.FH.j6(bArr, i + iJ6, i2 - iJ6);
        int i3 = iJ6 + iJ62;
        this.Hw += iJ62;
        return i3;
    }
}
