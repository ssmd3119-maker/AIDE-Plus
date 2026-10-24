package abcd;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

/* loaded from: classes.dex */
public class en0 implements sm0 {
    private final Hashtable j6 = new Hashtable();

    public Hashtable DW(Map map) {
        jj0 jj0Var;
        Hashtable hashtable = (Hashtable) this.j6.clone();
        if (!hashtable.containsKey(nk0.j6) && (jj0Var = (jj0) map.get("contentType")) != null) {
            lk0 lk0Var = new lk0(nk0.j6, new qj0(jj0Var));
            hashtable.put(lk0Var.VH(), lk0Var);
        }
        if (!hashtable.containsKey(nk0.FH)) {
            lk0 lk0Var2 = new lk0(nk0.FH, new qj0(new uk0(new Date())));
            hashtable.put(lk0Var2.VH(), lk0Var2);
        }
        if (!hashtable.containsKey(nk0.DW)) {
            lk0 lk0Var3 = new lk0(nk0.DW, new qj0(new kj0((byte[]) map.get("digest"))));
            hashtable.put(lk0Var3.VH(), lk0Var3);
        }
        return hashtable;
    }

    @Override // abcd.sm0
    public mk0 j6(Map map) {
        return new mk0(DW(map));
    }
}
