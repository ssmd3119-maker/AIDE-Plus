package org.spongycastle.jcajce.provider.asymmetric;

import abcd.cp0;
import abcd.gp0;

/* loaded from: classes.dex */
public class DH$Mappings extends gp0 {
    @Override // abcd.fp0
    public void configure(cp0 cp0Var) {
        cp0Var.j6("KeyPairGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyPairGeneratorSpi");
        cp0Var.j6("Alg.Alias.KeyPairGenerator.DIFFIEHELLMAN", "DH");
        cp0Var.j6("KeyAgreement.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyAgreementSpi");
        cp0Var.j6("Alg.Alias.KeyAgreement.DIFFIEHELLMAN", "DH");
        cp0Var.j6("KeyFactory.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi");
        cp0Var.j6("Alg.Alias.KeyFactory.DIFFIEHELLMAN", "DH");
        cp0Var.j6("AlgorithmParameters.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParametersSpi");
        cp0Var.j6("Alg.Alias.AlgorithmParameters.DIFFIEHELLMAN", "DH");
        cp0Var.j6("Alg.Alias.AlgorithmParameterGenerator.DIFFIEHELLMAN", "DH");
        cp0Var.j6("AlgorithmParameterGenerator.DH", "org.spongycastle.jcajce.provider.asymmetric.dh.AlgorithmParameterGeneratorSpi");
    }
}
