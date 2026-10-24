package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class l20 implements dy {
    private final SecretKey j6;

    public l20(byte[] bArr) throws InvalidAlgorithmParameterException {
        r30.j6(bArr.length);
        this.j6 = new SecretKeySpec(bArr, "AES");
    }

    private static AlgorithmParameterSpec DW(byte[] bArr, int i, int i2) throws GeneralSecurityException, ClassNotFoundException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (q30.j6()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.android.gms.internal.ads.dy
    public final byte[] j6(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrFH = l30.FH(12);
        System.arraycopy(bArrFH, 0, bArr3, 0, 12);
        Cipher cipherDW = a30.Zo.DW("AES/GCM/NoPadding");
        cipherDW.init(1, this.j6, DW(bArrFH, 0, bArrFH.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherDW.updateAAD(bArr2);
        }
        int iDoFinal = cipherDW.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }
}
