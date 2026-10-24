package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public abstract class o30 implements i30 {
    static final int[] FH = Zo(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));
    private final int DW;
    final h30 j6;

    o30(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.j6 = h30.DW(bArr);
        this.DW = i;
    }

    static int DW(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    static int[] Zo(ByteBuffer byteBuffer) {
        IntBuffer intBufferAsIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    final void FH(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - Hw() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrFH = l30.FH(Hw());
        byteBuffer.put(bArrFH);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        int i = (iRemaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBufferV5 = v5(bArrFH, this.DW + i2);
            if (i2 == i - 1) {
                m20.j6(byteBuffer, byteBufferWrap, byteBufferV5, iRemaining % 64);
            } else {
                m20.j6(byteBuffer, byteBufferWrap, byteBufferV5, 64);
            }
        }
    }

    abstract int Hw();

    @Override // com.google.android.gms.internal.ads.i30
    public final byte[] j6(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        Hw();
        if (length > 2147483635) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Hw() + bArr.length);
        FH(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    abstract ByteBuffer v5(byte[] bArr, int i);
}
