package abcd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class z10 extends m10<Collection<String>> {
    private final Collection<String> FH;

    public z10(p70 p70Var) {
        super(p70Var);
        this.FH = new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: Hw, reason: merged with bridge method [inline-methods] */
    public Collection<String> call() {
        j6();
        try {
            lc0 lc0VarJ6 = lc0.j6(this.j6);
            if (!this.FH.isEmpty()) {
                lc0VarJ6.aM(qf0.FH(this.FH));
            }
            t70 t70VarGn = this.j6.gn();
            ArrayList arrayList = new ArrayList();
            while (lc0VarJ6.XL()) {
                if (lc0VarJ6.FH() == null) {
                    String strU7 = lc0VarJ6.u7();
                    String strTp = lc0VarJ6.tp();
                    String strZo = lc0VarJ6.Zo();
                    if (strTp != null) {
                        t70VarGn.ro("submodule", strU7, "url", strTp);
                    }
                    if (strZo != null) {
                        t70VarGn.ro("submodule", strU7, "update", strZo);
                    }
                    if (strTp != null || strZo != null) {
                        arrayList.add(strU7);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                t70VarGn.ef();
            }
            return arrayList;
        } catch (h40 e) {
            throw new o20(e.getMessage(), e);
        } catch (IOException e2) {
            throw new o20(e2.getMessage(), e2);
        }
    }
}
