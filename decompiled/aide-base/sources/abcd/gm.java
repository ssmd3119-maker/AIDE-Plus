package abcd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class gm extends rn {
    private ArrayList<fm> VH;
    private final TreeMap<fr, fm> Zo;

    public gm(km kmVar) {
        super("class_defs", kmVar, 4);
        this.Zo = new TreeMap<>();
        this.VH = null;
    }

    private int j3(fr frVar, int i, int i2) {
        fm fmVar = this.Zo.get(frVar);
        if (fmVar == null || fmVar.tp()) {
            return i;
        }
        if (i2 < 0) {
            throw new RuntimeException("class circularity with " + frVar);
        }
        int i3 = i2 - 1;
        zq zqVarBT = fmVar.BT();
        if (zqVarBT != null) {
            i = j3(zqVarBT.J0(), i, i3);
        }
        hr hrVarYS = fmVar.yS();
        int size = hrVarYS.size();
        for (int i4 = 0; i4 < size; i4++) {
            i = j3(hrVarYS.v5(i4), i, i3);
        }
        fmVar.J0(i);
        this.VH.add(fmVar);
        return i + 1;
    }

    public void Mr(ls lsVar) {
        EQ();
        int size = this.Zo.size();
        int iZo = size == 0 ? 0 : Zo();
        if (lsVar.EQ()) {
            lsVar.Hw(4, "class_defs_size: " + xs.tp(size));
            lsVar.Hw(4, "class_defs_off:  " + xs.tp(iZo));
        }
        lsVar.writeInt(size);
        lsVar.writeInt(iZo);
    }

    @Override // abcd.jn
    public Collection<? extends wm> VH() {
        ArrayList<fm> arrayList = this.VH;
        return arrayList != null ? arrayList : this.Zo.values();
    }

    @Override // abcd.rn
    public void XL() {
        int size = this.Zo.size();
        this.VH = new ArrayList<>(size);
        Iterator<fr> it = this.Zo.keySet().iterator();
        int iJ3 = 0;
        while (it.hasNext()) {
            iJ3 = j3(it.next(), iJ3, size - iJ3);
        }
    }

    public void aM(fm fmVar) {
        try {
            fr frVarJ0 = fmVar.vy().J0();
            we();
            if (this.Zo.get(frVarJ0) == null) {
                this.Zo.put(frVarJ0, fmVar);
                return;
            }
            throw new IllegalArgumentException("already added: " + frVarJ0);
        } catch (NullPointerException unused) {
            throw new NullPointerException("clazz == null");
        }
    }
}
