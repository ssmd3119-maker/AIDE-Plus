package com.jcraft.jsch.jce;

/* loaded from: classes.dex */
public class HMACSHA196 extends HMACSHA1 {
    private final byte[] v5 = new byte[20];

    @Override // com.jcraft.jsch.jce.HMAC, com.jcraft.jsch.MAC
    public int FH() {
        return 12;
    }

    @Override // com.jcraft.jsch.jce.HMAC, com.jcraft.jsch.MAC
    public void Hw(byte[] bArr, int i) {
        super.Hw(this.v5, 0);
        System.arraycopy(this.v5, 0, bArr, i, 12);
    }
}
