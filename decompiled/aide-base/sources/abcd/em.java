package abcd;

import abcd.eq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class em extends fn {
    private final ArrayList<mm> AL;
    private eq cT;
    private final ArrayList<om> hK;
    private final ArrayList<mm> k2;
    private byte[] q7;
    private final zq qp;
    private final ArrayList<om> w9;
    private final HashMap<mm, bq> zh;

    public em(zq zqVar) {
        super(1, -1);
        if (zqVar == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.qp = zqVar;
        this.k2 = new ArrayList<>(20);
        this.zh = new HashMap<>(40);
        this.AL = new ArrayList<>(20);
        this.w9 = new ArrayList<>(20);
        this.hK = new ArrayList<>(20);
        this.cT = null;
    }

    private void cn(km kmVar, ls lsVar) {
        boolean zEQ = lsVar.EQ();
        if (zEQ) {
            lsVar.Hw(0, XL() + " class data for " + this.qp.Zo());
        }
        sh(kmVar, lsVar, "static_fields", this.k2.size());
        sh(kmVar, lsVar, "instance_fields", this.AL.size());
        sh(kmVar, lsVar, "direct_methods", this.w9.size());
        sh(kmVar, lsVar, "virtual_methods", this.hK.size());
        ro(kmVar, lsVar, "static_fields", this.k2);
        ro(kmVar, lsVar, "instance_fields", this.AL);
        ro(kmVar, lsVar, "direct_methods", this.w9);
        ro(kmVar, lsVar, "virtual_methods", this.hK);
        if (zEQ) {
            lsVar.u7();
        }
    }

    private static void ro(km kmVar, ls lsVar, String str, ArrayList<? extends nm> arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (lsVar.EQ()) {
            lsVar.Hw(0, "  " + str + ":");
        }
        int iDW = 0;
        for (int i = 0; i < size; i++) {
            iDW = arrayList.get(i).DW(kmVar, lsVar, iDW, i);
        }
    }

    private eq sG() {
        Collections.sort(this.k2);
        int size = this.k2.size();
        while (size > 0) {
            bq bqVar = this.zh.get(this.k2.get(size - 1));
            if (bqVar instanceof sq) {
                if (((sq) bqVar).Mr() != 0) {
                    break;
                }
                size--;
            } else {
                if (bqVar != null) {
                    break;
                }
                size--;
            }
        }
        if (size == 0) {
            return null;
        }
        eq.a aVar = new eq.a(size);
        for (int i = 0; i < size; i++) {
            mm mmVar = this.k2.get(i);
            bq bqVarJ6 = this.zh.get(mmVar);
            if (bqVarJ6 == null) {
                bqVarJ6 = cr.j6(mmVar.we().j6());
            }
            aVar.ef(i, bqVarJ6);
        }
        aVar.Mr();
        return new eq(aVar);
    }

    private static void sh(km kmVar, ls lsVar, String str, int i) {
        if (lsVar.EQ()) {
            lsVar.j6(String.format("  %-21s %08x", str + "_size:", Integer.valueOf(i)));
        }
        lsVar.gn(i);
    }

    public void BT(mm mmVar) {
        if (mmVar == null) {
            throw new NullPointerException("field == null");
        }
        this.AL.add(mmVar);
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_CLASS_DATA_ITEM;
    }

    public void KD(om omVar) {
        if (omVar == null) {
            throw new NullPointerException("method == null");
        }
        this.hK.add(omVar);
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        ps psVar = new ps();
        cn(jnVar.v5(), psVar);
        byte[] bArrAM = psVar.aM();
        this.q7 = bArrAM;
        U2(bArrAM.length);
    }

    @Override // abcd.fn
    public String a8() {
        return toString();
    }

    public eq cb() {
        if (this.cT == null && this.k2.size() != 0) {
            this.cT = sG();
        }
        return this.cT;
    }

    public boolean dx() {
        return this.k2.isEmpty() && this.AL.isEmpty() && this.w9.isEmpty() && this.hK.isEmpty();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        if (!this.k2.isEmpty()) {
            cb();
            Iterator<mm> it = this.k2.iterator();
            while (it.hasNext()) {
                it.next().v5(kmVar);
            }
        }
        if (!this.AL.isEmpty()) {
            Collections.sort(this.AL);
            Iterator<mm> it2 = this.AL.iterator();
            while (it2.hasNext()) {
                it2.next().v5(kmVar);
            }
        }
        if (!this.w9.isEmpty()) {
            Collections.sort(this.w9);
            Iterator<om> it3 = this.w9.iterator();
            while (it3.hasNext()) {
                it3.next().v5(kmVar);
            }
        }
        if (this.hK.isEmpty()) {
            return;
        }
        Collections.sort(this.hK);
        Iterator<om> it4 = this.hK.iterator();
        while (it4.hasNext()) {
            it4.next().v5(kmVar);
        }
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        if (lsVar.EQ()) {
            cn(kmVar, lsVar);
        } else {
            lsVar.write(this.q7);
        }
    }

    public void vy(mm mmVar, bq bqVar) {
        if (mmVar == null) {
            throw new NullPointerException("field == null");
        }
        if (this.cT != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.k2.add(mmVar);
        this.zh.put(mmVar, bqVar);
    }

    public void yS(om omVar) {
        if (omVar == null) {
            throw new NullPointerException("method == null");
        }
        this.w9.add(omVar);
    }
}
