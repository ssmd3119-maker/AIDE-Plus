package abcd;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class nn extends rn {
    private final TreeMap<yq, mn> Zo;

    public nn(km kmVar) {
        super("string_ids", kmVar, 4);
        this.Zo = new TreeMap<>();
    }

    public mn Mr(mn mnVar) {
        if (mnVar == null) {
            throw new NullPointerException("string == null");
        }
        we();
        yq yqVarQX = mnVar.QX();
        mn mnVar2 = this.Zo.get(yqVarQX);
        if (mnVar2 != null) {
            return mnVar2;
        }
        this.Zo.put(yqVarQX, mnVar);
        return mnVar;
    }

    public mn U2(yq yqVar) {
        return Mr(new mn(yqVar));
    }

    @Override // abcd.jn
    public Collection<? extends wm> VH() {
        return this.Zo.values();
    }

    @Override // abcd.rn
    public void XL() {
        Iterator<mn> it = this.Zo.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next().J0(i);
            i++;
        }
    }

    public void a8(ls lsVar) {
        EQ();
        int size = this.Zo.size();
        int iZo = size == 0 ? 0 : Zo();
        if (lsVar.EQ()) {
            lsVar.Hw(4, "string_ids_size: " + xs.tp(size));
            lsVar.Hw(4, "string_ids_off:  " + xs.tp(iZo));
        }
        lsVar.writeInt(size);
        lsVar.writeInt(iZo);
    }

    public vm aM(bq bqVar) {
        if (bqVar == null) {
            throw new NullPointerException("cst == null");
        }
        EQ();
        mn mnVar = this.Zo.get((yq) bqVar);
        if (mnVar != null) {
            return mnVar;
        }
        throw new IllegalArgumentException("not found");
    }

    public int j3(yq yqVar) {
        if (yqVar == null) {
            throw new NullPointerException("string == null");
        }
        EQ();
        mn mnVar = this.Zo.get(yqVar);
        if (mnVar != null) {
            return mnVar.u7();
        }
        throw new IllegalArgumentException("not found");
    }
}
