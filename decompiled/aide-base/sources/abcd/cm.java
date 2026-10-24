package abcd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cm extends fn {
    private ArrayList<gn> AL;
    private ArrayList<pm> k2;
    private zl qp;
    private ArrayList<bn> zh;

    public cm() {
        super(4, -1);
        this.qp = null;
        this.k2 = null;
        this.zh = null;
        this.AL = null;
    }

    private static int cn(ArrayList<?> arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void BT(vq vqVar, yo yoVar) {
        if (this.zh == null) {
            this.zh = new ArrayList<>();
        }
        this.zh.add(new bn(vqVar, new zl(yoVar)));
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_ANNOTATIONS_DIRECTORY_ITEM;
    }

    public boolean KD() {
        return this.qp == null && this.k2 == null && this.zh == null && this.AL == null;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        U2(((cn(this.k2) + cn(this.zh) + cn(this.AL)) * 8) + 16);
    }

    @Override // abcd.fn
    public String a8() {
        throw new RuntimeException("unsupported");
    }

    public int hashCode() {
        zl zlVar = this.qp;
        if (zlVar == null) {
            return 0;
        }
        return zlVar.hashCode();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        en enVarU2 = kmVar.U2();
        zl zlVar = this.qp;
        if (zlVar != null) {
            this.qp = (zl) enVarU2.aM(zlVar);
        }
        ArrayList<pm> arrayList = this.k2;
        if (arrayList != null) {
            Iterator<pm> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().DW(kmVar);
            }
        }
        ArrayList<bn> arrayList2 = this.zh;
        if (arrayList2 != null) {
            Iterator<bn> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().DW(kmVar);
            }
        }
        ArrayList<gn> arrayList3 = this.AL;
        if (arrayList3 != null) {
            Iterator<gn> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                it3.next().DW(kmVar);
            }
        }
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        boolean zEQ = lsVar.EQ();
        int iJ0 = fn.J0(this.qp);
        int iCn = cn(this.k2);
        int iCn2 = cn(this.zh);
        int iCn3 = cn(this.AL);
        if (zEQ) {
            lsVar.Hw(0, XL() + " annotations directory");
            lsVar.Hw(4, "  class_annotations_off: " + xs.tp(iJ0));
            lsVar.Hw(4, "  fields_size:           " + xs.tp(iCn));
            lsVar.Hw(4, "  methods_size:          " + xs.tp(iCn2));
            lsVar.Hw(4, "  parameters_size:       " + xs.tp(iCn3));
        }
        lsVar.writeInt(iJ0);
        lsVar.writeInt(iCn);
        lsVar.writeInt(iCn2);
        lsVar.writeInt(iCn3);
        if (iCn != 0) {
            Collections.sort(this.k2);
            if (zEQ) {
                lsVar.Hw(0, "  fields:");
            }
            Iterator<pm> it = this.k2.iterator();
            while (it.hasNext()) {
                it.next().v5(kmVar, lsVar);
            }
        }
        if (iCn2 != 0) {
            Collections.sort(this.zh);
            if (zEQ) {
                lsVar.Hw(0, "  methods:");
            }
            Iterator<bn> it2 = this.zh.iterator();
            while (it2.hasNext()) {
                it2.next().v5(kmVar, lsVar);
            }
        }
        if (iCn3 != 0) {
            Collections.sort(this.AL);
            if (zEQ) {
                lsVar.Hw(0, "  parameters:");
            }
            Iterator<gn> it3 = this.AL.iterator();
            while (it3.hasNext()) {
                it3.next().v5(kmVar, lsVar);
            }
        }
    }

    public boolean ro() {
        return this.qp != null && this.k2 == null && this.zh == null && this.AL == null;
    }

    public void sh(yo yoVar) {
        if (yoVar == null) {
            throw new NullPointerException("annotations == null");
        }
        if (this.qp != null) {
            throw new UnsupportedOperationException("class annotations already set");
        }
        this.qp = new zl(yoVar);
    }

    @Override // abcd.fn
    public int tp(fn fnVar) {
        if (ro()) {
            return this.qp.compareTo(((cm) fnVar).qp);
        }
        throw new UnsupportedOperationException("uninternable instance");
    }

    public void vy(vq vqVar, zo zoVar) {
        if (this.AL == null) {
            this.AL = new ArrayList<>();
        }
        this.AL.add(new gn(vqVar, zoVar));
    }

    public void yS(lq lqVar, yo yoVar) {
        if (this.k2 == null) {
            this.k2 = new ArrayList<>();
        }
        this.k2.add(new pm(lqVar, new zl(yoVar)));
    }
}
