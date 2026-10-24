package com.jcraft.jsch;

/* loaded from: classes.dex */
public class CipherNone implements Cipher {
    @Override // com.jcraft.jsch.Cipher
    public int FH() {
        return 16;
    }

    @Override // com.jcraft.jsch.Cipher
    public boolean Hw() {
        return false;
    }

    @Override // com.jcraft.jsch.Cipher
    public void VH(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
    }

    @Override // com.jcraft.jsch.Cipher
    public int Zo() {
        return 8;
    }

    @Override // com.jcraft.jsch.Cipher
    public void v5(int i, byte[] bArr, byte[] bArr2) {
    }
}
