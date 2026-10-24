package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class j20 implements i30 {
    private final int DW;
    private final int FH;
    private final SecretKeySpec j6;

    public j20(byte[] bArr, int i) throws GeneralSecurityException {
        r30.j6(bArr.length);
        this.j6 = new SecretKeySpec(bArr, "AES");
        int blockSize = a30.Zo.DW("AES/CTR/NoPadding").getBlockSize();
        this.FH = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.DW = i;
    }

    @Override // com.google.android.gms.internal.ads.i30
    public final byte[] j6(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.DW;
        if (length > Integer.MAX_VALUE - i) {
            int i2 = Integer.MAX_VALUE - this.DW;
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i2);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[bArr.length + i];
        byte[] bArrFH = l30.FH(i);
        System.arraycopy(bArrFH, 0, bArr2, 0, this.DW);
        int length2 = bArr.length;
        int i3 = this.DW;
        Cipher cipherDW = a30.Zo.DW("AES/CTR/NoPadding");
        byte[] bArr3 = new byte[this.FH];
        System.arraycopy(bArrFH, 0, bArr3, 0, this.DW);
        cipherDW.init(1, this.j6, new IvParameterSpec(bArr3));
        if (cipherDW.doFinal(bArr, 0, length2, bArr2, i3) == length2) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
