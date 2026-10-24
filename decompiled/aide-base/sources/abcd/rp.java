package abcd;

import java.util.BitSet;

/* loaded from: classes.dex */
public final class rp extends ws implements hr {
    public static final rp jw = new rp(0);

    public rp(int i) {
        super(i);
    }

    public static rp g3(qp qpVar, qp qpVar2) {
        rp rpVar = new rp(2);
        rpVar.Mz(0, qpVar);
        rpVar.Mz(1, qpVar2);
        return rpVar;
    }

    public static rp vJ(qp qpVar) {
        rp rpVar = new rp(1);
        rpVar.Mz(0, qpVar);
        return rpVar;
    }

    public rp I(BitSet bitSet) {
        int size = size() - bitSet.cardinality();
        if (size == 0) {
            return jw;
        }
        rp rpVar = new rp(size);
        int i = 0;
        for (int i2 = 0; i2 < size(); i2++) {
            if (!bitSet.get(i2)) {
                rpVar.KD(i, BT(i2));
                i++;
            }
        }
        if (aM()) {
            rpVar.Mr();
        }
        return rpVar;
    }

    public void Mz(int i, qp qpVar) {
        KD(i, qpVar);
    }

    public rp Qq(int i) {
        int size = size();
        if (size == 0) {
            return this;
        }
        rp rpVar = new rp(size);
        for (int i2 = 0; i2 < size; i2++) {
            qp qpVar = (qp) BT(i2);
            if (qpVar != null) {
                rpVar.KD(i2, qpVar.vJ(i));
            }
        }
        if (aM()) {
            rpVar.Mr();
        }
        return rpVar;
    }

    public int Sf(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (sG(i2).Mr() == i) {
                return i2;
            }
        }
        return -1;
    }

    public rp aj() {
        int size = size() - 1;
        if (size == 0) {
            return jw;
        }
        rp rpVar = new rp(size);
        for (int i = 0; i < size; i++) {
            rpVar.KD(i, BT(i));
        }
        if (aM()) {
            rpVar.Mr();
        }
        return rpVar;
    }

    public rp ca(int i, boolean z, BitSet bitSet) {
        int size = size();
        if (size == 0) {
            return this;
        }
        rp rpVar = new rp(size);
        for (int i2 = 0; i2 < size; i2++) {
            qp qpVar = (qp) BT(i2);
            boolean z2 = true;
            if (bitSet != null && bitSet.get(i2)) {
                z2 = false;
            }
            if (z2) {
                rpVar.KD(i2, qpVar.g3(i));
                if (!z) {
                    i += qpVar.J0();
                }
            } else {
                rpVar.KD(i2, qpVar);
            }
            if (z) {
                z = false;
            }
        }
        if (aM()) {
            rpVar.Mr();
        }
        return rpVar;
    }

    public int ef() {
        int size = size();
        int iTp = 0;
        for (int i = 0; i < size; i++) {
            iTp += v5(i).tp();
        }
        return iTp;
    }

    public qp sG(int i) {
        return (qp) BT(i);
    }

    public rp sy() {
        int size = size() - 1;
        if (size == 0) {
            return jw;
        }
        rp rpVar = new rp(size);
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            rpVar.KD(i, BT(i2));
            i = i2;
        }
        if (aM()) {
            rpVar.Mr();
        }
        return rpVar;
    }

    @Override // abcd.hr
    public hr tp(fr frVar) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // abcd.hr
    public fr v5(int i) {
        fr frVarJ6 = sG(i).j6();
        frVarJ6.j6();
        return frVarJ6;
    }

    public rp x9(qp qpVar) {
        int size = size();
        rp rpVar = new rp(size + 1);
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            rpVar.KD(i2, BT(i));
            i = i2;
        }
        rpVar.KD(0, qpVar);
        if (aM()) {
            rpVar.Mr();
        }
        return rpVar;
    }
}
