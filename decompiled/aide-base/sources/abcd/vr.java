package abcd;

import abcd.cs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class vr extends cs {
    private final ArrayList<a> fY;
    private final int jw;
    private rp qp;

    private static class a {
        public final int DW;
        public final int FH;
        public qp j6;

        public a(qp qpVar, int i, int i2) {
            this.j6 = qpVar;
            this.DW = i;
            this.FH = i2;
        }
    }

    public interface b {
        void j6(vr vrVar);
    }

    public vr(qp qpVar, as asVar) {
        super(qpVar, asVar);
        this.fY = new ArrayList<>();
        this.jw = qpVar.Mr();
    }

    @Override // abcd.cs
    public void FH(cs.a aVar) {
        aVar.j6(this);
    }

    @Override // abcd.cs
    public boolean Hw() {
        return false;
    }

    @Override // abcd.cs
    public ip J0() {
        return null;
    }

    public void Mz(ds dsVar) {
        Iterator<a> it = this.fY.iterator();
        while (it.hasNext()) {
            a next = it.next();
            next.j6 = next.j6.I(dsVar.Ws(next.j6.Mr()).J8().j6());
        }
        this.qp = null;
    }

    public List<as> Sf(int i, ds dsVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.fY.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j6.Mr() == i) {
                arrayList.add(dsVar.J0().get(next.DW));
            }
        }
        return arrayList;
    }

    @Override // abcd.cs
    public rp Ws() {
        rp rpVar = this.qp;
        if (rpVar != null) {
            return rpVar;
        }
        if (this.fY.size() == 0) {
            return rp.jw;
        }
        int size = this.fY.size();
        this.qp = new rp(size);
        for (int i = 0; i < size; i++) {
            this.qp.Mz(i, this.fY.get(i).j6);
        }
        this.qp.Mr();
        return this.qp;
    }

    @Override // abcd.kt
    public String Zo() {
        return g3(null);
    }

    public void cb(gr grVar, kp kpVar) {
        nw(qp.sh(J8().Mr(), grVar, kpVar));
    }

    @Override // abcd.cs
    public /* bridge */ /* synthetic */ Object clone() {
        dx();
        throw null;
    }

    @Override // abcd.cs
    public ip cn() {
        throw new IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    public vr dx() {
        throw new UnsupportedOperationException("can't clone phi");
    }

    public int ef(int i) {
        return this.fY.get(i).DW;
    }

    @Override // abcd.cs
    public final void ei(xr xrVar) {
        Iterator<a> it = this.fY.iterator();
        while (it.hasNext()) {
            a next = it.next();
            qp qpVar = next.j6;
            qp qpVarDW = xrVar.DW(qpVar);
            next.j6 = qpVarDW;
            if (qpVar != qpVarDW) {
                tp().aM().ro(this, qpVar, next.j6);
            }
        }
        this.qp = null;
    }

    public final String g3(String str) {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(wp.Hw);
        stringBuffer.append(": phi");
        if (str != null) {
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")");
        }
        qp qpVarJ8 = J8();
        if (qpVarJ8 == null) {
            stringBuffer.append(" .");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(qpVarJ8.Zo());
        }
        stringBuffer.append(" <-");
        int size = Ws().size();
        if (size == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                stringBuffer.append(" ");
                stringBuffer.append(this.qp.sG(i).Zo() + "[b=" + xs.VH(this.fY.get(i).FH) + "]");
            }
        }
        return stringBuffer.toString();
    }

    @Override // abcd.cs
    /* renamed from: gn */
    public /* bridge */ /* synthetic */ cs clone() {
        dx();
        throw null;
    }

    @Override // abcd.cs
    public boolean j3() {
        return ur.DW() && EQ() != null;
    }

    public int sG() {
        return this.jw;
    }

    public void sh(qp qpVar, as asVar) {
        this.fY.add(new a(qpVar, asVar.Ws(), asVar.rN()));
        this.qp = null;
    }

    public void vJ(qp qpVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.fY.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.j6.Mr() == qpVar.Mr()) {
                arrayList.add(next);
            }
        }
        this.fY.removeAll(arrayList);
        this.qp = null;
    }

    @Override // abcd.cs
    public tp we() {
        return null;
    }

    @Override // abcd.cs
    public boolean yS() {
        return true;
    }

    public vr(int i, as asVar) {
        super(qp.ro(i, fr.Jl), asVar);
        this.fY = new ArrayList<>();
        this.jw = i;
    }
}
