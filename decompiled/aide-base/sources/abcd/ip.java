package abcd;

/* loaded from: classes.dex */
public abstract class ip implements kt {
    private final tp WB;
    private final rp fY;
    private final qp jw;
    private final wp mb;

    public static class a implements b {
        @Override // abcd.ip.b
        public void FH(yp ypVar) {
        }

        @Override // abcd.ip.b
        public void Hw(zp zpVar) {
        }

        @Override // abcd.ip.b
        public void Zo(hp hpVar) {
        }

        @Override // abcd.ip.b
        public void j6(op opVar) {
        }

        @Override // abcd.ip.b
        public void v5(xp xpVar) {
        }
    }

    public interface b {
        void DW(np npVar);

        void FH(yp ypVar);

        void Hw(zp zpVar);

        void Zo(hp hpVar);

        void j6(op opVar);

        void v5(xp xpVar);
    }

    public ip(tp tpVar, wp wpVar, qp qpVar, rp rpVar) {
        if (tpVar == null) {
            throw new NullPointerException("opcode == null");
        }
        if (wpVar == null) {
            throw new NullPointerException("position == null");
        }
        if (rpVar == null) {
            throw new NullPointerException("sources == null");
        }
        this.WB = tpVar;
        this.mb = wpVar;
        this.jw = qpVar;
        this.fY = rpVar;
    }

    private static boolean v5(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public abstract void DW(b bVar);

    public final tp EQ() {
        return this.WB;
    }

    public final boolean FH() {
        return this.WB.j6();
    }

    public boolean Hw(ip ipVar) {
        return this.WB == ipVar.EQ() && this.mb.equals(ipVar.we()) && getClass() == ipVar.getClass() && v5(this.jw, ipVar.J0()) && v5(this.fY, ipVar.J8()) && er.ef(VH(), ipVar.VH());
    }

    public final qp J0() {
        return this.jw;
    }

    public final rp J8() {
        return this.fY;
    }

    public ip Mr() {
        return this;
    }

    public final String QX(String str) {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append("Insn{");
        stringBuffer.append(this.mb);
        stringBuffer.append(' ');
        stringBuffer.append(this.WB);
        if (str != null) {
            stringBuffer.append(' ');
            stringBuffer.append(str);
        }
        stringBuffer.append(" :: ");
        qp qpVar = this.jw;
        if (qpVar != null) {
            stringBuffer.append(qpVar);
            stringBuffer.append(" <- ");
        }
        stringBuffer.append(this.fY);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public abstract hr VH();

    public final String Ws(String str) {
        StringBuffer stringBuffer = new StringBuffer(80);
        stringBuffer.append(this.mb);
        stringBuffer.append(": ");
        stringBuffer.append(this.WB.FH());
        if (str != null) {
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")");
        }
        if (this.jw == null) {
            stringBuffer.append(" .");
        } else {
            stringBuffer.append(" ");
            stringBuffer.append(this.jw.Zo());
        }
        stringBuffer.append(" <-");
        int size = this.fY.size();
        if (size == 0) {
            stringBuffer.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                stringBuffer.append(" ");
                stringBuffer.append(this.fY.sG(i).Zo());
            }
        }
        return stringBuffer.toString();
    }

    @Override // abcd.kt
    public String Zo() {
        return Ws(gn());
    }

    public abstract ip aM(fr frVar);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public String gn() {
        return null;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public abstract ip j3(qp qpVar, rp rpVar);

    public String toString() {
        return QX(gn());
    }

    public final qp tp() {
        qp qpVarSG = this.WB.Hw() == 54 ? this.fY.sG(0) : this.jw;
        if (qpVarSG == null || qpVarSG.QX() == null) {
            return null;
        }
        return qpVarSG;
    }

    public final wp we() {
        return this.mb;
    }
}
