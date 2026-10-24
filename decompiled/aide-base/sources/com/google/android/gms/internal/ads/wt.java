package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

@jg
/* loaded from: classes.dex */
public final class wt implements ma0 {
    private final ByteBuffer WB;

    wt(ByteBuffer byteBuffer) {
        this.WB = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void VH(long j) {
        this.WB.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.ma0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final long position() {
        return this.WB.position();
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final int read(ByteBuffer byteBuffer) {
        if (this.WB.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), this.WB.remaining());
        byte[] bArr = new byte[iMin];
        this.WB.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final long size() {
        return this.WB.limit();
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final ByteBuffer v5(long j, long j2) {
        int iPosition = this.WB.position();
        this.WB.position((int) j);
        ByteBuffer byteBufferSlice = this.WB.slice();
        byteBufferSlice.limit((int) j2);
        this.WB.position(iPosition);
        return byteBufferSlice;
    }
}
