package org.spongycastle.jcajce.provider.asymmetric.dh;

import abcd.gl0;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.DHParameterSpec;

/* loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    DHParameterSpec j6;

    protected AlgorithmParameterSpec DW(Class cls) throws InvalidParameterSpecException {
        if (cls == DHParameterSpec.class) {
            return this.j6;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            return new gl0(this.j6.getP(), this.j6.getG(), this.j6.getL()).Zo("DER");
        } catch (IOException unused) {
            throw new RuntimeException("Error encoding DHParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls != null) {
            return DW(cls);
        }
        throw new NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof DHParameterSpec)) {
            throw new InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
        }
        this.j6 = (DHParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    protected boolean j6(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (j6(str)) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            gl0 gl0VarGn = gl0.gn(bArr);
            if (gl0VarGn.u7() != null) {
                this.j6 = new DHParameterSpec(gl0VarGn.tp(), gl0VarGn.VH(), gl0VarGn.u7().intValue());
            } else {
                this.j6 = new DHParameterSpec(gl0VarGn.tp(), gl0VarGn.VH());
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IOException("Not a valid DH Parameter encoding.");
        } catch (ClassCastException unused2) {
            throw new IOException("Not a valid DH Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (j6(str)) {
            engineInit(bArr);
        } else {
            throw new IOException("Unknown parameter format " + str);
        }
    }
}
