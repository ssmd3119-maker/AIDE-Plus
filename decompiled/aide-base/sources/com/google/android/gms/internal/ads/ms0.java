package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@jg
/* loaded from: classes.dex */
public final class ms0 extends hs0 {
    private MessageDigest FH;

    @Override // com.google.android.gms.internal.ads.hs0
    public final byte[] j6(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = 4;
        if (strArrSplit.length == 1) {
            int iJ6 = ls0.j6(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iJ6);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (strArrSplit.length < 5) {
                bArr = new byte[strArrSplit.length << 1];
                for (int i = 0; i < strArrSplit.length; i++) {
                    int iJ62 = ls0.j6(strArrSplit[i]);
                    int i2 = (iJ62 >> 16) ^ (65535 & iJ62);
                    byte[] bArr2 = {(byte) i2, (byte) (i2 >> 8)};
                    int i3 = i << 1;
                    bArr[i3] = bArr2[0];
                    bArr[i3 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[strArrSplit.length];
                for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                    int iJ63 = ls0.j6(strArrSplit[i4]);
                    bArr[i4] = (byte) ((iJ63 >> 24) ^ (((iJ63 & 255) ^ ((iJ63 >> 8) & 255)) ^ ((iJ63 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.FH = DW();
        synchronized (this.j6) {
            if (this.FH == null) {
                return new byte[0];
            }
            this.FH.reset();
            this.FH.update(bArrArray);
            byte[] bArrDigest = this.FH.digest();
            if (bArrDigest.length <= 4) {
                length = bArrDigest.length;
            }
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr3, 0, length);
            return bArr3;
        }
    }
}
