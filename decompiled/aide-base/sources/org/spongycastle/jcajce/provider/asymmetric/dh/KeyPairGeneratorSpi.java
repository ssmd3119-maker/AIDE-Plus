package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.go0;
import abcd.io0;
import abcd.jp0;
import abcd.kn0;
import abcd.mo0;
import abcd.oo0;
import abcd.po0;
import abcd.qo0;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;

/* loaded from: classes.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    private static Hashtable VH = new Hashtable();
    go0 DW;
    int FH;
    int Hw;
    boolean Zo;
    mo0 j6;
    SecureRandom v5;

    public KeyPairGeneratorSpi() {
        super("DH");
        this.DW = new go0();
        this.FH = 1024;
        this.Hw = 20;
        this.v5 = new SecureRandom();
        this.Zo = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.Zo) {
            Integer num = new Integer(this.FH);
            if (VH.containsKey(num)) {
                this.j6 = (mo0) VH.get(num);
            } else {
                DHParameterSpec dHParameterSpecJ6 = jp0.jw.j6();
                if (dHParameterSpecJ6 == null || dHParameterSpecJ6.getP().bitLength() != this.FH) {
                    io0 io0Var = new io0();
                    io0Var.DW(this.FH, this.Hw, this.v5);
                    mo0 mo0Var = new mo0(this.v5, io0Var.j6());
                    this.j6 = mo0Var;
                    VH.put(num, mo0Var);
                } else {
                    this.j6 = new mo0(this.v5, new oo0(dHParameterSpecJ6.getP(), dHParameterSpecJ6.getG(), null, dHParameterSpecJ6.getL()));
                }
            }
            this.DW.DW(this.j6);
            this.Zo = true;
        }
        kn0 kn0VarJ6 = this.DW.j6();
        return new KeyPair(new BCDHPublicKey((qo0) kn0VarJ6.DW()), new BCDHPrivateKey((po0) kn0VarJ6.j6()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.FH = i;
        this.v5 = secureRandom;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            mo0 mo0Var = new mo0(secureRandom, new oo0(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
            this.j6 = mo0Var;
            this.DW.DW(mo0Var);
            this.Zo = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
    }
}
