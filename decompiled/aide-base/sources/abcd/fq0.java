package abcd;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public class fq0 implements hq0 {
    private Collection j6;

    public fq0(Collection collection) {
        this.j6 = new ArrayList(collection);
    }

    @Override // abcd.hq0
    public Collection j6(gq0 gq0Var) {
        if (gq0Var == null) {
            return new ArrayList(this.j6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.j6) {
            if (gq0Var.ro(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
