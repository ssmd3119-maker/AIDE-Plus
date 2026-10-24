package abcd;

import abcd.yj;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hm extends fn {
    private final boolean AL;
    private jm hK;
    private final yj k2;
    private final vq qp;
    private final hr w9;
    private dm zh;

    class a implements yj.a {
        final /* synthetic */ km j6;

        public a(hm hmVar, km kmVar) {
            this.j6 = kmVar;
        }

        @Override // abcd.yj.a
        public int j6(bq bqVar) {
            vm vmVarHw = this.j6.Hw(bqVar);
            if (vmVarHw == null) {
                return -1;
            }
            return vmVarHw.u7();
        }
    }

    public hm(vq vqVar, yj yjVar, boolean z, hr hrVar) {
        super(4, -1);
        if (vqVar == null) {
            throw new NullPointerException("ref == null");
        }
        if (yjVar == null) {
            throw new NullPointerException("code == null");
        }
        if (hrVar == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.qp = vqVar;
        this.k2 = yjVar;
        this.AL = z;
        this.w9 = hrVar;
        this.zh = null;
        this.hK = null;
    }

    private int BT() {
        return this.k2.Zo().Sf();
    }

    private void KD(km kmVar, ls lsVar) {
        try {
            this.k2.Zo().I(lsVar);
        } catch (RuntimeException e) {
            throw us.DW(e, "...while writing instructions for " + this.qp.Zo());
        }
    }

    private int vy() {
        return this.k2.Zo().vJ();
    }

    private int yS() {
        return this.qp.QX(this.AL);
    }

    @Override // abcd.wm
    public xm DW() {
        return xm.TYPE_CODE_ITEM;
    }

    @Override // abcd.fn
    public void Mr(jn jnVar, int i) {
        int iZo;
        km kmVarV5 = jnVar.v5();
        this.k2.j6(new a(this, kmVarV5));
        dm dmVar = this.zh;
        if (dmVar != null) {
            dmVar.FH(kmVarV5);
            iZo = this.zh.Zo();
        } else {
            iZo = 0;
        }
        int iSG = this.k2.Zo().sG();
        if ((iSG & 1) != 0) {
            iSG++;
        }
        U2((iSG * 2) + 16 + iZo);
    }

    @Override // abcd.fn
    public String a8() {
        return this.qp.Zo();
    }

    @Override // abcd.wm
    public void j6(km kmVar) {
        en enVarV5 = kmVar.v5();
        pn pnVarJ3 = kmVar.j3();
        if (this.k2.EQ() || this.k2.tp()) {
            jm jmVar = new jm(this.k2, this.AL, this.qp);
            this.hK = jmVar;
            enVarV5.XL(jmVar);
        }
        if (this.k2.u7()) {
            Iterator<fr> it = this.k2.FH().iterator();
            while (it.hasNext()) {
                pnVarJ3.a8(it.next());
            }
            this.zh = new dm(this.k2);
        }
        Iterator<bq> it2 = this.k2.v5().iterator();
        while (it2.hasNext()) {
            kmVar.a8(it2.next());
        }
    }

    @Override // abcd.fn
    public void rN(km kmVar, ls lsVar) {
        boolean zEQ = lsVar.EQ();
        int iVy = vy();
        int iBT = BT();
        int iYS = yS();
        int iSG = this.k2.Zo().sG();
        boolean z = (iSG & 1) != 0;
        dm dmVar = this.zh;
        int iV5 = dmVar == null ? 0 : dmVar.v5();
        jm jmVar = this.hK;
        int iWe = jmVar == null ? 0 : jmVar.we();
        if (zEQ) {
            lsVar.Hw(0, XL() + ' ' + this.qp.Zo());
            StringBuilder sb = new StringBuilder();
            sb.append("  registers_size: ");
            sb.append(xs.VH(iVy));
            lsVar.Hw(2, sb.toString());
            lsVar.Hw(2, "  ins_size:       " + xs.VH(iYS));
            lsVar.Hw(2, "  outs_size:      " + xs.VH(iBT));
            lsVar.Hw(2, "  tries_size:     " + xs.VH(iV5));
            lsVar.Hw(4, "  debug_off:      " + xs.tp(iWe));
            lsVar.Hw(4, "  insns_size:     " + xs.tp(iSG));
            if (this.w9.size() != 0) {
                lsVar.Hw(0, "  throws " + er.sy(this.w9));
            }
        }
        lsVar.writeShort(iVy);
        lsVar.writeShort(iYS);
        lsVar.writeShort(iBT);
        lsVar.writeShort(iV5);
        lsVar.writeInt(iWe);
        lsVar.writeInt(iSG);
        KD(kmVar, lsVar);
        if (this.zh != null) {
            if (z) {
                if (zEQ) {
                    lsVar.Hw(2, "  padding: 0");
                }
                lsVar.writeShort(0);
            }
            this.zh.VH(kmVar, lsVar);
        }
        if (!zEQ || this.hK == null) {
            return;
        }
        lsVar.Hw(0, "  debug info");
        this.hK.yS(kmVar, lsVar, "    ");
    }

    public String toString() {
        return "CodeItem{" + a8() + "}";
    }
}
