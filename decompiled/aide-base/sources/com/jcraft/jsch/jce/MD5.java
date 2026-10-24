package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class MD5 implements HASH {
    MessageDigest j6;

    @Override // com.jcraft.jsch.HASH
    public void DW() {
        try {
            this.j6 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override // com.jcraft.jsch.HASH
    public int FH() {
        return 16;
    }

    @Override // com.jcraft.jsch.HASH
    public byte[] Hw() {
        return this.j6.digest();
    }

    @Override // com.jcraft.jsch.HASH
    public void j6(byte[] bArr, int i, int i2) {
        this.j6.update(bArr, i, i2);
    }
}
