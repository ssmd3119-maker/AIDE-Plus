package abcd;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

/* loaded from: classes.dex */
public class pq0 {
    private static Hashtable j6 = new Hashtable();
    private static Hashtable DW = new Hashtable();
    private static Set FH = new HashSet();

    static {
        j6.put("MD2WITHRSAENCRYPTION", hl0.v5);
        j6.put("MD2WITHRSA", hl0.v5);
        j6.put("MD5WITHRSAENCRYPTION", hl0.VH);
        j6.put("MD5WITHRSA", hl0.VH);
        j6.put("SHA1WITHRSAENCRYPTION", hl0.gn);
        j6.put("SHA1WITHRSA", hl0.gn);
        j6.put("SHA224WITHRSAENCRYPTION", hl0.J8);
        j6.put("SHA224WITHRSA", hl0.J8);
        j6.put("SHA256WITHRSAENCRYPTION", hl0.EQ);
        j6.put("SHA256WITHRSA", hl0.EQ);
        j6.put("SHA384WITHRSAENCRYPTION", hl0.we);
        j6.put("SHA384WITHRSA", hl0.we);
        j6.put("SHA512WITHRSAENCRYPTION", hl0.J0);
        j6.put("SHA512WITHRSA", hl0.J0);
        j6.put("SHA1WITHRSAANDMGF1", hl0.tp);
        j6.put("SHA224WITHRSAANDMGF1", hl0.tp);
        j6.put("SHA256WITHRSAANDMGF1", hl0.tp);
        j6.put("SHA384WITHRSAANDMGF1", hl0.tp);
        j6.put("SHA512WITHRSAANDMGF1", hl0.tp);
        j6.put("RIPEMD160WITHRSAENCRYPTION", kl0.Zo);
        j6.put("RIPEMD160WITHRSA", kl0.Zo);
        j6.put("RIPEMD128WITHRSAENCRYPTION", kl0.VH);
        j6.put("RIPEMD128WITHRSA", kl0.VH);
        j6.put("RIPEMD256WITHRSAENCRYPTION", kl0.gn);
        j6.put("RIPEMD256WITHRSA", kl0.gn);
        j6.put("SHA1WITHDSA", mm0.Ws);
        j6.put("DSAWITHSHA1", mm0.Ws);
        j6.put("SHA224WITHDSA", dl0.J8);
        j6.put("SHA256WITHDSA", dl0.Ws);
        j6.put("SHA384WITHDSA", dl0.QX);
        j6.put("SHA512WITHDSA", dl0.XL);
        j6.put("SHA1WITHECDSA", mm0.Hw);
        j6.put("ECDSAWITHSHA1", mm0.Hw);
        j6.put("SHA224WITHECDSA", mm0.VH);
        j6.put("SHA256WITHECDSA", mm0.gn);
        j6.put("SHA384WITHECDSA", mm0.u7);
        j6.put("SHA512WITHECDSA", mm0.tp);
        j6.put("GOST3411WITHGOST3410", vk0.Hw);
        j6.put("GOST3411WITHGOST3410-94", vk0.Hw);
        j6.put("GOST3411WITHECGOST3410", vk0.v5);
        j6.put("GOST3411WITHECGOST3410-2001", vk0.v5);
        j6.put("GOST3411WITHGOST3410-2001", vk0.v5);
        FH.add(mm0.Hw);
        FH.add(mm0.VH);
        FH.add(mm0.gn);
        FH.add(mm0.u7);
        FH.add(mm0.tp);
        FH.add(mm0.Ws);
        FH.add(dl0.J8);
        FH.add(dl0.Ws);
        FH.add(dl0.QX);
        FH.add(dl0.XL);
        FH.add(vk0.Hw);
        FH.add(vk0.v5);
        DW.put("SHA1WITHRSAANDMGF1", DW(new sl0(fl0.Hw, (mh0) new hj0()), 20));
        DW.put("SHA224WITHRSAANDMGF1", DW(new sl0(dl0.v5, (mh0) new hj0()), 28));
        DW.put("SHA256WITHRSAANDMGF1", DW(new sl0(dl0.DW, (mh0) new hj0()), 32));
        DW.put("SHA384WITHRSAANDMGF1", DW(new sl0(dl0.FH, (mh0) new hj0()), 48));
        DW.put("SHA512WITHRSAANDMGF1", DW(new sl0(dl0.Hw, (mh0) new hj0()), 64));
    }

    private static jl0 DW(sl0 sl0Var, int i) {
        return new jl0(sl0Var, new sl0(hl0.u7, (mh0) sl0Var), new sh0(i), new sh0(1));
    }

    public static jj0 FH(String str) {
        String strZo = iq0.Zo(str);
        return j6.containsKey(strZo) ? (jj0) j6.get(strZo) : new jj0(strZo);
    }

    public static sl0 Hw(jj0 jj0Var, String str) {
        if (FH.contains(jj0Var)) {
            return new sl0(jj0Var);
        }
        String strZo = iq0.Zo(str);
        return DW.containsKey(strZo) ? new sl0(jj0Var, (mh0) DW.get(strZo)) : new sl0(jj0Var, new hj0());
    }

    public static byte[] j6(jj0 jj0Var, String str, String str2, PrivateKey privateKey, SecureRandom secureRandom, mh0 mh0Var) throws SignatureException, InvalidKeyException {
        if (jj0Var == null) {
            throw new IllegalStateException("no signature algorithm specified");
        }
        Signature signatureV5 = v5(str, str2);
        if (secureRandom != null) {
            signatureV5.initSign(privateKey, secureRandom);
        } else {
            signatureV5.initSign(privateKey);
        }
        signatureV5.update(mh0Var.DW().Zo("DER"));
        return signatureV5.sign();
    }

    public static Signature v5(String str, String str2) {
        return str2 != null ? Signature.getInstance(str, str2) : Signature.getInstance(str);
    }
}
