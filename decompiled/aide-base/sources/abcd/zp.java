package abcd;

import abcd.ip;

/* loaded from: classes.dex */
public final class zp extends ip {
    private final hr qp;

    public zp(tp tpVar, wp wpVar, rp rpVar, hr hrVar) {
        super(tpVar, wpVar, null, rpVar);
        if (tpVar.DW() != 6) {
            throw new IllegalArgumentException("bogus branchingness");
        }
        if (hrVar == null) {
            throw new NullPointerException("catches == null");
        }
        this.qp = hrVar;
    }

    public static String a8(hr hrVar) {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("catch");
        int size = hrVar.size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(" ");
            stringBuffer.append(hrVar.v5(i).Zo());
        }
        return stringBuffer.toString();
    }

    @Override // abcd.ip
    public void DW(ip.b bVar) {
        bVar.Hw(this);
    }

    @Override // abcd.ip
    public hr VH() {
        return this.qp;
    }

    @Override // abcd.ip
    public ip aM(fr frVar) {
        return new zp(EQ(), we(), J8(), this.qp.tp(frVar));
    }

    @Override // abcd.ip
    public String gn() {
        return a8(this.qp);
    }

    @Override // abcd.ip
    public ip j3(qp qpVar, rp rpVar) {
        return new zp(EQ(), we(), rpVar, this.qp);
    }
}
