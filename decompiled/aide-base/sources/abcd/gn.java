package abcd;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gn implements kt, Comparable<gn> {
    private final vq WB;
    private final sn<am> mb;

    public gn(vq vqVar, zo zoVar) {
        if (vqVar == null) {
            throw new NullPointerException("method == null");
        }
        if (zoVar == null) {
            throw new NullPointerException("annotationsList == null");
        }
        this.WB = vqVar;
        int size = zoVar.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new am(new zl(zoVar.ef(i))));
        }
        this.mb = new sn<>(xm.TYPE_ANNOTATION_SET_REF_LIST, arrayList);
    }

    public void DW(km kmVar) {
        dn dnVarJ8 = kmVar.J8();
        en enVarU2 = kmVar.U2();
        dnVarJ8.Mr(this.WB);
        enVarU2.XL(this.mb);
    }

    @Override // java.lang.Comparable
    /* renamed from: FH, reason: merged with bridge method [inline-methods] */
    public int compareTo(gn gnVar) {
        return this.WB.compareTo(gnVar.WB);
    }

    @Override // abcd.kt
    public String Zo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.WB.Zo());
        sb.append(": ");
        boolean z = true;
        for (T t : this.mb.BT()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(t.a8());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof gn) {
            return this.WB.equals(((gn) obj).WB);
        }
        return false;
    }

    public int hashCode() {
        return this.WB.hashCode();
    }

    public void v5(km kmVar, ls lsVar) {
        int iJ3 = kmVar.J8().j3(this.WB);
        int iWe = this.mb.we();
        if (lsVar.EQ()) {
            lsVar.Hw(0, "    " + this.WB.Zo());
            lsVar.Hw(4, "      method_idx:      " + xs.tp(iJ3));
            lsVar.Hw(4, "      annotations_off: " + xs.tp(iWe));
        }
        lsVar.writeInt(iJ3);
        lsVar.writeInt(iWe);
    }
}
