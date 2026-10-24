package abcd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class qp0 {
    private static Map j6 = new HashMap();
    private static Set DW = new HashSet();
    private static Map FH = new HashMap();
    private static Set Hw = new HashSet();
    private static Map v5 = new HashMap();

    static {
        vh0 vh0Var = hl0.Hw;
        vh0 vh0Var2 = mm0.Ws;
        vh0 vh0Var3 = mm0.Hw;
        vh0 vh0Var4 = hl0.tp;
        vh0 vh0Var5 = vk0.DW;
        vh0 vh0Var6 = vk0.FH;
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
        DW.add(mm0.Hw);
        DW.add(mm0.VH);
        DW.add(mm0.gn);
        DW.add(mm0.u7);
        DW.add(mm0.tp);
        DW.add(mm0.Ws);
        DW.add(dl0.J8);
        DW.add(dl0.Ws);
        DW.add(dl0.QX);
        DW.add(dl0.XL);
        DW.add(vk0.Hw);
        DW.add(vk0.v5);
        Hw.add(hl0.gn);
        Hw.add(hl0.J8);
        Hw.add(hl0.EQ);
        Hw.add(hl0.we);
        Hw.add(hl0.J0);
        Hw.add(kl0.VH);
        Hw.add(kl0.Zo);
        Hw.add(kl0.gn);
        FH.put("SHA1WITHRSAANDMGF1", j6(new sl0(fl0.Hw, (mh0) new hj0()), 20));
        FH.put("SHA224WITHRSAANDMGF1", j6(new sl0(dl0.v5, (mh0) new hj0()), 28));
        FH.put("SHA256WITHRSAANDMGF1", j6(new sl0(dl0.DW, (mh0) new hj0()), 32));
        FH.put("SHA384WITHRSAANDMGF1", j6(new sl0(dl0.FH, (mh0) new hj0()), 48));
        FH.put("SHA512WITHRSAANDMGF1", j6(new sl0(dl0.Hw, (mh0) new hj0()), 64));
        v5.put(hl0.J8, dl0.v5);
        v5.put(hl0.EQ, dl0.DW);
        v5.put(hl0.we, dl0.FH);
        v5.put(hl0.J0, dl0.Hw);
        v5.put(hl0.v5, hl0.vy);
        v5.put(hl0.Zo, hl0.P8);
        v5.put(hl0.VH, hl0.ei);
        v5.put(hl0.gn, fl0.Hw);
        v5.put(kl0.VH, kl0.FH);
        v5.put(kl0.Zo, kl0.DW);
        v5.put(kl0.gn, kl0.Hw);
        v5.put(vk0.Hw, vk0.j6);
        v5.put(vk0.v5, vk0.j6);
    }

    private static sl0 FH(String str) {
        String strZo = iq0.Zo(str);
        vh0 vh0Var = (vh0) j6.get(strZo);
        if (vh0Var == null) {
            throw new IllegalArgumentException("Unknown signature type requested: " + strZo);
        }
        sl0 sl0Var = DW.contains(vh0Var) ? new sl0(vh0Var) : FH.containsKey(strZo) ? new sl0(vh0Var, (mh0) FH.get(strZo)) : new sl0(vh0Var, (mh0) hj0.WB);
        if (Hw.contains(vh0Var)) {
            vh0 vh0Var2 = hl0.Hw;
        }
        if (sl0Var.VH().equals(hl0.tp)) {
            ((jl0) sl0Var.EQ()).VH();
        }
        return sl0Var;
    }

    private static jl0 j6(sl0 sl0Var, int i) {
        return new jl0(sl0Var, new sl0(hl0.u7, (mh0) sl0Var), new sh0(i), new sh0(1));
    }

    public sl0 DW(String str) {
        return FH(str);
    }
}
