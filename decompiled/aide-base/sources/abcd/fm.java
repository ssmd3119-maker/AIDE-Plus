package abcd;

/* loaded from: classes.dex */
public final class fm extends vm {
    private lm AL;
    private final zq fY;
    private final int jw;
    private final yq k2;
    private final zq mb;
    private qn qp;
    private cm w9;
    private final em zh;

    public fm(zq zqVar, int i, zq zqVar2, hr hrVar, yq yqVar) {
        if (zqVar == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (hrVar == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.mb = zqVar;
        this.jw = i;
        this.fY = zqVar2;
        this.qp = hrVar.size() == 0 ? null : new qn(hrVar);
        this.k2 = yqVar;
        this.zh = new em(zqVar);
        this.AL = null;
        this.w9 = new cm();
    }

    public zq BT() {
        return this.fY;
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_CLASS_DEF_ITEM;
    }

    public void KD(yo yoVar) {
        this.w9.sh(yoVar);
    }

    public void Mr(vq vqVar, yo yoVar) {
        this.w9.BT(vqVar, yoVar);
    }

    public void QX(om omVar) {
        this.zh.yS(omVar);
    }

    public void U2(vq vqVar, zo zoVar) {
        this.w9.vy(vqVar, zoVar);
    }

    public void XL(lq lqVar, yo yoVar) {
        this.w9.yS(lqVar, yoVar);
    }

    @Override // abcd.wm
    public void Zo(km kmVar, ls lsVar) {
        boolean zEQ = lsVar.EQ();
        pn pnVarJ3 = kmVar.j3();
        int iJ3 = pnVarJ3.j3(this.mb);
        zq zqVar = this.fY;
        int iJ32 = zqVar == null ? -1 : pnVarJ3.j3(zqVar);
        int iJ0 = fn.J0(this.qp);
        int iWe = this.w9.KD() ? 0 : this.w9.we();
        int iJ33 = this.k2 != null ? kmVar.aM().j3(this.k2) : -1;
        int iWe2 = this.zh.dx() ? 0 : this.zh.we();
        int iJ02 = fn.J0(this.AL);
        if (zEQ) {
            lsVar.Hw(0, we() + ' ' + this.mb.Zo());
            StringBuilder sb = new StringBuilder();
            sb.append("  class_idx:           ");
            sb.append(xs.tp(iJ3));
            lsVar.Hw(4, sb.toString());
            lsVar.Hw(4, "  access_flags:        " + bp.j6(this.jw));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  superclass_idx:      ");
            sb2.append(xs.tp(iJ32));
            sb2.append(" // ");
            zq zqVar2 = this.fY;
            sb2.append(zqVar2 == null ? "<none>" : zqVar2.Zo());
            lsVar.Hw(4, sb2.toString());
            lsVar.Hw(4, "  interfaces_off:      " + xs.tp(iJ0));
            if (iJ0 != 0) {
                hr hrVarYS = this.qp.yS();
                int size = hrVarYS.size();
                for (int i = 0; i < size; i++) {
                    lsVar.Hw(0, "    " + hrVarYS.v5(i).Zo());
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  source_file_idx:     ");
            sb3.append(xs.tp(iJ33));
            sb3.append(" // ");
            yq yqVar = this.k2;
            sb3.append(yqVar != null ? yqVar.Zo() : "<none>");
            lsVar.Hw(4, sb3.toString());
            lsVar.Hw(4, "  annotations_off:     " + xs.tp(iWe));
            lsVar.Hw(4, "  class_data_off:      " + xs.tp(iWe2));
            lsVar.Hw(4, "  static_values_off:   " + xs.tp(iJ02));
        }
        lsVar.writeInt(iJ3);
        lsVar.writeInt(this.jw);
        lsVar.writeInt(iJ32);
        lsVar.writeInt(iJ0);
        lsVar.writeInt(iJ33);
        lsVar.writeInt(iWe);
        lsVar.writeInt(iWe2);
        lsVar.writeInt(iJ02);
    }

    public void a8(mm mmVar, bq bqVar) {
        this.zh.vy(mmVar, bqVar);
    }

    public void aM(mm mmVar) {
        this.zh.BT(mmVar);
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        pn pnVarJ3 = kmVar.j3();
        en enVarV5 = kmVar.v5();
        en enVarU2 = kmVar.U2();
        en enVarMr = kmVar.Mr();
        nn nnVarAM = kmVar.aM();
        pnVarJ3.U2(this.mb);
        if (!this.zh.dx()) {
            kmVar.Zo().XL(this.zh);
            eq eqVarCb = this.zh.cb();
            if (eqVarCb != null) {
                this.AL = (lm) enVarV5.aM(new lm(eqVarCb));
            }
        }
        zq zqVar = this.fY;
        if (zqVar != null) {
            pnVarJ3.U2(zqVar);
        }
        qn qnVar = this.qp;
        if (qnVar != null) {
            this.qp = (qn) enVarMr.aM(qnVar);
        }
        yq yqVar = this.k2;
        if (yqVar != null) {
            nnVarAM.U2(yqVar);
        }
        if (this.w9.KD()) {
            return;
        }
        if (this.w9.ro()) {
            this.w9 = (cm) enVarU2.aM(this.w9);
        } else {
            enVarU2.XL(this.w9);
        }
    }

    public void rN(om omVar) {
        this.zh.KD(omVar);
    }

    @Override // abcd.wm
    public int v5() {
        return 32;
    }

    public zq vy() {
        return this.mb;
    }

    public hr yS() {
        qn qnVar = this.qp;
        return qnVar == null ? er.jw : qnVar.yS();
    }
}
