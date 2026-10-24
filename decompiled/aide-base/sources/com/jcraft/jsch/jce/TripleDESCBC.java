package com.jcraft.jsch.jce;

import com.jcraft.jsch.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public class TripleDESCBC implements Cipher {
    private javax.crypto.Cipher j6;

    @Override // com.jcraft.jsch.Cipher
    public int FH() {
        return 24;
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean Hw() {
        return true;
    }

    @Override // com.jcraft.jsch.Cipher
    public void VH(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.j6.update(bArr, i, i2, bArr2, i3);
    }

    @Override // com.jcraft.jsch.Cipher
    public int Zo() {
        return 8;
    }

    @Override // com.jcraft.jsch.Cipher
    public void v5(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 8) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr2, 0, bArr3, 0, 8);
            bArr2 = bArr3;
        }
        if (bArr.length > 24) {
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArr, 0, bArr4, 0, 24);
            bArr = bArr4;
        }
        try {
            this.j6 = javax.crypto.Cipher.getInstance("DESede/CBC/NoPadding");
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(bArr));
            synchronized (javax.crypto.Cipher.class) {
                this.j6.init(i == 0 ? 1 : 2, secretKeyGenerateSecret, new IvParameterSpec(bArr2));
            }
        } catch (Exception e) {
            this.j6 = null;
            throw e;
        }
    }
}
