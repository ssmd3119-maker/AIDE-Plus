package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class k20 implements dy {
    private final byte[] DW;
    private final SecretKeySpec FH;
    private final int Hw;
    private final byte[] j6;

    public k20(byte[] bArr, int i) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.Hw = i;
        r30.j6(bArr.length);
        this.FH = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
        cipher.init(1, this.FH);
        byte[] bArrHw = Hw(cipher.doFinal(new byte[16]));
        this.j6 = bArrHw;
        this.DW = Hw(bArrHw);
    }

    private final byte[] DW(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrFH;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(FH(bArr2, this.j6));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArrDoFinal[i5] = (byte) (bArrDoFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i4 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrFH = FH(bArrCopyOfRange, this.j6);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.DW, 16);
            for (int i6 = 0; i6 < bArrCopyOfRange.length; i6++) {
                bArrCopyOf[i6] = (byte) (bArrCopyOf[i6] ^ bArrCopyOfRange[i6]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
            bArrFH = bArrCopyOf;
        }
        return cipher.doFinal(FH(bArrDoFinal, bArrFH));
    }

    private static byte[] FH(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private static byte[] Hw(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) ((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7));
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.dy
    public final byte[] j6(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.Hw;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i + 16];
        byte[] bArrFH = l30.FH(i);
        System.arraycopy(bArrFH, 0, bArr3, 0, this.Hw);
        Cipher cipher = Cipher.getInstance("AES/ECB/NOPADDING");
        cipher.init(1, this.FH);
        byte[] bArrDW = DW(cipher, 0, bArrFH, 0, bArrFH.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrDW2 = DW(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = Cipher.getInstance("AES/CTR/NOPADDING");
        cipher2.init(1, this.FH, new IvParameterSpec(bArrDW));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.Hw);
        byte[] bArrDW3 = DW(cipher, 2, bArr3, this.Hw, bArr.length);
        int length2 = bArr.length + this.Hw;
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[length2 + i2] = (byte) ((bArrDW2[i2] ^ bArrDW[i2]) ^ bArrDW3[i2]);
        }
        return bArr3;
    }
}
