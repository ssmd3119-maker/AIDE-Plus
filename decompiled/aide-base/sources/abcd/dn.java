package abcd;

import java.util.Collection;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class dn extends an {
    private final TreeMap<fq, cn> Zo;

    public dn(km kmVar) {
        super("method_ids", kmVar);
        this.Zo = new TreeMap<>();
    }

    public cn Mr(fq fqVar) {
        if (fqVar == null) {
            throw new NullPointerException("method == null");
        }
        we();
        cn cnVar = this.Zo.get(fqVar);
        if (cnVar != null) {
            return cnVar;
        }
        cn cnVar2 = new cn(fqVar);
        this.Zo.put(fqVar, cnVar2);
        return cnVar2;
    }

    public void U2(ls lsVar) {
        EQ();
        int size = this.Zo.size();
        int iZo = size == 0 ? 0 : Zo();
        if (lsVar.EQ()) {
            lsVar.Hw(4, "method_ids_size: " + xs.tp(size));
            lsVar.Hw(4, "method_ids_off:  " + xs.tp(iZo));
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
        cn cnVar = this.Zo.get((fq) bqVar);
        if (cnVar != null) {
            return cnVar;
        }
        throw new IllegalArgumentException("not found");
    }

    public int j3(fq fqVar) {
        if (fqVar == null) {
            throw new NullPointerException("ref == null");
        }
        EQ();
        cn cnVar = this.Zo.get(fqVar);
        if (cnVar != null) {
            return cnVar.u7();
        }
        throw new IllegalArgumentException("not found");
    }
}
