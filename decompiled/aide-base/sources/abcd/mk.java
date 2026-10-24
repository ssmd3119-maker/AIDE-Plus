package abcd;

import abcd.yj;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class mk {
    private final int DW;
    private ArrayList<zj> FH;
    private final kj j6;
    private int Zo = -1;
    private boolean Hw = false;
    private boolean v5 = false;

    public mk(kj kjVar, int i, int i2) {
        this.j6 = kjVar;
        this.DW = i2;
        this.FH = new ArrayList<>(i);
    }

    private static void DW(HashSet<bq> hashSet, zj zjVar) {
        if (zjVar instanceof xj) {
            hashSet.add(((xj) zjVar).rN());
            return;
        }
        if (!(zjVar instanceof ik)) {
            if (zjVar instanceof jk) {
                FH(hashSet, ((jk) zjVar).rN());
            }
        } else {
            sp spVarRN = ((ik) zjVar).rN();
            int size = spVarRN.size();
            for (int i = 0; i < size; i++) {
                FH(hashSet, spVarRN.vy(i));
            }
        }
    }

    private static void FH(HashSet<bq> hashSet, qp qpVar) {
        if (qpVar == null) {
            return;
        }
        kp kpVarQX = qpVar.QX();
        yq yqVarFH = kpVarQX.FH();
        yq yqVarV5 = kpVarQX.v5();
        fr frVarJ6 = qpVar.j6();
        if (frVarJ6 != fr.iW) {
            hashSet.add(zq.aM(frVarJ6));
        }
        if (yqVarFH != null) {
            hashSet.add(yqVarFH);
        }
        if (yqVarV5 != null) {
            hashSet.add(yqVarV5);
        }
    }

    private void Hw() {
        int size = this.FH.size();
        int iDW = 0;
        for (int i = 0; i < size; i++) {
            zj zjVar = this.FH.get(i);
            zjVar.j3(iDW);
            iDW += zjVar.DW();
        }
    }

    private ArrayList<zj> Mr(bk[] bkVarArr) {
        zj zjVarHw;
        int size = this.FH.size();
        ArrayList<zj> arrayList = new ArrayList<>(size * 2);
        for (int i = 0; i < size; i++) {
            zj zjVarV5 = this.FH.get(i);
            bk bkVarTp = zjVarV5.tp();
            bk bkVarU7 = bkVarArr[i];
            zj zjVar = null;
            if (bkVarU7 != null) {
                zjVarHw = null;
            } else {
                bkVarU7 = u7(zjVarV5);
                BitSet bitSetVH = bkVarU7.DW().VH(zjVarV5);
                zj zjVarFH = zjVarV5.FH(bitSetVH);
                zjVarHw = zjVarV5.Hw(bitSetVH);
                zjVarV5 = zjVarV5.v5(bitSetVH);
                zjVar = zjVarFH;
            }
            if (zjVar != null) {
                arrayList.add(zjVar);
            }
            if (bkVarU7 != bkVarTp) {
                zjVarV5 = zjVarV5.Mr(bkVarU7);
            }
            arrayList.add(zjVarV5);
            if (zjVarHw != null) {
                arrayList.add(zjVarHw);
            }
        }
        return arrayList;
    }

    private static boolean QX(zj zjVar) {
        if (zjVar instanceof ik) {
            sp spVarRN = ((ik) zjVar).rN();
            int size = spVarRN.size();
            for (int i = 0; i < size; i++) {
                if (XL(spVarRN.vy(i))) {
                    return true;
                }
            }
        } else if ((zjVar instanceof jk) && XL(((jk) zjVar).rN())) {
            return true;
        }
        return false;
    }

    private void U2(bk[] bkVarArr) {
        int i = this.Zo;
        if (i < 0) {
            i = 0;
        }
        while (true) {
            int iGn = gn(bkVarArr);
            if (i >= iGn) {
                this.Zo = i;
                return;
            }
            int i2 = iGn - i;
            int size = this.FH.size();
            for (int i3 = 0; i3 < size; i3++) {
                zj zjVar = this.FH.get(i3);
                if (!(zjVar instanceof wj)) {
                    this.FH.set(i3, zjVar.U2(i2));
                }
            }
            i = iGn;
        }
    }

    private static boolean XL(qp qpVar) {
        return (qpVar == null || qpVar.QX().FH() == null) ? false : true;
    }

    private static void Zo(xj xjVar, yj.a aVar) {
        int iJ6;
        bq bqVarRN = xjVar.rN();
        int iJ62 = aVar.j6(bqVarRN);
        if (iJ62 >= 0) {
            xjVar.BT(iJ62);
        }
        if (!(bqVarRN instanceof uq) || (iJ6 = aVar.j6(((uq) bqVarRN).we())) < 0) {
            return;
        }
        xjVar.gW(iJ6);
    }

    private bk[] aM() {
        int size = this.FH.size();
        bk[] bkVarArr = new bk[size];
        for (int i = 0; i < size; i++) {
            bkVarArr[i] = this.FH.get(i).tp();
        }
        return bkVarArr;
    }

    private int gn(bk[] bkVarArr) {
        int size = this.FH.size();
        int i = this.Zo;
        for (int i2 = 0; i2 < size; i2++) {
            zj zjVar = this.FH.get(i2);
            bk bkVar = bkVarArr[i2];
            bk bkVarTp = tp(zjVar, bkVar);
            if (bkVarTp == null) {
                int iGn = zjVar.gn(u7(zjVar).DW().VH(zjVar));
                if (iGn > i) {
                    i = iGn;
                }
            } else {
                if (bkVar == bkVarTp) {
                }
            }
            bkVarArr[i2] = bkVarTp;
        }
        return i;
    }

    private void j3(bk[] bkVarArr) {
        if (this.Zo != 0) {
            this.FH = Mr(bkVarArr);
            return;
        }
        int size = this.FH.size();
        for (int i = 0; i < size; i++) {
            zj zjVar = this.FH.get(i);
            bk bkVarTp = zjVar.tp();
            bk bkVar = bkVarArr[i];
            if (bkVarTp != bkVar) {
                this.FH.set(i, zjVar.Mr(bkVar));
            }
        }
    }

    private void lg(zj zjVar) {
        if (!this.Hw && zjVar.EQ().j6() >= 0) {
            this.Hw = true;
        }
        if (this.v5 || !QX(zjVar)) {
            return;
        }
        this.v5 = true;
    }

    private bk tp(zj zjVar, bk bkVar) {
        while (bkVar != null && !bkVar.DW().we(zjVar)) {
            bkVar = ck.DW(bkVar, this.j6);
        }
        return bkVar;
    }

    private bk u7(zj zjVar) {
        bk bkVarTp = tp(zjVar.VH(), zjVar.tp());
        if (bkVarTp != null) {
            return bkVarTp;
        }
        throw new ts("No expanded opcode for " + zjVar);
    }

    private void v5() {
        do {
            Hw();
        } while (we());
    }

    private boolean we() {
        int size = this.FH.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            zj zjVar = this.FH.get(i);
            if (zjVar instanceof tk) {
                bk bkVarTp = zjVar.tp();
                tk tkVar = (tk) zjVar;
                if (bkVarTp.DW().DW(tkVar)) {
                    continue;
                } else {
                    if (bkVarTp.j6() == 40) {
                        bk bkVarTp2 = tp(zjVar, bkVarTp);
                        if (bkVarTp2 == null) {
                            throw new UnsupportedOperationException("method too long");
                        }
                        this.FH.set(i, zjVar.Mr(bkVarTp2));
                    } else {
                        try {
                            int i2 = i + 1;
                            wj wjVar = (wj) this.FH.get(i2);
                            this.FH.set(i, new tk(ck.vJ, tkVar.EQ(), rp.jw, tkVar.rN()));
                            this.FH.add(i, tkVar.BT(wjVar));
                            size++;
                            i = i2;
                        } catch (ClassCastException unused) {
                            throw new IllegalStateException("unpaired TargetInsn");
                        } catch (IndexOutOfBoundsException unused2) {
                            throw new IllegalStateException("unpaired TargetInsn (dangling)");
                        }
                    }
                    z = true;
                }
            }
            i++;
        }
        return z;
    }

    public ak EQ() {
        if (this.Zo >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        bk[] bkVarArrAM = aM();
        U2(bkVarArrAM);
        j3(bkVarArrAM);
        v5();
        return ak.g3(this.FH, this.Zo + this.DW);
    }

    public HashSet<bq> J0() {
        HashSet<bq> hashSet = new HashSet<>(20);
        Iterator<zj> it = this.FH.iterator();
        while (it.hasNext()) {
            DW(hashSet, it.next());
        }
        return hashSet;
    }

    public boolean J8() {
        return this.v5;
    }

    public void VH(yj.a aVar) {
        Iterator<zj> it = this.FH.iterator();
        while (it.hasNext()) {
            zj next = it.next();
            if (next instanceof xj) {
                Zo((xj) next, aVar);
            }
        }
    }

    public boolean Ws() {
        return this.Hw;
    }

    public void a8(int i, wj wjVar) {
        int size = (this.FH.size() - i) - 1;
        try {
            this.FH.set(size, ((tk) this.FH.get(size)).BT(wjVar));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    public void j6(zj zjVar) {
        this.FH.add(zjVar);
        lg(zjVar);
    }
}
