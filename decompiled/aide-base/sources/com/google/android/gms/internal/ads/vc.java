package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class vc extends FilterInputStream {
    private final long WB;
    private long mb;

    vc(InputStream inputStream, long j) {
        super(inputStream);
        this.WB = j;
    }

    final long j6() {
        return this.WB - this.mb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i = super.read();
        if (i != -1) {
            this.mb++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.mb += i3;
        }
        return i3;
    }
}
