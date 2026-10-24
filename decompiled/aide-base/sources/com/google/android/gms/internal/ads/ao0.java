package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class ao0 extends InputStream {
    private final xn0 WB;
    private long k2;
    private final bo0 mb;
    private boolean fY = false;
    private boolean qp = false;
    private final byte[] jw = new byte[1];

    public ao0(xn0 xn0Var, bo0 bo0Var) {
        this.WB = xn0Var;
        this.mb = bo0Var;
    }

    private final void FH() {
        if (this.fY) {
            return;
        }
        this.WB.DW(this.mb);
        this.fY = true;
    }

    public final long DW() {
        return this.k2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.qp) {
            return;
        }
        this.WB.close();
        this.qp = true;
    }

    public final void j6() {
        FH();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.jw) == -1) {
            return -1;
        }
        return this.jw[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ro0.Hw(!this.qp);
        FH();
        int iJ6 = this.WB.j6(bArr, i, i2);
        if (iJ6 == -1) {
            return -1;
        }
        this.k2 += iJ6;
        return iJ6;
    }
}
