package abcd;

import abcd.as;
import abcd.cs;
import abcd.vr;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class es implements Runnable {
    private final ds WB;
    private int fY;
    private final int jw;
    private final ArrayList<kp> k2;
    private int mb;
    private final qp[][] qp;

    class a implements as.a {
        public a() {
        }

        @Override // abcd.as.a
        public void j6(as asVar, as asVar2) {
            es.this.new b(asVar).VH();
        }
    }

    private class b implements cs.a {
        private final qp[] DW;
        private final as j6;
        private final HashSet<cs> FH = new HashSet<>();
        private final HashMap<cs, cs> Hw = new HashMap<>();
        private final C0002b v5 = new C0002b();

        class a implements vr.b {
            public a() {
            }

            @Override // abcd.vr.b
            public void j6(vr vrVar) {
                int iSG = vrVar.sG();
                if (es.this.XL(iSG)) {
                    return;
                }
                qp qpVar = b.this.DW[iSG];
                if (es.this.aM(qpVar.Mr())) {
                    return;
                }
                vrVar.sh(qpVar, b.this.j6);
            }
        }

        /* renamed from: abcd.es$b$b, reason: collision with other inner class name */
        private class C0002b extends xr {
            public C0002b() {
            }

            @Override // abcd.xr
            public qp DW(qp qpVar) {
                if (qpVar == null) {
                    return null;
                }
                return qpVar.g3(b.this.DW[qpVar.Mr()].Mr());
            }

            @Override // abcd.xr
            public int j6() {
                return es.this.mb;
            }
        }

        public b(as asVar) {
            this.j6 = asVar;
            this.DW = es.this.qp[asVar.Ws()];
            es.this.qp[asVar.Ws()] = null;
        }

        private void Zo(int i, qp qpVar) {
            int iMr = qpVar.Mr();
            kp kpVarQX = qpVar.QX();
            qp[] qpVarArr = this.DW;
            qpVarArr[i] = qpVar;
            for (int length = qpVarArr.length - 1; length >= 0; length--) {
                if (iMr == this.DW[length].Mr()) {
                    this.DW[length] = qpVar;
                }
            }
            if (kpVarQX == null) {
                return;
            }
            es.this.j3(qpVar);
            for (int length2 = this.DW.length - 1; length2 >= 0; length2--) {
                qp qpVar2 = this.DW[length2];
                if (iMr != qpVar2.Mr() && kpVarQX.equals(qpVar2.QX())) {
                    this.DW[length2] = qpVar2.Sf(null);
                }
            }
        }

        private void u7() {
            a aVar = new a();
            BitSet bitSetBT = this.j6.BT();
            for (int iNextSetBit = bitSetBT.nextSetBit(0); iNextSetBit >= 0; iNextSetBit = bitSetBT.nextSetBit(iNextSetBit + 1)) {
                es.this.WB.J0().get(iNextSetBit).we(aVar);
            }
        }

        @Override // abcd.cs.a
        public void DW(tr trVar) {
            qp qpVarJ8 = trVar.J8();
            int iMr = qpVarJ8.Mr();
            int iMr2 = trVar.Ws().sG(0).Mr();
            trVar.ei(this.v5);
            int iMr3 = trVar.Ws().sG(0).Mr();
            kp kpVarQX = this.DW[iMr2].QX();
            kp kpVarQX2 = qpVarJ8.QX();
            if (kpVarQX2 == null) {
                kpVarQX2 = kpVarQX;
            }
            kp kpVarQX3 = es.this.QX(iMr3);
            boolean z = kpVarQX3 == null || kpVarQX2 == null || kpVarQX2.equals(kpVarQX3);
            qp qpVarSh = qp.sh(iMr3, qpVarJ8.j6(), kpVarQX2);
            if (!ur.DW() || (z && es.Ws(kpVarQX2, kpVarQX) && es.this.fY == 0)) {
                Zo(iMr, qpVarSh);
                return;
            }
            if (z && kpVarQX == null && es.this.fY == 0) {
                this.Hw.put(trVar, cs.BT(new op(vp.rN(qpVarSh), wp.Hw, (qp) null, rp.vJ(qp.cn(qpVarSh.Mr(), qpVarSh.j6(), kpVarQX2))), this.j6));
                Zo(iMr, qpVarSh);
            } else {
                gn(trVar);
                this.FH.add(trVar);
            }
        }

        @Override // abcd.cs.a
        public void FH(tr trVar) {
            trVar.ei(this.v5);
            gn(trVar);
        }

        public void VH() {
            this.j6.EQ(this);
            u7();
            ArrayList<cs> arrayListQX = this.j6.QX();
            boolean z = true;
            for (int size = arrayListQX.size() - 1; size >= 0; size--) {
                cs csVar = arrayListQX.get(size);
                cs csVar2 = this.Hw.get(csVar);
                if (csVar2 != null) {
                    arrayListQX.set(size, csVar2);
                } else if (csVar.er() && !this.FH.contains(csVar)) {
                    arrayListQX.remove(size);
                }
            }
            Iterator<as> it = this.j6.J8().iterator();
            while (it.hasNext()) {
                as next = it.next();
                if (next != this.j6) {
                    es.this.qp[next.Ws()] = z ? this.DW : es.J8(this.DW);
                    z = false;
                }
            }
        }

        public void gn(cs csVar) {
            qp qpVarJ8 = csVar.J8();
            if (qpVarJ8 == null) {
                return;
            }
            int iMr = qpVarJ8.Mr();
            if (es.this.XL(iMr)) {
                return;
            }
            csVar.VH(es.this.mb);
            Zo(iMr, csVar.J8());
            es.FH(es.this);
        }

        @Override // abcd.cs.a
        public void j6(vr vrVar) {
            gn(vrVar);
        }
    }

    public es(ds dsVar) {
        int iA8 = dsVar.a8();
        this.jw = iA8;
        this.WB = dsVar;
        this.mb = iA8;
        this.fY = 0;
        this.qp = new qp[dsVar.J0().size()][];
        this.k2 = new ArrayList<>();
        qp[] qpVarArr = new qp[this.jw];
        for (int i = 0; i < this.jw; i++) {
            qpVarArr[i] = qp.ro(i, fr.Jl);
        }
        this.qp[dsVar.XL()] = qpVarArr;
    }

    public static /* synthetic */ int FH(es esVar) {
        int i = esVar.mb;
        esVar.mb = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qp[] J8(qp[] qpVarArr) {
        qp[] qpVarArr2 = new qp[qpVarArr.length];
        System.arraycopy(qpVarArr, 0, qpVarArr2, 0, qpVarArr.length);
        return qpVarArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public kp QX(int i) {
        if (i < this.k2.size()) {
            return this.k2.get(i);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Ws(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean XL(int i) {
        return i < this.fY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aM(int i) {
        return i < this.jw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(qp qpVar) {
        int iMr = qpVar.Mr();
        kp kpVarQX = qpVar.QX();
        this.k2.ensureCapacity(iMr + 1);
        while (this.k2.size() <= iMr) {
            this.k2.add(null);
        }
        this.k2.set(iMr, kpVarQX);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.WB.EQ(new a());
        this.WB.sG(this.mb);
        this.WB.KD();
    }

    public es(ds dsVar, int i) {
        this(dsVar);
        this.fY = i;
    }
}
