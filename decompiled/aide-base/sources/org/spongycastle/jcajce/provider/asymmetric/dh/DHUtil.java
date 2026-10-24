package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.ko0;
import abcd.oo0;
import abcd.po0;
import abcd.qo0;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;

/* loaded from: classes.dex */
public class DHUtil {
    public static ko0 generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify DH private key.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new po0(dHPrivateKey.getX(), new oo0(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG(), null, dHPrivateKey.getParams().getL()));
    }

    public static ko0 generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify DH public key.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new qo0(dHPublicKey.getY(), new oo0(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG(), null, dHPublicKey.getParams().getL()));
    }
}
