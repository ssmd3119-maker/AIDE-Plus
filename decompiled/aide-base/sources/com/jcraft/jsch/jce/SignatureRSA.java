package com.jcraft.jsch.jce;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes.dex */
public class SignatureRSA implements com.jcraft.jsch.SignatureRSA {
    KeyFactory DW;
    Signature j6;

    @Override // com.jcraft.jsch.Signature
    public void DW() {
        this.j6 = Signature.getInstance("SHA1withRSA");
        this.DW = KeyFactory.getInstance("RSA");
    }

    @Override // com.jcraft.jsch.Signature
    public boolean FH(byte[] bArr) {
        if (bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0) {
            int i = 4 + (((bArr[1] << 16) & 16711680) | ((bArr[0] << 24) & (-16777216)) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255));
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = ((bArr[i2] << 16) & 16711680) | ((bArr[i] << 24) & (-16777216));
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr[i3] << 8) & 65280);
            int i7 = i5 + 1;
            int i8 = i6 | (bArr[i5] & 255);
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            bArr = bArr2;
        }
        return this.j6.verify(bArr);
    }

    @Override // com.jcraft.jsch.SignatureRSA
    public void Hw(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.j6.initVerify(this.DW.generatePublic(new RSAPublicKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }

    @Override // com.jcraft.jsch.Signature
    public void VH(byte[] bArr) throws SignatureException {
        this.j6.update(bArr);
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] gn() {
        return this.j6.sign();
    }

    @Override // com.jcraft.jsch.SignatureRSA
    public void v5(byte[] bArr, byte[] bArr2) throws InvalidKeySpecException, InvalidKeyException {
        this.j6.initSign(this.DW.generatePrivate(new RSAPrivateKeySpec(new BigInteger(bArr2), new BigInteger(bArr))));
    }
}
