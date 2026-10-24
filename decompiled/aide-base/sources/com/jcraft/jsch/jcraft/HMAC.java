package com.jcraft.jsch.jcraft;

import java.security.DigestException;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class HMAC {
    private byte[] j6 = null;
    private byte[] DW = null;
    private MessageDigest FH = null;
    private int Hw = 0;
    private final byte[] v5 = new byte[4];

    HMAC() {
    }

    protected void DW(MessageDigest messageDigest) {
        this.FH = messageDigest;
        this.Hw = messageDigest.getDigestLength();
    }

    public int FH() {
        return this.Hw;
    }

    public void Hw(byte[] bArr, int i) throws DigestException {
        byte[] bArrDigest = this.FH.digest();
        this.FH.update(this.DW, 0, 64);
        this.FH.update(bArrDigest, 0, this.Hw);
        try {
            this.FH.digest(bArr, i, this.Hw);
        } catch (Exception unused) {
        }
        this.FH.update(this.j6, 0, 64);
    }

    public void Zo(byte[] bArr) {
        this.FH.reset();
        int length = bArr.length;
        int i = this.Hw;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        if (bArr.length > 64) {
            this.FH.update(bArr, 0, bArr.length);
            bArr = this.FH.digest();
        }
        byte[] bArr3 = new byte[64];
        this.j6 = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        byte[] bArr4 = new byte[64];
        this.DW = bArr4;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        for (int i2 = 0; i2 < 64; i2++) {
            byte[] bArr5 = this.j6;
            bArr5[i2] = (byte) (bArr5[i2] ^ 54);
            byte[] bArr6 = this.DW;
            bArr6[i2] = (byte) (bArr6[i2] ^ 92);
        }
        this.FH.update(this.j6, 0, 64);
    }

    public void j6(byte[] bArr, int i, int i2) {
        this.FH.update(bArr, i, i2);
    }

    public void v5(int i) {
        byte[] bArr = this.v5;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        j6(bArr, 0, 4);
    }
}
