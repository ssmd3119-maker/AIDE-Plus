package com.jcraft.jsch.jcraft;

/* loaded from: classes.dex */
public class HMACMD596 extends HMACMD5 {
    private final byte[] Zo = new byte[16];

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public int FH() {
        return 12;
    }

    @Override // com.jcraft.jsch.jcraft.HMAC, com.jcraft.jsch.MAC
    public void Hw(byte[] bArr, int i) {
        super.Hw(this.Zo, 0);
        System.arraycopy(this.Zo, 0, bArr, i, 12);
    }
}
