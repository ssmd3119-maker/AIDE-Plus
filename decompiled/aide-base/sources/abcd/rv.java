package abcd;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class rv {
    private final ConcurrentHashMap<sv, List<Throwable>> j6 = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> DW = new ReferenceQueue<>();

    public final List<Throwable> j6(Throwable th, boolean z) {
        Reference<? extends Throwable> referencePoll = this.DW.poll();
        while (referencePoll != null) {
            this.j6.remove(referencePoll);
            referencePoll = this.DW.poll();
        }
        List<Throwable> list = this.j6.get(new sv(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.j6.putIfAbsent(new sv(th, this.DW), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }
}
