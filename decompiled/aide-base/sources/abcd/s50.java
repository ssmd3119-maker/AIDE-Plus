package abcd;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class s50 {
    private final ConcurrentMap<Class<? extends w50>, CopyOnWriteArrayList<r50>> j6 = new ConcurrentHashMap();

    private void j6(r50 r50Var) {
        CopyOnWriteArrayList<r50> copyOnWriteArrayListPutIfAbsent;
        CopyOnWriteArrayList<r50> copyOnWriteArrayList = this.j6.get(r50Var.j6);
        if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = this.j6.putIfAbsent(r50Var.j6, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
        }
        copyOnWriteArrayList.add(r50Var);
    }

    public r50 DW(o50 o50Var) {
        return FH(o50.class, o50Var);
    }

    public <T extends w50> r50 FH(Class<T> cls, T t) {
        r50 r50Var = new r50(this, cls, t);
        j6(r50Var);
        return r50Var;
    }

    public void Hw(v50 v50Var) {
        CopyOnWriteArrayList<r50> copyOnWriteArrayList = this.j6.get(v50Var.DW());
        if (copyOnWriteArrayList != null) {
            Iterator<r50> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                v50Var.j6(it.next().DW);
            }
        }
    }
}
