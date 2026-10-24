package abcd;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class dn0 implements wm0 {
    private static final Set j6;

    static {
        HashSet hashSet = new HashSet();
        j6 = hashSet;
        hashSet.add(hl0.v5);
        j6.add(hl0.Zo);
        j6.add(hl0.VH);
        j6.add(hl0.gn);
        j6.add(hl0.J8);
        j6.add(hl0.EQ);
        j6.add(hl0.we);
        j6.add(hl0.J0);
        j6.add(fl0.FH);
        j6.add(fl0.j6);
        j6.add(fl0.DW);
        j6.add(fl0.Zo);
        j6.add(kl0.VH);
        j6.add(kl0.Zo);
        j6.add(kl0.gn);
    }

    @Override // abcd.wm0
    public sl0 j6(sl0 sl0Var) {
        return j6.contains(sl0Var.VH()) ? new sl0(hl0.Hw, (mh0) hj0.WB) : sl0Var;
    }
}
