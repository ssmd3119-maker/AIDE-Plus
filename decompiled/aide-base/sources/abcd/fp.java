package abcd;

import com.aide.uidesigner.ProxyTextView;

/* loaded from: classes.dex */
public final class fp implements aq {
    public static final fp DW = new fp();
    private final boolean j6 = false;

    private fp() {
    }

    private int Hw(rp rpVar) {
        int size = rpVar.size();
        int iJ0 = 0;
        for (int i = 0; i < size; i++) {
            iJ0 += rpVar.sG(i).J0();
        }
        return iJ0;
    }

    @Override // abcd.aq
    public boolean DW(tp tpVar, rp rpVar) {
        return !this.j6 && tpVar.VH() && Hw(rpVar) >= 6;
    }

    @Override // abcd.aq
    public boolean FH(tp tpVar, qp qpVar, qp qpVar2) {
        if (qpVar.j6() != fr.n5) {
            return false;
        }
        if (!(qpVar2.a8() instanceof nq)) {
            if ((qpVar.a8() instanceof nq) && tpVar.Hw() == 15) {
                return ((nq) qpVar.a8()).we();
            }
            return false;
        }
        nq nqVar = (nq) qpVar2.a8();
        switch (tpVar.Hw()) {
            case 14:
            case 16:
            case ProxyTextView.INPUTTYPE_textUri /* 17 */:
            case ProxyTextView.INPUTTYPE_numberPassword /* 18 */:
            case ProxyTextView.INPUTTYPE_date /* 20 */:
            case 21:
            case 22:
                return nqVar.we();
            case 15:
                return nq.yS(-nqVar.a8()).we();
            case 19:
            default:
                return false;
            case 23:
            case 24:
            case 25:
                return nqVar.J0();
        }
    }

    @Override // abcd.aq
    public int j6() {
        return 16;
    }
}
