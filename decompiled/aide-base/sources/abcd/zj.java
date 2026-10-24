package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public abstract class zj {
    private final bk DW;
    private final wp FH;
    private final rp Hw;
    private int j6;

    public zj(bk bkVar, wp wpVar, rp rpVar) {
        if (bkVar == null) {
            throw new NullPointerException("opcode == null");
        }
        if (wpVar == null) {
            throw new NullPointerException("position == null");
        }
        if (rpVar == null) {
            throw new NullPointerException("registers == null");
        }
        this.j6 = -1;
        this.DW = bkVar;
        this.FH = wpVar;
        this.Hw = rpVar;
    }

    public static qk aM(wp wpVar, qp qpVar, qp qpVar2) {
        boolean z = qpVar.J0() == 1;
        boolean zDx = qpVar.j6().dx();
        int iMr = qpVar.Mr();
        return new qk((qpVar2.Mr() | iMr) < 16 ? zDx ? ck.tp : z ? ck.Hw : ck.VH : iMr < 256 ? zDx ? ck.EQ : z ? ck.v5 : ck.gn : zDx ? ck.we : z ? ck.Zo : ck.u7, wpVar, rp.g3(qpVar, qpVar2));
    }

    public abstract int DW();

    public final wp EQ() {
        return this.FH;
    }

    public zj FH(BitSet bitSet) {
        rp rpVar = this.Hw;
        boolean z = bitSet.get(0);
        if (J8()) {
            bitSet.set(0);
        }
        rp rpVarI = rpVar.I(bitSet);
        if (J8()) {
            bitSet.set(0, z);
        }
        if (rpVarI.size() == 0) {
            return null;
        }
        return new ek(this.FH, rpVarI);
    }

    public zj Hw(BitSet bitSet) {
        if (!J8() || bitSet.get(0)) {
            return null;
        }
        qp qpVarSG = this.Hw.sG(0);
        return aM(this.FH, qpVarSG, qpVarSG.g3(0));
    }

    public final boolean J0() {
        return this.j6 >= 0;
    }

    public final boolean J8() {
        return this.DW.VH();
    }

    public abstract zj Mr(bk bkVar);

    public final String QX(String str, int i, boolean z) {
        String strXL = XL(z);
        if (strXL == null) {
            return null;
        }
        String str2 = str + Ws() + ": ";
        int length = str2.length();
        return lt.gn(str2, length, "", strXL, i == 0 ? strXL.length() : i - length);
    }

    public abstract zj U2(int i);

    public zj VH() {
        return a8(this.Hw.ca(0, J8(), null));
    }

    public final String Ws() {
        int i = this.j6;
        return i != -1 ? String.format("%04x", Integer.valueOf(i)) : xs.tp(System.identityHashCode(this));
    }

    public abstract String XL(boolean z);

    public final int Zo() {
        int i = this.j6;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("address not yet known");
    }

    public abstract zj a8(rp rpVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [abcd.rp] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.BitSet] */
    public final int gn(BitSet bitSet) {
        ?? J8 = J8();
        int size = this.Hw.size();
        int iJ0 = 0;
        int iJ02 = (J8 == 0 || bitSet.get(0)) ? 0 : this.Hw.sG(0).J0();
        while (J8 < size) {
            if (!bitSet.get(J8)) {
                iJ0 += this.Hw.sG(J8).J0();
            }
            J8++;
        }
        return Math.max(iJ0, iJ02);
    }

    public final void j3(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        this.j6 = i;
    }

    public abstract String j6();

    public abstract void lg(ls lsVar);

    public final String toString() {
        boolean z;
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(Ws());
        stringBuffer.append(' ');
        stringBuffer.append(this.FH);
        stringBuffer.append(": ");
        stringBuffer.append(this.DW.FH());
        if (this.Hw.size() != 0) {
            stringBuffer.append(this.Hw.sh(" ", ", ", null));
            z = true;
        } else {
            z = false;
        }
        String strJ6 = j6();
        if (strJ6 != null) {
            if (z) {
                stringBuffer.append(',');
            }
            stringBuffer.append(' ');
            stringBuffer.append(strJ6);
        }
        return stringBuffer.toString();
    }

    public final bk tp() {
        return this.DW;
    }

    public final int u7() {
        return Zo() + DW();
    }

    public zj v5(BitSet bitSet) {
        return a8(this.Hw.ca(0, J8(), bitSet));
    }

    public final rp we() {
        return this.Hw;
    }
}
