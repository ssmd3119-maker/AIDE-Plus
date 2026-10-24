package com.jcraft.jsch.jce;

import abcd.jp0;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;

/* loaded from: classes.dex */
public class DH implements com.jcraft.jsch.DH {
    BigInteger DW;
    BigInteger FH;
    byte[] Hw;
    byte[] VH;
    BigInteger Zo;
    private KeyPairGenerator gn;
    BigInteger j6;
    private KeyAgreement u7;
    BigInteger v5;

    @Override // com.jcraft.jsch.DH
    public void DW() {
        Security.addProvider(new jp0());
        this.gn = KeyPairGenerator.getInstance("DH", "SC");
        this.u7 = KeyAgreement.getInstance("DH", "SC");
    }

    @Override // com.jcraft.jsch.DH
    public byte[] FH() throws IllegalStateException, InvalidKeySpecException, InvalidKeyException {
        if (this.Zo == null) {
            this.u7.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(this.v5, this.j6, this.DW)), true);
            byte[] bArrGenerateSecret = this.u7.generateSecret();
            BigInteger bigInteger = new BigInteger(bArrGenerateSecret);
            this.Zo = bigInteger;
            this.VH = bigInteger.toByteArray();
            this.VH = bArrGenerateSecret;
        }
        return this.VH;
    }

    @Override // com.jcraft.jsch.DH
    public void Hw(byte[] bArr) {
        u7(new BigInteger(bArr));
    }

    void VH(BigInteger bigInteger) {
        this.v5 = bigInteger;
    }

    @Override // com.jcraft.jsch.DH
    public void Zo(byte[] bArr) {
        VH(new BigInteger(bArr));
    }

    void gn(BigInteger bigInteger) {
        this.DW = bigInteger;
    }

    @Override // com.jcraft.jsch.DH
    public byte[] j6() throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.FH == null) {
            this.gn.initialize(new DHParameterSpec(this.j6, this.DW));
            KeyPair keyPairGenerateKeyPair = this.gn.generateKeyPair();
            this.u7.init(keyPairGenerateKeyPair.getPrivate());
            keyPairGenerateKeyPair.getPublic().getEncoded();
            BigInteger y = ((DHPublicKey) keyPairGenerateKeyPair.getPublic()).getY();
            this.FH = y;
            this.Hw = y.toByteArray();
        }
        return this.Hw;
    }

    void u7(BigInteger bigInteger) {
        this.j6 = bigInteger;
    }

    @Override // com.jcraft.jsch.DH
    public void v5(byte[] bArr) {
        gn(new BigInteger(bArr));
    }
}
