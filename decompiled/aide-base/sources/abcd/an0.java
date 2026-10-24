package abcd;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class an0 {
    static final an0 j6 = new an0();
    private static final Map DW = new HashMap();
    private static final Map FH = new HashMap();
    private static final Map Hw = new HashMap();

    static {
        j6(dl0.J8, "SHA224", "DSA");
        j6(dl0.Ws, "SHA256", "DSA");
        j6(dl0.QX, "SHA384", "DSA");
        j6(dl0.XL, "SHA512", "DSA");
        j6(fl0.v5, "SHA1", "DSA");
        j6(fl0.j6, "MD4", "RSA");
        j6(fl0.FH, "MD4", "RSA");
        j6(fl0.DW, "MD5", "RSA");
        j6(fl0.Zo, "SHA1", "RSA");
        j6(hl0.v5, "MD2", "RSA");
        j6(hl0.Zo, "MD4", "RSA");
        j6(hl0.VH, "MD5", "RSA");
        j6(hl0.gn, "SHA1", "RSA");
        j6(hl0.J8, "SHA224", "RSA");
        j6(hl0.EQ, "SHA256", "RSA");
        j6(hl0.we, "SHA384", "RSA");
        j6(hl0.J0, "SHA512", "RSA");
        j6(mm0.Hw, "SHA1", "ECDSA");
        j6(mm0.VH, "SHA224", "ECDSA");
        j6(mm0.gn, "SHA256", "ECDSA");
        j6(mm0.u7, "SHA384", "ECDSA");
        j6(mm0.tp, "SHA512", "ECDSA");
        j6(mm0.Ws, "SHA1", "DSA");
        j6(wk0.J0, "SHA1", "ECDSA");
        j6(wk0.J8, "SHA224", "ECDSA");
        j6(wk0.Ws, "SHA256", "ECDSA");
        j6(wk0.QX, "SHA384", "ECDSA");
        j6(wk0.XL, "SHA512", "ECDSA");
        j6(wk0.gn, "SHA1", "RSA");
        j6(wk0.u7, "SHA256", "RSA");
        j6(wk0.tp, "SHA1", "RSAandMGF1");
        j6(wk0.EQ, "SHA256", "RSAandMGF1");
        DW.put(mm0.J8.XL(), "DSA");
        DW.put(hl0.Hw.XL(), "RSA");
        DW.put(kl0.v5, "RSA");
        DW.put(jm0.jO.XL(), "RSA");
        DW.put(zm0.J8, "RSAandMGF1");
        DW.put(vk0.DW.XL(), "GOST3410");
        DW.put(vk0.FH.XL(), "ECGOST3410");
        DW.put("1.3.6.1.4.1.5849.1.6.2", "ECGOST3410");
        DW.put("1.3.6.1.4.1.5849.1.1.5", "GOST3410");
        DW.put(vk0.v5.XL(), "ECGOST3410");
        DW.put(vk0.Hw.XL(), "GOST3410");
        FH.put(hl0.vy.XL(), "MD2");
        FH.put(hl0.P8.XL(), "MD4");
        FH.put(hl0.ei.XL(), "MD5");
        FH.put(fl0.Hw.XL(), "SHA1");
        FH.put(dl0.v5.XL(), "SHA224");
        FH.put(dl0.DW.XL(), "SHA256");
        FH.put(dl0.FH.XL(), "SHA384");
        FH.put(dl0.Hw.XL(), "SHA512");
        FH.put(kl0.FH.XL(), "RIPEMD128");
        FH.put(kl0.DW.XL(), "RIPEMD160");
        FH.put(kl0.Hw.XL(), "RIPEMD256");
        FH.put(vk0.j6.XL(), "GOST3411");
        FH.put("1.3.6.1.4.1.5849.1.2.1", "GOST3411");
        Hw.put("SHA1", new String[]{"SHA-1"});
        Hw.put("SHA224", new String[]{"SHA-224"});
        Hw.put("SHA256", new String[]{"SHA-256"});
        Hw.put("SHA384", new String[]{"SHA-384"});
        Hw.put("SHA512", new String[]{"SHA-512"});
    }

    private static void j6(jj0 jj0Var, String str, String str2) {
        FH.put(jj0Var.XL(), str);
        DW.put(jj0Var.XL(), str2);
    }

    public sl0 DW(sl0 sl0Var) {
        return sl0Var.EQ() == null ? new sl0(sl0Var.tp(), (mh0) hj0.WB) : sl0Var;
    }

    public String FH(String str) {
        String str2 = (String) FH.get(str);
        return str2 != null ? str2 : str;
    }

    public String Hw(String str) {
        String str2 = (String) DW.get(str);
        return str2 != null ? str2 : str;
    }
}
