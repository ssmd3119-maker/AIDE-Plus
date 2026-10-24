package abcd;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class in extends rn {
    private final TreeMap<dr, hn> Zo;

    public in(km kmVar) {
        super("proto_ids", kmVar, 4);
        this.Zo = new TreeMap<>();
    }

    public void Mr(ls lsVar) {
        EQ();
        int size = this.Zo.size();
        int iZo = size == 0 ? 0 : Zo();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many proto ids");
        }
        if (lsVar.EQ()) {
            lsVar.Hw(4, "proto_ids_size:  " + xs.tp(size));
            lsVar.Hw(4, "proto_ids_off:   " + xs.tp(iZo));
        }
        lsVar.writeInt(size);
        lsVar.writeInt(iZo);
    }

    @Override // abcd.jn
    public Collection<? extends wm> VH() {
        return this.Zo.values();
    }

    @Override // abcd.rn
    public void XL() {
        Iterator<? extends wm> it = VH().iterator();
        int i = 0;
        while (it.hasNext()) {
            ((hn) it.next()).J0(i);
            i++;
        }
    }

    public int aM(dr drVar) {
        if (drVar == null) {
            throw new NullPointerException("prototype == null");
        }
        EQ();
        hn hnVar = this.Zo.get(drVar);
        if (hnVar != null) {
            return hnVar.u7();
        }
        throw new IllegalArgumentException("not found");
    }

    public hn j3(dr drVar) {
        if (drVar == null) {
            throw new NullPointerException("prototype == null");
        }
        we();
        hn hnVar = this.Zo.get(drVar);
        if (hnVar != null) {
            return hnVar;
        }
        hn hnVar2 = new hn(drVar);
        this.Zo.put(drVar, hnVar2);
        return hnVar2;
    }
}
