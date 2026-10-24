package com.jcraft.jsch.jce;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;
import java.security.spec.InvalidKeySpecException;

/* loaded from: classes.dex */
public class SignatureDSA implements com.jcraft.jsch.SignatureDSA {
    KeyFactory DW;
    Signature j6;

    @Override // com.jcraft.jsch.Signature
    public void DW() {
        this.j6 = Signature.getInstance("SHA1withDSA");
        this.DW = KeyFactory.getInstance("DSA");
    }

    @Override // com.jcraft.jsch.Signature
    public boolean FH(byte[] bArr) {
        if (bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0) {
            int i = (((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255)) + 4;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = ((bArr[i] << 24) & (-16777216)) | ((bArr[i2] << 16) & 16711680);
            int i5 = i3 + 1;
            int i6 = i4 | ((bArr[i3] << 8) & 65280);
            int i7 = i5 + 1;
            int i8 = i6 | (bArr[i5] & 255);
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            bArr = bArr2;
        }
        byte b = (bArr[0] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte b2 = (bArr[20] & 128) != 0 ? (byte) 1 : (byte) 0;
        byte[] bArr3 = new byte[bArr.length + 6 + b + b2];
        bArr3[0] = 48;
        bArr3[1] = 44;
        bArr3[1] = (byte) (bArr3[1] + b);
        bArr3[1] = (byte) (bArr3[1] + b2);
        bArr3[2] = 2;
        bArr3[3] = 20;
        bArr3[3] = (byte) (bArr3[3] + b);
        System.arraycopy(bArr, 0, bArr3, b + 4, 20);
        bArr3[bArr3[3] + 4] = 2;
        bArr3[bArr3[3] + 5] = 20;
        int i9 = bArr3[3] + 5;
        bArr3[i9] = (byte) (bArr3[i9] + b2);
        System.arraycopy(bArr, 20, bArr3, bArr3[3] + 6 + b2, 20);
        return this.j6.verify(bArr3);
    }

    @Override // com.jcraft.jsch.Signature
    public void VH(byte[] bArr) throws SignatureException {
        this.j6.update(bArr);
    }

    @Override // com.jcraft.jsch.SignatureDSA
    public void Zo(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.j6.initVerify(this.DW.generatePublic(new DSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }

    @Override // com.jcraft.jsch.Signature
    public byte[] gn() throws SignatureException {
        byte[] bArrSign = this.j6.sign();
        int i = bArrSign[3] & 255;
        byte[] bArr = new byte[i];
        System.arraycopy(bArrSign, 4, bArr, 0, i);
        int i2 = 4 + i + 1;
        int i3 = i2 + 1;
        int i4 = bArrSign[i2] & 255;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArrSign, i3, bArr2, 0, i4);
        byte[] bArr3 = new byte[40];
        int i5 = i > 20 ? 1 : 0;
        int i6 = i > 20 ? 0 : 20 - i;
        if (i > 20) {
            i = 20;
        }
        System.arraycopy(bArr, i5, bArr3, i6, i);
        int i7 = i4 > 20 ? 1 : 0;
        int i8 = i4 > 20 ? 20 : 40 - i4;
        if (i4 > 20) {
            i4 = 20;
        }
        System.arraycopy(bArr2, i7, bArr3, i8, i4);
        return bArr3;
    }

    @Override // com.jcraft.jsch.SignatureDSA
    public void j6(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeySpecException, InvalidKeyException {
        this.j6.initSign(this.DW.generatePrivate(new DSAPrivateKeySpec(new BigInteger(bArr), new BigInteger(bArr2), new BigInteger(bArr3), new BigInteger(bArr4))));
    }
}
