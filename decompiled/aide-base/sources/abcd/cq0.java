package abcd;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class cq0 {
    private static final Map DW = new HashMap();
    private static final Map FH = new HashMap();
    private static final Map Hw = new HashMap();
    private static final Map v5 = new HashMap();
    private wo0 j6;

    static {
        DW.put(new vh0("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        DW.put(hl0.J8, "SHA224WITHRSA");
        DW.put(hl0.EQ, "SHA256WITHRSA");
        DW.put(hl0.we, "SHA384WITHRSA");
        DW.put(hl0.J0, "SHA512WITHRSA");
        DW.put(vk0.Hw, "GOST3411WITHGOST3410");
        DW.put(vk0.v5, "GOST3411WITHECGOST3410");
        DW.put(new vh0("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        DW.put(new vh0("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        DW.put(new vh0("1.2.840.10040.4.3"), "SHA1WITHDSA");
        DW.put(mm0.Hw, "SHA1WITHECDSA");
        DW.put(mm0.VH, "SHA224WITHECDSA");
        DW.put(mm0.gn, "SHA256WITHECDSA");
        DW.put(mm0.u7, "SHA384WITHECDSA");
        DW.put(mm0.tp, "SHA512WITHECDSA");
        DW.put(fl0.Zo, "SHA1WITHRSA");
        DW.put(fl0.v5, "SHA1WITHDSA");
        DW.put(dl0.J8, "SHA224WITHDSA");
        DW.put(dl0.Ws, "SHA256WITHDSA");
        FH.put(hl0.Hw, "RSA/ECB/PKCS1Padding");
        Hw.put(hl0.Eq, "DESEDEWrap");
        Hw.put(hl0.hz, "RC2Wrap");
        Hw.put(dl0.gn, "AESWrap");
        Hw.put(dl0.tp, "AESWrap");
        Hw.put(dl0.we, "AESWrap");
        Hw.put(el0.j6, "CamelliaWrap");
        Hw.put(el0.DW, "CamelliaWrap");
        Hw.put(el0.FH, "CamelliaWrap");
        Hw.put(yk0.j6, "SEEDWrap");
        Hw.put(hl0.yS, "DESede");
        v5.put(dl0.Zo, "AES");
        v5.put(dl0.VH, "AES");
        v5.put(dl0.u7, "AES");
        v5.put(dl0.EQ, "AES");
        v5.put(hl0.yS, "DESede");
        v5.put(hl0.gW, "RC2");
    }

    public cq0(wo0 wo0Var) {
        this.j6 = wo0Var;
    }

    private static String FH(vh0 vh0Var) {
        return hl0.ei.equals(vh0Var) ? "MD5" : fl0.Hw.equals(vh0Var) ? "SHA1" : dl0.v5.equals(vh0Var) ? "SHA224" : dl0.DW.equals(vh0Var) ? "SHA256" : dl0.FH.equals(vh0Var) ? "SHA384" : dl0.Hw.equals(vh0Var) ? "SHA512" : kl0.FH.equals(vh0Var) ? "RIPEMD128" : kl0.DW.equals(vh0Var) ? "RIPEMD160" : kl0.Hw.equals(vh0Var) ? "RIPEMD256" : vk0.j6.equals(vh0Var) ? "GOST3411" : vh0Var.XL();
    }

    private static String Hw(sl0 sl0Var) {
        mh0 mh0VarEQ = sl0Var.EQ();
        if (mh0VarEQ == null || hj0.WB.equals(mh0VarEQ) || !sl0Var.VH().equals(hl0.tp)) {
            return DW.containsKey(sl0Var.VH()) ? (String) DW.get(sl0Var.VH()) : sl0Var.VH().XL();
        }
        return String.valueOf(FH(jl0.gn(mh0VarEQ).VH().VH())) + "WITHRSAANDMGF1";
    }

    public Signature DW(sl0 sl0Var) throws NoSuchAlgorithmException {
        try {
            return this.j6.DW(Hw(sl0Var));
        } catch (NoSuchAlgorithmException e) {
            if (DW.get(sl0Var.VH()) == null) {
                throw e;
            }
            return this.j6.DW((String) DW.get(sl0Var.VH()));
        }
    }

    public MessageDigest j6(sl0 sl0Var) throws NoSuchAlgorithmException {
        try {
            return this.j6.j6(FH(sl0Var.VH()));
        } catch (NoSuchAlgorithmException e) {
            if (DW.get(sl0Var.VH()) == null) {
                throw e;
            }
            return this.j6.j6((String) DW.get(sl0Var.VH()));
        }
    }
}
