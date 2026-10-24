package abcd;

import abcd.cs;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class pr {
    private final ds j6;

    class a implements cs.a {
        final /* synthetic */ aq j6;

        public a(aq aqVar) {
            this.j6 = aqVar;
        }

        @Override // abcd.cs.a
        public void DW(tr trVar) {
        }

        @Override // abcd.cs.a
        public void FH(tr trVar) {
            tp tpVarEQ = trVar.J0().EQ();
            rp rpVarWs = trVar.Ws();
            if (!pr.this.gn(trVar) && rpVarWs.size() == 2) {
                if (tpVarEQ.DW() == 4) {
                    if (pr.Hw(rpVarWs.sG(0))) {
                        pr.this.Zo(trVar, rpVarWs.sy(), pp.j6(tpVarEQ.Hw()), null);
                        return;
                    } else {
                        if (pr.Hw(rpVarWs.sG(1))) {
                            pr.this.Zo(trVar, rpVarWs.aj(), tpVarEQ.Hw(), null);
                            return;
                        }
                        return;
                    }
                }
                if (this.j6.FH(tpVarEQ, rpVarWs.sG(0), rpVarWs.sG(1))) {
                    trVar.sG();
                } else if (tpVarEQ.gn() && this.j6.FH(tpVarEQ, rpVarWs.sG(1), rpVarWs.sG(0))) {
                    trVar.dx(rp.g3(rpVarWs.sG(1), rpVarWs.sG(0)));
                    trVar.sG();
                }
            }
        }

        @Override // abcd.cs.a
        public void j6(vr vrVar) {
        }
    }

    private pr(ds dsVar) {
        this.j6 = dsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Hw(qp qpVar) {
        gr grVarA8 = qpVar.a8();
        return (grVarA8 instanceof sq) && ((sq) grVarA8).Mr() == 0;
    }

    private void VH() {
        this.j6.we(new a(ur.j6()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Zo(tr trVar, rp rpVar, int i, bq bqVar) {
        ip ipVarJ0 = trVar.J0();
        tp tpVarI = vp.I(i, trVar.J8(), rpVar, bqVar);
        tr trVar2 = new tr(bqVar == null ? new op(tpVarI, ipVarJ0.we(), trVar.J8(), rpVar) : new np(tpVarI, ipVarJ0.we(), trVar.J8(), rpVar, bqVar), trVar.tp());
        ArrayList<cs> arrayListQX = trVar.tp().QX();
        this.j6.SI(trVar);
        arrayListQX.set(arrayListQX.lastIndexOf(trVar), trVar2);
        this.j6.nw(trVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean gn(tr trVar) {
        tp tpVarEQ = trVar.J0().EQ();
        qp qpVarJ8 = trVar.J8();
        if (qpVarJ8 != null && !this.j6.yS(qpVarJ8) && tpVarEQ.Hw() != 5) {
            gr grVarA8 = trVar.J8().a8();
            if (grVarA8.XL() && grVarA8.u7() == 6) {
                Zo(trVar, rp.jw, 5, (bq) grVarA8);
                if (tpVarEQ.Hw() == 56) {
                    ArrayList<cs> arrayListQX = this.j6.J0().get(trVar.tp().Mr().nextSetBit(0)).QX();
                    Zo((tr) arrayListQX.get(arrayListQX.size() - 1), rp.jw, 6, null);
                }
                return true;
            }
        }
        return false;
    }

    public static void v5(ds dsVar) {
        new pr(dsVar).VH();
    }
}
