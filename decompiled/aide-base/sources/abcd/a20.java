package abcd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a20 extends m10<Map<String, jc0>> {
    private final Collection<String> FH;

    public a20(p70 p70Var) {
        super(p70Var);
        this.FH = new ArrayList();
    }

    private jc0 v5(lc0 lc0Var) {
        a70 a70VarGn = lc0Var.gn();
        String strU7 = lc0Var.u7();
        if (lc0Var.v5() == null) {
            return new jc0(kc0.MISSING, strU7, a70VarGn);
        }
        if (lc0Var.FH() == null) {
            return new jc0(kc0.UNINITIALIZED, strU7, a70VarGn);
        }
        p70 p70VarEQ = lc0Var.EQ();
        if (p70VarEQ == null) {
            return new jc0(kc0.UNINITIALIZED, strU7, a70VarGn);
        }
        a70 a70VarRo = p70VarEQ.ro("HEAD");
        return a70VarRo == null ? new jc0(kc0.UNINITIALIZED, strU7, a70VarGn, a70VarRo) : !a70VarRo.aM(a70VarGn) ? new jc0(kc0.REV_CHECKED_OUT, strU7, a70VarGn, a70VarRo) : new jc0(kc0.INITIALIZED, strU7, a70VarGn, a70VarRo);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public Map<String, jc0> call() {
        j6();
        try {
            lc0 lc0VarJ6 = lc0.j6(this.j6);
            if (!this.FH.isEmpty()) {
                lc0VarJ6.aM(qf0.FH(this.FH));
            }
            HashMap map = new HashMap();
            while (lc0VarJ6.XL()) {
                jc0 jc0VarV5 = v5(lc0VarJ6);
                map.put(jc0VarV5.j6(), jc0VarV5);
            }
            return map;
        } catch (h40 e) {
            throw new o20(e.getMessage(), e);
        } catch (IOException e2) {
            throw new o20(e2.getMessage(), e2);
        }
    }
}
