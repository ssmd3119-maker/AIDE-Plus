package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class uj extends ByteArrayOutputStream {
    private final c9 WB;

    public uj(c9 c9Var, int i) {
        this.WB = c9Var;
        ((ByteArrayOutputStream) this).buf = c9Var.DW(Math.max(i, 256));
    }

    private final void j6(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrDW = this.WB.DW((i2 + i) << 1);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrDW, 0, ((ByteArrayOutputStream) this).count);
        this.WB.j6(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrDW;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.WB.j6(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.WB.j6(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        j6(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        j6(1);
        super.write(i);
    }
}
