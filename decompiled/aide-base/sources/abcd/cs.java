package abcd;

/* loaded from: classes.dex */
public abstract class cs implements kt, Cloneable {
    private final as WB;
    private qp mb;

    public interface a {
        void DW(tr trVar);

        void FH(tr trVar);

        void j6(vr vrVar);
    }

    public cs(qp qpVar, as asVar) {
        if (asVar == null) {
            throw new NullPointerException("block == null");
        }
        this.WB = asVar;
        this.mb = qpVar;
    }

    public static cs BT(ip ipVar, as asVar) {
        return new tr(ipVar, asVar);
    }

    public qp EQ() {
        qp qpVar = this.mb;
        if (qpVar == null || qpVar.QX() == null) {
            return null;
        }
        return this.mb;
    }

    public abstract void FH(a aVar);

    public abstract boolean Hw();

    public abstract ip J0();

    public qp J8() {
        return this.mb;
    }

    public final void P8(xr xrVar) {
        qp qpVar = this.mb;
        this.mb = xrVar.DW(qpVar);
        this.WB.aM().ef(this, qpVar);
        ei(xrVar);
    }

    public final void SI(kp kpVar) {
        if (kpVar != this.mb.QX()) {
            if (kpVar == null || !kpVar.equals(this.mb.QX())) {
                this.mb = qp.sh(this.mb.Mr(), this.mb.j6(), kpVar);
            }
        }
    }

    public void VH(int i) {
        qp qpVar = this.mb;
        if (qpVar != null) {
            this.mb = qpVar.g3(i);
        }
    }

    public abstract rp Ws();

    public abstract ip cn();

    public abstract void ei(xr xrVar);

    public boolean er() {
        return false;
    }

    public boolean gW(int i) {
        qp qpVar = this.mb;
        return qpVar != null && qpVar.Mr() == i;
    }

    @Override // 
    /* renamed from: gn, reason: merged with bridge method [inline-methods] */
    public cs clone() {
        try {
            return (cs) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("unexpected", e);
        }
    }

    public abstract boolean j3();

    public boolean lg() {
        return false;
    }

    public void nw(qp qpVar) {
        if (qpVar == null) {
            throw new NullPointerException("result == null");
        }
        this.mb = qpVar;
    }

    public as tp() {
        return this.WB;
    }

    public abstract tp we();

    public abstract boolean yS();
}
