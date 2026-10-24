package com.jcraft.jsch.jce;

import com.jcraft.jsch.MAC;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class HMAC implements MAC {
    protected String DW;
    private Mac FH;
    private final byte[] Hw = new byte[4];
    protected int j6;

    HMAC() {
    }

    @Override // com.jcraft.jsch.MAC
    public int FH() {
        return this.j6;
    }

    @Override // com.jcraft.jsch.MAC
    public void Hw(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        try {
            this.FH.doFinal(bArr, i);
        } catch (ShortBufferException e) {
            System.err.println(e);
        }
    }

    @Override // com.jcraft.jsch.MAC
    public void Zo(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        int length = bArr.length;
        int i = this.j6;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.DW);
        Mac mac = Mac.getInstance(this.DW);
        this.FH = mac;
        mac.init(secretKeySpec);
    }

    @Override // com.jcraft.jsch.MAC
    public void j6(byte[] bArr, int i, int i2) throws IllegalStateException {
        this.FH.update(bArr, i, i2);
    }

    @Override // com.jcraft.jsch.MAC
    public void v5(int i) throws IllegalStateException {
        byte[] bArr = this.Hw;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        j6(bArr, 0, 4);
    }
}
