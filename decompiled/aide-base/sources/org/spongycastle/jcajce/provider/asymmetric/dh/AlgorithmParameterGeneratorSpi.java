package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.io0;
import abcd.jp0;
import abcd.oo0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;

/* loaded from: classes.dex */
public class AlgorithmParameterGeneratorSpi extends java.security.AlgorithmParameterGeneratorSpi {
    protected int DW = 1024;
    private int FH = 0;
    protected SecureRandom j6;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected AlgorithmParameters engineGenerateParameters() throws NoSuchAlgorithmException, InvalidParameterSpecException, NoSuchProviderException {
        io0 io0Var = new io0();
        SecureRandom secureRandom = this.j6;
        if (secureRandom != null) {
            io0Var.DW(this.DW, 20, secureRandom);
        } else {
            io0Var.DW(this.DW, 20, new SecureRandom());
        }
        oo0 oo0VarJ6 = io0Var.j6();
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("DH", jp0.mb);
            algorithmParameters.init(new DHParameterSpec(oo0VarJ6.v5(), oo0VarJ6.DW(), this.FH));
            return algorithmParameters;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(int i, SecureRandom secureRandom) {
        this.DW = i;
        this.j6 = secureRandom;
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHGenParameterSpec) {
            DHGenParameterSpec dHGenParameterSpec = (DHGenParameterSpec) algorithmParameterSpec;
            this.DW = dHGenParameterSpec.getPrimeSize();
            this.FH = dHGenParameterSpec.getExponentSize();
            this.j6 = secureRandom;
            return;
        }
        throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }
}
