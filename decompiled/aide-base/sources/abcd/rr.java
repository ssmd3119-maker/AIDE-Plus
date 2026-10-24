package abcd;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class rr extends gt {
    private final sp[] fY;
    private final sp jw;
    private final int mb;
    private final HashMap<cs, qp> qp;

    public rr(ds dsVar) {
        if (dsVar == null) {
            throw new NullPointerException("method == null");
        }
        ArrayList<as> arrayListJ0 = dsVar.J0();
        this.mb = dsVar.a8();
        this.jw = new sp(this.mb);
        this.fY = new sp[arrayListJ0.size()];
        this.qp = new HashMap<>();
        this.jw.Mr();
    }

    private sp KD(int i) {
        try {
            return this.fY[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    public void BT(cs csVar, qp qpVar) {
        a8();
        if (csVar == null) {
            throw new NullPointerException("insn == null");
        }
        if (qpVar == null) {
            throw new NullPointerException("spec == null");
        }
        this.qp.put(csVar, qpVar);
    }

    public sp cn(int i) {
        sp spVarKD = KD(i);
        return spVarKD != null ? spVarKD.cb() : new sp(this.mb);
    }

    public boolean ro(int i, sp spVar) {
        sp spVarKD = KD(i);
        if (spVarKD == null) {
            sh(i, spVar);
            return true;
        }
        sp spVarCb = spVarKD.cb();
        spVarCb.cn(spVar, true);
        if (spVarKD.equals(spVarCb)) {
            return false;
        }
        spVarCb.Mr();
        sh(i, spVarCb);
        return true;
    }

    public void sh(int i, sp spVar) {
        a8();
        if (spVar == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.fY[i] = spVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus index");
        }
    }

    public sp vy(int i) {
        sp spVarKD = KD(i);
        return spVarKD != null ? spVarKD : this.jw;
    }
}
