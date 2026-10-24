package abcd;

import java.io.File;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ja0 extends z60 {

    static class a {
        final ja0 j6;

        public a(ja0 ja0Var) {
            this.j6 = ja0Var;
        }

        public Collection<sb0> DW() {
            return this.j6.tp();
        }

        public void j6() {
            this.j6.j6();
        }
    }

    static class b extends a {
        final ka0 DW;

        public b(ka0 ka0Var) {
            super(ka0Var.J0());
            this.DW = ka0Var;
        }

        @Override // abcd.ja0.a
        public void j6() {
            this.DW.j6();
        }
    }

    enum c {
        INSERTED,
        EXISTS_PACKED,
        EXISTS_LOOSE,
        FAILURE;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            int length = cVarArrValuesCustom.length;
            c[] cVarArr = new c[length];
            System.arraycopy(cVarArrValuesCustom, 0, cVarArr, 0, length);
            return cVarArr;
        }
    }

    public abstract f70 BT(ob0 ob0Var, j60 j60Var);

    public abstract q60 EQ();

    @Override // abcd.z60
    public boolean FH(j60 j60Var) {
        return U2(j60Var) || a8(j60Var.BT());
    }

    public abstract wf0 J0();

    public long J8(ob0 ob0Var, j60 j60Var) {
        long jXL = XL(ob0Var, j60Var);
        return 0 <= jXL ? jXL : aM(ob0Var, j60Var.BT(), j60Var);
    }

    public abstract void KD(gc0 gc0Var, dc0 dc0Var, ob0 ob0Var);

    public abstract boolean Mr(String str);

    public final f70 P8(ob0 ob0Var, j60 j60Var) {
        f70 f70VarBT;
        f70 f70VarBT2 = BT(ob0Var, j60Var);
        if (f70VarBT2 != null) {
            return f70VarBT2;
        }
        for (a aVar : rN()) {
            f70 f70VarP8 = aVar.j6.P8(ob0Var, j60Var);
            if (f70VarP8 != null) {
                return f70VarP8;
            }
        }
        if (!ro() || (f70VarBT = BT(ob0Var, j60Var)) == null) {
            return null;
        }
        return f70VarBT;
    }

    public abstract long QX(ob0 ob0Var, String str, j60 j60Var);

    public abstract void SI(Set<a70> set, h60 h60Var);

    public final boolean U2(j60 j60Var) {
        if (j3(j60Var)) {
            return true;
        }
        for (a aVar : rN()) {
            if (aVar.j6.U2(j60Var)) {
                return true;
            }
        }
        return ro() && j3(j60Var);
    }

    public abstract long Ws(ob0 ob0Var, j60 j60Var);

    public final long XL(ob0 ob0Var, j60 j60Var) {
        long jWs = Ws(ob0Var, j60Var);
        if (0 <= jWs) {
            return jWs;
        }
        for (a aVar : rN()) {
            long jXL = aVar.j6.XL(ob0Var, j60Var);
            if (0 <= jXL) {
                return jXL;
            }
        }
        if (!ro()) {
            return -1L;
        }
        long jWs2 = Ws(ob0Var, j60Var);
        if (0 <= jWs2) {
            return jWs2;
        }
        return -1L;
    }

    @Override // abcd.z60
    public g70 Zo() {
        return new ob0(this);
    }

    public final boolean a8(String str) {
        if (Mr(str)) {
            return true;
        }
        for (a aVar : rN()) {
            if (aVar.j6.a8(str)) {
                return true;
            }
        }
        return false;
    }

    public final long aM(ob0 ob0Var, String str, j60 j60Var) {
        long jQX = QX(ob0Var, str, j60Var);
        if (0 <= jQX) {
            return jQX;
        }
        for (a aVar : rN()) {
            long jAM = aVar.j6.aM(ob0Var, str, j60Var);
            if (0 <= jAM) {
                return jAM;
            }
        }
        return -1L;
    }

    public final f70 ei(ob0 ob0Var, String str, j60 j60Var) {
        f70 f70VarVy = vy(ob0Var, str, j60Var);
        if (f70VarVy != null) {
            return f70VarVy;
        }
        for (a aVar : rN()) {
            f70 f70VarEi = aVar.j6.ei(ob0Var, str, j60Var);
            if (f70VarEi != null) {
                return f70VarEi;
            }
        }
        return null;
    }

    public abstract ja0 er();

    public f70 gW(ob0 ob0Var, j60 j60Var) {
        f70 f70VarP8 = P8(ob0Var, j60Var);
        if (f70VarP8 != null) {
            return f70VarP8;
        }
        f70 f70VarEi = ei(ob0Var, j60Var.BT(), j60Var);
        if (f70VarEi != null) {
            return f70VarEi;
        }
        return null;
    }

    public File gn(String str) {
        String strSubstring = str.substring(0, 2);
        return new File(new File(we(), strSubstring), str.substring(2));
    }

    public abstract boolean j3(j60 j60Var);

    public abstract c lg(File file, a70 a70Var, boolean z);

    public abstract wa0 nw(File file, File file2);

    public abstract a[] rN();

    public abstract boolean ro();

    public abstract Collection<? extends sb0> tp();

    public File u7(j60 j60Var) {
        return gn(j60Var.BT());
    }

    public abstract f70 vy(ob0 ob0Var, String str, j60 j60Var);

    public abstract File we();

    @Override // abcd.z60
    /* renamed from: yS, reason: merged with bridge method [inline-methods] */
    public ua0 v5() {
        return new ua0(this, EQ());
    }
}
