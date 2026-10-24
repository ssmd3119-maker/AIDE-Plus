package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class p30 implements dy {
    private final o30 DW;
    private final o30 j6;

    p30(byte[] bArr) {
        this.j6 = DW(bArr, 1);
        this.DW = DW(bArr, 0);
    }

    abstract o30 DW(byte[] bArr, int i);

    @Override // com.google.android.gms.internal.ads.dy
    public byte[] j6(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        this.j6.Hw();
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + this.j6.Hw() + 16);
        if (byteBufferAllocate.remaining() < bArr.length + this.j6.Hw() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        this.j6.FH(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[this.j6.Hw()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.DW.v5(bArr3, 0).get(bArr4);
        int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
        int iRemaining = byteBufferAllocate.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr2);
        byteBufferOrder.position(length2);
        byteBufferOrder.put(byteBufferAllocate);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr2.length);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrDW = k30.DW(bArr4, byteBufferOrder.array());
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrDW);
        return byteBufferAllocate.array();
    }
}
