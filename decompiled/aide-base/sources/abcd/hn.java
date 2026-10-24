package abcd;

/* loaded from: classes.dex */
public final class hn extends vm {
    private qn fY;
    private final yq jw;
    private final dr mb;

    public hn(dr drVar) {
        if (drVar == null) {
            throw new NullPointerException("prototype == null");
        }
        this.mb = drVar;
        this.jw = QX(drVar);
        er erVarV5 = drVar.v5();
        this.fY = erVarV5.size() == 0 ? null : new qn(erVarV5);
    }

    private static yq QX(dr drVar) {
        er erVarV5 = drVar.v5();
        int size = erVarV5.size();
        StringBuilder sb = new StringBuilder(size + 1);
        sb.append(XL(drVar.Zo()));
        for (int i = 0; i < size; i++) {
            sb.append(XL(erVarV5.v5(i)));
        }
        return new yq(sb.toString());
    }

    private static char XL(fr frVar) {
        char cCharAt = frVar.QX().charAt(0);
        if (cCharAt == '[') {
            return 'L';
        }
        return cCharAt;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_PROTO_ID_ITEM;
    }

    @Override // abcd.wm
    public void Zo(km kmVar, ls lsVar) {
        int iJ3 = kmVar.aM().j3(this.jw);
        int iMr = kmVar.j3().Mr(this.mb.Zo());
        int iJ0 = fn.J0(this.fY);
        if (lsVar.EQ()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mb.Zo().Zo());
            sb.append(" proto(");
            er erVarV5 = this.mb.v5();
            int size = erVarV5.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(erVarV5.v5(i).Zo());
            }
            sb.append(")");
            lsVar.Hw(0, we() + ' ' + sb.toString());
            lsVar.Hw(4, "  shorty_idx:      " + xs.tp(iJ3) + " // " + this.jw.yS());
            lsVar.Hw(4, "  return_type_idx: " + xs.tp(iMr) + " // " + this.mb.Zo().Zo());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  parameters_off:  ");
            sb2.append(xs.tp(iJ0));
            lsVar.Hw(4, sb2.toString());
        }
        lsVar.writeInt(iJ3);
        lsVar.writeInt(iMr);
        lsVar.writeInt(iJ0);
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        nn nnVarAM = kmVar.aM();
        pn pnVarJ3 = kmVar.j3();
        en enVarMr = kmVar.Mr();
        pnVarJ3.a8(this.mb.Zo());
        nnVarAM.U2(this.jw);
        qn qnVar = this.fY;
        if (qnVar != null) {
            this.fY = (qn) enVarMr.aM(qnVar);
        }
    }

    @Override // abcd.wm
    public int v5() {
        return 12;
    }
}
