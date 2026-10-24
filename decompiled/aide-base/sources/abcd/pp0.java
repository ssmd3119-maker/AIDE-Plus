package abcd;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class pp0 implements rp0 {
    private static Map j6 = new HashMap();
    private static Map DW = new HashMap();

    static {
        j6.put(fl0.FH, hl0.P8);
        j6.put(fl0.j6, hl0.P8);
        j6.put(fl0.Zo, fl0.Hw);
        j6.put(hl0.J8, dl0.v5);
        j6.put(hl0.EQ, dl0.DW);
        j6.put(hl0.we, dl0.FH);
        j6.put(hl0.J0, dl0.Hw);
        j6.put(hl0.v5, hl0.vy);
        j6.put(hl0.Zo, hl0.P8);
        j6.put(hl0.VH, hl0.ei);
        j6.put(hl0.gn, fl0.Hw);
        j6.put(mm0.Hw, fl0.Hw);
        j6.put(mm0.VH, dl0.v5);
        j6.put(mm0.gn, dl0.DW);
        j6.put(mm0.u7, dl0.FH);
        j6.put(mm0.tp, dl0.Hw);
        j6.put(mm0.Ws, fl0.Hw);
        j6.put(dl0.J8, dl0.v5);
        j6.put(dl0.Ws, dl0.DW);
        j6.put(dl0.QX, dl0.FH);
        j6.put(dl0.XL, dl0.Hw);
        j6.put(kl0.VH, kl0.FH);
        j6.put(kl0.Zo, kl0.DW);
        j6.put(kl0.gn, kl0.Hw);
        j6.put(vk0.Hw, vk0.j6);
        j6.put(vk0.v5, vk0.j6);
        DW.put("SHA-1", fl0.Hw);
        DW.put("SHA-224", dl0.v5);
        DW.put("SHA-256", dl0.DW);
        DW.put("SHA-384", dl0.FH);
        DW.put("SHA-512", dl0.Hw);
        DW.put("GOST3411", vk0.j6);
        DW.put("MD2", hl0.vy);
        DW.put("MD4", hl0.P8);
        DW.put("MD5", hl0.ei);
        DW.put("RIPEMD128", kl0.FH);
        DW.put("RIPEMD160", kl0.DW);
        DW.put("RIPEMD256", kl0.Hw);
    }

    @Override // abcd.rp0
    public sl0 j6(sl0 sl0Var) {
        return sl0Var.VH().equals(hl0.tp) ? ((jl0) sl0Var.EQ()).VH() : new sl0((vh0) j6.get(sl0Var.VH()), (mh0) new hj0());
    }
}
