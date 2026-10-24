package abcd;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes.dex */
public abstract class bi0 extends ai0 {
    protected Vector WB;

    public bi0() {
        this.WB = new Vector();
    }

    public static bi0 J8(Object obj) {
        if (obj == null || (obj instanceof bi0)) {
            return (bi0) obj;
        }
        if (obj instanceof ci0) {
            return J8(((ci0) obj).DW());
        }
        if (obj instanceof byte[]) {
            try {
                return J8(ai0.tp((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof mh0) {
            ai0 ai0VarDW = ((mh0) obj).DW();
            if (ai0VarDW instanceof bi0) {
                return (bi0) ai0VarDW;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private mh0 QX(Enumeration enumeration) {
        return (mh0) enumeration.nextElement();
    }

    public static bi0 Ws(hi0 hi0Var, boolean z) {
        if (z) {
            if (!hi0Var.aM()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            ai0 ai0VarWs = hi0Var.Ws();
            ai0VarWs.DW();
            return J8(ai0VarWs);
        }
        if (hi0Var.aM()) {
            return hi0Var instanceof si0 ? new oi0(hi0Var.Ws()) : new zj0(hi0Var.Ws());
        }
        if (hi0Var.Ws() instanceof bi0) {
            return (bi0) hi0Var.Ws();
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + hi0Var.getClass().getName());
    }

    @Override // abcd.ai0
    public boolean EQ() {
        return true;
    }

    @Override // abcd.ai0
    public ai0 J0() {
        zj0 zj0Var = new zj0();
        zj0Var.WB = this.WB;
        return zj0Var;
    }

    public mh0[] Mr() {
        mh0[] mh0VarArr = new mh0[j3()];
        for (int i = 0; i != j3(); i++) {
            mh0VarArr[i] = XL(i);
        }
        return mh0VarArr;
    }

    @Override // abcd.ai0
    public boolean VH(ai0 ai0Var) {
        if (!(ai0Var instanceof bi0)) {
            return false;
        }
        bi0 bi0Var = (bi0) ai0Var;
        if (j3() != bi0Var.j3()) {
            return false;
        }
        Enumeration enumerationAM = aM();
        Enumeration enumerationAM2 = bi0Var.aM();
        while (enumerationAM.hasMoreElements()) {
            mh0 mh0VarQX = QX(enumerationAM);
            mh0 mh0VarQX2 = QX(enumerationAM2);
            ai0 ai0VarDW = mh0VarQX.DW();
            ai0 ai0VarDW2 = mh0VarQX2.DW();
            if (ai0VarDW != ai0VarDW2 && !ai0VarDW.equals(ai0VarDW2)) {
                return false;
            }
        }
        return true;
    }

    public mh0 XL(int i) {
        return (mh0) this.WB.elementAt(i);
    }

    public Enumeration aM() {
        return this.WB.elements();
    }

    @Override // abcd.uh0
    public int hashCode() {
        Enumeration enumerationAM = aM();
        int iJ3 = j3();
        while (enumerationAM.hasMoreElements()) {
            iJ3 = (iJ3 * 17) ^ QX(enumerationAM).hashCode();
        }
        return iJ3;
    }

    public int j3() {
        return this.WB.size();
    }

    public String toString() {
        return this.WB.toString();
    }

    @Override // abcd.ai0
    public ai0 we() {
        oj0 oj0Var = new oj0();
        oj0Var.WB = this.WB;
        return oj0Var;
    }

    public bi0(mh0 mh0Var) {
        Vector vector = new Vector();
        this.WB = vector;
        vector.addElement(mh0Var);
    }

    public bi0(nh0 nh0Var) {
        this.WB = new Vector();
        for (int i = 0; i != nh0Var.FH(); i++) {
            this.WB.addElement(nh0Var.DW(i));
        }
    }

    public bi0(mh0[] mh0VarArr) {
        this.WB = new Vector();
        for (int i = 0; i != mh0VarArr.length; i++) {
            this.WB.addElement(mh0VarArr[i]);
        }
    }
}
