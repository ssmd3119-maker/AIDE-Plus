package com.jcraft.jsch.jce;

import com.jcraft.jsch.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class AES128CBC implements Cipher {
    private javax.crypto.Cipher j6;

    @Override // com.jcraft.jsch.Cipher
    public int FH() {
        return 16;
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
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public void v5(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        if (bArr.length > 16) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            bArr = bArr4;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.j6 = javax.crypto.Cipher.getInstance("AES/CBC/NoPadding");
            synchronized (javax.crypto.Cipher.class) {
                this.j6.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
            }
        } catch (Exception e) {
            this.j6 = null;
            throw e;
        }
    }
}
