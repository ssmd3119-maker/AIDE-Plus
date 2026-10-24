package abcd;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class pn extends rn {
    private final TreeMap<fr, on> Zo;

    public pn(km kmVar) {
        super("type_ids", kmVar, 4);
        this.Zo = new TreeMap<>();
    }

    public int Mr(fr frVar) {
        if (frVar == null) {
            throw new NullPointerException("type == null");
        }
        EQ();
        on onVar = this.Zo.get(frVar);
        if (onVar != null) {
            return onVar.u7();
        }
        throw new IllegalArgumentException("not found: " + frVar);
    }

    public on U2(zq zqVar) {
        if (zqVar == null) {
            throw new NullPointerException("type == null");
        }
        we();
        fr frVarJ0 = zqVar.J0();
        on onVar = this.Zo.get(frVarJ0);
        if (onVar != null) {
            return onVar;
        }
        on onVar2 = new on(zqVar);
        this.Zo.put(frVarJ0, onVar2);
        return onVar2;
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
            ((on) it.next()).J0(i);
            i++;
        }
    }

    public on a8(fr frVar) {
        if (frVar == null) {
            throw new NullPointerException("type == null");
        }
        we();
        on onVar = this.Zo.get(frVar);
        if (onVar != null) {
            return onVar;
        }
        on onVar2 = new on(new zq(frVar));
        this.Zo.put(frVar, onVar2);
        return onVar2;
    }

    public vm aM(bq bqVar) {
        if (bqVar == null) {
            throw new NullPointerException("cst == null");
        }
        EQ();
        on onVar = this.Zo.get(((zq) bqVar).J0());
        if (onVar != null) {
            return onVar;
        }
        throw new IllegalArgumentException("not found: " + bqVar);
    }

    public int j3(zq zqVar) {
        if (zqVar != null) {
            return Mr(zqVar.J0());
        }
        throw new NullPointerException("type == null");
    }

    public void lg(ls lsVar) {
        EQ();
        int size = this.Zo.size();
        int iZo = size == 0 ? 0 : Zo();
        if (size > 65536) {
            throw new UnsupportedOperationException("too many type ids");
        }
        if (lsVar.EQ()) {
            lsVar.Hw(4, "type_ids_size:   " + xs.tp(size));
            lsVar.Hw(4, "type_ids_off:    " + xs.tp(iZo));
        }
        lsVar.writeInt(size);
        lsVar.writeInt(iZo);
    }
}
