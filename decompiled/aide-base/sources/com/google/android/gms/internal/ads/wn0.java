package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final class wn0 implements xn0 {
    private Uri DW;
    private int FH;
    private int Hw;
    private final byte[] j6;

    public wn0(byte[] bArr) {
        ro0.FH(bArr);
        ro0.j6(bArr.length > 0);
        this.j6 = bArr;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final long DW(bo0 bo0Var) throws IOException {
        this.DW = bo0Var.j6;
        long j = bo0Var.Hw;
        this.FH = (int) j;
        long length = bo0Var.v5;
        if (length == -1) {
            length = this.j6.length - j;
        }
        int i = (int) length;
        this.Hw = i;
        if (i > 0 && this.FH + i <= this.j6.length) {
            return i;
        }
        int i2 = this.FH;
        long j2 = bo0Var.v5;
        int length2 = this.j6.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j2);
        sb.append("], length: ");
        sb.append(length2);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final Uri Jm() {
        return this.DW;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final void close() {
        this.DW = null;
    }

    @Override // com.google.android.gms.internal.ads.xn0
    public final int j6(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.Hw;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.j6, this.FH, bArr, i, iMin);
        this.FH += iMin;
        this.Hw -= iMin;
        return iMin;
    }
}
