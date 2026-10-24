package abcd;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

/* loaded from: classes.dex */
public class np0 {
    private static final th0 j6 = new hj0();

    public static String DW(sl0 sl0Var) {
        mh0 mh0VarEQ = sl0Var.EQ();
        if (mh0VarEQ != null && !j6.equals(mh0VarEQ)) {
            if (sl0Var.tp().equals(hl0.tp)) {
                return String.valueOf(j6(jl0.gn(mh0VarEQ).VH().tp())) + "withRSAandMGF1";
            }
            if (sl0Var.tp().equals(mm0.Zo)) {
                return String.valueOf(j6((jj0) bi0.J8(mh0VarEQ).XL(0))) + "withECDSA";
            }
        }
        return sl0Var.tp().XL();
    }

    public static void FH(Signature signature, mh0 mh0Var) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidAlgorithmParameterException {
        if (mh0Var == null || j6.equals(mh0Var)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(mh0Var.DW().v5());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e) {
                    throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                }
            }
        } catch (IOException e2) {
            throw new SignatureException("IOException decoding parameters: " + e2.getMessage());
        }
    }

    private static String j6(jj0 jj0Var) {
        return hl0.ei.equals(jj0Var) ? "MD5" : fl0.Hw.equals(jj0Var) ? "SHA1" : dl0.v5.equals(jj0Var) ? "SHA224" : dl0.DW.equals(jj0Var) ? "SHA256" : dl0.FH.equals(jj0Var) ? "SHA384" : dl0.Hw.equals(jj0Var) ? "SHA512" : kl0.FH.equals(jj0Var) ? "RIPEMD128" : kl0.DW.equals(jj0Var) ? "RIPEMD160" : kl0.Hw.equals(jj0Var) ? "RIPEMD256" : vk0.j6.equals(jj0Var) ? "GOST3411" : jj0Var.XL();
    }
}
