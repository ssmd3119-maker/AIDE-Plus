package abcd;

import abcd.cs;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class sr {
    private final ds j6;

    class a implements cs.a {
        final /* synthetic */ HashSet DW;
        final /* synthetic */ qp[] j6;

        /* renamed from: abcd.sr$a$a, reason: collision with other inner class name */
        class C0012a extends xr {
            final /* synthetic */ qp DW;
            final /* synthetic */ qp j6;

            public C0012a(qp qpVar, qp qpVar2) {
                this.j6 = qpVar;
                this.DW = qpVar2;
            }

            @Override // abcd.xr
            public qp DW(qp qpVar) {
                return qpVar.Mr() == this.j6.Mr() ? this.DW : qpVar;
            }

            @Override // abcd.xr
            public int j6() {
                return sr.this.j6.a8();
            }
        }

        public a(qp[] qpVarArr, HashSet hashSet) {
            this.j6 = qpVarArr;
            this.DW = hashSet;
        }

        @Override // abcd.cs.a
        public void DW(tr trVar) {
        }

        @Override // abcd.cs.a
        public void FH(tr trVar) {
            if (trVar.we().Hw() != 3) {
                return;
            }
            int iFH = sr.this.FH(trVar);
            qp[] qpVarArr = this.j6;
            if (qpVarArr[iFH] == null) {
                qpVarArr[iFH] = trVar.J8();
                return;
            }
            qp qpVar = qpVarArr[iFH];
            qp qpVarJ8 = trVar.J8();
            kp kpVarQX = qpVar.QX();
            kp kpVarQX2 = qpVarJ8.QX();
            if (kpVarQX == null) {
                kpVarQX = kpVarQX2;
            } else if (kpVarQX2 != null && !kpVarQX.equals(kpVarQX2)) {
                return;
            }
            sr.this.j6.Ws(qpVar.Mr()).SI(kpVarQX);
            C0012a c0012a = new C0012a(qpVarJ8, qpVar);
            List<cs> listRN = sr.this.j6.rN(qpVarJ8.Mr());
            for (int size = listRN.size() - 1; size >= 0; size--) {
                listRN.get(size).ei(c0012a);
            }
            this.DW.add(trVar);
        }

        @Override // abcd.cs.a
        public void j6(vr vrVar) {
        }
    }

    private sr(ds dsVar) {
        this.j6 = dsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int FH(tr trVar) {
        return ((nq) ((ep) trVar.J0()).a8()).a8();
    }

    public static void Hw(ds dsVar) {
        new sr(dsVar).v5();
    }

    private void v5() {
        qp[] qpVarArr = new qp[this.j6.U2()];
        HashSet hashSet = new HashSet();
        this.j6.we(new a(qpVarArr, hashSet));
        this.j6.u7(hashSet);
    }
}
