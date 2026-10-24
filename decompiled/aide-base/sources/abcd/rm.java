package abcd;

import java.util.Collection;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class rm extends an {
    private final TreeMap<lq, qm> Zo;

    public rm(km kmVar) {
        super("field_ids", kmVar);
        this.Zo = new TreeMap<>();
    }

    public qm Mr(lq lqVar) {
        if (lqVar == null) {
            throw new NullPointerException("field == null");
        }
        we();
        qm qmVar = this.Zo.get(lqVar);
        if (qmVar != null) {
            return qmVar;
        }
        qm qmVar2 = new qm(lqVar);
        this.Zo.put(lqVar, qmVar2);
        return qmVar2;
    }

    public void U2(ls lsVar) {
        EQ();
        int size = this.Zo.size();
        int iZo = size == 0 ? 0 : Zo();
        if (lsVar.EQ()) {
            lsVar.Hw(4, "field_ids_size:  " + xs.tp(size));
            lsVar.Hw(4, "field_ids_off:   " + xs.tp(iZo));
        }
        lsVar.writeInt(size);
        lsVar.writeInt(iZo);
    }

    @Override // abcd.jn
    public Collection<? extends wm> VH() {
        return this.Zo.values();
    }

    public vm aM(bq bqVar) {
        if (bqVar == null) {
            throw new NullPointerException("cst == null");
        }
        EQ();
        qm qmVar = this.Zo.get((lq) bqVar);
        if (qmVar != null) {
            return qmVar;
        }
        throw new IllegalArgumentException("not found");
    }

    public int j3(lq lqVar) {
        if (lqVar == null) {
            throw new NullPointerException("ref == null");
        }
        EQ();
        qm qmVar = this.Zo.get(lqVar);
        if (qmVar != null) {
            return qmVar.u7();
        }
        throw new IllegalArgumentException("not found");
    }
}
