package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.hl0;
import abcd.il0;
import abcd.mm0;
import abcd.vh0;
import abcd.yl0;
import abcd.zo0;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;

/* loaded from: classes.dex */
public class KeyFactorySpi extends zo0 {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.zo0, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof DHPrivateKeySpec ? new BCDHPrivateKey((DHPrivateKeySpec) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.zo0, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof DHPublicKeySpec ? new BCDHPublicKey((DHPublicKeySpec) keySpec) : super.engineGeneratePublic(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // abcd.zo0, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(DHPrivateKeySpec.class) && (key instanceof DHPrivateKey)) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
            return new DHPrivateKeySpec(dHPrivateKey.getX(), dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG());
        }
        if (!cls.isAssignableFrom(DHPublicKeySpec.class) || !(key instanceof DHPublicKey)) {
            return super.engineGetKeySpec(key, cls);
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        return new DHPublicKeySpec(dHPublicKey.getY(), dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG());
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) throws InvalidKeyException {
        if (key instanceof DHPublicKey) {
            return new BCDHPublicKey((DHPublicKey) key);
        }
        if (key instanceof DHPrivateKey) {
            return new BCDHPrivateKey((DHPrivateKey) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // abcd.hp0
    public PrivateKey generatePrivate(il0 il0Var) throws IOException {
        vh0 vh0VarVH = il0Var.gn().VH();
        if (vh0VarVH.equals(hl0.QX)) {
            return new BCDHPrivateKey(il0Var);
        }
        if (vh0VarVH.equals(mm0.aM)) {
            return new BCDHPrivateKey(il0Var);
        }
        throw new IOException("algorithm identifier " + vh0VarVH + " in key not recognised");
    }

    @Override // abcd.hp0
    public PublicKey generatePublic(yl0 yl0Var) throws IOException {
        vh0 vh0VarVH = yl0Var.VH().VH();
        if (vh0VarVH.equals(hl0.QX)) {
            return new BCDHPublicKey(yl0Var);
        }
        if (vh0VarVH.equals(mm0.aM)) {
            return new BCDHPublicKey(yl0Var);
        }
        throw new IOException("algorithm identifier " + vh0VarVH + " in key not recognised");
    }
}
