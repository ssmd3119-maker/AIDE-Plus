package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.iq0;
import abcd.lo0;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class KeyAgreementSpi extends javax.crypto.KeyAgreementSpi {
    private static final Hashtable v5 = new Hashtable();
    private BigInteger DW;
    private BigInteger FH;
    private BigInteger Hw;
    private BigInteger j6;

    static {
        Integer num = new Integer(64);
        Integer num2 = new Integer(192);
        Integer num3 = new Integer(128);
        Integer num4 = new Integer(256);
        v5.put("DES", num);
        v5.put("DESEDE", num2);
        v5.put("BLOWFISH", num3);
        v5.put("AES", num4);
    }

    private byte[] j6(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.j6 == null) {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey)) {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.FH) || !dHPublicKey.getParams().getP().equals(this.DW)) {
            throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        if (z) {
            this.Hw = dHPublicKey.getY().modPow(this.j6, this.DW);
            return null;
        }
        BigInteger bigIntegerModPow = dHPublicKey.getY().modPow(this.j6, this.DW);
        this.Hw = bigIntegerModPow;
        return new BCDHPublicKey(bigIntegerModPow, dHPublicKey.getParams());
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected byte[] engineGenerateSecret() {
        if (this.j6 != null) {
            return j6(this.Hw);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (!(key instanceof DHPrivateKey)) {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.DW = dHPrivateKey.getParams().getP();
            this.FH = dHPrivateKey.getParams().getG();
        } else {
            if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.DW = dHParameterSpec.getP();
            this.FH = dHParameterSpec.getG();
        }
        BigInteger x = dHPrivateKey.getX();
        this.Hw = x;
        this.j6 = x;
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected int engineGenerateSecret(byte[] bArr, int i) throws ShortBufferException {
        if (this.j6 != null) {
            byte[] bArrJ6 = j6(this.Hw);
            if (bArr.length - i >= bArrJ6.length) {
                System.arraycopy(bArrJ6, 0, bArr, i, bArrJ6.length);
                return bArrJ6.length;
            }
            throw new ShortBufferException("DHKeyAgreement - buffer too short");
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected SecretKey engineGenerateSecret(String str) {
        if (this.j6 != null) {
            String strZo = iq0.Zo(str);
            byte[] bArrJ6 = j6(this.Hw);
            if (v5.containsKey(strZo)) {
                int iIntValue = ((Integer) v5.get(strZo)).intValue() / 8;
                byte[] bArr = new byte[iIntValue];
                System.arraycopy(bArrJ6, 0, bArr, 0, iIntValue);
                if (strZo.startsWith("DES")) {
                    lo0.DW(bArr);
                }
                return new SecretKeySpec(bArr, str);
            }
            return new SecretKeySpec(bArrJ6, str);
        }
        throw new IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            this.DW = dHPrivateKey.getParams().getP();
            this.FH = dHPrivateKey.getParams().getG();
            BigInteger x = dHPrivateKey.getX();
            this.Hw = x;
            this.j6 = x;
            return;
        }
        throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }
}
