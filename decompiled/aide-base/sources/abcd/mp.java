package abcd;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class mp extends gt {
    private final sp[] fY;
    private final sp jw;
    private final int mb;
    private final HashMap<ip, qp> qp;

    public mp(up upVar) {
        if (upVar == null) {
            throw new NullPointerException("method == null");
        }
        dp dpVarDW = upVar.DW();
        int iEf = dpVarDW.ef();
        this.mb = dpVarDW.aj();
        this.jw = new sp(this.mb);
        this.fY = new sp[iEf];
        this.qp = new HashMap<>(dpVarDW.Qq());
        this.jw.Mr();
    }

    private sp sh(int i) {
        try {
            return this.fY[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public void BT(ip ipVar, qp qpVar) {
        a8();
        if (ipVar == null) {
            throw new NullPointerException("insn == null");
        }
        if (qpVar == null) {
            throw new NullPointerException("spec == null");
        }
        this.qp.put(ipVar, qpVar);
    }

    public int KD() {
        return this.qp.size();
    }

    public boolean cb(int i, sp spVar) {
        sp spVarSh = sh(i);
        if (spVarSh == null) {
            sG(i, spVar);
            return true;
        }
        sp spVarCb = spVarSh.cb();
        if (spVarSh.size() != 0) {
            spVarCb.cn(spVar, true);
        } else {
            spVarCb = spVar.cb();
        }
        if (spVarSh.equals(spVarCb)) {
            return false;
        }
        spVarCb.Mr();
        sG(i, spVarCb);
        return true;
    }

    public sp cn(cp cpVar) {
        return ro(cpVar.j6());
    }

    public sp dx(int i) {
        sp spVarSh = sh(i);
        return spVarSh != null ? spVarSh.cb() : new sp(this.mb);
    }

    public sp ro(int i) {
        sp spVarSh = sh(i);
        return spVarSh != null ? spVarSh : this.jw;
    }

    public void sG(int i, sp spVar) {
        a8();
        if (spVar == null) {
            throw new NullPointerException("specs == null");
        }
        try {
            this.fY[i] = spVar;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus label");
        }
    }

    public qp vy(ip ipVar) {
        return this.qp.get(ipVar);
    }
}
